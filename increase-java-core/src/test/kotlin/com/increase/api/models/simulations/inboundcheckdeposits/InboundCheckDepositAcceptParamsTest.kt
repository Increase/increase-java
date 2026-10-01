// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundcheckdeposits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundCheckDepositAcceptParamsTest {

    @Test
    fun create() {
        InboundCheckDepositAcceptParams.builder()
            .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundCheckDepositAcceptParams.builder()
                .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_check_deposit_zoshvqybq0cjjm31mra")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
