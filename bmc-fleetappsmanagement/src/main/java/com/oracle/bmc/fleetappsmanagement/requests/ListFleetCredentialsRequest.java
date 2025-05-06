/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListFleetCredentialsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFleetCredentialsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class ListFleetCredentialsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Fleet identifier. */
    private String fleetId;

    /** Unique Fleet identifier. */
    public String getFleetId() {
        return fleetId;
    }
    /** A filter to return only resources whose lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState lifecycleState;

    /** A filter to return only resources whose lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** Resource Identifier */
    private String resourceId;

    /** Resource Identifier */
    public String getResourceId() {
        return resourceId;
    }
    /** A filter to return only resources whose target matches the given target name. */
    private String target;

    /** A filter to return only resources whose target matches the given target name. */
    public String getTarget() {
        return target;
    }
    /**
     * A filter to return only resources whose credentialLevel matches the given credentialLevel.
     */
    private com.oracle.bmc.fleetappsmanagement.model.CredentialEntitySpecificDetails.CredentialLevel
            credentialLevel;

    /**
     * A filter to return only resources whose credentialLevel matches the given credentialLevel.
     */
    public com.oracle.bmc.fleetappsmanagement.model.CredentialEntitySpecificDetails.CredentialLevel
            getCredentialLevel() {
        return credentialLevel;
    }
    /**
     * A filter to return only resources whose credential identifier matches the given identifier.
     */
    private String id;

    /**
     * A filter to return only resources whose credential identifier matches the given identifier.
     */
    public String getId() {
        return id;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFleetCredentialsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Fleet identifier. */
        private String fleetId = null;

        /**
         * Unique Fleet identifier.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetappsmanagement.model.FleetCredential.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Resource Identifier */
        private String resourceId = null;

        /**
         * Resource Identifier
         *
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /** A filter to return only resources whose target matches the given target name. */
        private String target = null;

        /**
         * A filter to return only resources whose target matches the given target name.
         *
         * @param target the value to set
         * @return this builder instance
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * A filter to return only resources whose credentialLevel matches the given
         * credentialLevel.
         */
        private com.oracle.bmc.fleetappsmanagement.model.CredentialEntitySpecificDetails
                        .CredentialLevel
                credentialLevel = null;

        /**
         * A filter to return only resources whose credentialLevel matches the given
         * credentialLevel.
         *
         * @param credentialLevel the value to set
         * @return this builder instance
         */
        public Builder credentialLevel(
                com.oracle.bmc.fleetappsmanagement.model.CredentialEntitySpecificDetails
                                .CredentialLevel
                        credentialLevel) {
            this.credentialLevel = credentialLevel;
            return this;
        }

        /**
         * A filter to return only resources whose credential identifier matches the given
         * identifier.
         */
        private String id = null;

        /**
         * A filter to return only resources whose credential identifier matches the given
         * identifier.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(
                com.oracle.bmc.fleetappsmanagement.model.FleetCredentialSortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListFleetCredentialsRequest o) {
            fleetId(o.getFleetId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            resourceId(o.getResourceId());
            target(o.getTarget());
            credentialLevel(o.getCredentialLevel());
            id(o.getId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFleetCredentialsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListFleetCredentialsRequest
         */
        public ListFleetCredentialsRequest build() {
            ListFleetCredentialsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFleetCredentialsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFleetCredentialsRequest
         */
        public ListFleetCredentialsRequest buildWithoutInvocationCallback() {
            ListFleetCredentialsRequest request = new ListFleetCredentialsRequest();
            request.fleetId = fleetId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.resourceId = resourceId;
            request.target = target;
            request.credentialLevel = credentialLevel;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFleetCredentialsRequest(fleetId, lifecycleState, displayName, resourceId,
            // target, credentialLevel, id, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .resourceId(resourceId)
                .target(target)
                .credentialLevel(credentialLevel)
                .id(id)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",target=").append(String.valueOf(this.target));
        sb.append(",credentialLevel=").append(String.valueOf(this.credentialLevel));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFleetCredentialsRequest)) {
            return false;
        }

        ListFleetCredentialsRequest other = (ListFleetCredentialsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.credentialLevel, other.credentialLevel)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialLevel == null ? 43 : this.credentialLevel.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
