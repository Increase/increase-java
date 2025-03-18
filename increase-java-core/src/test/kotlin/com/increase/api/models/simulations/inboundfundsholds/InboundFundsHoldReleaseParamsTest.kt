// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundfundsholds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFundsHoldReleaseParamsTest {

    @Test
    fun create() {
        InboundFundsHoldReleaseParams.builder()
            .inboundFundsHoldId("inbound_funds_hold_9vuasmywdo7xb3zt4071")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundFundsHoldReleaseParams.builder()
                .inboundFundsHoldId("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_funds_hold_9vuasmywdo7xb3zt4071")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
