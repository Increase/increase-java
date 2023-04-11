package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.CardProfileCreateParams.CardProfileCreateBody

class CardProfileCreateParamsTest {

    @Test
    fun createCardProfileCreateParams() {
      CardProfileCreateParams.builder()
          .description("x")
          .digitalWallets(CardProfileCreateParams.DigitalWallets.builder()
              .textColor(CardProfileCreateParams.DigitalWallets.TextColor.builder()
                  .red(123L)
                  .green(123L)
                  .blue(123L)
                  .build())
              .issuerName("x")
              .cardDescription("x")
              .contactWebsite("string")
              .contactEmail("x")
              .contactPhone("x")
              .backgroundImageFileId("string")
              .appIconFileId("string")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = CardProfileCreateParams.builder()
          .description("x")
          .digitalWallets(CardProfileCreateParams.DigitalWallets.builder()
              .textColor(CardProfileCreateParams.DigitalWallets.TextColor.builder()
                  .red(123L)
                  .green(123L)
                  .blue(123L)
                  .build())
              .issuerName("x")
              .cardDescription("x")
              .contactWebsite("string")
              .contactEmail("x")
              .contactPhone("x")
              .backgroundImageFileId("string")
              .appIconFileId("string")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.digitalWallets()).isEqualTo(CardProfileCreateParams.DigitalWallets.builder()
          .textColor(CardProfileCreateParams.DigitalWallets.TextColor.builder()
              .red(123L)
              .green(123L)
              .blue(123L)
              .build())
          .issuerName("x")
          .cardDescription("x")
          .contactWebsite("string")
          .contactEmail("x")
          .contactPhone("x")
          .backgroundImageFileId("string")
          .appIconFileId("string")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = CardProfileCreateParams.builder()
          .description("x")
          .digitalWallets(CardProfileCreateParams.DigitalWallets.builder()
              .issuerName("x")
              .cardDescription("x")
              .backgroundImageFileId("string")
              .appIconFileId("string")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.digitalWallets()).isEqualTo(CardProfileCreateParams.DigitalWallets.builder()
          .issuerName("x")
          .cardDescription("x")
          .backgroundImageFileId("string")
          .appIconFileId("string")
          .build())
    }
}
