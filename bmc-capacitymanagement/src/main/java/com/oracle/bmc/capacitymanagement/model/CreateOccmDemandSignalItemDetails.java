/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * Details about different fields required to create a demand signal item resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOccmDemandSignalItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOccmDemandSignalItemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "demandSignalId",
        "demandSignalCatalogResourceId",
        "requestType",
        "region",
        "availabilityDomain",
        "targetCompartmentId",
        "demandQuantity",
        "timeNeededBefore",
        "resourceProperties",
        "notes",
        "freeformTags",
        "definedTags"
    })
    public CreateOccmDemandSignalItemDetails(
            String compartmentId,
            String demandSignalId,
            String demandSignalCatalogResourceId,
            OccmDemandSignalItemRequestType requestType,
            String region,
            String availabilityDomain,
            String targetCompartmentId,
            Long demandQuantity,
            java.util.Date timeNeededBefore,
            java.util.Map<String, String> resourceProperties,
            String notes,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.demandSignalId = demandSignalId;
        this.demandSignalCatalogResourceId = demandSignalCatalogResourceId;
        this.requestType = requestType;
        this.region = region;
        this.availabilityDomain = availabilityDomain;
        this.targetCompartmentId = targetCompartmentId;
        this.demandQuantity = demandQuantity;
        this.timeNeededBefore = timeNeededBefore;
        this.resourceProperties = resourceProperties;
        this.notes = notes;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the tenancy from which the demand signal item was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy from which the demand signal item was created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the demand signal under which we need to create this item. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandSignalId")
        private String demandSignalId;

        /**
         * The OCID of the demand signal under which we need to create this item.
         *
         * @param demandSignalId the value to set
         * @return this builder
         */
        public Builder demandSignalId(String demandSignalId) {
            this.demandSignalId = demandSignalId;
            this.__explicitlySet__.add("demandSignalId");
            return this;
        }
        /** The OCID of the correponding demand signal catalog resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandSignalCatalogResourceId")
        private String demandSignalCatalogResourceId;

        /**
         * The OCID of the correponding demand signal catalog resource.
         *
         * @param demandSignalCatalogResourceId the value to set
         * @return this builder
         */
        public Builder demandSignalCatalogResourceId(String demandSignalCatalogResourceId) {
            this.demandSignalCatalogResourceId = demandSignalCatalogResourceId;
            this.__explicitlySet__.add("demandSignalCatalogResourceId");
            return this;
        }
        /**
         * The type of request (DEMAND or RETURN) that you want to make for this demand signal item.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestType")
        private OccmDemandSignalItemRequestType requestType;

        /**
         * The type of request (DEMAND or RETURN) that you want to make for this demand signal item.
         *
         * @param requestType the value to set
         * @return this builder
         */
        public Builder requestType(OccmDemandSignalItemRequestType requestType) {
            this.requestType = requestType;
            this.__explicitlySet__.add("requestType");
            return this;
        }
        /** The name of region for which you want to request the OCI resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of region for which you want to request the OCI resource.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The name of the availability domain for which you want to request the OCI resource. This
         * is an optional parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain for which you want to request the OCI resource. This
         * is an optional parameter.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The OCID of the tenancy for which you want to request the OCI resource for. This is an
         * optional parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        /**
         * The OCID of the tenancy for which you want to request the OCI resource for. This is an
         * optional parameter.
         *
         * @param targetCompartmentId the value to set
         * @return this builder
         */
        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }
        /** The quantity of the resource that you want to demand from OCI. */
        @com.fasterxml.jackson.annotation.JsonProperty("demandQuantity")
        private Long demandQuantity;

        /**
         * The quantity of the resource that you want to demand from OCI.
         *
         * @param demandQuantity the value to set
         * @return this builder
         */
        public Builder demandQuantity(Long demandQuantity) {
            this.demandQuantity = demandQuantity;
            this.__explicitlySet__.add("demandQuantity");
            return this;
        }
        /** the date before which you would ideally like the OCI resource to be delivered to you. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNeededBefore")
        private java.util.Date timeNeededBefore;

        /**
         * the date before which you would ideally like the OCI resource to be delivered to you.
         *
         * @param timeNeededBefore the value to set
         * @return this builder
         */
        public Builder timeNeededBefore(java.util.Date timeNeededBefore) {
            this.timeNeededBefore = timeNeededBefore;
            this.__explicitlySet__.add("timeNeededBefore");
            return this;
        }
        /** A map of various properties associated with the OCI resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceProperties")
        private java.util.Map<String, String> resourceProperties;

        /**
         * A map of various properties associated with the OCI resource.
         *
         * @param resourceProperties the value to set
         * @return this builder
         */
        public Builder resourceProperties(java.util.Map<String, String> resourceProperties) {
            this.resourceProperties = resourceProperties;
            this.__explicitlySet__.add("resourceProperties");
            return this;
        }
        /**
         * This field will serve as notes section for you. You can use this section to convey a
         * message to OCI regarding your resource request.
         *
         * <p>NOTE: The previous value gets overwritten with the new one for this once updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        private String notes;

        /**
         * This field will serve as notes section for you. You can use this section to convey a
         * message to OCI regarding your resource request.
         *
         * <p>NOTE: The previous value gets overwritten with the new one for this once updated.
         *
         * @param notes the value to set
         * @return this builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            this.__explicitlySet__.add("notes");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOccmDemandSignalItemDetails build() {
            CreateOccmDemandSignalItemDetails model =
                    new CreateOccmDemandSignalItemDetails(
                            this.compartmentId,
                            this.demandSignalId,
                            this.demandSignalCatalogResourceId,
                            this.requestType,
                            this.region,
                            this.availabilityDomain,
                            this.targetCompartmentId,
                            this.demandQuantity,
                            this.timeNeededBefore,
                            this.resourceProperties,
                            this.notes,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOccmDemandSignalItemDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("demandSignalId")) {
                this.demandSignalId(model.getDemandSignalId());
            }
            if (model.wasPropertyExplicitlySet("demandSignalCatalogResourceId")) {
                this.demandSignalCatalogResourceId(model.getDemandSignalCatalogResourceId());
            }
            if (model.wasPropertyExplicitlySet("requestType")) {
                this.requestType(model.getRequestType());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("targetCompartmentId")) {
                this.targetCompartmentId(model.getTargetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("demandQuantity")) {
                this.demandQuantity(model.getDemandQuantity());
            }
            if (model.wasPropertyExplicitlySet("timeNeededBefore")) {
                this.timeNeededBefore(model.getTimeNeededBefore());
            }
            if (model.wasPropertyExplicitlySet("resourceProperties")) {
                this.resourceProperties(model.getResourceProperties());
            }
            if (model.wasPropertyExplicitlySet("notes")) {
                this.notes(model.getNotes());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the tenancy from which the demand signal item was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy from which the demand signal item was created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the demand signal under which we need to create this item. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandSignalId")
    private final String demandSignalId;

    /**
     * The OCID of the demand signal under which we need to create this item.
     *
     * @return the value
     */
    public String getDemandSignalId() {
        return demandSignalId;
    }

    /** The OCID of the correponding demand signal catalog resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandSignalCatalogResourceId")
    private final String demandSignalCatalogResourceId;

    /**
     * The OCID of the correponding demand signal catalog resource.
     *
     * @return the value
     */
    public String getDemandSignalCatalogResourceId() {
        return demandSignalCatalogResourceId;
    }

    /** The type of request (DEMAND or RETURN) that you want to make for this demand signal item. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestType")
    private final OccmDemandSignalItemRequestType requestType;

    /**
     * The type of request (DEMAND or RETURN) that you want to make for this demand signal item.
     *
     * @return the value
     */
    public OccmDemandSignalItemRequestType getRequestType() {
        return requestType;
    }

    /** The name of region for which you want to request the OCI resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of region for which you want to request the OCI resource.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The name of the availability domain for which you want to request the OCI resource. This is
     * an optional parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain for which you want to request the OCI resource. This is
     * an optional parameter.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the tenancy for which you want to request the OCI resource for. This is an
     * optional parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    /**
     * The OCID of the tenancy for which you want to request the OCI resource for. This is an
     * optional parameter.
     *
     * @return the value
     */
    public String getTargetCompartmentId() {
        return targetCompartmentId;
    }

    /** The quantity of the resource that you want to demand from OCI. */
    @com.fasterxml.jackson.annotation.JsonProperty("demandQuantity")
    private final Long demandQuantity;

    /**
     * The quantity of the resource that you want to demand from OCI.
     *
     * @return the value
     */
    public Long getDemandQuantity() {
        return demandQuantity;
    }

    /** the date before which you would ideally like the OCI resource to be delivered to you. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNeededBefore")
    private final java.util.Date timeNeededBefore;

    /**
     * the date before which you would ideally like the OCI resource to be delivered to you.
     *
     * @return the value
     */
    public java.util.Date getTimeNeededBefore() {
        return timeNeededBefore;
    }

    /** A map of various properties associated with the OCI resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceProperties")
    private final java.util.Map<String, String> resourceProperties;

    /**
     * A map of various properties associated with the OCI resource.
     *
     * @return the value
     */
    public java.util.Map<String, String> getResourceProperties() {
        return resourceProperties;
    }

    /**
     * This field will serve as notes section for you. You can use this section to convey a message
     * to OCI regarding your resource request.
     *
     * <p>NOTE: The previous value gets overwritten with the new one for this once updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notes")
    private final String notes;

    /**
     * This field will serve as notes section for you. You can use this section to convey a message
     * to OCI regarding your resource request.
     *
     * <p>NOTE: The previous value gets overwritten with the new one for this once updated.
     *
     * @return the value
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateOccmDemandSignalItemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", demandSignalId=").append(String.valueOf(this.demandSignalId));
        sb.append(", demandSignalCatalogResourceId=")
                .append(String.valueOf(this.demandSignalCatalogResourceId));
        sb.append(", requestType=").append(String.valueOf(this.requestType));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", targetCompartmentId=").append(String.valueOf(this.targetCompartmentId));
        sb.append(", demandQuantity=").append(String.valueOf(this.demandQuantity));
        sb.append(", timeNeededBefore=").append(String.valueOf(this.timeNeededBefore));
        sb.append(", resourceProperties=").append(String.valueOf(this.resourceProperties));
        sb.append(", notes=").append(String.valueOf(this.notes));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOccmDemandSignalItemDetails)) {
            return false;
        }

        CreateOccmDemandSignalItemDetails other = (CreateOccmDemandSignalItemDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.demandSignalId, other.demandSignalId)
                && java.util.Objects.equals(
                        this.demandSignalCatalogResourceId, other.demandSignalCatalogResourceId)
                && java.util.Objects.equals(this.requestType, other.requestType)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.targetCompartmentId, other.targetCompartmentId)
                && java.util.Objects.equals(this.demandQuantity, other.demandQuantity)
                && java.util.Objects.equals(this.timeNeededBefore, other.timeNeededBefore)
                && java.util.Objects.equals(this.resourceProperties, other.resourceProperties)
                && java.util.Objects.equals(this.notes, other.notes)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.demandSignalId == null ? 43 : this.demandSignalId.hashCode());
        result =
                (result * PRIME)
                        + (this.demandSignalCatalogResourceId == null
                                ? 43
                                : this.demandSignalCatalogResourceId.hashCode());
        result = (result * PRIME) + (this.requestType == null ? 43 : this.requestType.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCompartmentId == null
                                ? 43
                                : this.targetCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.demandQuantity == null ? 43 : this.demandQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNeededBefore == null ? 43 : this.timeNeededBefore.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceProperties == null
                                ? 43
                                : this.resourceProperties.hashCode());
        result = (result * PRIME) + (this.notes == null ? 43 : this.notes.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
