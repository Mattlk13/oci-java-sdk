/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/** Exadata rack type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum ExadataRackType implements com.oracle.bmc.http.internal.BmcEnum {
    Full("FULL"),
    Half("HALF"),
    Quarter("QUARTER"),
    Eighth("EIGHTH"),
    Flex("FLEX"),
    Base("BASE"),
    Elastic("ELASTIC"),
    ElasticBase("ELASTIC_BASE"),
    ElasticLarge("ELASTIC_LARGE"),
    ElasticExtraLarge("ELASTIC_EXTRA_LARGE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ExadataRackType.class);

    private final String value;
    private static java.util.Map<String, ExadataRackType> map;

    static {
        map = new java.util.HashMap<>();
        for (ExadataRackType v : ExadataRackType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ExadataRackType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExadataRackType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ExadataRackType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
