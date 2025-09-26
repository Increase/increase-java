// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardrefunds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRefundCreateParamsTest {

    @Test
    fun create() {
        CardRefundCreateParams.builder()
            .pendingTransactionId("pending_transaction_id")
            .transactionId("transaction_uyrp7fld2ium70oa7oi")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardRefundCreateParams.builder()
                .pendingTransactionId("pending_transaction_id")
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        val body = params._body()

        assertThat(body.pendingTransactionId()).contains("pending_transaction_id")
        assertThat(body.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardRefundCreateParams.builder().build()

        val body = params._body()
    }
}
