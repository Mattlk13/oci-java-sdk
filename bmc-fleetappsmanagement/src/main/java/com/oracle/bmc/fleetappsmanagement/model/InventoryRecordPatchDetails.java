/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details about an installed patch on the target <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InventoryRecordPatchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InventoryRecordPatchDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "patchId",
        "patchName",
        "patchDescription",
        "timeApplied",
        "patchType"
    })
    public InventoryRecordPatchDetails(
            String patchId,
            String patchName,
            String patchDescription,
            java.util.Date timeApplied,
            String patchType) {
        super();
        this.patchId = patchId;
        this.patchName = patchName;
        this.patchDescription = patchDescription;
        this.timeApplied = timeApplied;
        this.patchType = patchType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the installed patch */
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * OCID of the installed patch
         *
         * @param patchId the value to set
         * @return this builder
         */
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /** Name of the installed patch */
        @com.fasterxml.jackson.annotation.JsonProperty("patchName")
        private String patchName;

        /**
         * Name of the installed patch
         *
         * @param patchName the value to set
         * @return this builder
         */
        public Builder patchName(String patchName) {
            this.patchName = patchName;
            this.__explicitlySet__.add("patchName");
            return this;
        }
        /** Description for the installed patch */
        @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
        private String patchDescription;

        /**
         * Description for the installed patch
         *
         * @param patchDescription the value to set
         * @return this builder
         */
        public Builder patchDescription(String patchDescription) {
            this.patchDescription = patchDescription;
            this.__explicitlySet__.add("patchDescription");
            return this;
        }
        /** Date on which the patch was applied to the target */
        @com.fasterxml.jackson.annotation.JsonProperty("timeApplied")
        private java.util.Date timeApplied;

        /**
         * Date on which the patch was applied to the target
         *
         * @param timeApplied the value to set
         * @return this builder
         */
        public Builder timeApplied(java.util.Date timeApplied) {
            this.timeApplied = timeApplied;
            this.__explicitlySet__.add("timeApplied");
            return this;
        }
        /** Type of patch applied */
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private String patchType;

        /**
         * Type of patch applied
         *
         * @param patchType the value to set
         * @return this builder
         */
        public Builder patchType(String patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventoryRecordPatchDetails build() {
            InventoryRecordPatchDetails model =
                    new InventoryRecordPatchDetails(
                            this.patchId,
                            this.patchName,
                            this.patchDescription,
                            this.timeApplied,
                            this.patchType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventoryRecordPatchDetails model) {
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            if (model.wasPropertyExplicitlySet("patchName")) {
                this.patchName(model.getPatchName());
            }
            if (model.wasPropertyExplicitlySet("patchDescription")) {
                this.patchDescription(model.getPatchDescription());
            }
            if (model.wasPropertyExplicitlySet("timeApplied")) {
                this.timeApplied(model.getTimeApplied());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
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

    /** OCID of the installed patch */
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * OCID of the installed patch
     *
     * @return the value
     */
    public String getPatchId() {
        return patchId;
    }

    /** Name of the installed patch */
    @com.fasterxml.jackson.annotation.JsonProperty("patchName")
    private final String patchName;

    /**
     * Name of the installed patch
     *
     * @return the value
     */
    public String getPatchName() {
        return patchName;
    }

    /** Description for the installed patch */
    @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
    private final String patchDescription;

    /**
     * Description for the installed patch
     *
     * @return the value
     */
    public String getPatchDescription() {
        return patchDescription;
    }

    /** Date on which the patch was applied to the target */
    @com.fasterxml.jackson.annotation.JsonProperty("timeApplied")
    private final java.util.Date timeApplied;

    /**
     * Date on which the patch was applied to the target
     *
     * @return the value
     */
    public java.util.Date getTimeApplied() {
        return timeApplied;
    }

    /** Type of patch applied */
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final String patchType;

    /**
     * Type of patch applied
     *
     * @return the value
     */
    public String getPatchType() {
        return patchType;
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
        sb.append("InventoryRecordPatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("patchId=").append(String.valueOf(this.patchId));
        sb.append(", patchName=").append(String.valueOf(this.patchName));
        sb.append(", patchDescription=").append(String.valueOf(this.patchDescription));
        sb.append(", timeApplied=").append(String.valueOf(this.timeApplied));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventoryRecordPatchDetails)) {
            return false;
        }

        InventoryRecordPatchDetails other = (InventoryRecordPatchDetails) o;
        return java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(this.patchName, other.patchName)
                && java.util.Objects.equals(this.patchDescription, other.patchDescription)
                && java.util.Objects.equals(this.timeApplied, other.timeApplied)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result = (result * PRIME) + (this.patchName == null ? 43 : this.patchName.hashCode());
        result =
                (result * PRIME)
                        + (this.patchDescription == null ? 43 : this.patchDescription.hashCode());
        result = (result * PRIME) + (this.timeApplied == null ? 43 : this.timeApplied.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
