// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositRetrieveParamsTest {

    @Test
    fun createInboundCheckDepositRetrieveParams() {
        InboundCheckDepositRetrieveParams.builder()
            .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundCheckDepositRetrieveParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .build()
        assertThat(params).isNotNull
        // path param "inboundCheckDepositId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_check_deposit_zoshvqybq0cjjm31mra")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
