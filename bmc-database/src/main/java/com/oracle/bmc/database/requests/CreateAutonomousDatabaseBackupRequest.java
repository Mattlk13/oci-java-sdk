/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousDatabaseBackupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateAutonomousDatabaseBackupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateAutonomousDatabaseBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails> {

    /** Request to create a new Autonomous Database backup. */
    private com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails
            createAutonomousDatabaseBackupDetails;

    /** Request to create a new Autonomous Database backup. */
    public com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails
            getCreateAutonomousDatabaseBackupDetails() {
        return createAutonomousDatabaseBackupDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not
     * actually creating or updating a resource and is used only to perform validation on the
     * submitted data.
     */
    private Boolean opcDryRun;

    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not
     * actually creating or updating a resource and is used only to perform validation on the
     * submitted data.
     */
    public Boolean getOpcDryRun() {
        return opcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails getBody$() {
        return createAutonomousDatabaseBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateAutonomousDatabaseBackupRequest,
                    com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request to create a new Autonomous Database backup. */
        private com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails
                createAutonomousDatabaseBackupDetails = null;

        /**
         * Request to create a new Autonomous Database backup.
         *
         * @param createAutonomousDatabaseBackupDetails the value to set
         * @return this builder instance
         */
        public Builder createAutonomousDatabaseBackupDetails(
                com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails
                        createAutonomousDatabaseBackupDetails) {
            this.createAutonomousDatabaseBackupDetails = createAutonomousDatabaseBackupDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * actually creating or updating a resource and is used only to perform validation on the
         * submitted data.
         */
        private Boolean opcDryRun = null;

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not
         * actually creating or updating a resource and is used only to perform validation on the
         * submitted data.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(Boolean opcDryRun) {
            this.opcDryRun = opcDryRun;
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
        public Builder copy(CreateAutonomousDatabaseBackupRequest o) {
            createAutonomousDatabaseBackupDetails(o.getCreateAutonomousDatabaseBackupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opcDryRun(o.getOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateAutonomousDatabaseBackupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateAutonomousDatabaseBackupRequest
         */
        public CreateAutonomousDatabaseBackupRequest build() {
            CreateAutonomousDatabaseBackupRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.CreateAutonomousDatabaseBackupDetails body) {
            createAutonomousDatabaseBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateAutonomousDatabaseBackupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateAutonomousDatabaseBackupRequest
         */
        public CreateAutonomousDatabaseBackupRequest buildWithoutInvocationCallback() {
            CreateAutonomousDatabaseBackupRequest request =
                    new CreateAutonomousDatabaseBackupRequest();
            request.createAutonomousDatabaseBackupDetails = createAutonomousDatabaseBackupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.opcDryRun = opcDryRun;
            return request;
            // new CreateAutonomousDatabaseBackupRequest(createAutonomousDatabaseBackupDetails,
            // opcRetryToken, opcRequestId, opcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createAutonomousDatabaseBackupDetails(createAutonomousDatabaseBackupDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .opcDryRun(opcDryRun);
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
        sb.append(",createAutonomousDatabaseBackupDetails=")
                .append(String.valueOf(this.createAutonomousDatabaseBackupDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousDatabaseBackupRequest)) {
            return false;
        }

        CreateAutonomousDatabaseBackupRequest other = (CreateAutonomousDatabaseBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createAutonomousDatabaseBackupDetails,
                        other.createAutonomousDatabaseBackupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createAutonomousDatabaseBackupDetails == null
                                ? 43
                                : this.createAutonomousDatabaseBackupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        return result;
    }
}
