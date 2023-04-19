package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsInterestPaymentCreateParamsTest {

    @Test
    fun createSimulationsInterestPaymentCreateParams() {
        SimulationsInterestPaymentCreateParams.builder().accountId("string").amount(123L).build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationsInterestPaymentCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationsInterestPaymentCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
