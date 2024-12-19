// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardRefundCreateParamsTest {

    @Test
    fun createSimulationCardRefundCreateParams() {
        SimulationCardRefundCreateParams.builder()
            .transactionId("transaction_uyrp7fld2ium70oa7oi")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardRefundCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardRefundCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }
}
