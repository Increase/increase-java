package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsDocumentCreateParamsTest {

    @Test
    fun createSimulationsDocumentCreateParams() {
        SimulationsDocumentCreateParams.builder().accountId("string").build()
    }

    @Test
    fun getBody() {
        val params = SimulationsDocumentCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationsDocumentCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }
}
