// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafibalances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiBalanceIntrafiBalanceParamsTest {

    @Test
    fun create() {
        IntrafiBalanceIntrafiBalanceParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntrafiBalanceIntrafiBalanceParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
