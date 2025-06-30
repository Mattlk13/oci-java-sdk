/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ScheduledQueryClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ScheduledQuery {
    /** Service instance for ScheduledQuery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SCHEDULEDQUERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-trace.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ScheduledQueryClient.class);

    private final ScheduledQueryWaiters waiters;

    private final ScheduledQueryPaginators paginators;

    ScheduledQueryClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("ScheduledQuery-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new ScheduledQueryWaiters(executorService, this);

        this.paginators = new ScheduledQueryPaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ScheduledQueryClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmtraces";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ScheduledQueryClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ScheduledQueryClient(this, authenticationDetailsProvider, executorService);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public CreateScheduledQueryResponse createScheduledQuery(CreateScheduledQueryRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateScheduledQueryDetails(),
                "createScheduledQueryDetails is required");

        return clientCall(request, CreateScheduledQueryResponse::builder)
                .logger(LOG, "createScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "CreateScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/CreateScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQuery.class,
                        CreateScheduledQueryResponse.Builder::scheduledQuery)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduledQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduledQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteScheduledQueryResponse deleteScheduledQuery(DeleteScheduledQueryRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScheduledQueryId(), "scheduledQueryId must not be blank");

        return clientCall(request, DeleteScheduledQueryResponse::builder)
                .logger(LOG, "deleteScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "DeleteScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/DeleteScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendPathParam(request.getScheduledQueryId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduledQueryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetScheduledQueryResponse getScheduledQuery(GetScheduledQueryRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScheduledQueryId(), "scheduledQueryId must not be blank");

        return clientCall(request, GetScheduledQueryResponse::builder)
                .logger(LOG, "getScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "GetScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/GetScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendPathParam(request.getScheduledQueryId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQuery.class,
                        GetScheduledQueryResponse.Builder::scheduledQuery)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduledQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ListScheduledQueriesResponse listScheduledQueries(ListScheduledQueriesRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListScheduledQueriesResponse::builder)
                .logger(LOG, "listScheduledQueries")
                .serviceDetails(
                        "ScheduledQuery",
                        "ListScheduledQueries",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQueryCollection/ListScheduledQueries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledQueriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQueryCollection.class,
                        ListScheduledQueriesResponse.Builder::scheduledQueryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledQueriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledQueriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateScheduledQueryResponse updateScheduledQuery(UpdateScheduledQueryRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScheduledQueryId(), "scheduledQueryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduledQueryDetails(),
                "updateScheduledQueryDetails is required");

        return clientCall(request, UpdateScheduledQueryResponse::builder)
                .logger(LOG, "updateScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "UpdateScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/UpdateScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendPathParam(request.getScheduledQueryId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQuery.class,
                        UpdateScheduledQueryResponse.Builder::scheduledQuery)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduledQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateScheduledQueryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public ScheduledQueryWaiters getWaiters() {
        return waiters;
    }

    @Override
    public ScheduledQueryPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
