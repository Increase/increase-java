// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferReverseParamsTest {

    @Test
    fun create() {
        InboundWireTransferReverseParams.builder()
            .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
            .reason(InboundWireTransferReverseParams.Reason.CREDITOR_REQUEST)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundWireTransferReverseParams.builder()
                .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .reason(InboundWireTransferReverseParams.Reason.CREDITOR_REQUEST)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundWireTransferReverseParams.builder()
                .inboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .reason(InboundWireTransferReverseParams.Reason.CREDITOR_REQUEST)
                .build()

        val body = params._body()

        assertThat(body.reason())
            .isEqualTo(InboundWireTransferReverseParams.Reason.CREDITOR_REQUEST)
    }
}
