/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Listing revision details for service listings <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceListingRevision.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "listingType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceListingRevision extends ListingRevision {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revisionNumber")
        private String revisionNumber;

        public Builder revisionNumber(String revisionNumber) {
            this.revisionNumber = revisionNumber;
            this.__explicitlySet__.add("revisionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headline")
        private String headline;

        public Builder headline(String headline) {
            this.headline = headline;
            this.__explicitlySet__.add("headline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private String tagline;

        public Builder tagline(String tagline) {
            this.tagline = tagline;
            this.__explicitlySet__.add("tagline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private String keywords;

        public Builder keywords(String keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageInformation")
        private String usageInformation;

        public Builder usageInformation(String usageInformation) {
            this.usageInformation = usageInformation;
            this.__explicitlySet__.add("usageInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private LanguageItem contentLanguage;

        public Builder contentLanguage(LanguageItem contentLanguage) {
            this.contentLanguage = contentLanguage;
            this.__explicitlySet__.add("contentLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedlanguages")
        private java.util.List<LanguageItem> supportedlanguages;

        public Builder supportedlanguages(java.util.List<LanguageItem> supportedlanguages) {
            this.supportedlanguages = supportedlanguages;
            this.__explicitlySet__.add("supportedlanguages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportContacts")
        private java.util.List<SupportContact> supportContacts;

        public Builder supportContacts(java.util.List<SupportContact> supportContacts) {
            this.supportContacts = supportContacts;
            this.__explicitlySet__.add("supportContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportLinks")
        private java.util.List<NamedLink> supportLinks;

        public Builder supportLinks(java.util.List<NamedLink> supportLinks) {
            this.supportLinks = supportLinks;
            this.__explicitlySet__.add("supportLinks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("icon")
        private ListingRevisionIconAttachment icon;

        public Builder icon(ListingRevisionIconAttachment icon) {
            this.icon = icon;
            this.__explicitlySet__.add("icon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusNotes")
        private String statusNotes;

        public Builder statusNotes(String statusNotes) {
            this.statusNotes = statusNotes;
            this.__explicitlySet__.add("statusNotes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Custom text by partner regarding contact information */
        @com.fasterxml.jackson.annotation.JsonProperty("contactUs")
        private String contactUs;

        /**
         * Custom text by partner regarding contact information
         *
         * @param contactUs the value to set
         * @return this builder
         */
        public Builder contactUs(String contactUs) {
            this.contactUs = contactUs;
            this.__explicitlySet__.add("contactUs");
            return this;
        }
        /** List of product codes subscribed by listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("productCodes")
        private java.util.List<String> productCodes;

        /**
         * List of product codes subscribed by listing.
         *
         * @param productCodes the value to set
         * @return this builder
         */
        public Builder productCodes(java.util.List<String> productCodes) {
            this.productCodes = productCodes;
            this.__explicitlySet__.add("productCodes");
            return this;
        }
        /** List of industries subscribed by listing. */
        @com.fasterxml.jackson.annotation.JsonProperty("industries")
        private java.util.List<String> industries;

        /**
         * List of industries subscribed by listing.
         *
         * @param industries the value to set
         * @return this builder
         */
        public Builder industries(java.util.List<String> industries) {
            this.industries = industries;
            this.__explicitlySet__.add("industries");
            return this;
        }
        /** Number of trained professional per product */
        @com.fasterxml.jackson.annotation.JsonProperty("trainedProfessionals")
        private java.util.List<TrainedProfessionals> trainedProfessionals;

        /**
         * Number of trained professional per product
         *
         * @param trainedProfessionals the value to set
         * @return this builder
         */
        public Builder trainedProfessionals(
                java.util.List<TrainedProfessionals> trainedProfessionals) {
            this.trainedProfessionals = trainedProfessionals;
            this.__explicitlySet__.add("trainedProfessionals");
            return this;
        }
        /** Custom link to the listing */
        @com.fasterxml.jackson.annotation.JsonProperty("vanityUrl")
        private String vanityUrl;

        /**
         * Custom link to the listing
         *
         * @param vanityUrl the value to set
         * @return this builder
         */
        public Builder vanityUrl(String vanityUrl) {
            this.vanityUrl = vanityUrl;
            this.__explicitlySet__.add("vanityUrl");
            return this;
        }
        /** Support details based on geographic location */
        @com.fasterxml.jackson.annotation.JsonProperty("geoLocations")
        private java.util.List<GeoLocation> geoLocations;

        /**
         * Support details based on geographic location
         *
         * @param geoLocations the value to set
         * @return this builder
         */
        public Builder geoLocations(java.util.List<GeoLocation> geoLocations) {
            this.geoLocations = geoLocations;
            this.__explicitlySet__.add("geoLocations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceListingRevision build() {
            ServiceListingRevision model =
                    new ServiceListingRevision(
                            this.id,
                            this.listingId,
                            this.compartmentId,
                            this.displayName,
                            this.revisionNumber,
                            this.headline,
                            this.tagline,
                            this.keywords,
                            this.shortDescription,
                            this.usageInformation,
                            this.longDescription,
                            this.timeCreated,
                            this.timeUpdated,
                            this.contentLanguage,
                            this.supportedlanguages,
                            this.supportContacts,
                            this.supportLinks,
                            this.icon,
                            this.status,
                            this.statusNotes,
                            this.lifecycleState,
                            this.packageType,
                            this.extendedMetadata,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.contactUs,
                            this.productCodes,
                            this.industries,
                            this.trainedProfessionals,
                            this.vanityUrl,
                            this.geoLocations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceListingRevision model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("revisionNumber")) {
                this.revisionNumber(model.getRevisionNumber());
            }
            if (model.wasPropertyExplicitlySet("headline")) {
                this.headline(model.getHeadline());
            }
            if (model.wasPropertyExplicitlySet("tagline")) {
                this.tagline(model.getTagline());
            }
            if (model.wasPropertyExplicitlySet("keywords")) {
                this.keywords(model.getKeywords());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("usageInformation")) {
                this.usageInformation(model.getUsageInformation());
            }
            if (model.wasPropertyExplicitlySet("longDescription")) {
                this.longDescription(model.getLongDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("contentLanguage")) {
                this.contentLanguage(model.getContentLanguage());
            }
            if (model.wasPropertyExplicitlySet("supportedlanguages")) {
                this.supportedlanguages(model.getSupportedlanguages());
            }
            if (model.wasPropertyExplicitlySet("supportContacts")) {
                this.supportContacts(model.getSupportContacts());
            }
            if (model.wasPropertyExplicitlySet("supportLinks")) {
                this.supportLinks(model.getSupportLinks());
            }
            if (model.wasPropertyExplicitlySet("icon")) {
                this.icon(model.getIcon());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusNotes")) {
                this.statusNotes(model.getStatusNotes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("contactUs")) {
                this.contactUs(model.getContactUs());
            }
            if (model.wasPropertyExplicitlySet("productCodes")) {
                this.productCodes(model.getProductCodes());
            }
            if (model.wasPropertyExplicitlySet("industries")) {
                this.industries(model.getIndustries());
            }
            if (model.wasPropertyExplicitlySet("trainedProfessionals")) {
                this.trainedProfessionals(model.getTrainedProfessionals());
            }
            if (model.wasPropertyExplicitlySet("vanityUrl")) {
                this.vanityUrl(model.getVanityUrl());
            }
            if (model.wasPropertyExplicitlySet("geoLocations")) {
                this.geoLocations(model.getGeoLocations());
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

    @Deprecated
    public ServiceListingRevision(
            String id,
            String listingId,
            String compartmentId,
            String displayName,
            String revisionNumber,
            String headline,
            String tagline,
            String keywords,
            String shortDescription,
            String usageInformation,
            String longDescription,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LanguageItem contentLanguage,
            java.util.List<LanguageItem> supportedlanguages,
            java.util.List<SupportContact> supportContacts,
            java.util.List<NamedLink> supportLinks,
            ListingRevisionIconAttachment icon,
            Status status,
            String statusNotes,
            LifecycleState lifecycleState,
            PackageType packageType,
            java.util.Map<String, String> extendedMetadata,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String contactUs,
            java.util.List<String> productCodes,
            java.util.List<String> industries,
            java.util.List<TrainedProfessionals> trainedProfessionals,
            String vanityUrl,
            java.util.List<GeoLocation> geoLocations) {
        super(
                id,
                listingId,
                compartmentId,
                displayName,
                revisionNumber,
                headline,
                tagline,
                keywords,
                shortDescription,
                usageInformation,
                longDescription,
                timeCreated,
                timeUpdated,
                contentLanguage,
                supportedlanguages,
                supportContacts,
                supportLinks,
                icon,
                status,
                statusNotes,
                lifecycleState,
                packageType,
                extendedMetadata,
                freeformTags,
                definedTags,
                systemTags);
        this.contactUs = contactUs;
        this.productCodes = productCodes;
        this.industries = industries;
        this.trainedProfessionals = trainedProfessionals;
        this.vanityUrl = vanityUrl;
        this.geoLocations = geoLocations;
    }

    /** Custom text by partner regarding contact information */
    @com.fasterxml.jackson.annotation.JsonProperty("contactUs")
    private final String contactUs;

    /**
     * Custom text by partner regarding contact information
     *
     * @return the value
     */
    public String getContactUs() {
        return contactUs;
    }

    /** List of product codes subscribed by listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("productCodes")
    private final java.util.List<String> productCodes;

    /**
     * List of product codes subscribed by listing.
     *
     * @return the value
     */
    public java.util.List<String> getProductCodes() {
        return productCodes;
    }

    /** List of industries subscribed by listing. */
    @com.fasterxml.jackson.annotation.JsonProperty("industries")
    private final java.util.List<String> industries;

    /**
     * List of industries subscribed by listing.
     *
     * @return the value
     */
    public java.util.List<String> getIndustries() {
        return industries;
    }

    /** Number of trained professional per product */
    @com.fasterxml.jackson.annotation.JsonProperty("trainedProfessionals")
    private final java.util.List<TrainedProfessionals> trainedProfessionals;

    /**
     * Number of trained professional per product
     *
     * @return the value
     */
    public java.util.List<TrainedProfessionals> getTrainedProfessionals() {
        return trainedProfessionals;
    }

    /** Custom link to the listing */
    @com.fasterxml.jackson.annotation.JsonProperty("vanityUrl")
    private final String vanityUrl;

    /**
     * Custom link to the listing
     *
     * @return the value
     */
    public String getVanityUrl() {
        return vanityUrl;
    }

    /** Support details based on geographic location */
    @com.fasterxml.jackson.annotation.JsonProperty("geoLocations")
    private final java.util.List<GeoLocation> geoLocations;

    /**
     * Support details based on geographic location
     *
     * @return the value
     */
    public java.util.List<GeoLocation> getGeoLocations() {
        return geoLocations;
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
        sb.append("ServiceListingRevision(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", contactUs=").append(String.valueOf(this.contactUs));
        sb.append(", productCodes=").append(String.valueOf(this.productCodes));
        sb.append(", industries=").append(String.valueOf(this.industries));
        sb.append(", trainedProfessionals=").append(String.valueOf(this.trainedProfessionals));
        sb.append(", vanityUrl=").append(String.valueOf(this.vanityUrl));
        sb.append(", geoLocations=").append(String.valueOf(this.geoLocations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceListingRevision)) {
            return false;
        }

        ServiceListingRevision other = (ServiceListingRevision) o;
        return java.util.Objects.equals(this.contactUs, other.contactUs)
                && java.util.Objects.equals(this.productCodes, other.productCodes)
                && java.util.Objects.equals(this.industries, other.industries)
                && java.util.Objects.equals(this.trainedProfessionals, other.trainedProfessionals)
                && java.util.Objects.equals(this.vanityUrl, other.vanityUrl)
                && java.util.Objects.equals(this.geoLocations, other.geoLocations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.contactUs == null ? 43 : this.contactUs.hashCode());
        result = (result * PRIME) + (this.productCodes == null ? 43 : this.productCodes.hashCode());
        result = (result * PRIME) + (this.industries == null ? 43 : this.industries.hashCode());
        result =
                (result * PRIME)
                        + (this.trainedProfessionals == null
                                ? 43
                                : this.trainedProfessionals.hashCode());
        result = (result * PRIME) + (this.vanityUrl == null ? 43 : this.vanityUrl.hashCode());
        result = (result * PRIME) + (this.geoLocations == null ? 43 : this.geoLocations.hashCode());
        return result;
    }
}
