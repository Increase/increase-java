// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundrealtimepaymentstransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsTransferCreateParamsTest {

    @Test
    fun create() {
        InboundRealTimePaymentsTransferCreateParams.builder()
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
    fun body() {
        val params =
            InboundRealTimePaymentsTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .debtorAccountNumber("x")
                .debtorName("x")
                .debtorRoutingNumber("xxxxxxxxx")
                .remittanceInformation("x")
                .requestForPaymentId("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.debtorAccountNumber()).contains("x")
        assertThat(body.debtorName()).contains("x")
        assertThat(body.debtorRoutingNumber()).contains("xxxxxxxxx")
        assertThat(body.remittanceInformation()).contains("x")
        assertThat(body.requestForPaymentId())
            .contains("real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundRealTimePaymentsTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
