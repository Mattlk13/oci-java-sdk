/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/**
 * Helper class to generate in-memory temporary session keys. Decoupled from
 * AbstractRequestingAuthenticationDetailsProvider for better modularity.
 *
 * <p>WARNING: This class is NOT thread-safe. Concurrent access to getKeyPair() and refreshKeys()
 * can cause race conditions. Callers must provide external synchronization in multithreaded
 * environments.
 *
 * <p>Implementation uses lazy initialization to avoid generating keys unnecessarily.
 */
class SessionKeySupplierImpl implements SessionKeySupplier {
    private static final KeyPairGenerator GENERATOR;
    private KeyPair keyPair = null;

    static {
        try {
            GENERATOR = KeyPairGenerator.getInstance("RSA");
            GENERATOR.initialize(2048);
        } catch (NoSuchAlgorithmException e) {
            throw new Error(e.getMessage(), e);
        }
    }

    SessionKeySupplierImpl() {}

    @Override
    public KeyPair getKeyPair() {
        if (this.keyPair == null) {
            this.keyPair = GENERATOR.generateKeyPair();
        }
        return keyPair;
    }

    @Override
    public void refreshKeys() {
        this.keyPair = GENERATOR.generateKeyPair();
    }
}
