/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class CheckCloudDbSystemConnectorConnectionStatusResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Content Location of the resource. */
    private String contentLocation;

    /**
     * Content Location of the resource.
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /** The returned {@code CloudDbSystemConnector} instance. */
    private com.oracle.bmc.databasemanagement.model.CloudDbSystemConnector cloudDbSystemConnector;

    /**
     * The returned {@code CloudDbSystemConnector} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.CloudDbSystemConnector
            getCloudDbSystemConnector() {
        return cloudDbSystemConnector;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "contentLocation",
        "cloudDbSystemConnector"
    })
    private CheckCloudDbSystemConnectorConnectionStatusResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String contentLocation,
            com.oracle.bmc.databasemanagement.model.CloudDbSystemConnector cloudDbSystemConnector) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.contentLocation = contentLocation;
        this.cloudDbSystemConnector = cloudDbSystemConnector;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CheckCloudDbSystemConnectorConnectionStatusResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Content Location of the resource. */
        private String contentLocation;

        /**
         * Content Location of the resource.
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /** The returned {@code CloudDbSystemConnector} instance. */
        private com.oracle.bmc.databasemanagement.model.CloudDbSystemConnector
                cloudDbSystemConnector;

        /**
         * The returned {@code CloudDbSystemConnector} instance.
         *
         * @param cloudDbSystemConnector the value to set
         * @return this builder
         */
        public Builder cloudDbSystemConnector(
                com.oracle.bmc.databasemanagement.model.CloudDbSystemConnector
                        cloudDbSystemConnector) {
            this.cloudDbSystemConnector = cloudDbSystemConnector;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CheckCloudDbSystemConnectorConnectionStatusResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            contentLocation(o.getContentLocation());
            cloudDbSystemConnector(o.getCloudDbSystemConnector());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CheckCloudDbSystemConnectorConnectionStatusResponse build() {
            return new CheckCloudDbSystemConnectorConnectionStatusResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    contentLocation,
                    cloudDbSystemConnector);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",cloudDbSystemConnector=").append(String.valueOf(cloudDbSystemConnector));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CheckCloudDbSystemConnectorConnectionStatusResponse)) {
            return false;
        }

        CheckCloudDbSystemConnectorConnectionStatusResponse other =
                (CheckCloudDbSystemConnectorConnectionStatusResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(
                        this.cloudDbSystemConnector, other.cloudDbSystemConnector);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudDbSystemConnector == null
                                ? 43
                                : this.cloudDbSystemConnector.hashCode());
        return result;
    }
}
