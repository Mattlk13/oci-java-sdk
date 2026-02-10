/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.internal.ClientCall;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.internal.ClientThreadFactory;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.responses.BmcResponse;
import com.oracle.bmc.retrier.RetryConfiguration;
import org.slf4j.Logger;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.KeyPair;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** This class gets a security token from identity cloud service */
public class WorkloadIdentityFederationClient extends AbstractAsyncFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(WorkloadIdentityFederationClient.class);

    // Proactive refresh configuration
    private static final long MIN_REFRESH_DELAY_SECONDS = 60; // Minimum 1 minute delay
    private static final long PROACTIVE_REFRESH_FAILURE_RETRY_DELAY_SECONDS = 60;

    private final Supplier<String> subjectTokenSupplier;
    private final String clientCredentials;
    private final Boolean isInstanceCertificatesRequired;
    private final Long earlySessionTokenExpirationInSeconds;
    private Map<String, String> requestPayload;

    // Proactive refresh components
    private final ScheduledExecutorService proactiveRefreshScheduler;
    private volatile ScheduledFuture<?> scheduledRefreshTask;

    private final ExecutorService tokenExchangeExecutor;

    private final RetryConfiguration tokenExchangeRetryConfiguration;

    /**
     * Constructor of WorkloadIdentityFederationClient.
     *
     * @param tokenExchangeEndpoint the identity cloud service token endpoint
     * @param subjectTokenSupplier the subject token supplier
     * @param sessionKeySupplier the session key supplier.
     * @param clientCredentials the client credential of OAuth application
     * @param requestPayload the map of parameters to send to server
     * @param clientConfigurator the reset client configurator.
     * @param circuitBreakerConfiguration the rest client circuit breaker configuration.
     * @param additionalClientConfigurators additional client configurators to be run after the
     *     primary configurator.
     * @param earlySessionTokenExpirationInSeconds the number of seconds to refresh token before it
     *     expires
     * @param enableProactiveRefresh control of proactive refresh
     * @param tokenExchangeRetryConfiguration SDK retry configuration to use
     */
    public WorkloadIdentityFederationClient(
            String tokenExchangeEndpoint,
            Supplier<String> subjectTokenSupplier,
            SessionKeySupplier sessionKeySupplier,
            String clientCredentials,
            Map<String, String> requestPayload,
            Boolean isInstanceCertificatesRequired,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration,
            List<ClientConfigurator> additionalClientConfigurators,
            Long earlySessionTokenExpirationInSeconds,
            boolean enableProactiveRefresh,
            RetryConfiguration tokenExchangeRetryConfiguration) {
        super(
                sessionKeySupplier,
                tokenExchangeEndpoint,
                clientConfigurator,
                circuitBreakerConfiguration,
                additionalClientConfigurators);
        this.subjectTokenSupplier = subjectTokenSupplier;
        this.clientCredentials = clientCredentials;
        this.isInstanceCertificatesRequired = isInstanceCertificatesRequired;
        this.requestPayload = requestPayload;

        this.earlySessionTokenExpirationInSeconds = earlySessionTokenExpirationInSeconds;

        this.tokenExchangeRetryConfiguration = tokenExchangeRetryConfiguration;

        // Only initialize proactive refresh scheduler if explicitly enabled
        if (enableProactiveRefresh) {
            this.proactiveRefreshScheduler =
                    new ScheduledThreadPoolExecutor(
                            1,
                            ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat(
                                            "WorkloadIdentityFederationClient-ProactiveRefresh-%d")
                                    .build());
            LOG.debug("Proactive refresh enabled - scheduler initialized");
        } else {
            this.proactiveRefreshScheduler = null;
            LOG.debug("Proactive refresh disabled - no scheduler created");
        }

        this.tokenExchangeExecutor =
                java.util.concurrent.Executors.newSingleThreadExecutor(
                        ClientThreadFactory.builder()
                                .isDaemon(true)
                                .nameFormat("WorkloadIdentityFederationClient-TokenExchange-%d")
                                .build());

        LOG.debug(
                "WorkloadIdentityFederationClient initialized with endpoint: {}, proactive refresh enabled: {}, token exchange retry config present: {}",
                tokenExchangeEndpoint,
                enableProactiveRefresh,
                tokenExchangeRetryConfiguration != null);
    }

    /**
     * Overrides the base implementation to provide proactive token refresh behavior.
     *
     * <p>Unlike the base class which only refreshes tokens when they are already invalid, this
     * implementation refreshes tokens early (before expiration) to prevent authentication failures
     * in workload identity scenarios where timing is critical.
     *
     * <p>The early refresh is controlled by earlySessionTokenExpirationInSeconds (default 5
     * minutes), ensuring tokens are renewed well before they expire to avoid any risk of using an
     * expired token during authentication.
     *
     * @return CompletableFuture containing the security token
     */
    @Override
    public CompletableFuture<String> getSecurityToken() {
        return refreshAndGetSecurityTokenIfExpiringWithin(
                Duration.ofSeconds(earlySessionTokenExpirationInSeconds));
    }

    @Override
    protected CompletableFuture<SecurityTokenAdapter> getSecurityTokenFromServer() {
        LOG.info("getSecurityTokenFromServer called, getting session token from Identity Domain");

        return CompletableFuture.supplyAsync(
                () -> {
                    try {
                        this.requestPayload.put(
                                WorkloadIdentityFederationConstants.OAUTH_PARAM_GRANT_TYPE,
                                WorkloadIdentityFederationConstants.TOKEN_EXCHANGE_STRING);

                        if (subjectTokenSupplier != null) {
                            String subjectToken = subjectTokenSupplier.get();
                            if (subjectToken == null || subjectToken.isEmpty()) {
                                throw new IllegalStateException(
                                        "Subject token must not be null or empty");
                            }
                            this.requestPayload.put(
                                    WorkloadIdentityFederationConstants
                                            .OAUTH_PARAM_SUBJECT_TOKEN_TYPE,
                                    WorkloadIdentityFederationConstants.JWT_TOKEN_STRING);
                            this.requestPayload.put(
                                    WorkloadIdentityFederationConstants.OAUTH_PARAM_SUBJECT_TOKEN,
                                    subjectToken);
                        }

                        KeyPair keyPair = sessionKeySupplier.getKeyPair();
                        if (keyPair == null) {
                            throw new IllegalStateException("KeyPair must not be null");
                        }
                        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
                        if (publicKey == null) {
                            throw new IllegalStateException("Public key must not be null");
                        }
                        String publicKeyDerBase64 =
                                Base64.getEncoder().encodeToString(publicKey.getEncoded());
                        this.requestPayload.put(
                                WorkloadIdentityFederationConstants.OAUTH_PARAM_PUBLIC_KEY,
                                publicKeyDerBase64);

                        TokenExchangeResponseBody tokenResponse;
                        if (this.clientCredentials != null) {
                            tokenResponse = prepareClientCredentialRequest();
                        } else {
                            tokenResponse = prepareInstancePrincipalSignedRequest();
                        }

                        if (tokenResponse == null || tokenResponse.token == null) {
                            throw new IllegalStateException(
                                    "Token exchange response did not contain 'token'");
                        }

                        return new SecurityTokenAdapter(tokenResponse.token, sessionKeySupplier);
                    } catch (BmcException e) {
                        LOG.error("Token exchange failed", e);
                        throw e;
                    } catch (Exception e) {
                        LOG.error("Unable to exchange token", e);
                        throw new RuntimeException("Unable to exchange token", e);
                    }
                },
                tokenExchangeExecutor);
    }

    private static final class TokenExchangeRequestWrapper extends BmcRequest<String> {
        private final String requestBody;

        private TokenExchangeRequestWrapper(String requestBody) {
            this.requestBody = requestBody;
        }

        @Override
        public String getBody$() {
            return requestBody;
        }
    }

    private static final class TokenExchangeResponseBody {
        @JsonProperty("token")
        private String token;
    }

    private static final class TokenExchangeResponseWrapper extends BmcResponse {
        private final TokenExchangeResponseBody body;

        private TokenExchangeResponseWrapper(int status, TokenExchangeResponseBody body) {
            super(status);
            this.body = body;
        }

        private static final class Builder
                implements BmcResponse.Builder<TokenExchangeResponseWrapper> {
            private int status;
            TokenExchangeResponseBody body;

            @Override
            public BmcResponse.Builder<TokenExchangeResponseWrapper> __httpStatusCode__(
                    int __httpStatusCode__) {
                this.status = __httpStatusCode__;
                return this;
            }

            @Override
            public BmcResponse.Builder<TokenExchangeResponseWrapper> headers(
                    java.util.Map<String, java.util.List<String>> headers) {
                return this;
            }

            @Override
            public BmcResponse.Builder<TokenExchangeResponseWrapper> copy(
                    TokenExchangeResponseWrapper o) {
                this.status = o.get__httpStatusCode__();
                this.body = o.body;
                return this;
            }

            @Override
            public TokenExchangeResponseWrapper build() {
                return new TokenExchangeResponseWrapper(status, body);
            }
        }
    }

    private TokenExchangeResponseBody prepareClientCredentialRequest()
            throws UnsupportedEncodingException {

        String basicAuth = clientCredentials;
        // Avoid logging full credentials; mask for safety
        if (LOG.isDebugEnabled()) {
            String masked =
                    basicAuth == null
                            ? "null"
                            : (basicAuth.length() <= 8
                                    ? "********"
                                    : basicAuth.substring(0, 4)
                                            + "****"
                                            + basicAuth.substring(basicAuth.length() - 4));
            LOG.debug("Basic Auth Header (encoded, masked): {}", masked);
        }
        return ClientCall.builder(
                        federationClient,
                        new TokenExchangeRequestWrapper(buildRequestBody(this.requestPayload)),
                        TokenExchangeResponseWrapper.Builder::new)
                .logger(LOG, "WorkloadIdentityFederationClient")
                .method(Method.POST)
                .appendHeader("Authorization", "Basic " + basicAuth)
                .appendHeader("Content-Type", "application/x-www-form-urlencoded")
                .accept("application/json")
                .hasBody()
                .handleBody(TokenExchangeResponseBody.class, (w, t) -> w.body = t)
                .clientConfigurator(null)
                .circuitBreaker(circuitBreaker)
                .retryConfiguration(this.tokenExchangeRetryConfiguration)
                .callSync()
                .body;
    }

    private TokenExchangeResponseBody prepareInstancePrincipalSignedRequest()
            throws CertificateEncodingException, UnsupportedEncodingException {
        InstancePrincipalsAuthenticationDetailsProvider
                        .InstancePrincipalsAuthenticationDetailsProviderBuilder
                providerBuilder = InstancePrincipalsAuthenticationDetailsProvider.builder();
        InstancePrincipalsAuthenticationDetailsProvider provider = providerBuilder.build();
        X509Certificate instanceLeafCertificate;
        X509Certificate instanceIntermediateCertificate;
        if (isInstanceCertificatesRequired) {
            instanceLeafCertificate =
                    providerBuilder
                            .getLeafCertificateSupplier()
                            .getCertificateAndKeyPair()
                            .getCertificate();
            this.requestPayload.put(
                    WorkloadIdentityFederationConstants.OAUTH_PARAM_INSTANCE_CERTIFICATE,
                    Base64.getEncoder().encodeToString(instanceLeafCertificate.getEncoded()));
            Set<X509CertificateSupplier> interCertSet =
                    providerBuilder.getIntermediateCertificateSupplier();
            if (interCertSet != null) {
                List<X509CertificateSupplier> interCertList = new ArrayList<>(interCertSet);
                instanceIntermediateCertificate =
                        interCertList.get(0).getCertificateAndKeyPair().getCertificate();
                this.requestPayload.put(
                        WorkloadIdentityFederationConstants
                                .OAUTH_PARAM_INSTANCE_INTERMEDIATE_CERTIFICATE,
                        Base64.getEncoder()
                                .encodeToString(instanceIntermediateCertificate.getEncoded()));
            }
        }

        Map<String, List<String>> headers = new HashMap<>();
        List<String> urlEncodedForm =
                Collections.singletonList("application/x-www-form-urlencoded");
        headers.put("Content-Type", urlEncodedForm);
        String requestBody = buildRequestBody(this.requestPayload);

        RequestSigner requestSigner = DefaultRequestSigner.createRequestSigner(provider);
        Map<String, String> signedHeaders =
                requestSigner.signRequest(
                        URI.create(getFederationEndpoint()), "POST", headers, requestBody);

        return ClientCall.builder(
                        federationClient,
                        new TokenExchangeRequestWrapper(requestBody),
                        TokenExchangeResponseWrapper.Builder::new)
                .logger(LOG, "WorkloadIdentityFederationClient")
                .method(Method.POST)
                .appendHeaders(signedHeaders)
                .accept("application/json")
                .hasBody()
                .handleBody(TokenExchangeResponseBody.class, (w, t) -> w.body = t)
                .clientConfigurator(null)
                .circuitBreaker(circuitBreaker)
                .retryConfiguration(this.tokenExchangeRetryConfiguration)
                .callSync()
                .body;
    }

    private String buildRequestBody(Map<String, String> payloads)
            throws UnsupportedEncodingException {
        StringBuilder formAsString = new StringBuilder();
        boolean isFirstField = true;
        for (Map.Entry<String, String> entry : payloads.entrySet()) {
            formAsString
                    .append(isFirstField ? "" : "&")
                    .append(entry.getKey())
                    .append("=")
                    .append(java.net.URLEncoder.encode(entry.getValue(), "UTF-8"));
            isFirstField = false;
        }
        return formAsString.toString();
    }

    @Override
    public String getStringClaim(String key) {
        return securityTokenAdapter.getStringClaim(key);
    }

    @Override
    protected void onTokenRefreshCompleted(Duration tokenValidDuration) {
        LOG.debug("Token refresh completed, token valid for: {}", tokenValidDuration);
        // Only schedule proactive refresh if scheduler is enabled
        if (proactiveRefreshScheduler != null) {
            LOG.debug("Token refresh completed, scheduling proactive refresh");
            scheduleProactiveTokenRefresh();
        } else {
            LOG.debug("Token refresh completed, proactive refresh disabled");
        }
    }

    /**
     * Calculates when the next proactive token refresh should occur. Returns the number of seconds
     * from now when a proactive refresh should be scheduled, typically at 80% of the token's
     * remaining lifetime.
     *
     * @return Optional containing seconds until proactive refresh, or empty if no valid token or
     *     scheduling not possible
     */
    private Optional<Long> calculateSecondsUntilProactiveRefresh() {
        // Check if we have a valid token
        if (!securityTokenAdapter.isValid()) {
            // Token is invalid/expired, should refresh immediately
            LOG.info("Proactive refresh: token invalid/expired; scheduling immediate refresh");
            return Optional.of(0L);
        }

        Duration tokenValidDuration = securityTokenAdapter.getTokenValidDuration();
        if (tokenValidDuration == null) {
            LOG.warn(
                    "Proactive refresh: token valid duration unknown; cannot schedule proactively");
            return Optional.empty();
        }

        long totalLifetimeSeconds = tokenValidDuration.getSeconds();
        long refreshDelaySeconds =
                Math.max((long) (totalLifetimeSeconds * 0.8), MIN_REFRESH_DELAY_SECONDS);

        // Cap the delay to a reasonable maximum (e.g., 1 hour) to handle very long-lived tokens
        refreshDelaySeconds = Math.min(refreshDelaySeconds, 3600);

        LOG.info(
                "Proactive refresh: token valid for ~{}s; targeting refresh in {}s (~80% of lifetime)",
                totalLifetimeSeconds, refreshDelaySeconds);

        return Optional.of(refreshDelaySeconds);
    }

    /**
     * Schedules a proactive token refresh based on the current token's expiration time. This method
     * cancels any previously scheduled refresh and schedules a new one using the federation
     * client's calculation of when to refresh proactively.
     */
    private void scheduleProactiveTokenRefresh() {
        // Only schedule if proactive refresh is enabled
        if (proactiveRefreshScheduler == null) {
            LOG.debug("Proactive refresh disabled, skipping scheduling");
            return;
        }

        try {
            // Cancel any existing scheduled refresh
            if (scheduledRefreshTask != null && !scheduledRefreshTask.isDone()) {
                scheduledRefreshTask.cancel(false);
                LOG.debug("Cancelled previous proactive refresh task");
            }

            // Get the recommended delay from the federation client
            Optional<Long> secondsUntilRefresh = calculateSecondsUntilProactiveRefresh();
            if (!secondsUntilRefresh.isPresent()) {
                LOG.warn("Cannot schedule proactive refresh: could not determine refresh timing");
                return;
            }

            long refreshDelaySeconds = secondsUntilRefresh.get();

            if (refreshDelaySeconds <= 0) {
                LOG.warn(
                        "Proactive refresh: scheduling immediate refresh (delay={}s)",
                        refreshDelaySeconds);
                scheduleImmediateRefresh();
                return;
            }

            Instant scheduledAt = Instant.now().plusSeconds(refreshDelaySeconds);
            LOG.info(
                    "Proactive refresh: scheduling background refresh in {}s at {}",
                    refreshDelaySeconds,
                    scheduledAt);

            // Schedule the proactive refresh
            scheduledRefreshTask =
                    proactiveRefreshScheduler.schedule(
                            this::performProactiveRefresh, refreshDelaySeconds, TimeUnit.SECONDS);

        } catch (Exception e) {
            LOG.warn("Failed to schedule proactive token refresh", e);
        }
    }

    /**
     * Performs the actual proactive token refresh in the background. This method is called by the
     * scheduled executor service.
     */
    private void performProactiveRefresh() {
        try {
            LOG.info("Proactive refresh: starting background token refresh");
            refreshAndGetSecurityTokenInnerAsync(true, null, true)
                    .thenRun(
                            () -> {
                                LOG.info("Proactive refresh: token refresh completed successfully");
                                // onTokenRefreshCompleted will be called automatically and schedule
                                // the next
                                // refresh
                            })
                    .exceptionally(
                            throwable -> {
                                LOG.warn(
                                        "Proactive refresh: token refresh failed; scheduling retry",
                                        throwable);
                                scheduleRetryAfterProactiveRefreshFailure();
                                return null;
                            });
        } catch (Exception e) {
            LOG.warn("Proactive refresh: failed to initiate token refresh; scheduling retry", e);
            scheduleRetryAfterProactiveRefreshFailure();
        }
    }

    private void scheduleRetryAfterProactiveRefreshFailure() {
        if (proactiveRefreshScheduler == null) {
            return;
        }

        try {
            if (scheduledRefreshTask != null && !scheduledRefreshTask.isDone()) {
                scheduledRefreshTask.cancel(false);
            }
            scheduledRefreshTask =
                    proactiveRefreshScheduler.schedule(
                            this::performProactiveRefresh,
                            PROACTIVE_REFRESH_FAILURE_RETRY_DELAY_SECONDS,
                            TimeUnit.SECONDS);
        } catch (Exception e) {
            LOG.warn("Proactive refresh: failed to schedule retry", e);
        }
    }

    /** Schedules an immediate refresh when the token is already expired. */
    private void scheduleImmediateRefresh() {
        if (proactiveRefreshScheduler != null) {
            scheduledRefreshTask =
                    proactiveRefreshScheduler.schedule(
                            this::performProactiveRefresh, 0, TimeUnit.SECONDS);
        }
    }

    /**
     * Shuts down the proactive refresh scheduler. This method should be called when the client is
     * no longer needed to clean up resources.
     */
    public void shutdown() {
        if (scheduledRefreshTask != null && !scheduledRefreshTask.isDone()) {
            scheduledRefreshTask.cancel(false);
        }
        if (proactiveRefreshScheduler != null) {
            proactiveRefreshScheduler.shutdown();
            try {
                if (!proactiveRefreshScheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                    proactiveRefreshScheduler.shutdownNow();
                }
            } catch (InterruptedException e) {
                proactiveRefreshScheduler.shutdownNow();
                Thread.currentThread().interrupt();
            }
            LOG.debug("Proactive refresh scheduler shut down");
        } else {
            LOG.debug("No proactive refresh scheduler to shut down");
        }

        tokenExchangeExecutor.shutdown();
        try {
            if (!tokenExchangeExecutor.awaitTermination(5, TimeUnit.SECONDS)) {
                tokenExchangeExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            tokenExchangeExecutor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
