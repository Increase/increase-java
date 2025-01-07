// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun createCard() {
        val card =
            Card.builder()
                .id("card_oubs0hwk5rn6knuecxg2")
                .accountId("account_in71c4amph0vgo2qllky")
                .billingAddress(
                    Card.BillingAddress.builder()
                        .city("New York")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Office Expenses")
                .digitalWallet(
                    Card.DigitalWallet.builder()
                        .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                        .email("user@example.com")
                        .phone("+16505046304")
                        .build()
                )
                .entityId(null)
                .expirationMonth(11L)
                .expirationYear(2028L)
                .idempotencyKey(null)
                .last4("4242")
                .status(Card.Status.ACTIVE)
                .type(Card.Type.CARD)
                .build()
        assertThat(card).isNotNull
        assertThat(card.id()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(card.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(card.billingAddress())
            .isEqualTo(
                Card.BillingAddress.builder()
                    .city("New York")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(card.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(card.description()).contains("Office Expenses")
        assertThat(card.digitalWallet())
            .contains(
                Card.DigitalWallet.builder()
                    .digitalCardProfileId("digital_card_profile_s3puplu90f04xhcwkiga")
                    .email("user@example.com")
                    .phone("+16505046304")
                    .build()
            )
        assertThat(card.entityId()).isEmpty
        assertThat(card.expirationMonth()).isEqualTo(11L)
        assertThat(card.expirationYear()).isEqualTo(2028L)
        assertThat(card.idempotencyKey()).isEmpty
        assertThat(card.last4()).isEqualTo("4242")
        assertThat(card.status()).isEqualTo(Card.Status.ACTIVE)
        assertThat(card.type()).isEqualTo(Card.Type.CARD)
    }
}
