/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.009")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetTransferDeviceResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    /**
     * The returned TransferDevice instance.
     */
    private TransferDevice transferDevice;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTransferDeviceResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            transferDevice(o.getTransferDevice());

            return this;
        }
    }
}
