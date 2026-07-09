// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardsettlements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardSettlementCreateParamsTest {

    @Test
    fun create() {
        CardSettlementCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .amount(1L)
            .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardSettlementCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .amount(1L)
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .build()

        val body = params._body()

        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.amount()).contains(1L)
        assertThat(body.pendingTransactionId()).contains("pending_transaction_k1sfetcau2qbvjbzgju4")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardSettlementCreateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        val body = params._body()

        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }
}
