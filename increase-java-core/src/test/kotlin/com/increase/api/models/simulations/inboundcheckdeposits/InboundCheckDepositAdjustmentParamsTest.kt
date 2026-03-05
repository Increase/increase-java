// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundcheckdeposits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundCheckDepositAdjustmentParamsTest {

    @Test
    fun create() {
        InboundCheckDepositAdjustmentParams.builder()
            .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
            .amount(1000L)
            .reason(InboundCheckDepositAdjustmentParams.Reason.LATE_RETURN)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundCheckDepositAdjustmentParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_check_deposit_zoshvqybq0cjjm31mra")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundCheckDepositAdjustmentParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .amount(1000L)
                .reason(InboundCheckDepositAdjustmentParams.Reason.LATE_RETURN)
                .build()

        val body = params._body()

        assertThat(body.amount()).contains(1000L)
        assertThat(body.reason()).contains(InboundCheckDepositAdjustmentParams.Reason.LATE_RETURN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundCheckDepositAdjustmentParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .build()

        val body = params._body()
    }
}
