// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireTransferRetrieveParamsTest {

    @Test
    fun createWireTransferRetrieveParams() {
        WireTransferRetrieveParams.builder().wireTransferId("wire_transfer_id").build()
    }

    @Test
    fun getPathParam() {
        val params = WireTransferRetrieveParams.builder().wireTransferId("wire_transfer_id").build()
        assertThat(params).isNotNull
        // path param "wireTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("wire_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
