// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchTransferAcknowledgeParamsTest {

    @Test
    fun create() {
        AchTransferAcknowledgeParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AchTransferAcknowledgeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()
        assertThat(params).isNotNull
        // path param "achTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
