package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsCardRefundCreateParams.SimulationsCardRefundCreateBody

class SimulationsCardRefundCreateParamsTest {

    @Test
    fun createSimulationsCardRefundCreateParams() {
      SimulationsCardRefundCreateParams.builder()
          .transactionId("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsCardRefundCreateParams.builder()
          .transactionId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.transactionId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsCardRefundCreateParams.builder()
          .transactionId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.transactionId()).isEqualTo("string")
    }
}
