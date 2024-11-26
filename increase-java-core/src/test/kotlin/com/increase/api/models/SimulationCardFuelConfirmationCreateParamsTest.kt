// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardFuelConfirmationCreateParamsTest {

    @Test
    fun createSimulationCardFuelConfirmationCreateParams() {
        SimulationCardFuelConfirmationCreateParams.builder()
            .amount(1L)
            .cardPaymentId("card_payment_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardFuelConfirmationCreateParams.builder()
                .amount(1L)
                .cardPaymentId("card_payment_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardFuelConfirmationCreateParams.builder()
                .amount(1L)
                .cardPaymentId("card_payment_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(1L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }
}
