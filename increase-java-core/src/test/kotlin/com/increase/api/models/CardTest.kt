package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun createCard() {
        val card =
            Card.builder()
                .id("string")
                .accountId("string")
                .billingAddress(
                    Card.BillingAddress.builder()
                        .city("string")
                        .line1("string")
                        .line2("string")
                        .postalCode("string")
                        .state("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .digitalWallet(
                    Card.DigitalWallet.builder()
                        .cardProfileId("string")
                        .email("string")
                        .phone("string")
                        .build()
                )
                .expirationMonth(123L)
                .expirationYear(123L)
                .last4("string")
                .status(Card.Status.ACTIVE)
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
        assertThat(card.billingAddress())
            .isEqualTo(
                Card.BillingAddress.builder()
                    .city("string")
                    .line1("string")
                    .line2("string")
                    .postalCode("string")
                    .state("string")
                    .build()
            )
        assertThat(card.digitalWallet())
            .contains(
                Card.DigitalWallet.builder()
                    .cardProfileId("string")
                    .email("string")
                    .phone("string")
                    .build()
            )
        assertThat(card.type()).isEqualTo(Card.Type.CARD)
    }
}
