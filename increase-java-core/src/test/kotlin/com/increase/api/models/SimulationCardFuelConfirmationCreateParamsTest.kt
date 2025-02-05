// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardFuelConfirmationCreateParamsTest {

    @Test
    fun create() {
        SimulationCardFuelConfirmationCreateParams.builder()
            .amount(5000L)
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationCardFuelConfirmationCreateParams.builder()
                .amount(5000L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(5000L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationCardFuelConfirmationCreateParams.builder()
                .amount(5000L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(5000L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
