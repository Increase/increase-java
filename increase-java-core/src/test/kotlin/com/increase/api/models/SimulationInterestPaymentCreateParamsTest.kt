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
import com.increase.api.models.SimulationInterestPaymentCreateParams
import com.increase.api.models.SimulationInterestPaymentCreateParams.SimulationInterestPaymentCreateBody

class SimulationInterestPaymentCreateParamsTest {

    @Test
    fun createSimulationInterestPaymentCreateParams() {
      SimulationInterestPaymentCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationInterestPaymentCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.periodEnd()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(body.periodStart()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationInterestPaymentCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.amount()).isEqualTo(123L)
    }
}
