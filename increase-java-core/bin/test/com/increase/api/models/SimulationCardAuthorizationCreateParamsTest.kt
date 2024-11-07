// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardAuthorizationCreateParamsTest {

    @Test
    fun createSimulationCardAuthorizationCreateParams() {
        SimulationCardAuthorizationCreateParams.builder()
            .amount(123L)
            .authenticatedCardPaymentId("authenticated_card_payment_id")
            .cardId("card_id")
            .declineReason(SimulationCardAuthorizationCreateParams.DeclineReason.CARD_NOT_ACTIVE)
            .digitalWalletTokenId("digital_wallet_token_id")
            .direction(SimulationCardAuthorizationCreateParams.Direction.SETTLEMENT)
            .eventSubscriptionId("event_subscription_id")
            .merchantAcceptorId("x")
            .merchantCategoryCode("x")
            .merchantCity("x")
            .merchantCountry("x")
            .merchantDescriptor("x")
            .physicalCardId("physical_card_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardAuthorizationCreateParams.builder()
                .amount(123L)
                .authenticatedCardPaymentId("authenticated_card_payment_id")
                .cardId("card_id")
                .declineReason(
                    SimulationCardAuthorizationCreateParams.DeclineReason.CARD_NOT_ACTIVE
                )
                .digitalWalletTokenId("digital_wallet_token_id")
                .direction(SimulationCardAuthorizationCreateParams.Direction.SETTLEMENT)
                .eventSubscriptionId("event_subscription_id")
                .merchantAcceptorId("x")
                .merchantCategoryCode("x")
                .merchantCity("x")
                .merchantCountry("x")
                .merchantDescriptor("x")
                .physicalCardId("physical_card_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.authenticatedCardPaymentId()).isEqualTo("authenticated_card_payment_id")
        assertThat(body.cardId()).isEqualTo("card_id")
        assertThat(body.declineReason())
            .isEqualTo(SimulationCardAuthorizationCreateParams.DeclineReason.CARD_NOT_ACTIVE)
        assertThat(body.digitalWalletTokenId()).isEqualTo("digital_wallet_token_id")
        assertThat(body.direction())
            .isEqualTo(SimulationCardAuthorizationCreateParams.Direction.SETTLEMENT)
        assertThat(body.eventSubscriptionId()).isEqualTo("event_subscription_id")
        assertThat(body.merchantAcceptorId()).isEqualTo("x")
        assertThat(body.merchantCategoryCode()).isEqualTo("x")
        assertThat(body.merchantCity()).isEqualTo("x")
        assertThat(body.merchantCountry()).isEqualTo("x")
        assertThat(body.merchantDescriptor()).isEqualTo("x")
        assertThat(body.physicalCardId()).isEqualTo("physical_card_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationCardAuthorizationCreateParams.builder().amount(123L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
    }
}
