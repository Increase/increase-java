// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardDisputeActionParamsTest {

    @Test
    fun createSimulationCardDisputeActionParams() {
        SimulationCardDisputeActionParams.builder()
            .cardDisputeId("string")
            .status(SimulationCardDisputeActionParams.Status.ACCEPTED)
            .explanation("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardDisputeActionParams.builder()
                .cardDisputeId("string")
                .status(SimulationCardDisputeActionParams.Status.ACCEPTED)
                .explanation("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(SimulationCardDisputeActionParams.Status.ACCEPTED)
        assertThat(body.explanation()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardDisputeActionParams.builder()
                .cardDisputeId("string")
                .status(SimulationCardDisputeActionParams.Status.ACCEPTED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(SimulationCardDisputeActionParams.Status.ACCEPTED)
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationCardDisputeActionParams.builder()
                .cardDisputeId("string")
                .status(SimulationCardDisputeActionParams.Status.ACCEPTED)
                .build()
        assertThat(params).isNotNull
        // path param "cardDisputeId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
