// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositReturnParamsTest {

    @Test
    fun createInboundCheckDepositReturnParams() {
        InboundCheckDepositReturnParams.builder()
            .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
            .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundCheckDepositReturnParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundCheckDepositReturnParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
    }

    @Test
    fun getPathParam() {
        val params =
            InboundCheckDepositReturnParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                .build()
        assertThat(params).isNotNull
        // path param "inboundCheckDepositId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_check_deposit_zoshvqybq0cjjm31mra")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
