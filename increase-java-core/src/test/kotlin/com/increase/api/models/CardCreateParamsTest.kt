// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardCreateParamsTest {

    @Test
    fun createCardCreateParams() {
        CardCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .billingAddress(
                CardCreateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
            .description("Card for Ian Crease")
            .digitalWallet(
                CardCreateParams.DigitalWallet.builder()
                    .digitalCardProfileId("digital_card_profile_id")
                    .email("x")
                    .phone("x")
                    .build()
            )
            .entityId("entity_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .billingAddress(
                    CardCreateParams.BillingAddress.builder()
                        .city("x")
                        .line1("x")
                        .postalCode("x")
                        .state("x")
                        .line2("x")
                        .build()
                )
                .description("Card for Ian Crease")
                .digitalWallet(
                    CardCreateParams.DigitalWallet.builder()
                        .digitalCardProfileId("digital_card_profile_id")
                        .email("x")
                        .phone("x")
                        .build()
                )
                .entityId("entity_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.billingAddress())
            .contains(
                CardCreateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
        assertThat(body.description()).contains("Card for Ian Crease")
        assertThat(body.digitalWallet())
            .contains(
                CardCreateParams.DigitalWallet.builder()
                    .digitalCardProfileId("digital_card_profile_id")
                    .email("x")
                    .phone("x")
                    .build()
            )
        assertThat(body.entityId()).contains("entity_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CardCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }
}
