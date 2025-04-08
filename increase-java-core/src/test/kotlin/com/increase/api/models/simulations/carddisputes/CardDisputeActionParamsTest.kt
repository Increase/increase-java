// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.carddisputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeActionParamsTest {

    @Test
    fun create() {
        CardDisputeActionParams.builder()
            .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
            .status(CardDisputeActionParams.Status.REJECTED)
            .explanation("This was a valid recurring transaction")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .status(CardDisputeActionParams.Status.REJECTED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .status(CardDisputeActionParams.Status.REJECTED)
                .explanation("This was a valid recurring transaction")
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(CardDisputeActionParams.Status.REJECTED)
        assertThat(body.explanation()).contains("This was a valid recurring transaction")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .status(CardDisputeActionParams.Status.REJECTED)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(CardDisputeActionParams.Status.REJECTED)
    }
}
