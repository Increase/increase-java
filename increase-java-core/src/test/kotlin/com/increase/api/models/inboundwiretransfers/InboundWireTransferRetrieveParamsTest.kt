// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferRetrieveParamsTest {

    @Test
    fun create() {
        InboundWireTransferRetrieveParams.builder()
            .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundWireTransferRetrieveParams.builder()
                .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
