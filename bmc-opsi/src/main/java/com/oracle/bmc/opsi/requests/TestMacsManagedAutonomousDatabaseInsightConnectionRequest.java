/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/TestMacsManagedAutonomousDatabaseInsightConnectionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * TestMacsManagedAutonomousDatabaseInsightConnectionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class TestMacsManagedAutonomousDatabaseInsightConnectionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model
                        .TestMacsManagedAutonomousDatabaseInsightConnectionDetails> {

    /** The database connection information for the MACS-managed autonomous database. */
    private com.oracle.bmc.opsi.model.TestMacsManagedAutonomousDatabaseInsightConnectionDetails
            testMacsManagedAutonomousDatabaseInsightConnectionDetails;

    /** The database connection information for the MACS-managed autonomous database. */
    public com.oracle.bmc.opsi.model.TestMacsManagedAutonomousDatabaseInsightConnectionDetails
            getTestMacsManagedAutonomousDatabaseInsightConnectionDetails() {
        return testMacsManagedAutonomousDatabaseInsightConnectionDetails;
    }
    /**
     * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated DBaaS entity.
     */
    private String databaseId;

    /**
     * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated DBaaS entity.
     */
    public String getDatabaseId() {
        return databaseId;
    }
    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database
     * insight resource.
     */
    private String id;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database
     * insight resource.
     */
    public String getId() {
        return id;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or server
     * error without risk of executing the same action again. Retry tokens expire after 24 hours.
     *
     * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or server
     * error without risk of executing the same action again. Retry tokens expire after 24 hours.
     *
     * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.TestMacsManagedAutonomousDatabaseInsightConnectionDetails
            getBody$() {
        return testMacsManagedAutonomousDatabaseInsightConnectionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TestMacsManagedAutonomousDatabaseInsightConnectionRequest,
                    com.oracle.bmc.opsi.model
                            .TestMacsManagedAutonomousDatabaseInsightConnectionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The database connection information for the MACS-managed autonomous database. */
        private com.oracle.bmc.opsi.model.TestMacsManagedAutonomousDatabaseInsightConnectionDetails
                testMacsManagedAutonomousDatabaseInsightConnectionDetails = null;

        /**
         * The database connection information for the MACS-managed autonomous database.
         *
         * @param testMacsManagedAutonomousDatabaseInsightConnectionDetails the value to set
         * @return this builder instance
         */
        public Builder testMacsManagedAutonomousDatabaseInsightConnectionDetails(
                com.oracle.bmc.opsi.model.TestMacsManagedAutonomousDatabaseInsightConnectionDetails
                        testMacsManagedAutonomousDatabaseInsightConnectionDetails) {
            this.testMacsManagedAutonomousDatabaseInsightConnectionDetails =
                    testMacsManagedAutonomousDatabaseInsightConnectionDetails;
            return this;
        }

        /**
         * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the associated DBaaS entity.
         */
        private String databaseId = null;

        /**
         * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the associated DBaaS entity.
         *
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database insight resource.
         */
        private String id = null;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database insight resource.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after
         * 24 hours.
         *
         * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to
         * conflicting operations, such as a resource being deleted or purged from the system.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after
         * 24 hours.
         *
         * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to
         * conflicting operations, such as a resource being deleted or purged from the system.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(TestMacsManagedAutonomousDatabaseInsightConnectionRequest o) {
            testMacsManagedAutonomousDatabaseInsightConnectionDetails(
                    o.getTestMacsManagedAutonomousDatabaseInsightConnectionDetails());
            databaseId(o.getDatabaseId());
            id(o.getId());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TestMacsManagedAutonomousDatabaseInsightConnectionRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of TestMacsManagedAutonomousDatabaseInsightConnectionRequest
         */
        public TestMacsManagedAutonomousDatabaseInsightConnectionRequest build() {
            TestMacsManagedAutonomousDatabaseInsightConnectionRequest request =
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
                com.oracle.bmc.opsi.model.TestMacsManagedAutonomousDatabaseInsightConnectionDetails
                        body) {
            testMacsManagedAutonomousDatabaseInsightConnectionDetails(body);
            return this;
        }

        /**
         * Build the instance of TestMacsManagedAutonomousDatabaseInsightConnectionRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TestMacsManagedAutonomousDatabaseInsightConnectionRequest
         */
        public TestMacsManagedAutonomousDatabaseInsightConnectionRequest
                buildWithoutInvocationCallback() {
            TestMacsManagedAutonomousDatabaseInsightConnectionRequest request =
                    new TestMacsManagedAutonomousDatabaseInsightConnectionRequest();
            request.testMacsManagedAutonomousDatabaseInsightConnectionDetails =
                    testMacsManagedAutonomousDatabaseInsightConnectionDetails;
            request.databaseId = databaseId;
            request.id = id;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // TestMacsManagedAutonomousDatabaseInsightConnectionRequest(testMacsManagedAutonomousDatabaseInsightConnectionDetails, databaseId, id, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .testMacsManagedAutonomousDatabaseInsightConnectionDetails(
                        testMacsManagedAutonomousDatabaseInsightConnectionDetails)
                .databaseId(databaseId)
                .id(id)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",testMacsManagedAutonomousDatabaseInsightConnectionDetails=")
                .append(
                        String.valueOf(
                                this.testMacsManagedAutonomousDatabaseInsightConnectionDetails));
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestMacsManagedAutonomousDatabaseInsightConnectionRequest)) {
            return false;
        }

        TestMacsManagedAutonomousDatabaseInsightConnectionRequest other =
                (TestMacsManagedAutonomousDatabaseInsightConnectionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.testMacsManagedAutonomousDatabaseInsightConnectionDetails,
                        other.testMacsManagedAutonomousDatabaseInsightConnectionDetails)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.testMacsManagedAutonomousDatabaseInsightConnectionDetails == null
                                ? 43
                                : this.testMacsManagedAutonomousDatabaseInsightConnectionDetails
                                        .hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
