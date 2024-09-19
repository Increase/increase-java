// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.SimulationInboundCheckDepositCreateParams
import com.increase.api.models.SimulationInboundCheckDepositCreateParams.SimulationInboundCheckDepositCreateBody

class SimulationInboundCheckDepositCreateParamsTest {

    @Test
    fun createSimulationInboundCheckDepositCreateParams() {
      SimulationInboundCheckDepositCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .checkNumber("x")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationInboundCheckDepositCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .checkNumber("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("account_number_id")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.checkNumber()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationInboundCheckDepositCreateParams.builder()
          .accountNumberId("account_number_id")
          .amount(123L)
          .checkNumber("x")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountNumberId()).isEqualTo("account_number_id")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.checkNumber()).isEqualTo("x")
    }
}
