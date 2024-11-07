// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundCheckDepositCreateParamsTest {

    @Test
    fun createSimulationInboundCheckDepositCreateParams() {
        SimulationInboundCheckDepositCreateParams.builder()
            .accountNumberId("account_number_id")
            .amount(123L)
            .checkNumber("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundCheckDepositCreateParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .checkNumber("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.checkNumber()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundCheckDepositCreateParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .checkNumber("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.checkNumber()).isEqualTo("x")
    }
}
