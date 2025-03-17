// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTransferCancelParamsTest {

    @Test
    fun create() {
        CheckTransferCancelParams.builder()
            .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CheckTransferCancelParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .build()
        assertThat(params).isNotNull
        // path param "checkTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("check_transfer_30b43acfu9vw8fyc4f5")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
