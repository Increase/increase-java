// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDocumentCreateParamsTest {

    @Test
    fun createSimulationDocumentCreateParams() {
        SimulationDocumentCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
    }

    @Test
    fun body() {
        val params =
            SimulationDocumentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationDocumentCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }
}
