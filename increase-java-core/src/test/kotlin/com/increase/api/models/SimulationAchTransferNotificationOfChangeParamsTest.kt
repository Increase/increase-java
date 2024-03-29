// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAchTransferNotificationOfChangeParamsTest {

    @Test
    fun createSimulationAchTransferNotificationOfChangeParams() {
        SimulationAchTransferNotificationOfChangeParams.builder()
            .achTransferId("string")
            .changeCode(
                SimulationAchTransferNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
            )
            .correctedData("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationAchTransferNotificationOfChangeParams.builder()
                .achTransferId("string")
                .changeCode(
                    SimulationAchTransferNotificationOfChangeParams.ChangeCode
                        .INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.changeCode())
            .isEqualTo(
                SimulationAchTransferNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
            )
        assertThat(body.correctedData()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationAchTransferNotificationOfChangeParams.builder()
                .achTransferId("string")
                .changeCode(
                    SimulationAchTransferNotificationOfChangeParams.ChangeCode
                        .INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.changeCode())
            .isEqualTo(
                SimulationAchTransferNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
            )
        assertThat(body.correctedData()).isEqualTo("x")
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationAchTransferNotificationOfChangeParams.builder()
                .achTransferId("string")
                .changeCode(
                    SimulationAchTransferNotificationOfChangeParams.ChangeCode
                        .INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("x")
                .build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
