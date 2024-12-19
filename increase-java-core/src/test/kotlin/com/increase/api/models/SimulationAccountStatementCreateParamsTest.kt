// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationAccountStatementCreateParamsTest {

    @Test
    fun createSimulationAccountStatementCreateParams() {
        SimulationAccountStatementCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationAccountStatementCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationAccountStatementCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }
}
