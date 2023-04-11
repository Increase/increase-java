package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsCardRefundCreateParamsTest {

    @Test
    fun createSimulationsCardRefundCreateParams() {
        SimulationsCardRefundCreateParams.builder().transactionId("string").build()
    }

    @Test
    fun getBody() {
        val params = SimulationsCardRefundCreateParams.builder().transactionId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationsCardRefundCreateParams.builder().transactionId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("string")
    }
}
