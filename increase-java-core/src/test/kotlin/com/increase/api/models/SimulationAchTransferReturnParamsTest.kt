// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAchTransferReturnParamsTest {

    @Test
    fun create() {
        SimulationAchTransferReturnParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationAchTransferReturnParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.reason())
            .contains(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationAchTransferReturnParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationAchTransferReturnParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
