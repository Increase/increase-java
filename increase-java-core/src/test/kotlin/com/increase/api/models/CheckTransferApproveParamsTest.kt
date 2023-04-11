package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferApproveParamsTest {

    @Test
    fun createCheckTransferApproveParams() {
        CheckTransferApproveParams.builder().checkTransferId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = CheckTransferApproveParams.builder().checkTransferId("string").build()
        assertThat(params).isNotNull
        // path param "checkTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
