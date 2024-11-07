// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardRefundCreateParamsTest {

    @Test
    fun createSimulationCardRefundCreateParams() {
        SimulationCardRefundCreateParams.builder().transactionId("transaction_id").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardRefundCreateParams.builder().transactionId("transaction_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("transaction_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardRefundCreateParams.builder().transactionId("transaction_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("transaction_id")
    }
}
