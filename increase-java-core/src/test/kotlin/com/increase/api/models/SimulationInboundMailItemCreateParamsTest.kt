// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundMailItemCreateParamsTest {

    @Test
    fun createSimulationInboundMailItemCreateParams() {
        SimulationInboundMailItemCreateParams.builder()
            .amount(1000L)
            .lockboxId("lockbox_3xt21ok13q19advds4t5")
            .contentsFileId("contents_file_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundMailItemCreateParams.builder()
                .amount(1000L)
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .contentsFileId("contents_file_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.lockboxId()).isEqualTo("lockbox_3xt21ok13q19advds4t5")
        assertThat(body.contentsFileId()).contains("contents_file_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundMailItemCreateParams.builder()
                .amount(1000L)
                .lockboxId("lockbox_3xt21ok13q19advds4t5")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.lockboxId()).isEqualTo("lockbox_3xt21ok13q19advds4t5")
    }
}
