// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundMailItemCreateParamsTest {

    @Test
    fun createSimulationInboundMailItemCreateParams() {
        SimulationInboundMailItemCreateParams.builder().amount(123L).lockboxId("lockbox_id").build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundMailItemCreateParams.builder()
                .amount(123L)
                .lockboxId("lockbox_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.lockboxId()).isEqualTo("lockbox_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundMailItemCreateParams.builder()
                .amount(123L)
                .lockboxId("lockbox_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.lockboxId()).isEqualTo("lockbox_id")
    }
}