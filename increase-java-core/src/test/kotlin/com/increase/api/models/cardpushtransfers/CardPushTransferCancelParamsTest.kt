// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPushTransferCancelParamsTest {

    @Test
    fun create() {
        CardPushTransferCancelParams.builder()
            .cardPushTransferId("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardPushTransferCancelParams.builder()
                .cardPushTransferId("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
