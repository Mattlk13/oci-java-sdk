/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/AddReturnPathLockExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use AddReturnPathLockRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class AddReturnPathLockRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.email.model.AddLockDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * email return path.
     */
    private String emailReturnPathId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * email return path.
     */
    public String getEmailReturnPathId() {
        return emailReturnPathId;
    }
    /** Details for adding a lock to a resource. */
    private com.oracle.bmc.email.model.AddLockDetails addLockDetails;

    /** Details for adding a lock to a resource. */
    public com.oracle.bmc.email.model.AddLockDetails getAddLockDetails() {
        return addLockDetails;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
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
    public com.oracle.bmc.email.model.AddLockDetails getBody$() {
        return addLockDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AddReturnPathLockRequest, com.oracle.bmc.email.model.AddLockDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * email return path.
         */
        private String emailReturnPathId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * email return path.
         *
         * @param emailReturnPathId the value to set
         * @return this builder instance
         */
        public Builder emailReturnPathId(String emailReturnPathId) {
            this.emailReturnPathId = emailReturnPathId;
            return this;
        }

        /** Details for adding a lock to a resource. */
        private com.oracle.bmc.email.model.AddLockDetails addLockDetails = null;

        /**
         * Details for adding a lock to a resource.
         *
         * @param addLockDetails the value to set
         * @return this builder instance
         */
        public Builder addLockDetails(com.oracle.bmc.email.model.AddLockDetails addLockDetails) {
            this.addLockDetails = addLockDetails;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
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
        public Builder copy(AddReturnPathLockRequest o) {
            emailReturnPathId(o.getEmailReturnPathId());
            addLockDetails(o.getAddLockDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AddReturnPathLockRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AddReturnPathLockRequest
         */
        public AddReturnPathLockRequest build() {
            AddReturnPathLockRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.email.model.AddLockDetails body) {
            addLockDetails(body);
            return this;
        }

        /**
         * Build the instance of AddReturnPathLockRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AddReturnPathLockRequest
         */
        public AddReturnPathLockRequest buildWithoutInvocationCallback() {
            AddReturnPathLockRequest request = new AddReturnPathLockRequest();
            request.emailReturnPathId = emailReturnPathId;
            request.addLockDetails = addLockDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new AddReturnPathLockRequest(emailReturnPathId, addLockDetails, opcRequestId,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .emailReturnPathId(emailReturnPathId)
                .addLockDetails(addLockDetails)
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
        sb.append(",emailReturnPathId=").append(String.valueOf(this.emailReturnPathId));
        sb.append(",addLockDetails=").append(String.valueOf(this.addLockDetails));
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
        if (!(o instanceof AddReturnPathLockRequest)) {
            return false;
        }

        AddReturnPathLockRequest other = (AddReturnPathLockRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.emailReturnPathId, other.emailReturnPathId)
                && java.util.Objects.equals(this.addLockDetails, other.addLockDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.emailReturnPathId == null ? 43 : this.emailReturnPathId.hashCode());
        result =
                (result * PRIME)
                        + (this.addLockDetails == null ? 43 : this.addLockDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
