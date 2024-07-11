// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationRealTimePaymentsTransferCreateInboundParamsTest {

    @Test
    fun createSimulationRealTimePaymentsTransferCreateInboundParams() {
        SimulationRealTimePaymentsTransferCreateInboundParams.builder()
            .accountNumberId("account_number_id")
            .amount(123L)
            .debtorAccountNumber("x")
            .debtorName("x")
            .debtorRoutingNumber("xxxxxxxxx")
            .remittanceInformation("x")
            .requestForPaymentId("request_for_payment_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationRealTimePaymentsTransferCreateInboundParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .debtorAccountNumber("x")
                .debtorName("x")
                .debtorRoutingNumber("xxxxxxxxx")
                .remittanceInformation("x")
                .requestForPaymentId("request_for_payment_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.debtorAccountNumber()).isEqualTo("x")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.debtorRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.remittanceInformation()).isEqualTo("x")
        assertThat(body.requestForPaymentId()).isEqualTo("request_for_payment_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationRealTimePaymentsTransferCreateInboundParams.builder()
                .accountNumberId("account_number_id")
                .amount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_id")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
