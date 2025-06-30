/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeCloudAutonomousVmClusterSubscriptionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeCloudAutonomousVmClusterSubscriptionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeCloudAutonomousVmClusterSubscriptionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails> {

    /** Associate a Cloud Autonomous VM cluster with a different subscription. */
    private com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails
            changeCloudAutonomousVmClusterSubscriptionDetails;

    /** Associate a Cloud Autonomous VM cluster with a different subscription. */
    public com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails
            getChangeCloudAutonomousVmClusterSubscriptionDetails() {
        return changeCloudAutonomousVmClusterSubscriptionDetails;
    }
    /**
     * The Cloud VM cluster
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String cloudAutonomousVmClusterId;

    /**
     * The Cloud VM cluster
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails
            getBody$() {
        return changeCloudAutonomousVmClusterSubscriptionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeCloudAutonomousVmClusterSubscriptionRequest,
                    com.oracle.bmc.database.model
                            .ChangeCloudAutonomousVmClusterSubscriptionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Associate a Cloud Autonomous VM cluster with a different subscription. */
        private com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails
                changeCloudAutonomousVmClusterSubscriptionDetails = null;

        /**
         * Associate a Cloud Autonomous VM cluster with a different subscription.
         *
         * @param changeCloudAutonomousVmClusterSubscriptionDetails the value to set
         * @return this builder instance
         */
        public Builder changeCloudAutonomousVmClusterSubscriptionDetails(
                com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails
                        changeCloudAutonomousVmClusterSubscriptionDetails) {
            this.changeCloudAutonomousVmClusterSubscriptionDetails =
                    changeCloudAutonomousVmClusterSubscriptionDetails;
            return this;
        }

        /**
         * The Cloud VM cluster
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String cloudAutonomousVmClusterId = null;

        /**
         * The Cloud VM cluster
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder instance
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
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
        public Builder copy(ChangeCloudAutonomousVmClusterSubscriptionRequest o) {
            changeCloudAutonomousVmClusterSubscriptionDetails(
                    o.getChangeCloudAutonomousVmClusterSubscriptionDetails());
            cloudAutonomousVmClusterId(o.getCloudAutonomousVmClusterId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeCloudAutonomousVmClusterSubscriptionRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeCloudAutonomousVmClusterSubscriptionRequest
         */
        public ChangeCloudAutonomousVmClusterSubscriptionRequest build() {
            ChangeCloudAutonomousVmClusterSubscriptionRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.ChangeCloudAutonomousVmClusterSubscriptionDetails
                        body) {
            changeCloudAutonomousVmClusterSubscriptionDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeCloudAutonomousVmClusterSubscriptionRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeCloudAutonomousVmClusterSubscriptionRequest
         */
        public ChangeCloudAutonomousVmClusterSubscriptionRequest buildWithoutInvocationCallback() {
            ChangeCloudAutonomousVmClusterSubscriptionRequest request =
                    new ChangeCloudAutonomousVmClusterSubscriptionRequest();
            request.changeCloudAutonomousVmClusterSubscriptionDetails =
                    changeCloudAutonomousVmClusterSubscriptionDetails;
            request.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new
            // ChangeCloudAutonomousVmClusterSubscriptionRequest(changeCloudAutonomousVmClusterSubscriptionDetails, cloudAutonomousVmClusterId, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .changeCloudAutonomousVmClusterSubscriptionDetails(
                        changeCloudAutonomousVmClusterSubscriptionDetails)
                .cloudAutonomousVmClusterId(cloudAutonomousVmClusterId)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",changeCloudAutonomousVmClusterSubscriptionDetails=")
                .append(String.valueOf(this.changeCloudAutonomousVmClusterSubscriptionDetails));
        sb.append(",cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeCloudAutonomousVmClusterSubscriptionRequest)) {
            return false;
        }

        ChangeCloudAutonomousVmClusterSubscriptionRequest other =
                (ChangeCloudAutonomousVmClusterSubscriptionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.changeCloudAutonomousVmClusterSubscriptionDetails,
                        other.changeCloudAutonomousVmClusterSubscriptionDetails)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.changeCloudAutonomousVmClusterSubscriptionDetails == null
                                ? 43
                                : this.changeCloudAutonomousVmClusterSubscriptionDetails
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
