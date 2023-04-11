package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsCardAuthorizeParamsTest {

    @Test
    fun createSimulationsCardAuthorizeParams() {
        SimulationsCardAuthorizeParams.builder()
            .amount(123L)
            .cardId("string")
            .digitalWalletTokenId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationsCardAuthorizeParams.builder()
                .amount(123L)
                .cardId("string")
                .digitalWalletTokenId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.cardId()).isEqualTo("string")
        assertThat(body.digitalWalletTokenId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = SimulationsCardAuthorizeParams.builder().amount(123L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
    }
}
