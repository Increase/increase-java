// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardAuthorizeParamsTest {

    @Test
    fun createSimulationCardAuthorizeParams() {
        SimulationCardAuthorizeParams.builder()
            .amount(123L)
            .cardId("string")
            .digitalWalletTokenId("string")
            .eventSubscriptionId("string")
            .merchantAcceptorId("x")
            .merchantCategoryCode("x")
            .merchantCity("x")
            .merchantCountry("x")
            .merchantDescriptor("x")
            .physicalCardId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardAuthorizeParams.builder()
                .amount(123L)
                .cardId("string")
                .digitalWalletTokenId("string")
                .eventSubscriptionId("string")
                .merchantAcceptorId("x")
                .merchantCategoryCode("x")
                .merchantCity("x")
                .merchantCountry("x")
                .merchantDescriptor("x")
                .physicalCardId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.cardId()).isEqualTo("string")
        assertThat(body.digitalWalletTokenId()).isEqualTo("string")
        assertThat(body.eventSubscriptionId()).isEqualTo("string")
        assertThat(body.merchantAcceptorId()).isEqualTo("x")
        assertThat(body.merchantCategoryCode()).isEqualTo("x")
        assertThat(body.merchantCity()).isEqualTo("x")
        assertThat(body.merchantCountry()).isEqualTo("x")
        assertThat(body.merchantDescriptor()).isEqualTo("x")
        assertThat(body.physicalCardId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationCardAuthorizeParams.builder().amount(123L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
    }
}
