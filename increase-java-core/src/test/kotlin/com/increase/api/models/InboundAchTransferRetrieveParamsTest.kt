// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferRetrieveParamsTest {

    @Test
    fun createInboundAchTransferRetrieveParams() {
        InboundAchTransferRetrieveParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferRetrieveParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
