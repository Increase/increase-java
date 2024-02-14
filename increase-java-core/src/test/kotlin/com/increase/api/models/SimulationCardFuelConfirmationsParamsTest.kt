// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardFuelConfirmationsParamsTest {

    @Test
    fun createSimulationCardFuelConfirmationsParams() {
        SimulationCardFuelConfirmationsParams.builder().amount(123L).cardPaymentId("string").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardFuelConfirmationsParams.builder()
                .amount(123L)
                .cardPaymentId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.cardPaymentId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardFuelConfirmationsParams.builder()
                .amount(123L)
                .cardPaymentId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.cardPaymentId()).isEqualTo("string")
    }
}
