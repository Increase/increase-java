package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsCardDisputeActionParams.SimulationsCardDisputeActionBody

class SimulationsCardDisputeActionParamsTest {

    @Test
    fun createSimulationsCardDisputeActionParams() {
      SimulationsCardDisputeActionParams.builder()
          .cardDisputeId("string")
          .status(SimulationsCardDisputeActionParams.Status.ACCEPTED)
          .explanation("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsCardDisputeActionParams.builder()
          .cardDisputeId("string")
          .status(SimulationsCardDisputeActionParams.Status.ACCEPTED)
          .explanation("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.status()).isEqualTo(SimulationsCardDisputeActionParams.Status.ACCEPTED)
      assertThat(body.explanation()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsCardDisputeActionParams.builder()
          .cardDisputeId("string")
          .status(SimulationsCardDisputeActionParams.Status.ACCEPTED)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.status()).isEqualTo(SimulationsCardDisputeActionParams.Status.ACCEPTED)
    }

    @Test
    fun getPathParam() {
      val params = SimulationsCardDisputeActionParams.builder()
          .cardDisputeId("string")
          .status(SimulationsCardDisputeActionParams.Status.ACCEPTED)
          .build()
      assertThat(params).isNotNull
      // path param "cardDisputeId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
