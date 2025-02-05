// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferRetrieveParamsTest {

    @Test
    fun create() {
        InboundWireTransferRetrieveParams.builder()
            .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundWireTransferRetrieveParams.builder()
                .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .build()
        assertThat(params).isNotNull
        // path param "inboundWireTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
