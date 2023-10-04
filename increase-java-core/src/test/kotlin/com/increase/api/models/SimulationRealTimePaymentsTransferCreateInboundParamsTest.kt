// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationRealTimePaymentsTransferCreateInboundParamsTest {

    @Test
    fun createSimulationRealTimePaymentsTransferCreateInboundParams() {
        SimulationRealTimePaymentsTransferCreateInboundParams.builder()
            .accountNumberId("string")
            .amount(123L)
            .debtorAccountNumber("x")
            .debtorName("x")
            .debtorRoutingNumber("xxxxxxxxx")
            .remittanceInformation("x")
            .requestForPaymentId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationRealTimePaymentsTransferCreateInboundParams.builder()
                .accountNumberId("string")
                .amount(123L)
                .debtorAccountNumber("x")
                .debtorName("x")
                .debtorRoutingNumber("xxxxxxxxx")
                .remittanceInformation("x")
                .requestForPaymentId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.debtorAccountNumber()).isEqualTo("x")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.debtorRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.remittanceInformation()).isEqualTo("x")
        assertThat(body.requestForPaymentId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationRealTimePaymentsTransferCreateInboundParams.builder()
                .accountNumberId("string")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
