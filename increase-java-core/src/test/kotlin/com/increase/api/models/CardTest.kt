package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.Card

class CardTest {

    @Test
    fun createCard() {
      val card = Card.builder()
          .id("string")
          .accountId("string")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .description("string")
          .last4("string")
          .expirationMonth(123L)
          .expirationYear(123L)
          .status(Card.Status.ACTIVE)
          .billingAddress(Card.BillingAddress.builder()
              .line1("string")
              .line2("string")
              .city("string")
              .state("string")
              .postalCode("string")
              .build())
          .digitalWallet(Card.DigitalWallet.builder()
              .email("string")
              .phone("string")
              .cardProfileId("string")
              .build())
          .type(Card.Type.CARD)
          .build()
      assertThat(card).isNotNull
      assertThat(card.id()).isEqualTo("string")
      assertThat(card.accountId()).isEqualTo("string")
      assertThat(card.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(card.description()).contains("string")
      assertThat(card.last4()).isEqualTo("string")
      assertThat(card.expirationMonth()).isEqualTo(123L)
      assertThat(card.expirationYear()).isEqualTo(123L)
      assertThat(card.status()).isEqualTo(Card.Status.ACTIVE)
      assertThat(card.billingAddress()).isEqualTo(Card.BillingAddress.builder()
          .line1("string")
          .line2("string")
          .city("string")
          .state("string")
          .postalCode("string")
          .build())
      assertThat(card.digitalWallet()).contains(Card.DigitalWallet.builder()
          .email("string")
          .phone("string")
          .cardProfileId("string")
          .build())
      assertThat(card.type()).isEqualTo(Card.Type.CARD)
    }
}
