/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Details required to create a new OCI cache user. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOciCacheUserDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOciCacheUserDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "compartmentId",
        "authenticationMode",
        "aclString",
        "status",
        "freeformTags",
        "definedTags"
    })
    public CreateOciCacheUserDetails(
            String name,
            String description,
            String compartmentId,
            AuthenticationMode authenticationMode,
            String aclString,
            OciCacheUser.Status status,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.description = description;
        this.compartmentId = compartmentId;
        this.authenticationMode = authenticationMode;
        this.aclString = aclString;
        this.status = status;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCI cache user name is required to connect to an OCI cache cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * OCI cache user name is required to connect to an OCI cache cluster.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Description of OCI cache user. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of OCI cache user.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** OCI cache user compartment ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCI cache user compartment ID.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationMode")
        private AuthenticationMode authenticationMode;

        public Builder authenticationMode(AuthenticationMode authenticationMode) {
            this.authenticationMode = authenticationMode;
            this.__explicitlySet__.add("authenticationMode");
            return this;
        }
        /** ACL string of OCI cache user. */
        @com.fasterxml.jackson.annotation.JsonProperty("aclString")
        private String aclString;

        /**
         * ACL string of OCI cache user.
         *
         * @param aclString the value to set
         * @return this builder
         */
        public Builder aclString(String aclString) {
            this.aclString = aclString;
            this.__explicitlySet__.add("aclString");
            return this;
        }
        /**
         * OCI cache user status. ON enables and OFF disables the OCI cache user to login to the
         * associated clusters. Default value is ON.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private OciCacheUser.Status status;

        /**
         * OCI cache user status. ON enables and OFF disables the OCI cache user to login to the
         * associated clusters. Default value is ON.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(OciCacheUser.Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
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

        public CreateOciCacheUserDetails build() {
            CreateOciCacheUserDetails model =
                    new CreateOciCacheUserDetails(
                            this.name,
                            this.description,
                            this.compartmentId,
                            this.authenticationMode,
                            this.aclString,
                            this.status,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOciCacheUserDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("authenticationMode")) {
                this.authenticationMode(model.getAuthenticationMode());
            }
            if (model.wasPropertyExplicitlySet("aclString")) {
                this.aclString(model.getAclString());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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

    /** OCI cache user name is required to connect to an OCI cache cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * OCI cache user name is required to connect to an OCI cache cluster.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Description of OCI cache user. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of OCI cache user.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** OCI cache user compartment ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCI cache user compartment ID.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authenticationMode")
    private final AuthenticationMode authenticationMode;

    public AuthenticationMode getAuthenticationMode() {
        return authenticationMode;
    }

    /** ACL string of OCI cache user. */
    @com.fasterxml.jackson.annotation.JsonProperty("aclString")
    private final String aclString;

    /**
     * ACL string of OCI cache user.
     *
     * @return the value
     */
    public String getAclString() {
        return aclString;
    }

    /**
     * OCI cache user status. ON enables and OFF disables the OCI cache user to login to the
     * associated clusters. Default value is ON.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final OciCacheUser.Status status;

    /**
     * OCI cache user status. ON enables and OFF disables the OCI cache user to login to the
     * associated clusters. Default value is ON.
     *
     * @return the value
     */
    public OciCacheUser.Status getStatus() {
        return status;
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
        sb.append("CreateOciCacheUserDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", authenticationMode=").append(String.valueOf(this.authenticationMode));
        sb.append(", aclString=").append(String.valueOf(this.aclString));
        sb.append(", status=").append(String.valueOf(this.status));
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
        if (!(o instanceof CreateOciCacheUserDetails)) {
            return false;
        }

        CreateOciCacheUserDetails other = (CreateOciCacheUserDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.authenticationMode, other.authenticationMode)
                && java.util.Objects.equals(this.aclString, other.aclString)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationMode == null
                                ? 43
                                : this.authenticationMode.hashCode());
        result = (result * PRIME) + (this.aclString == null ? 43 : this.aclString.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
