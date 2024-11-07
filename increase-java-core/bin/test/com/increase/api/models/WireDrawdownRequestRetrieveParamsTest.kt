// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestRetrieveParamsTest {

    @Test
    fun createWireDrawdownRequestRetrieveParams() {
        WireDrawdownRequestRetrieveParams.builder()
            .wireDrawdownRequestId("wire_drawdown_request_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            WireDrawdownRequestRetrieveParams.builder()
                .wireDrawdownRequestId("wire_drawdown_request_id")
                .build()
        assertThat(params).isNotNull
        // path param "wireDrawdownRequestId"
        assertThat(params.getPathParam(0)).isEqualTo("wire_drawdown_request_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
