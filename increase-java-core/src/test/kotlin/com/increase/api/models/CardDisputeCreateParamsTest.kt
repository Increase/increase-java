// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeCreateParamsTest {

    @Test
    fun createCardDisputeCreateParams() {
        CardDisputeCreateParams.builder()
            .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
            .explanation("Unauthorized recurring transaction.")
            .amount(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardDisputeCreateParams.builder()
                .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .explanation("Unauthorized recurring transaction.")
                .amount(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.disputedTransactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(body.explanation()).isEqualTo("Unauthorized recurring transaction.")
        assertThat(body.amount()).isEqualTo(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CardDisputeCreateParams.builder()
                .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .explanation("Unauthorized recurring transaction.")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.disputedTransactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(body.explanation()).isEqualTo("Unauthorized recurring transaction.")
    }
}
