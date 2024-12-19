// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardIncrementCreateParamsTest {

    @Test
    fun createSimulationCardIncrementCreateParams() {
        SimulationCardIncrementCreateParams.builder()
            .amount(500L)
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .eventSubscriptionId("event_subscription_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardIncrementCreateParams.builder()
                .amount(500L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .eventSubscriptionId("event_subscription_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(500L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        assertThat(body.eventSubscriptionId()).isEqualTo("event_subscription_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardIncrementCreateParams.builder()
                .amount(500L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(500L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
