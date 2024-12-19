// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundCheckDepositCreateParamsTest {

    @Test
    fun createSimulationInboundCheckDepositCreateParams() {
        SimulationInboundCheckDepositCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .checkNumber("1234567890")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundCheckDepositCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .checkNumber("1234567890")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.checkNumber()).isEqualTo("1234567890")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundCheckDepositCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .checkNumber("1234567890")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.checkNumber()).isEqualTo("1234567890")
    }
}
