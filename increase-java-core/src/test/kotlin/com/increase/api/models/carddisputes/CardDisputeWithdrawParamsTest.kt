// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeWithdrawParamsTest {

    @Test
    fun create() {
        CardDisputeWithdrawParams.builder()
            .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
            .explanation("The explanation for withdrawing the Card Dispute.")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardDisputeWithdrawParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardDisputeWithdrawParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .explanation("The explanation for withdrawing the Card Dispute.")
                .build()

        val body = params._body()

        assertThat(body.explanation()).contains("The explanation for withdrawing the Card Dispute.")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardDisputeWithdrawParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .build()

        val body = params._body()
    }
}
