package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardSettlementParamsTest {

    @Test
    fun createSimulationCardSettlementParams() {
        SimulationCardSettlementParams.builder()
            .cardId("string")
            .pendingTransactionId("string")
            .amount(123L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardSettlementParams.builder()
                .cardId("string")
                .pendingTransactionId("string")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
        assertThat(body.pendingTransactionId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardSettlementParams.builder()
                .cardId("string")
                .pendingTransactionId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("string")
        assertThat(body.pendingTransactionId()).isEqualTo("string")
    }
}
