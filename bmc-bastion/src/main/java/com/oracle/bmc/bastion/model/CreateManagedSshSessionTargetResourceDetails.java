/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * Details about a managed SSH session for a target resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateManagedSshSessionTargetResourceDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sessionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateManagedSshSessionTargetResourceDetails
        extends CreateSessionTargetResourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePort")
        private Integer targetResourcePort;

        public Builder targetResourcePort(Integer targetResourcePort) {
            this.targetResourcePort = targetResourcePort;
            this.__explicitlySet__.add("targetResourcePort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceOperatingSystemUserName")
        private String targetResourceOperatingSystemUserName;

        public Builder targetResourceOperatingSystemUserName(
                String targetResourceOperatingSystemUserName) {
            this.targetResourceOperatingSystemUserName = targetResourceOperatingSystemUserName;
            this.__explicitlySet__.add("targetResourceOperatingSystemUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
        private String targetResourcePrivateIpAddress;

        public Builder targetResourcePrivateIpAddress(String targetResourcePrivateIpAddress) {
            this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
            this.__explicitlySet__.add("targetResourcePrivateIpAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateManagedSshSessionTargetResourceDetails build() {
            CreateManagedSshSessionTargetResourceDetails __instance__ =
                    new CreateManagedSshSessionTargetResourceDetails(
                            targetResourcePort,
                            targetResourceOperatingSystemUserName,
                            targetResourceId,
                            targetResourcePrivateIpAddress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateManagedSshSessionTargetResourceDetails o) {
            Builder copiedBuilder =
                    targetResourcePort(o.getTargetResourcePort())
                            .targetResourceOperatingSystemUserName(
                                    o.getTargetResourceOperatingSystemUserName())
                            .targetResourceId(o.getTargetResourceId())
                            .targetResourcePrivateIpAddress(o.getTargetResourcePrivateIpAddress());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public CreateManagedSshSessionTargetResourceDetails(
            Integer targetResourcePort,
            String targetResourceOperatingSystemUserName,
            String targetResourceId,
            String targetResourcePrivateIpAddress) {
        super(targetResourcePort);
        this.targetResourceOperatingSystemUserName = targetResourceOperatingSystemUserName;
        this.targetResourceId = targetResourceId;
        this.targetResourcePrivateIpAddress = targetResourcePrivateIpAddress;
    }

    /**
     * The name of the user on the target resource operating system that the session uses for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceOperatingSystemUserName")
    String targetResourceOperatingSystemUserName;

    /**
     * The unique identifier (OCID) of the target resource (a Compute instance, for example) that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    String targetResourceId;

    /**
     * The private IP address of the target resource that the session connects to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourcePrivateIpAddress")
    String targetResourcePrivateIpAddress;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
