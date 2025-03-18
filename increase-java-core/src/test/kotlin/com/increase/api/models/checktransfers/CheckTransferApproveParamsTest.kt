// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTransferApproveParamsTest {

    @Test
    fun create() {
        CheckTransferApproveParams.builder()
            .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckTransferApproveParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("check_transfer_30b43acfu9vw8fyc4f5")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
