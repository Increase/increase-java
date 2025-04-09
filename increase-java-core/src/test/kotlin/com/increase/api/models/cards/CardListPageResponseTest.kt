// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListPageResponseTest {

    @Test
    fun create() {
        val cardListPageResponse =
            CardListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(cardListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(cardListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListPageResponse =
            CardListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCardListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListPageResponse),
                jacksonTypeRef<CardListPageResponse>(),
            )

        assertThat(roundtrippedCardListPageResponse).isEqualTo(cardListPageResponse)
    }
}
