package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsDigitalWalletTokenRequestCreateParams.SimulationsDigitalWalletTokenRequestCreateBody

class SimulationsDigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun createSimulationsDigitalWalletTokenRequestCreateParams() {
      SimulationsDigitalWalletTokenRequestCreateParams.builder()
          .cardId("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsDigitalWalletTokenRequestCreateParams.builder()
          .cardId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsDigitalWalletTokenRequestCreateParams.builder()
          .cardId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardId()).isEqualTo("string")
    }
}
