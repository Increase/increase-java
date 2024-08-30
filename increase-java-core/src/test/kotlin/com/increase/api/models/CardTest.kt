// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.Card

class CardTest {

    @Test
    fun createCard() {
      val card = Card.builder()
          .id("id")
          .accountId("account_id")
          .billingAddress(Card.BillingAddress.builder()
              .city("city")
              .line1("line1")
              .line2("line2")
              .postalCode("postal_code")
              .state("state")
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .description("description")
          .digitalWallet(Card.DigitalWallet.builder()
              .digitalCardProfileId("digital_card_profile_id")
              .email("email")
              .phone("phone")
              .build())
          .entityId("entity_id")
          .expirationMonth(123L)
          .expirationYear(123L)
          .idempotencyKey("idempotency_key")
          .last4("last4")
          .status(Card.Status.ACTIVE)
          .type(Card.Type.CARD)
          .build()
      assertThat(card).isNotNull
      assertThat(card.id()).isEqualTo("id")
      assertThat(card.accountId()).isEqualTo("account_id")
      assertThat(card.billingAddress()).isEqualTo(Card.BillingAddress.builder()
          .city("city")
          .line1("line1")
          .line2("line2")
          .postalCode("postal_code")
          .state("state")
          .build())
      assertThat(card.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(card.description()).contains("description")
      assertThat(card.digitalWallet()).contains(Card.DigitalWallet.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .email("email")
          .phone("phone")
          .build())
      assertThat(card.entityId()).contains("entity_id")
      assertThat(card.expirationMonth()).isEqualTo(123L)
      assertThat(card.expirationYear()).isEqualTo(123L)
      assertThat(card.idempotencyKey()).contains("idempotency_key")
      assertThat(card.last4()).isEqualTo("last4")
      assertThat(card.status()).isEqualTo(Card.Status.ACTIVE)
      assertThat(card.type()).isEqualTo(Card.Type.CARD)
    }
}
