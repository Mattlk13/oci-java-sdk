/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.iot.requests.*;
import com.oracle.bmc.iot.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Iot service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class IotAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements IotAsync {
    /** Service instance for Iot. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("IOT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://iot.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IotAsyncClient.class);

    IotAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, IotAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "iot";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public IotAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new IotAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeIotDomainCompartmentResponse>
            changeIotDomainCompartment(
                    ChangeIotDomainCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainCompartmentRequest,
                                    ChangeIotDomainCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeIotDomainCompartmentDetails(),
                "changeIotDomainCompartmentDetails is required");

        return clientCall(request, ChangeIotDomainCompartmentResponse::builder)
                .logger(LOG, "changeIotDomainCompartment")
                .serviceDetails("Iot", "ChangeIotDomainCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIotDomainCompartmentRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIotDomainCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeIotDomainCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeIotDomainDataRetentionPeriodResponse>
            changeIotDomainDataRetentionPeriod(
                    ChangeIotDomainDataRetentionPeriodRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainDataRetentionPeriodRequest,
                                    ChangeIotDomainDataRetentionPeriodResponse>
                            handler) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getChangeIotDomainDataRetentionPeriodDetails(),
                "changeIotDomainDataRetentionPeriodDetails is required");

        return clientCall(request, ChangeIotDomainDataRetentionPeriodResponse::builder)
                .logger(LOG, "changeIotDomainDataRetentionPeriod")
                .serviceDetails("Iot", "ChangeIotDomainDataRetentionPeriod", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIotDomainDataRetentionPeriodRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .appendPathParam("actions")
                .appendPathParam("changeDataRetentionPeriod")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIotDomainDataRetentionPeriodResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIotDomainDataRetentionPeriodResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeIotDomainGroupCompartmentResponse>
            changeIotDomainGroupCompartment(
                    ChangeIotDomainGroupCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIotDomainGroupCompartmentRequest,
                                    ChangeIotDomainGroupCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");
        Objects.requireNonNull(
                request.getChangeIotDomainGroupCompartmentDetails(),
                "changeIotDomainGroupCompartmentDetails is required");

        return clientCall(request, ChangeIotDomainGroupCompartmentResponse::builder)
                .logger(LOG, "changeIotDomainGroupCompartment")
                .serviceDetails("Iot", "ChangeIotDomainGroupCompartment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeIotDomainGroupCompartmentRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeIotDomainGroupCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeIotDomainGroupCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureIotDomainDataAccessResponse>
            configureIotDomainDataAccess(
                    ConfigureIotDomainDataAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureIotDomainDataAccessRequest,
                                    ConfigureIotDomainDataAccessResponse>
                            handler) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getConfigureIotDomainDataAccessDetails(),
                "configureIotDomainDataAccessDetails is required");

        return clientCall(request, ConfigureIotDomainDataAccessResponse::builder)
                .logger(LOG, "configureIotDomainDataAccess")
                .serviceDetails("Iot", "ConfigureIotDomainDataAccess", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureIotDomainDataAccessRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .appendPathParam("actions")
                .appendPathParam("configureDataAccess")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureIotDomainDataAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureIotDomainDataAccessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ConfigureIotDomainGroupDataAccessResponse>
            configureIotDomainGroupDataAccess(
                    ConfigureIotDomainGroupDataAccessRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureIotDomainGroupDataAccessRequest,
                                    ConfigureIotDomainGroupDataAccessResponse>
                            handler) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");
        Objects.requireNonNull(
                request.getConfigureIotDomainGroupDataAccessDetails(),
                "configureIotDomainGroupDataAccessDetails is required");

        return clientCall(request, ConfigureIotDomainGroupDataAccessResponse::builder)
                .logger(LOG, "configureIotDomainGroupDataAccess")
                .serviceDetails("Iot", "ConfigureIotDomainGroupDataAccess", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureIotDomainGroupDataAccessRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .appendPathParam("actions")
                .appendPathParam("configureDataAccess")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureIotDomainGroupDataAccessResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureIotDomainGroupDataAccessResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDigitalTwinAdapterResponse> createDigitalTwinAdapter(
            CreateDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinAdapterRequest, CreateDigitalTwinAdapterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinAdapterDetails(),
                "createDigitalTwinAdapterDetails is required");

        return clientCall(request, CreateDigitalTwinAdapterResponse::builder)
                .logger(LOG, "createDigitalTwinAdapter")
                .serviceDetails("Iot", "CreateDigitalTwinAdapter", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapter.class,
                        CreateDigitalTwinAdapterResponse.Builder::digitalTwinAdapter)
                .handleResponseHeaderString("etag", CreateDigitalTwinAdapterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDigitalTwinInstanceResponse> createDigitalTwinInstance(
            CreateDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinInstanceRequest, CreateDigitalTwinInstanceResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinInstanceDetails(),
                "createDigitalTwinInstanceDetails is required");

        return clientCall(request, CreateDigitalTwinInstanceResponse::builder)
                .logger(LOG, "createDigitalTwinInstance")
                .serviceDetails("Iot", "CreateDigitalTwinInstance", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstance.class,
                        CreateDigitalTwinInstanceResponse.Builder::digitalTwinInstance)
                .handleResponseHeaderString("etag", CreateDigitalTwinInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDigitalTwinModelResponse> createDigitalTwinModel(
            CreateDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalTwinModelRequest, CreateDigitalTwinModelResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinModelDetails(),
                "createDigitalTwinModelDetails is required");

        return clientCall(request, CreateDigitalTwinModelResponse::builder)
                .logger(LOG, "createDigitalTwinModel")
                .serviceDetails("Iot", "CreateDigitalTwinModel", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModel.class,
                        CreateDigitalTwinModelResponse.Builder::digitalTwinModel)
                .handleResponseHeaderString("etag", CreateDigitalTwinModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalTwinModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDigitalTwinRelationshipResponse>
            createDigitalTwinRelationship(
                    CreateDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateDigitalTwinRelationshipRequest,
                                    CreateDigitalTwinRelationshipResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateDigitalTwinRelationshipDetails(),
                "createDigitalTwinRelationshipDetails is required");

        return clientCall(request, CreateDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "createDigitalTwinRelationship")
                .serviceDetails("Iot", "CreateDigitalTwinRelationship", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationship.class,
                        CreateDigitalTwinRelationshipResponse.Builder::digitalTwinRelationship)
                .handleResponseHeaderString(
                        "etag", CreateDigitalTwinRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIotDomainResponse> createIotDomain(
            CreateIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIotDomainRequest, CreateIotDomainResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIotDomainDetails(), "createIotDomainDetails is required");

        return clientCall(request, CreateIotDomainResponse::builder)
                .logger(LOG, "createIotDomain")
                .serviceDetails("Iot", "CreateIotDomain", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomain.class,
                        CreateIotDomainResponse.Builder::iotDomain)
                .handleResponseHeaderString("location", CreateIotDomainResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateIotDomainResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateIotDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateIotDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIotDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateIotDomainGroupResponse> createIotDomainGroup(
            CreateIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateIotDomainGroupRequest, CreateIotDomainGroupResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateIotDomainGroupDetails(),
                "createIotDomainGroupDetails is required");

        return clientCall(request, CreateIotDomainGroupResponse::builder)
                .logger(LOG, "createIotDomainGroup")
                .serviceDetails("Iot", "CreateIotDomainGroup", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomainGroup.class,
                        CreateIotDomainGroupResponse.Builder::iotDomainGroup)
                .handleResponseHeaderString(
                        "location", CreateIotDomainGroupResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateIotDomainGroupResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateIotDomainGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateIotDomainGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateIotDomainGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDigitalTwinAdapterResponse> deleteDigitalTwinAdapter(
            DeleteDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinAdapterRequest, DeleteDigitalTwinAdapterResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinAdapterId(), "digitalTwinAdapterId must not be blank");

        return clientCall(request, DeleteDigitalTwinAdapterResponse::builder)
                .logger(LOG, "deleteDigitalTwinAdapter")
                .serviceDetails("Iot", "DeleteDigitalTwinAdapter", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendPathParam(request.getDigitalTwinAdapterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDigitalTwinInstanceResponse> deleteDigitalTwinInstance(
            DeleteDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinInstanceRequest, DeleteDigitalTwinInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");

        return clientCall(request, DeleteDigitalTwinInstanceResponse::builder)
                .logger(LOG, "deleteDigitalTwinInstance")
                .serviceDetails("Iot", "DeleteDigitalTwinInstance", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDigitalTwinModelResponse> deleteDigitalTwinModel(
            DeleteDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalTwinModelRequest, DeleteDigitalTwinModelResponse>
                    handler) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");

        return clientCall(request, DeleteDigitalTwinModelResponse::builder)
                .logger(LOG, "deleteDigitalTwinModel")
                .serviceDetails("Iot", "DeleteDigitalTwinModel", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalTwinModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDigitalTwinRelationshipResponse>
            deleteDigitalTwinRelationship(
                    DeleteDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDigitalTwinRelationshipRequest,
                                    DeleteDigitalTwinRelationshipResponse>
                            handler) {

        Validate.notBlank(
                request.getDigitalTwinRelationshipId(),
                "digitalTwinRelationshipId must not be blank");

        return clientCall(request, DeleteDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "deleteDigitalTwinRelationship")
                .serviceDetails("Iot", "DeleteDigitalTwinRelationship", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendPathParam(request.getDigitalTwinRelationshipId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIotDomainResponse> deleteIotDomain(
            DeleteIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIotDomainRequest, DeleteIotDomainResponse>
                    handler) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");

        return clientCall(request, DeleteIotDomainResponse::builder)
                .logger(LOG, "deleteIotDomain")
                .serviceDetails("Iot", "DeleteIotDomain", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteIotDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIotDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteIotDomainGroupResponse> deleteIotDomainGroup(
            DeleteIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteIotDomainGroupRequest, DeleteIotDomainGroupResponse>
                    handler) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");

        return clientCall(request, DeleteIotDomainGroupResponse::builder)
                .logger(LOG, "deleteIotDomainGroup")
                .serviceDetails("Iot", "DeleteIotDomainGroup", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteIotDomainGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteIotDomainGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalTwinAdapterResponse> getDigitalTwinAdapter(
            GetDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinAdapterRequest, GetDigitalTwinAdapterResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinAdapterId(), "digitalTwinAdapterId must not be blank");

        return clientCall(request, GetDigitalTwinAdapterResponse::builder)
                .logger(LOG, "getDigitalTwinAdapter")
                .serviceDetails("Iot", "GetDigitalTwinAdapter", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendPathParam(request.getDigitalTwinAdapterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapter.class,
                        GetDigitalTwinAdapterResponse.Builder::digitalTwinAdapter)
                .handleResponseHeaderString("etag", GetDigitalTwinAdapterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalTwinInstanceResponse> getDigitalTwinInstance(
            GetDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinInstanceRequest, GetDigitalTwinInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");

        return clientCall(request, GetDigitalTwinInstanceResponse::builder)
                .logger(LOG, "getDigitalTwinInstance")
                .serviceDetails("Iot", "GetDigitalTwinInstance", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstance.class,
                        GetDigitalTwinInstanceResponse.Builder::digitalTwinInstance)
                .handleResponseHeaderString("etag", GetDigitalTwinInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalTwinInstanceContentResponse>
            getDigitalTwinInstanceContent(
                    GetDigitalTwinInstanceContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalTwinInstanceContentRequest,
                                    GetDigitalTwinInstanceContentResponse>
                            handler) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");

        return clientCall(request, GetDigitalTwinInstanceContentResponse::builder)
                .logger(LOG, "getDigitalTwinInstanceContent")
                .serviceDetails("Iot", "GetDigitalTwinInstanceContent", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinInstanceContentRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .appendPathParam("content")
                .appendQueryParam("shouldIncludeMetadata", request.getShouldIncludeMetadata())
                .accept("application/json, application/ld+json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        GetDigitalTwinInstanceContentResponse.ResultWrapper.class,
                        GetDigitalTwinInstanceContentResponse.Builder::resultWrapper)
                .handleResponseHeaderString(
                        "etag", GetDigitalTwinInstanceContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDigitalTwinInstanceContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalTwinModelResponse> getDigitalTwinModel(
            GetDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinModelRequest, GetDigitalTwinModelResponse>
                    handler) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");

        return clientCall(request, GetDigitalTwinModelResponse::builder)
                .logger(LOG, "getDigitalTwinModel")
                .serviceDetails("Iot", "GetDigitalTwinModel", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModel.class,
                        GetDigitalTwinModelResponse.Builder::digitalTwinModel)
                .handleResponseHeaderString("etag", GetDigitalTwinModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalTwinModelSpecResponse> getDigitalTwinModelSpec(
            GetDigitalTwinModelSpecRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalTwinModelSpecRequest, GetDigitalTwinModelSpecResponse>
                    handler) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");

        return clientCall(request, GetDigitalTwinModelSpecResponse::builder)
                .logger(LOG, "getDigitalTwinModelSpec")
                .serviceDetails("Iot", "GetDigitalTwinModelSpec", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinModelSpecRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .appendPathParam("spec")
                .accept("application/json, application/ld+json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        GetDigitalTwinModelSpecResponse.ResultWrapper.class,
                        GetDigitalTwinModelSpecResponse.Builder::resultWrapper)
                .handleResponseHeaderString("etag", GetDigitalTwinModelSpecResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinModelSpecResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalTwinRelationshipResponse>
            getDigitalTwinRelationship(
                    GetDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalTwinRelationshipRequest,
                                    GetDigitalTwinRelationshipResponse>
                            handler) {

        Validate.notBlank(
                request.getDigitalTwinRelationshipId(),
                "digitalTwinRelationshipId must not be blank");

        return clientCall(request, GetDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "getDigitalTwinRelationship")
                .serviceDetails("Iot", "GetDigitalTwinRelationship", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendPathParam(request.getDigitalTwinRelationshipId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationship.class,
                        GetDigitalTwinRelationshipResponse.Builder::digitalTwinRelationship)
                .handleResponseHeaderString(
                        "etag", GetDigitalTwinRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIotDomainResponse> getIotDomain(
            GetIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetIotDomainRequest, GetIotDomainResponse>
                    handler) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");

        return clientCall(request, GetIotDomainResponse::builder)
                .logger(LOG, "getIotDomain")
                .serviceDetails("Iot", "GetIotDomain", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomain.class,
                        GetIotDomainResponse.Builder::iotDomain)
                .handleResponseHeaderString("etag", GetIotDomainResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIotDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetIotDomainGroupResponse> getIotDomainGroup(
            GetIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetIotDomainGroupRequest, GetIotDomainGroupResponse>
                    handler) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");

        return clientCall(request, GetIotDomainGroupResponse::builder)
                .logger(LOG, "getIotDomainGroup")
                .serviceDetails("Iot", "GetIotDomainGroup", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomainGroup.class,
                        GetIotDomainGroupResponse.Builder::iotDomainGroup)
                .handleResponseHeaderString("etag", GetIotDomainGroupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetIotDomainGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails("Iot", "GetWorkRequest", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InvokeRawCommandResponse> invokeRawCommand(
            InvokeRawCommandRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InvokeRawCommandRequest, InvokeRawCommandResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInvokeRawCommandDetails(), "invokeRawCommandDetails is required");

        return clientCall(request, InvokeRawCommandResponse::builder)
                .logger(LOG, "invokeRawCommand")
                .serviceDetails("Iot", "InvokeRawCommand", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InvokeRawCommandRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .appendPathParam("actions")
                .appendPathParam("invokeRawCommand")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", InvokeRawCommandResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "Content-Location", InvokeRawCommandResponse.Builder::contentLocation)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDigitalTwinAdaptersResponse> listDigitalTwinAdapters(
            ListDigitalTwinAdaptersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinAdaptersRequest, ListDigitalTwinAdaptersResponse>
                    handler) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinAdaptersResponse::builder)
                .logger(LOG, "listDigitalTwinAdapters")
                .serviceDetails("Iot", "ListDigitalTwinAdapters", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinAdaptersRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("digitalTwinModelSpecUri", request.getDigitalTwinModelSpecUri())
                .appendQueryParam("digitalTwinModelId", request.getDigitalTwinModelId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapterCollection.class,
                        ListDigitalTwinAdaptersResponse.Builder::digitalTwinAdapterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalTwinAdaptersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinAdaptersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinAdaptersResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDigitalTwinInstancesResponse> listDigitalTwinInstances(
            ListDigitalTwinInstancesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinInstancesRequest, ListDigitalTwinInstancesResponse>
                    handler) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinInstancesResponse::builder)
                .logger(LOG, "listDigitalTwinInstances")
                .serviceDetails("Iot", "ListDigitalTwinInstances", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinInstancesRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("digitalTwinModelId", request.getDigitalTwinModelId())
                .appendQueryParam("digitalTwinModelSpecUri", request.getDigitalTwinModelSpecUri())
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstanceCollection.class,
                        ListDigitalTwinInstancesResponse.Builder::digitalTwinInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalTwinInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinInstancesResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDigitalTwinModelsResponse> listDigitalTwinModels(
            ListDigitalTwinModelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalTwinModelsRequest, ListDigitalTwinModelsResponse>
                    handler) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinModelsResponse::builder)
                .logger(LOG, "listDigitalTwinModels")
                .serviceDetails("Iot", "ListDigitalTwinModels", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinModelsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("specUriStartsWith", request.getSpecUriStartsWith())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModelCollection.class,
                        ListDigitalTwinModelsResponse.Builder::digitalTwinModelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalTwinModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinModelsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinModelsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDigitalTwinRelationshipsResponse>
            listDigitalTwinRelationships(
                    ListDigitalTwinRelationshipsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDigitalTwinRelationshipsRequest,
                                    ListDigitalTwinRelationshipsResponse>
                            handler) {
        Objects.requireNonNull(request.getIotDomainId(), "iotDomainId is required");

        return clientCall(request, ListDigitalTwinRelationshipsResponse::builder)
                .logger(LOG, "listDigitalTwinRelationships")
                .serviceDetails("Iot", "ListDigitalTwinRelationships", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalTwinRelationshipsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("contentPath", request.getContentPath())
                .appendQueryParam(
                        "sourceDigitalTwinInstanceId", request.getSourceDigitalTwinInstanceId())
                .appendQueryParam(
                        "targetDigitalTwinInstanceId", request.getTargetDigitalTwinInstanceId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("iotDomainId", request.getIotDomainId())
                .appendQueryParam("id", request.getId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationshipCollection.class,
                        ListDigitalTwinRelationshipsResponse.Builder
                                ::digitalTwinRelationshipCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDigitalTwinRelationshipsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalTwinRelationshipsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListDigitalTwinRelationshipsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIotDomainGroupsResponse> listIotDomainGroups(
            ListIotDomainGroupsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIotDomainGroupsRequest, ListIotDomainGroupsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIotDomainGroupsResponse::builder)
                .logger(LOG, "listIotDomainGroups")
                .serviceDetails("Iot", "ListIotDomainGroups", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIotDomainGroupsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomainGroupCollection.class,
                        ListIotDomainGroupsResponse.Builder::iotDomainGroupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIotDomainGroupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIotDomainGroupsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListIotDomainGroupsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListIotDomainsResponse> listIotDomains(
            ListIotDomainsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListIotDomainsRequest, ListIotDomainsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListIotDomainsResponse::builder)
                .logger(LOG, "listIotDomains")
                .serviceDetails("Iot", "ListIotDomains", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListIotDomainsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("iotDomainGroupId", request.getIotDomainGroupId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.IotDomainCollection.class,
                        ListIotDomainsResponse.Builder::iotDomainCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListIotDomainsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListIotDomainsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListIotDomainsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails("Iot", "ListWorkRequestErrors", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestErrorsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails("Iot", "ListWorkRequestLogs", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestLogsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails("Iot", "ListWorkRequests", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20250531")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.iot.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListWorkRequestsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalTwinAdapterResponse> updateDigitalTwinAdapter(
            UpdateDigitalTwinAdapterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinAdapterRequest, UpdateDigitalTwinAdapterResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinAdapterId(), "digitalTwinAdapterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinAdapterDetails(),
                "updateDigitalTwinAdapterDetails is required");

        return clientCall(request, UpdateDigitalTwinAdapterResponse::builder)
                .logger(LOG, "updateDigitalTwinAdapter")
                .serviceDetails("Iot", "UpdateDigitalTwinAdapter", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinAdapterRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinAdapters")
                .appendPathParam(request.getDigitalTwinAdapterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinAdapter.class,
                        UpdateDigitalTwinAdapterResponse.Builder::digitalTwinAdapter)
                .handleResponseHeaderString("etag", UpdateDigitalTwinAdapterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalTwinAdapterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalTwinInstanceResponse> updateDigitalTwinInstance(
            UpdateDigitalTwinInstanceRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinInstanceRequest, UpdateDigitalTwinInstanceResponse>
                    handler) {

        Validate.notBlank(
                request.getDigitalTwinInstanceId(), "digitalTwinInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinInstanceDetails(),
                "updateDigitalTwinInstanceDetails is required");

        return clientCall(request, UpdateDigitalTwinInstanceResponse::builder)
                .logger(LOG, "updateDigitalTwinInstance")
                .serviceDetails("Iot", "UpdateDigitalTwinInstance", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinInstanceRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinInstances")
                .appendPathParam(request.getDigitalTwinInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinInstance.class,
                        UpdateDigitalTwinInstanceResponse.Builder::digitalTwinInstance)
                .handleResponseHeaderString("etag", UpdateDigitalTwinInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalTwinInstanceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalTwinModelResponse> updateDigitalTwinModel(
            UpdateDigitalTwinModelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalTwinModelRequest, UpdateDigitalTwinModelResponse>
                    handler) {

        Validate.notBlank(request.getDigitalTwinModelId(), "digitalTwinModelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinModelDetails(),
                "updateDigitalTwinModelDetails is required");

        return clientCall(request, UpdateDigitalTwinModelResponse::builder)
                .logger(LOG, "updateDigitalTwinModel")
                .serviceDetails("Iot", "UpdateDigitalTwinModel", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinModelRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinModels")
                .appendPathParam(request.getDigitalTwinModelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinModel.class,
                        UpdateDigitalTwinModelResponse.Builder::digitalTwinModel)
                .handleResponseHeaderString("etag", UpdateDigitalTwinModelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalTwinModelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalTwinRelationshipResponse>
            updateDigitalTwinRelationship(
                    UpdateDigitalTwinRelationshipRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDigitalTwinRelationshipRequest,
                                    UpdateDigitalTwinRelationshipResponse>
                            handler) {

        Validate.notBlank(
                request.getDigitalTwinRelationshipId(),
                "digitalTwinRelationshipId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalTwinRelationshipDetails(),
                "updateDigitalTwinRelationshipDetails is required");

        return clientCall(request, UpdateDigitalTwinRelationshipResponse::builder)
                .logger(LOG, "updateDigitalTwinRelationship")
                .serviceDetails("Iot", "UpdateDigitalTwinRelationship", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalTwinRelationshipRequest::builder)
                .basePath("/20250531")
                .appendPathParam("digitalTwinRelationships")
                .appendPathParam(request.getDigitalTwinRelationshipId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.iot.model.DigitalTwinRelationship.class,
                        UpdateDigitalTwinRelationshipResponse.Builder::digitalTwinRelationship)
                .handleResponseHeaderString(
                        "etag", UpdateDigitalTwinRelationshipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDigitalTwinRelationshipResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIotDomainResponse> updateIotDomain(
            UpdateIotDomainRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIotDomainRequest, UpdateIotDomainResponse>
                    handler) {

        Validate.notBlank(request.getIotDomainId(), "iotDomainId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIotDomainDetails(), "updateIotDomainDetails is required");

        return clientCall(request, UpdateIotDomainResponse::builder)
                .logger(LOG, "updateIotDomain")
                .serviceDetails("Iot", "UpdateIotDomain", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIotDomainRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomains")
                .appendPathParam(request.getIotDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateIotDomainResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIotDomainResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateIotDomainGroupResponse> updateIotDomainGroup(
            UpdateIotDomainGroupRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateIotDomainGroupRequest, UpdateIotDomainGroupResponse>
                    handler) {

        Validate.notBlank(request.getIotDomainGroupId(), "iotDomainGroupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateIotDomainGroupDetails(),
                "updateIotDomainGroupDetails is required");

        return clientCall(request, UpdateIotDomainGroupResponse::builder)
                .logger(LOG, "updateIotDomainGroup")
                .serviceDetails("Iot", "UpdateIotDomainGroup", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateIotDomainGroupRequest::builder)
                .basePath("/20250531")
                .appendPathParam("iotDomainGroups")
                .appendPathParam(request.getIotDomainGroupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateIotDomainGroupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateIotDomainGroupResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IotAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public IotAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public IotAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public IotAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public IotAsyncClient(
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
                authenticationDetailsProvider);
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
    public IotAsyncClient(
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
                authenticationDetailsProvider);
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
    public IotAsyncClient(
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
                authenticationDetailsProvider);
    }
}
