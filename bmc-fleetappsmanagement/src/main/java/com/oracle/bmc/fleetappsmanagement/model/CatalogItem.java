/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A description of a CatalogItem resource.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CatalogItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CatalogItem extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "configSourceType",
        "shouldListPublicItems",
        "description",
        "catalogSourcePayload",
        "catalogResultPayload",
        "listingId",
        "listingVersion",
        "displayName",
        "versionDescription",
        "shortDescription",
        "packageType",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "timeReleased",
        "timeBackfillLastChecked",
        "timeLastChecked",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CatalogItem(
            String id,
            String compartmentId,
            ConfigSourceType configSourceType,
            Boolean shouldListPublicItems,
            String description,
            CatalogSourcePayload catalogSourcePayload,
            CatalogResultPayload catalogResultPayload,
            String listingId,
            String listingVersion,
            String displayName,
            String versionDescription,
            String shortDescription,
            PackageType packageType,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeReleased,
            java.util.Date timeBackfillLastChecked,
            java.util.Date timeLastChecked,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.configSourceType = configSourceType;
        this.shouldListPublicItems = shouldListPublicItems;
        this.description = description;
        this.catalogSourcePayload = catalogSourcePayload;
        this.catalogResultPayload = catalogResultPayload;
        this.listingId = listingId;
        this.listingVersion = listingVersion;
        this.displayName = displayName;
        this.versionDescription = versionDescription;
        this.shortDescription = shortDescription;
        this.packageType = packageType;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeReleased = timeReleased;
        this.timeBackfillLastChecked = timeBackfillLastChecked;
        this.timeLastChecked = timeLastChecked;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * catalog.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * catalog.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE,
         * GIT_CATALOG_SOURCE, MARKETPLACE_CATALOG_SOURCE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configSourceType")
        private ConfigSourceType configSourceType;

        /**
         * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE,
         * GIT_CATALOG_SOURCE, MARKETPLACE_CATALOG_SOURCE.
         *
         * @param configSourceType the value to set
         * @return this builder
         */
        public Builder configSourceType(ConfigSourceType configSourceType) {
            this.configSourceType = configSourceType;
            this.__explicitlySet__.add("configSourceType");
            return this;
        }
        /**
         * The indicator to append Public Items from the root compartment to any query, when set to
         * TRUE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldListPublicItems")
        private Boolean shouldListPublicItems;

        /**
         * The indicator to append Public Items from the root compartment to any query, when set to
         * TRUE.
         *
         * @param shouldListPublicItems the value to set
         * @return this builder
         */
        public Builder shouldListPublicItems(Boolean shouldListPublicItems) {
            this.shouldListPublicItems = shouldListPublicItems;
            this.__explicitlySet__.add("shouldListPublicItems");
            return this;
        }
        /** Description about the catalog item. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description about the catalog item.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogSourcePayload")
        private CatalogSourcePayload catalogSourcePayload;

        public Builder catalogSourcePayload(CatalogSourcePayload catalogSourcePayload) {
            this.catalogSourcePayload = catalogSourcePayload;
            this.__explicitlySet__.add("catalogSourcePayload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogResultPayload")
        private CatalogResultPayload catalogResultPayload;

        public Builder catalogResultPayload(CatalogResultPayload catalogResultPayload) {
            this.catalogResultPayload = catalogResultPayload;
            this.__explicitlySet__.add("catalogResultPayload");
            return this;
        }
        /** The catalog listing Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The catalog listing Id.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The catalog package version. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingVersion")
        private String listingVersion;

        /**
         * The catalog package version.
         *
         * @param listingVersion the value to set
         * @return this builder
         */
        public Builder listingVersion(String listingVersion) {
            this.listingVersion = listingVersion;
            this.__explicitlySet__.add("listingVersion");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Version description about the catalog item. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionDescription")
        private String versionDescription;

        /**
         * Version description about the catalog item.
         *
         * @param versionDescription the value to set
         * @return this builder
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            this.__explicitlySet__.add("versionDescription");
            return this;
        }
        /** Short description about the catalog item. */
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * Short description about the catalog item.
         *
         * @param shortDescription the value to set
         * @return this builder
         */
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /** Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        /**
         * Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** The current state of the CatalogItem. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the CatalogItem.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The details of lifecycle state CatalogItem. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The details of lifecycle state CatalogItem.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the CatalogItem was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the CatalogItem was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the CatalogItem was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the CatalogItem was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time the CatalogItem was released, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The date and time the CatalogItem was released, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /**
         * The date and time the CatalogItem was last checked by backfill job, in the format defined
         * by [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBackfillLastChecked")
        private java.util.Date timeBackfillLastChecked;

        /**
         * The date and time the CatalogItem was last checked by backfill job, in the format defined
         * by [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code
         * 2016-08-25T21:10:29.600Z}
         *
         * @param timeBackfillLastChecked the value to set
         * @return this builder
         */
        public Builder timeBackfillLastChecked(java.util.Date timeBackfillLastChecked) {
            this.timeBackfillLastChecked = timeBackfillLastChecked;
            this.__explicitlySet__.add("timeBackfillLastChecked");
            return this;
        }
        /**
         * The date and time the CatalogItem was last checked, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastChecked")
        private java.util.Date timeLastChecked;

        /**
         * The date and time the CatalogItem was last checked, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeLastChecked the value to set
         * @return this builder
         */
        public Builder timeLastChecked(java.util.Date timeLastChecked) {
            this.timeLastChecked = timeLastChecked;
            this.__explicitlySet__.add("timeLastChecked");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CatalogItem build() {
            CatalogItem model =
                    new CatalogItem(
                            this.id,
                            this.compartmentId,
                            this.configSourceType,
                            this.shouldListPublicItems,
                            this.description,
                            this.catalogSourcePayload,
                            this.catalogResultPayload,
                            this.listingId,
                            this.listingVersion,
                            this.displayName,
                            this.versionDescription,
                            this.shortDescription,
                            this.packageType,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeReleased,
                            this.timeBackfillLastChecked,
                            this.timeLastChecked,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogItem model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("configSourceType")) {
                this.configSourceType(model.getConfigSourceType());
            }
            if (model.wasPropertyExplicitlySet("shouldListPublicItems")) {
                this.shouldListPublicItems(model.getShouldListPublicItems());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("catalogSourcePayload")) {
                this.catalogSourcePayload(model.getCatalogSourcePayload());
            }
            if (model.wasPropertyExplicitlySet("catalogResultPayload")) {
                this.catalogResultPayload(model.getCatalogResultPayload());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("listingVersion")) {
                this.listingVersion(model.getListingVersion());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("versionDescription")) {
                this.versionDescription(model.getVersionDescription());
            }
            if (model.wasPropertyExplicitlySet("shortDescription")) {
                this.shortDescription(model.getShortDescription());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("timeBackfillLastChecked")) {
                this.timeBackfillLastChecked(model.getTimeBackfillLastChecked());
            }
            if (model.wasPropertyExplicitlySet("timeLastChecked")) {
                this.timeLastChecked(model.getTimeLastChecked());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * catalog.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * catalog.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, GIT_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     */
    public enum ConfigSourceType implements com.oracle.bmc.http.internal.BmcEnum {
        ParCatalogSource("PAR_CATALOG_SOURCE"),
        GitCatalogSource("GIT_CATALOG_SOURCE"),
        MarketplaceCatalogSource("MARKETPLACE_CATALOG_SOURCE"),
        StackTemplateCatalogSource("STACK_TEMPLATE_CATALOG_SOURCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfigSourceType.class);

        private final String value;
        private static java.util.Map<String, ConfigSourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigSourceType v : ConfigSourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfigSourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigSourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfigSourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, GIT_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configSourceType")
    private final ConfigSourceType configSourceType;

    /**
     * Config source type Eg: STACK_TEMPLATE_CATALOG_SOURCE, PAR_CATALOG_SOURCE, GIT_CATALOG_SOURCE,
     * MARKETPLACE_CATALOG_SOURCE.
     *
     * @return the value
     */
    public ConfigSourceType getConfigSourceType() {
        return configSourceType;
    }

    /**
     * The indicator to append Public Items from the root compartment to any query, when set to
     * TRUE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldListPublicItems")
    private final Boolean shouldListPublicItems;

    /**
     * The indicator to append Public Items from the root compartment to any query, when set to
     * TRUE.
     *
     * @return the value
     */
    public Boolean getShouldListPublicItems() {
        return shouldListPublicItems;
    }

    /** Description about the catalog item. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description about the catalog item.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("catalogSourcePayload")
    private final CatalogSourcePayload catalogSourcePayload;

    public CatalogSourcePayload getCatalogSourcePayload() {
        return catalogSourcePayload;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("catalogResultPayload")
    private final CatalogResultPayload catalogResultPayload;

    public CatalogResultPayload getCatalogResultPayload() {
        return catalogResultPayload;
    }

    /** The catalog listing Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The catalog listing Id.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The catalog package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingVersion")
    private final String listingVersion;

    /**
     * The catalog package version.
     *
     * @return the value
     */
    public String getListingVersion() {
        return listingVersion;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Version description about the catalog item. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionDescription")
    private final String versionDescription;

    /**
     * Version description about the catalog item.
     *
     * @return the value
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /** Short description about the catalog item. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * Short description about the catalog item.
     *
     * @return the value
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /** Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE. */
    public enum PackageType implements com.oracle.bmc.http.internal.BmcEnum {
        TfPackage("TF_PACKAGE"),
        NonTfPackage("NON_TF_PACKAGE"),
        ConfigFile("CONFIG_FILE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PackageType.class);

        private final String value;
        private static java.util.Map<String, PackageType> map;

        static {
            map = new java.util.HashMap<>();
            for (PackageType v : PackageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PackageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PackageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PackageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageType packageType;

    /**
     * Config package type Eg: TF_PACKAGE, NON_TF_PACKAGE, CONFIG_FILE.
     *
     * @return the value
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /** The current state of the CatalogItem. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the CatalogItem. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the CatalogItem.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The details of lifecycle state CatalogItem. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The details of lifecycle state CatalogItem.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the CatalogItem was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the CatalogItem was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the CatalogItem was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the CatalogItem was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the CatalogItem was released, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The date and time the CatalogItem was released, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /**
     * The date and time the CatalogItem was last checked by backfill job, in the format defined by
     * [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBackfillLastChecked")
    private final java.util.Date timeBackfillLastChecked;

    /**
     * The date and time the CatalogItem was last checked by backfill job, in the format defined by
     * [RFC 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeBackfillLastChecked() {
        return timeBackfillLastChecked;
    }

    /**
     * The date and time the CatalogItem was last checked, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastChecked")
    private final java.util.Date timeLastChecked;

    /**
     * The date and time the CatalogItem was last checked, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeLastChecked() {
        return timeLastChecked;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CatalogItem(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", configSourceType=").append(String.valueOf(this.configSourceType));
        sb.append(", shouldListPublicItems=").append(String.valueOf(this.shouldListPublicItems));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogSourcePayload=").append(String.valueOf(this.catalogSourcePayload));
        sb.append(", catalogResultPayload=").append(String.valueOf(this.catalogResultPayload));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", listingVersion=").append(String.valueOf(this.listingVersion));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", versionDescription=").append(String.valueOf(this.versionDescription));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", timeBackfillLastChecked=")
                .append(String.valueOf(this.timeBackfillLastChecked));
        sb.append(", timeLastChecked=").append(String.valueOf(this.timeLastChecked));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogItem)) {
            return false;
        }

        CatalogItem other = (CatalogItem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.configSourceType, other.configSourceType)
                && java.util.Objects.equals(this.shouldListPublicItems, other.shouldListPublicItems)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogSourcePayload, other.catalogSourcePayload)
                && java.util.Objects.equals(this.catalogResultPayload, other.catalogResultPayload)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.listingVersion, other.listingVersion)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.versionDescription, other.versionDescription)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(
                        this.timeBackfillLastChecked, other.timeBackfillLastChecked)
                && java.util.Objects.equals(this.timeLastChecked, other.timeLastChecked)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.configSourceType == null ? 43 : this.configSourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldListPublicItems == null
                                ? 43
                                : this.shouldListPublicItems.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogSourcePayload == null
                                ? 43
                                : this.catalogSourcePayload.hashCode());
        result =
                (result * PRIME)
                        + (this.catalogResultPayload == null
                                ? 43
                                : this.catalogResultPayload.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingVersion == null ? 43 : this.listingVersion.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.versionDescription == null
                                ? 43
                                : this.versionDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result =
                (result * PRIME)
                        + (this.timeBackfillLastChecked == null
                                ? 43
                                : this.timeBackfillLastChecked.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastChecked == null ? 43 : this.timeLastChecked.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
