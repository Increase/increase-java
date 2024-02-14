// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardReversalsParamsTest {

    @Test
    fun createSimulationCardReversalsParams() {
        SimulationCardReversalsParams.builder().cardPaymentId("string").amount(123L).build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardReversalsParams.builder().cardPaymentId("string").amount(123L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationCardReversalsParams.builder().cardPaymentId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("string")
    }
}
