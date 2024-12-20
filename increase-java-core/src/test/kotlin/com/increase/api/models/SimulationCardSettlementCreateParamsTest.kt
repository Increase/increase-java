// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardSettlementCreateParamsTest {

    @Test
    fun createSimulationCardSettlementCreateParams() {
        SimulationCardSettlementCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
            .amount(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardSettlementCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .amount(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.pendingTransactionId())
            .isEqualTo("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(body.amount()).contains(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardSettlementCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.pendingTransactionId())
            .isEqualTo("pending_transaction_k1sfetcau2qbvjbzgju4")
    }
}
