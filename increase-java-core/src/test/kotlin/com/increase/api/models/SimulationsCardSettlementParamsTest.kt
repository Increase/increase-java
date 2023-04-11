package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsCardSettlementParams.SimulationsCardSettlementBody

class SimulationsCardSettlementParamsTest {

    @Test
    fun createSimulationsCardSettlementParams() {
      SimulationsCardSettlementParams.builder()
          .cardId("string")
          .pendingTransactionId("string")
          .amount(123L)
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsCardSettlementParams.builder()
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
      val params = SimulationsCardSettlementParams.builder()
          .cardId("string")
          .pendingTransactionId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardId()).isEqualTo("string")
      assertThat(body.pendingTransactionId()).isEqualTo("string")
    }
}
