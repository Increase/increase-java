// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferRetrieveParamsTest {

    @Test
    fun create() {
        InboundAchTransferRetrieveParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundAchTransferRetrieveParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
