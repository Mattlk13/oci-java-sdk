/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Details for to refresh DB Azure Vault resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RefreshOracleDbAzureVaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RefreshOracleDbAzureVaultDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"oracleDbAzureConnectorId"})
    public RefreshOracleDbAzureVaultDetails(String oracleDbAzureConnectorId) {
        super();
        this.oracleDbAzureConnectorId = oracleDbAzureConnectorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Vault resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDbAzureConnectorId")
        private String oracleDbAzureConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Vault resource.
         *
         * @param oracleDbAzureConnectorId the value to set
         * @return this builder
         */
        public Builder oracleDbAzureConnectorId(String oracleDbAzureConnectorId) {
            this.oracleDbAzureConnectorId = oracleDbAzureConnectorId;
            this.__explicitlySet__.add("oracleDbAzureConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshOracleDbAzureVaultDetails build() {
            RefreshOracleDbAzureVaultDetails model =
                    new RefreshOracleDbAzureVaultDetails(this.oracleDbAzureConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshOracleDbAzureVaultDetails model) {
            if (model.wasPropertyExplicitlySet("oracleDbAzureConnectorId")) {
                this.oracleDbAzureConnectorId(model.getOracleDbAzureConnectorId());
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
     * Oracle DB Azure Vault resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDbAzureConnectorId")
    private final String oracleDbAzureConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Azure Vault resource.
     *
     * @return the value
     */
    public String getOracleDbAzureConnectorId() {
        return oracleDbAzureConnectorId;
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
        sb.append("RefreshOracleDbAzureVaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("oracleDbAzureConnectorId=")
                .append(String.valueOf(this.oracleDbAzureConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshOracleDbAzureVaultDetails)) {
            return false;
        }

        RefreshOracleDbAzureVaultDetails other = (RefreshOracleDbAzureVaultDetails) o;
        return java.util.Objects.equals(
                        this.oracleDbAzureConnectorId, other.oracleDbAzureConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.oracleDbAzureConnectorId == null
                                ? 43
                                : this.oracleDbAzureConnectorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
