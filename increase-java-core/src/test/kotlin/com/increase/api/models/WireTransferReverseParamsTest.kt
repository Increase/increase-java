package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireTransferReverseParamsTest {

    @Test
    fun createWireTransferReverseParams() {
        WireTransferReverseParams.builder().wireTransferId("string").build()
    }

    @Test
    fun getPathParam() {
        val params = WireTransferReverseParams.builder().wireTransferId("string").build()
        assertThat(params).isNotNull
        // path param "wireTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
