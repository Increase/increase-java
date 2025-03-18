// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundCheckDepositReturnParamsTest {

    @Test
    fun create() {
        InboundCheckDepositReturnParams.builder()
            .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
            .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundCheckDepositReturnParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_check_deposit_zoshvqybq0cjjm31mra")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundCheckDepositReturnParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.reason())
            .isEqualTo(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
    }
}
