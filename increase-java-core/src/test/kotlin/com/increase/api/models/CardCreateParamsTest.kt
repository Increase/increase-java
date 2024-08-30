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
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardCreateParams.CardCreateBody

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
      CardCreateParams.builder()
          .accountId("account_id")
          .billingAddress(CardCreateParams.BillingAddress.builder()
              .city("x")
              .line1("x")
              .postalCode("x")
              .state("x")
              .line2("x")
              .build())
          .description("x")
          .digitalWallet(CardCreateParams.DigitalWallet.builder()
              .digitalCardProfileId("digital_card_profile_id")
              .email("x")
              .phone("x")
              .build())
          .entityId("entity_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = CardCreateParams.builder()
          .accountId("account_id")
          .billingAddress(CardCreateParams.BillingAddress.builder()
              .city("x")
              .line1("x")
              .postalCode("x")
              .state("x")
              .line2("x")
              .build())
          .description("x")
          .digitalWallet(CardCreateParams.DigitalWallet.builder()
              .digitalCardProfileId("digital_card_profile_id")
              .email("x")
              .phone("x")
              .build())
          .entityId("entity_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
      assertThat(body.billingAddress()).isEqualTo(CardCreateParams.BillingAddress.builder()
          .city("x")
          .line1("x")
          .postalCode("x")
          .state("x")
          .line2("x")
          .build())
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.digitalWallet()).isEqualTo(CardCreateParams.DigitalWallet.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .email("x")
          .phone("x")
          .build())
      assertThat(body.entityId()).isEqualTo("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CardCreateParams.builder()
          .accountId("account_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("account_id")
    }
}
