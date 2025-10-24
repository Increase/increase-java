// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundfednowtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFednowTransferRetrieveParamsTest {

    @Test
    fun create() {
        InboundFednowTransferRetrieveParams.builder()
            .inboundFednowTransferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundFednowTransferRetrieveParams.builder()
                .inboundFednowTransferId("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
