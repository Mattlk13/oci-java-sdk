/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/UpdateOracleDbAzureVaultAssociationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOracleDbAzureVaultAssociationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class UpdateOracleDbAzureVaultAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails> {

    /** The ID of the Oracle DB Azure Vault Association Resource. */
    private String oracleDbAzureVaultAssociationId;

    /** The ID of the Oracle DB Azure Vault Association Resource. */
    public String getOracleDbAzureVaultAssociationId() {
        return oracleDbAzureVaultAssociationId;
    }
    /** Details for to update OracleDbAzureVaultAssociation. */
    private com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails
            updateOracleDbAzureVaultAssociationDetails;

    /** Details for to update OracleDbAzureVaultAssociation. */
    public com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails
            getUpdateOracleDbAzureVaultAssociationDetails() {
        return updateOracleDbAzureVaultAssociationDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails getBody$() {
        return updateOracleDbAzureVaultAssociationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOracleDbAzureVaultAssociationRequest,
                    com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the Oracle DB Azure Vault Association Resource. */
        private String oracleDbAzureVaultAssociationId = null;

        /**
         * The ID of the Oracle DB Azure Vault Association Resource.
         *
         * @param oracleDbAzureVaultAssociationId the value to set
         * @return this builder instance
         */
        public Builder oracleDbAzureVaultAssociationId(String oracleDbAzureVaultAssociationId) {
            this.oracleDbAzureVaultAssociationId = oracleDbAzureVaultAssociationId;
            return this;
        }

        /** Details for to update OracleDbAzureVaultAssociation. */
        private com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails
                updateOracleDbAzureVaultAssociationDetails = null;

        /**
         * Details for to update OracleDbAzureVaultAssociation.
         *
         * @param updateOracleDbAzureVaultAssociationDetails the value to set
         * @return this builder instance
         */
        public Builder updateOracleDbAzureVaultAssociationDetails(
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails
                        updateOracleDbAzureVaultAssociationDetails) {
            this.updateOracleDbAzureVaultAssociationDetails =
                    updateOracleDbAzureVaultAssociationDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(UpdateOracleDbAzureVaultAssociationRequest o) {
            oracleDbAzureVaultAssociationId(o.getOracleDbAzureVaultAssociationId());
            updateOracleDbAzureVaultAssociationDetails(
                    o.getUpdateOracleDbAzureVaultAssociationDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOracleDbAzureVaultAssociationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOracleDbAzureVaultAssociationRequest
         */
        public UpdateOracleDbAzureVaultAssociationRequest build() {
            UpdateOracleDbAzureVaultAssociationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.dbmulticloud.model.UpdateOracleDbAzureVaultAssociationDetails body) {
            updateOracleDbAzureVaultAssociationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOracleDbAzureVaultAssociationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOracleDbAzureVaultAssociationRequest
         */
        public UpdateOracleDbAzureVaultAssociationRequest buildWithoutInvocationCallback() {
            UpdateOracleDbAzureVaultAssociationRequest request =
                    new UpdateOracleDbAzureVaultAssociationRequest();
            request.oracleDbAzureVaultAssociationId = oracleDbAzureVaultAssociationId;
            request.updateOracleDbAzureVaultAssociationDetails =
                    updateOracleDbAzureVaultAssociationDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOracleDbAzureVaultAssociationRequest(oracleDbAzureVaultAssociationId,
            // updateOracleDbAzureVaultAssociationDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .oracleDbAzureVaultAssociationId(oracleDbAzureVaultAssociationId)
                .updateOracleDbAzureVaultAssociationDetails(
                        updateOracleDbAzureVaultAssociationDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",oracleDbAzureVaultAssociationId=")
                .append(String.valueOf(this.oracleDbAzureVaultAssociationId));
        sb.append(",updateOracleDbAzureVaultAssociationDetails=")
                .append(String.valueOf(this.updateOracleDbAzureVaultAssociationDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOracleDbAzureVaultAssociationRequest)) {
            return false;
        }

        UpdateOracleDbAzureVaultAssociationRequest other =
                (UpdateOracleDbAzureVaultAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.oracleDbAzureVaultAssociationId, other.oracleDbAzureVaultAssociationId)
                && java.util.Objects.equals(
                        this.updateOracleDbAzureVaultAssociationDetails,
                        other.updateOracleDbAzureVaultAssociationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oracleDbAzureVaultAssociationId == null
                                ? 43
                                : this.oracleDbAzureVaultAssociationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOracleDbAzureVaultAssociationDetails == null
                                ? 43
                                : this.updateOracleDbAzureVaultAssociationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
