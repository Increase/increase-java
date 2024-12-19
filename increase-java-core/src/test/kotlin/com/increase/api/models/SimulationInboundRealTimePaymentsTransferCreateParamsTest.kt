// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundRealTimePaymentsTransferCreateParamsTest {

    @Test
    fun createSimulationInboundRealTimePaymentsTransferCreateParams() {
        SimulationInboundRealTimePaymentsTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .debtorAccountNumber("x")
            .debtorName("x")
            .debtorRoutingNumber("xxxxxxxxx")
            .remittanceInformation("x")
            .requestForPaymentId("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationInboundRealTimePaymentsTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .debtorAccountNumber("x")
                .debtorName("x")
                .debtorRoutingNumber("xxxxxxxxx")
                .remittanceInformation("x")
                .requestForPaymentId("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.debtorAccountNumber()).isEqualTo("x")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.debtorRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.remittanceInformation()).isEqualTo("x")
        assertThat(body.requestForPaymentId())
            .isEqualTo("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationInboundRealTimePaymentsTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
