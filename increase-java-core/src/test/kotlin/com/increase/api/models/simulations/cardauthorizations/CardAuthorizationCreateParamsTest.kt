// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthorizations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthorizationCreateParamsTest {

    @Test
    fun create() {
        CardAuthorizationCreateParams.builder()
            .amount(1000L)
            .authenticatedCardPaymentId("authenticated_card_payment_id")
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .declineReason(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
            .digitalWalletTokenId("digital_wallet_token_id")
            .direction(CardAuthorizationCreateParams.Direction.SETTLEMENT)
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCity("New York")
            .merchantCountry("US")
            .merchantDescriptor("AMAZON.COM")
            .merchantState("NY")
            .networkDetails(
                CardAuthorizationCreateParams.NetworkDetails.builder()
                    .visa(
                        CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardAuthorizationCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
            .networkRiskScore(0L)
            .physicalCardId("physical_card_id")
            .terminalId("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardAuthorizationCreateParams.builder()
                .amount(1000L)
                .authenticatedCardPaymentId("authenticated_card_payment_id")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .declineReason(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
                .digitalWalletTokenId("digital_wallet_token_id")
                .direction(CardAuthorizationCreateParams.Direction.SETTLEMENT)
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCity("New York")
                .merchantCountry("US")
                .merchantDescriptor("AMAZON.COM")
                .merchantState("NY")
                .networkDetails(
                    CardAuthorizationCreateParams.NetworkDetails.builder()
                        .visa(
                            CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                                .standInProcessingReason(
                                    CardAuthorizationCreateParams.NetworkDetails.Visa
                                        .StandInProcessingReason
                                        .ISSUER_ERROR
                                )
                                .build()
                        )
                        .build()
                )
                .networkRiskScore(0L)
                .physicalCardId("physical_card_id")
                .terminalId("x")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.authenticatedCardPaymentId()).contains("authenticated_card_payment_id")
        assertThat(body.cardId()).contains("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.declineReason())
            .contains(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
        assertThat(body.digitalWalletTokenId()).contains("digital_wallet_token_id")
        assertThat(body.direction()).contains(CardAuthorizationCreateParams.Direction.SETTLEMENT)
        assertThat(body.eventSubscriptionId())
            .contains("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        assertThat(body.merchantAcceptorId()).contains("5665270011000168")
        assertThat(body.merchantCategoryCode()).contains("5734")
        assertThat(body.merchantCity()).contains("New York")
        assertThat(body.merchantCountry()).contains("US")
        assertThat(body.merchantDescriptor()).contains("AMAZON.COM")
        assertThat(body.merchantState()).contains("NY")
        assertThat(body.networkDetails())
            .contains(
                CardAuthorizationCreateParams.NetworkDetails.builder()
                    .visa(
                        CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardAuthorizationCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.networkRiskScore()).contains(0L)
        assertThat(body.physicalCardId()).contains("physical_card_id")
        assertThat(body.terminalId()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardAuthorizationCreateParams.builder().amount(1000L).build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000L)
    }
}
