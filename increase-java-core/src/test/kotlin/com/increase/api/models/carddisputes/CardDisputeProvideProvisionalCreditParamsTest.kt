// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeProvideProvisionalCreditParamsTest {

    @Test
    fun create() {
        CardDisputeProvideProvisionalCreditParams.builder()
            .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardDisputeProvideProvisionalCreditParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
