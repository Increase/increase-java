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
import com.increase.api.models.SimulationCardAuthorizationCreateParams
import com.increase.api.models.SimulationCardAuthorizationCreateParams.SimulationCardAuthorizationCreateBody

class SimulationCardAuthorizationCreateParamsTest {

    @Test
    fun createSimulationCardAuthorizationCreateParams() {
      SimulationCardAuthorizationCreateParams.builder()
          .amount(123L)
          .cardId("card_id")
          .digitalWalletTokenId("digital_wallet_token_id")
          .eventSubscriptionId("event_subscription_id")
          .merchantAcceptorId("x")
          .merchantCategoryCode("x")
          .merchantCity("x")
          .merchantCountry("x")
          .merchantDescriptor("x")
          .physicalCardId("physical_card_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationCardAuthorizationCreateParams.builder()
          .amount(123L)
          .cardId("card_id")
          .digitalWalletTokenId("digital_wallet_token_id")
          .eventSubscriptionId("event_subscription_id")
          .merchantAcceptorId("x")
          .merchantCategoryCode("x")
          .merchantCity("x")
          .merchantCountry("x")
          .merchantDescriptor("x")
          .physicalCardId("physical_card_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.cardId()).isEqualTo("card_id")
      assertThat(body.digitalWalletTokenId()).isEqualTo("digital_wallet_token_id")
      assertThat(body.eventSubscriptionId()).isEqualTo("event_subscription_id")
      assertThat(body.merchantAcceptorId()).isEqualTo("x")
      assertThat(body.merchantCategoryCode()).isEqualTo("x")
      assertThat(body.merchantCity()).isEqualTo("x")
      assertThat(body.merchantCountry()).isEqualTo("x")
      assertThat(body.merchantDescriptor()).isEqualTo("x")
      assertThat(body.physicalCardId()).isEqualTo("physical_card_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationCardAuthorizationCreateParams.builder()
          .amount(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
    }
}
