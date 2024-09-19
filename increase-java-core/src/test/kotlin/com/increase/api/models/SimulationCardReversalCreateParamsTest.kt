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
import com.increase.api.models.SimulationCardReversalCreateParams
import com.increase.api.models.SimulationCardReversalCreateParams.SimulationCardReversalCreateBody

class SimulationCardReversalCreateParamsTest {

    @Test
    fun createSimulationCardReversalCreateParams() {
      SimulationCardReversalCreateParams.builder()
          .cardPaymentId("card_payment_id")
          .amount(123L)
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationCardReversalCreateParams.builder()
          .cardPaymentId("card_payment_id")
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
      assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationCardReversalCreateParams.builder()
          .cardPaymentId("card_payment_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }
}
