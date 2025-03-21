// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardDisputeCreateParamsTest {

    @Test
    fun create() {
        CardDisputeCreateParams.builder()
            .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
            .explanation("Unauthorized recurring transaction.")
            .amount(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardDisputeCreateParams.builder()
                .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .explanation("Unauthorized recurring transaction.")
                .amount(1L)
                .build()

        val body = params._body()

        assertThat(body.disputedTransactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(body.explanation()).isEqualTo("Unauthorized recurring transaction.")
        assertThat(body.amount()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardDisputeCreateParams.builder()
                .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .explanation("Unauthorized recurring transaction.")
                .build()

        val body = params._body()

        assertThat(body.disputedTransactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(body.explanation()).isEqualTo("Unauthorized recurring transaction.")
    }
}
