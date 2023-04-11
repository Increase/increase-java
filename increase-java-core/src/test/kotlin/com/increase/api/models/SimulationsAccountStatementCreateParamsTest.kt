package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsAccountStatementCreateParamsTest {

    @Test
    fun createSimulationsAccountStatementCreateParams() {
        SimulationsAccountStatementCreateParams.builder().accountId("string").build()
    }

    @Test
    fun getBody() {
        val params = SimulationsAccountStatementCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationsAccountStatementCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }
}
