// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardUpdateParamsTest {

    @Test
    fun createCardUpdateParams() {
        CardUpdateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .billingAddress(
                CardUpdateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
            .description("New description")
            .digitalWallet(
                CardUpdateParams.DigitalWallet.builder()
                    .digitalCardProfileId("digital_card_profile_id")
                    .email("x")
                    .phone("x")
                    .build()
            )
            .entityId("entity_id")
            .status(CardUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CardUpdateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .billingAddress(
                    CardUpdateParams.BillingAddress.builder()
                        .city("x")
                        .line1("x")
                        .postalCode("x")
                        .state("x")
                        .line2("x")
                        .build()
                )
                .description("New description")
                .digitalWallet(
                    CardUpdateParams.DigitalWallet.builder()
                        .digitalCardProfileId("digital_card_profile_id")
                        .email("x")
                        .phone("x")
                        .build()
                )
                .entityId("entity_id")
                .status(CardUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.billingAddress())
            .contains(
                CardUpdateParams.BillingAddress.builder()
                    .city("x")
                    .line1("x")
                    .postalCode("x")
                    .state("x")
                    .line2("x")
                    .build()
            )
        assertThat(body.description()).contains("New description")
        assertThat(body.digitalWallet())
            .contains(
                CardUpdateParams.DigitalWallet.builder()
                    .digitalCardProfileId("digital_card_profile_id")
                    .email("x")
                    .phone("x")
                    .build()
            )
        assertThat(body.entityId()).contains("entity_id")
        assertThat(body.status()).contains(CardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CardUpdateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CardUpdateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()
        assertThat(params).isNotNull
        // path param "cardId"
        assertThat(params.getPathParam(0)).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
