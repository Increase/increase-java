// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateParamsTest {

    @Test
    fun create() {
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
    fun pathParams() {
        val params = CardUpdateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        assertThat(params._pathParam(0)).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
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

        val body = params._body()

        assertNotNull(body)
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
    fun bodyWithoutOptionalFields() {
        val params = CardUpdateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        val body = params._body()

        assertNotNull(body)
    }
}
