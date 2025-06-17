/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * This object represents the fields to create a terms of use agreement record for a domain. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAgreementRecordDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAgreementRecordDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"agreementUuid", "agreementSignature"})
    public CreateAgreementRecordDetails(String agreementUuid, String agreementSignature) {
        super();
        this.agreementUuid = agreementUuid;
        this.agreementSignature = agreementSignature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the agreement to accept. */
        @com.fasterxml.jackson.annotation.JsonProperty("agreementUuid")
        private String agreementUuid;

        /**
         * The ID of the agreement to accept.
         *
         * @param agreementUuid the value to set
         * @return this builder
         */
        public Builder agreementUuid(String agreementUuid) {
            this.agreementUuid = agreementUuid;
            this.__explicitlySet__.add("agreementUuid");
            return this;
        }
        /** The agreement signature. */
        @com.fasterxml.jackson.annotation.JsonProperty("agreementSignature")
        private String agreementSignature;

        /**
         * The agreement signature.
         *
         * @param agreementSignature the value to set
         * @return this builder
         */
        public Builder agreementSignature(String agreementSignature) {
            this.agreementSignature = agreementSignature;
            this.__explicitlySet__.add("agreementSignature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAgreementRecordDetails build() {
            CreateAgreementRecordDetails model =
                    new CreateAgreementRecordDetails(this.agreementUuid, this.agreementSignature);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgreementRecordDetails model) {
            if (model.wasPropertyExplicitlySet("agreementUuid")) {
                this.agreementUuid(model.getAgreementUuid());
            }
            if (model.wasPropertyExplicitlySet("agreementSignature")) {
                this.agreementSignature(model.getAgreementSignature());
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

    /** The ID of the agreement to accept. */
    @com.fasterxml.jackson.annotation.JsonProperty("agreementUuid")
    private final String agreementUuid;

    /**
     * The ID of the agreement to accept.
     *
     * @return the value
     */
    public String getAgreementUuid() {
        return agreementUuid;
    }

    /** The agreement signature. */
    @com.fasterxml.jackson.annotation.JsonProperty("agreementSignature")
    private final String agreementSignature;

    /**
     * The agreement signature.
     *
     * @return the value
     */
    public String getAgreementSignature() {
        return agreementSignature;
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
        sb.append("CreateAgreementRecordDetails(");
        sb.append("super=").append(super.toString());
        sb.append("agreementUuid=").append(String.valueOf(this.agreementUuid));
        sb.append(", agreementSignature=").append(String.valueOf(this.agreementSignature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgreementRecordDetails)) {
            return false;
        }

        CreateAgreementRecordDetails other = (CreateAgreementRecordDetails) o;
        return java.util.Objects.equals(this.agreementUuid, other.agreementUuid)
                && java.util.Objects.equals(this.agreementSignature, other.agreementSignature)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.agreementUuid == null ? 43 : this.agreementUuid.hashCode());
        result =
                (result * PRIME)
                        + (this.agreementSignature == null
                                ? 43
                                : this.agreementSignature.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
