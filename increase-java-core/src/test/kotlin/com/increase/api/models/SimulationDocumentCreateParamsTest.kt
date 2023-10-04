// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDocumentCreateParamsTest {

    @Test
    fun createSimulationDocumentCreateParams() {
        SimulationDocumentCreateParams.builder().accountId("string").build()
    }

    @Test
    fun getBody() {
        val params = SimulationDocumentCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationDocumentCreateParams.builder().accountId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
    }
}
