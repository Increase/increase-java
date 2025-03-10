// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestRetrieveParamsTest {

    @Test
    fun create() {
        WireDrawdownRequestRetrieveParams.builder()
            .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            WireDrawdownRequestRetrieveParams.builder()
                .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .build()
        assertThat(params).isNotNull
        // path param "wireDrawdownRequestId"
        assertThat(params.getPathParam(0)).isEqualTo("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
