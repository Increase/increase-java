// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundInternationalAchTransferCreateParamsTest {

    @Test
    fun createSimulationInboundInternationalAchTransferCreateParams() {
        SimulationInboundInternationalAchTransferCreateParams.builder()
            .accountNumberId("string")
            .amount(123L)
            .foreignPaymentAmount(123L)
            .originatingCurrencyCode("x")
            .originatorCompanyEntryDescription("x")
            .originatorName("x")
            .receivingCompanyOrIndividualName("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundInternationalAchTransferCreateParams.builder()
                .accountNumberId("string")
                .amount(123L)
                .foreignPaymentAmount(123L)
                .originatingCurrencyCode("x")
                .originatorCompanyEntryDescription("x")
                .originatorName("x")
                .receivingCompanyOrIndividualName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.foreignPaymentAmount()).isEqualTo(123L)
        assertThat(body.originatingCurrencyCode()).isEqualTo("x")
        assertThat(body.originatorCompanyEntryDescription()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("x")
        assertThat(body.receivingCompanyOrIndividualName()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundInternationalAchTransferCreateParams.builder()
                .accountNumberId("string")
                .amount(123L)
                .foreignPaymentAmount(123L)
                .originatingCurrencyCode("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.foreignPaymentAmount()).isEqualTo(123L)
        assertThat(body.originatingCurrencyCode()).isEqualTo("x")
    }
}
