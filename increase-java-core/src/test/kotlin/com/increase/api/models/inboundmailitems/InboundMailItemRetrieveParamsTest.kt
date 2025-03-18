// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundMailItemRetrieveParamsTest {

    @Test
    fun create() {
        InboundMailItemRetrieveParams.builder()
            .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundMailItemRetrieveParams.builder()
                .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_mail_item_q6rrg7mmqpplx80zceev")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
