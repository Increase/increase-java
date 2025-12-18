// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.exports

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportCreateParamsTest {

    @Test
    fun create() {
        ExportCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
    }

    @Test
    fun body() {
        val params = ExportCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }
}
