/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

public class WorkloadIdentityFederationConstants {
    public static final String OAUTH_PARAM_GRANT_TYPE = "grant_type";
    public static final String OAUTH_PARAM_SUBJECT_TOKEN = "subject_token";
    public static final String OAUTH_PARAM_SUBJECT_TOKEN_TYPE = "subject_token_type";
    public static final String OAUTH_PARAM_REQUESTED_TOKEN_TYPE = "requested_token_type";
    public static final String OAUTH_PARAM_APP_ID = "app_id";
    public static final String OAUTH_PARAM_RES_TYPE = "res_type";
    public static final String OAUTH_PARAM_RPST_EXP = "rpst_exp";
    public static final String OAUTH_PARAM_PUBLIC_KEY = "public_key";
    public static final String OAUTH_PARAM_INSTANCE_CERTIFICATE = "instance_certificate";
    public static final String OAUTH_PARAM_INSTANCE_INTERMEDIATE_CERTIFICATE =
            "instance_intermediate_certificate";
    public static final String TOKEN_EXCHANGE_STRING =
            "urn:ietf:params:oauth:grant-type:token-exchange";
    public static final String REQUESTED_TOKEN_STRING = "urn:oci:token-type:oci-";
    public static final String JWT_TOKEN_STRING = "jwt";
}
