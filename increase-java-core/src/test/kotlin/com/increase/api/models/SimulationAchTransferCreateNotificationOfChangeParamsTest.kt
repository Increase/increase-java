// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun create() {
        SimulationAchTransferCreateNotificationOfChangeParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .changeCode(
                SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                    .INCORRECT_ACCOUNT_NUMBER
            )
            .correctedData("123456789")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationAchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .changeCode(
                    SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                        .INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("123456789")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.changeCode())
            .isEqualTo(
                SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                    .INCORRECT_ACCOUNT_NUMBER
            )
        assertThat(body.correctedData()).isEqualTo("123456789")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationAchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .changeCode(
                    SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                        .INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("123456789")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.changeCode())
            .isEqualTo(
                SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                    .INCORRECT_ACCOUNT_NUMBER
            )
        assertThat(body.correctedData()).isEqualTo("123456789")
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationAchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .changeCode(
                    SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
                        .INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("123456789")
                .build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
