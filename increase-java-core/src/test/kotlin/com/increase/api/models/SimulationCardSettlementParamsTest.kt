// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardSettlementParamsTest {

    @Test
    fun createSimulationCardSettlementParams() {
        SimulationCardSettlementParams.builder()
            .cardId("card_id")
            .pendingTransactionId("pending_transaction_id")
            .amount(123L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardSettlementParams.builder()
                .cardId("card_id")
                .pendingTransactionId("pending_transaction_id")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_id")
        assertThat(body.pendingTransactionId()).isEqualTo("pending_transaction_id")
        assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardSettlementParams.builder()
                .cardId("card_id")
                .pendingTransactionId("pending_transaction_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_id")
        assertThat(body.pendingTransactionId()).isEqualTo("pending_transaction_id")
    }
}
