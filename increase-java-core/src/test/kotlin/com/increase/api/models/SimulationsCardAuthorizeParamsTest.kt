package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.SimulationsCardAuthorizeParams.SimulationsCardAuthorizeBody

class SimulationsCardAuthorizeParamsTest {

    @Test
    fun createSimulationsCardAuthorizeParams() {
      SimulationsCardAuthorizeParams.builder()
          .amount(123L)
          .cardId("string")
          .digitalWalletTokenId("string")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationsCardAuthorizeParams.builder()
          .amount(123L)
          .cardId("string")
          .digitalWalletTokenId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.cardId()).isEqualTo("string")
      assertThat(body.digitalWalletTokenId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationsCardAuthorizeParams.builder()
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
    }
}
