/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Contains information about resources such as parsers and sources that use the field. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsFieldUsages.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsFieldUsages
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dependentParsers", "dependentSources"})
    public LogAnalyticsFieldUsages(
            java.util.List<DependentParser> dependentParsers,
            java.util.List<DependentSource> dependentSources) {
        super();
        this.dependentParsers = dependentParsers;
        this.dependentSources = dependentSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Parsers that depend on or use the field. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependentParsers")
        private java.util.List<DependentParser> dependentParsers;

        /**
         * Parsers that depend on or use the field.
         *
         * @param dependentParsers the value to set
         * @return this builder
         */
        public Builder dependentParsers(java.util.List<DependentParser> dependentParsers) {
            this.dependentParsers = dependentParsers;
            this.__explicitlySet__.add("dependentParsers");
            return this;
        }
        /** Sources that depend on or use the field. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependentSources")
        private java.util.List<DependentSource> dependentSources;

        /**
         * Sources that depend on or use the field.
         *
         * @param dependentSources the value to set
         * @return this builder
         */
        public Builder dependentSources(java.util.List<DependentSource> dependentSources) {
            this.dependentSources = dependentSources;
            this.__explicitlySet__.add("dependentSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsFieldUsages build() {
            LogAnalyticsFieldUsages model =
                    new LogAnalyticsFieldUsages(this.dependentParsers, this.dependentSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsFieldUsages model) {
            if (model.wasPropertyExplicitlySet("dependentParsers")) {
                this.dependentParsers(model.getDependentParsers());
            }
            if (model.wasPropertyExplicitlySet("dependentSources")) {
                this.dependentSources(model.getDependentSources());
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

    /** Parsers that depend on or use the field. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependentParsers")
    private final java.util.List<DependentParser> dependentParsers;

    /**
     * Parsers that depend on or use the field.
     *
     * @return the value
     */
    public java.util.List<DependentParser> getDependentParsers() {
        return dependentParsers;
    }

    /** Sources that depend on or use the field. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependentSources")
    private final java.util.List<DependentSource> dependentSources;

    /**
     * Sources that depend on or use the field.
     *
     * @return the value
     */
    public java.util.List<DependentSource> getDependentSources() {
        return dependentSources;
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
        sb.append("LogAnalyticsFieldUsages(");
        sb.append("super=").append(super.toString());
        sb.append("dependentParsers=").append(String.valueOf(this.dependentParsers));
        sb.append(", dependentSources=").append(String.valueOf(this.dependentSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsFieldUsages)) {
            return false;
        }

        LogAnalyticsFieldUsages other = (LogAnalyticsFieldUsages) o;
        return java.util.Objects.equals(this.dependentParsers, other.dependentParsers)
                && java.util.Objects.equals(this.dependentSources, other.dependentSources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dependentParsers == null ? 43 : this.dependentParsers.hashCode());
        result =
                (result * PRIME)
                        + (this.dependentSources == null ? 43 : this.dependentSources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
