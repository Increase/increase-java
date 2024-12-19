// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardDisputeActionParamsTest {

    @Test
    fun createSimulationCardDisputeActionParams() {
        SimulationCardDisputeActionParams.builder()
            .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
            .status(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
            .explanation("This was a valid recurring transaction")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .status(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
                .explanation("This was a valid recurring transaction")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status())
            .isEqualTo(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
        assertThat(body.explanation()).isEqualTo("This was a valid recurring transaction")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .status(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status())
            .isEqualTo(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationCardDisputeActionParams.builder()
                .cardDisputeId("card_dispute_h9sc95nbl1cgltpp7men")
                .status(SimulationCardDisputeActionParams.Status.PENDING_USER_INFORMATION)
                .build()
        assertThat(params).isNotNull
        // path param "cardDisputeId"
        assertThat(params.getPathParam(0)).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
