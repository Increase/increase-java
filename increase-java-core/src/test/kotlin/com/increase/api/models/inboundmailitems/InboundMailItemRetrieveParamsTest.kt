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
    fun getPathParam() {
        val params =
            InboundMailItemRetrieveParams.builder()
                .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                .build()
        assertThat(params).isNotNull
        // path param "inboundMailItemId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_mail_item_q6rrg7mmqpplx80zceev")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
