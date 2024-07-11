// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardIncrementsParamsTest {

    @Test
    fun createSimulationCardIncrementsParams() {
        SimulationCardIncrementsParams.builder()
            .amount(123L)
            .cardPaymentId("card_payment_id")
            .eventSubscriptionId("event_subscription_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardIncrementsParams.builder()
                .amount(123L)
                .cardPaymentId("card_payment_id")
                .eventSubscriptionId("event_subscription_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
        assertThat(body.eventSubscriptionId()).isEqualTo("event_subscription_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardIncrementsParams.builder()
                .amount(123L)
                .cardPaymentId("card_payment_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }
}
