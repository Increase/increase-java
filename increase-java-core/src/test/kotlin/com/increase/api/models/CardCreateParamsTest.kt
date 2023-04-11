package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.CardCreateParams.CardCreateBody

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
      CardCreateParams.builder()
          .accountId("string")
          .description("x")
          .billingAddress(CardCreateParams.BillingAddress.builder()
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .postalCode("x")
              .build())
          .digitalWallet(CardCreateParams.DigitalWallet.builder()
              .email("x")
              .phone("x")
              .cardProfileId("string")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = CardCreateParams.builder()
          .accountId("string")
          .description("x")
          .billingAddress(CardCreateParams.BillingAddress.builder()
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .postalCode("x")
              .build())
          .digitalWallet(CardCreateParams.DigitalWallet.builder()
              .email("x")
              .phone("x")
              .cardProfileId("string")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("string")
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.billingAddress()).isEqualTo(CardCreateParams.BillingAddress.builder()
          .line1("x")
          .line2("x")
          .city("x")
          .state("x")
          .postalCode("x")
          .build())
      assertThat(body.digitalWallet()).isEqualTo(CardCreateParams.DigitalWallet.builder()
          .email("x")
          .phone("x")
          .cardProfileId("string")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CardCreateParams.builder()
          .accountId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.accountId()).isEqualTo("string")
    }
}
