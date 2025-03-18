// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchTransferReturnParamsTest {

    @Test
    fun create() {
        AchTransferReturnParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .reason(AchTransferReturnParams.Reason.INSUFFICIENT_FUND)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AchTransferReturnParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AchTransferReturnParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .reason(AchTransferReturnParams.Reason.INSUFFICIENT_FUND)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.reason()).contains(AchTransferReturnParams.Reason.INSUFFICIENT_FUND)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AchTransferReturnParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
