// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun create() {
        AchTransferCreateNotificationOfChangeParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .changeCode(
                AchTransferCreateNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
            )
            .correctedData("123456789")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .changeCode(
                    AchTransferCreateNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("123456789")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .changeCode(
                    AchTransferCreateNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
                )
                .correctedData("123456789")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.changeCode())
            .isEqualTo(
                AchTransferCreateNotificationOfChangeParams.ChangeCode.INCORRECT_ACCOUNT_NUMBER
            )
        assertThat(body.correctedData()).isEqualTo("123456789")
    }
}
