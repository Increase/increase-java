// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardbalanceinquiries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBalanceInquiryCreateParamsTest {

    @Test
    fun create() {
        CardBalanceInquiryCreateParams.builder()
            .balance(1000000L)
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .declineReason(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
            .digitalWalletTokenId("digital_wallet_token_id")
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCity("New York")
            .merchantCountry("US")
            .merchantDescriptor("CITIBANK")
            .merchantState("NY")
            .networkDetails(
                CardBalanceInquiryCreateParams.NetworkDetails.builder()
                    .visa(
                        CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardBalanceInquiryCreateParams.NetworkDetails.Visa
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
            CardBalanceInquiryCreateParams.builder()
                .balance(1000000L)
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .declineReason(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
                .digitalWalletTokenId("digital_wallet_token_id")
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCity("New York")
                .merchantCountry("US")
                .merchantDescriptor("CITIBANK")
                .merchantState("NY")
                .networkDetails(
                    CardBalanceInquiryCreateParams.NetworkDetails.builder()
                        .visa(
                            CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                                .standInProcessingReason(
                                    CardBalanceInquiryCreateParams.NetworkDetails.Visa
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

        assertThat(body.balance()).contains(1000000L)
        assertThat(body.cardId()).contains("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.declineReason())
            .contains(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
        assertThat(body.digitalWalletTokenId()).contains("digital_wallet_token_id")
        assertThat(body.eventSubscriptionId())
            .contains("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        assertThat(body.merchantAcceptorId()).contains("5665270011000168")
        assertThat(body.merchantCategoryCode()).contains("5734")
        assertThat(body.merchantCity()).contains("New York")
        assertThat(body.merchantCountry()).contains("US")
        assertThat(body.merchantDescriptor()).contains("CITIBANK")
        assertThat(body.merchantState()).contains("NY")
        assertThat(body.networkDetails())
            .contains(
                CardBalanceInquiryCreateParams.NetworkDetails.builder()
                    .visa(
                        CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardBalanceInquiryCreateParams.NetworkDetails.Visa
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
        val params = CardBalanceInquiryCreateParams.builder().build()

        val body = params._body()
    }
}
