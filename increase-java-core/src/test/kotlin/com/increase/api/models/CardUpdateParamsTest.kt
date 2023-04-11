package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.CardUpdateParams.CardUpdateBody

class CardUpdateParamsTest {

    @Test
    fun createCardUpdateParams() {
      CardUpdateParams.builder()
          .cardId("string")
          .description("x")
          .status(CardUpdateParams.Status.ACTIVE)
          .billingAddress(CardUpdateParams.BillingAddress.builder()
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .postalCode("x")
              .build())
          .digitalWallet(CardUpdateParams.DigitalWallet.builder()
              .email("x")
              .phone("x")
              .cardProfileId("string")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = CardUpdateParams.builder()
          .cardId("string")
          .description("x")
          .status(CardUpdateParams.Status.ACTIVE)
          .billingAddress(CardUpdateParams.BillingAddress.builder()
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .postalCode("x")
              .build())
          .digitalWallet(CardUpdateParams.DigitalWallet.builder()
              .email("x")
              .phone("x")
              .cardProfileId("string")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.status()).isEqualTo(CardUpdateParams.Status.ACTIVE)
      assertThat(body.billingAddress()).isEqualTo(CardUpdateParams.BillingAddress.builder()
          .line1("x")
          .line2("x")
          .city("x")
          .state("x")
          .postalCode("x")
          .build())
      assertThat(body.digitalWallet()).isEqualTo(CardUpdateParams.DigitalWallet.builder()
          .email("x")
          .phone("x")
          .cardProfileId("string")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CardUpdateParams.builder()
          .cardId("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = CardUpdateParams.builder()
          .cardId("string")
          .build()
      assertThat(params).isNotNull
      // path param "cardId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
