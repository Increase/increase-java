// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferCreateParamsTest {

    @Test
    fun createRealTimePaymentsTransferCreateParams() {
        RealTimePaymentsTransferCreateParams.builder()
            .amount(100L)
            .creditorName("Ian Crease")
            .remittanceInformation("Invoice 29582")
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .debtorName("x")
            .destinationAccountNumber("987654321")
            .destinationRoutingNumber("101050001")
            .externalAccountId("external_account_id")
            .requireApproval(true)
            .ultimateCreditorName("x")
            .ultimateDebtorName("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(100L)
                .creditorName("Ian Crease")
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .debtorName("x")
                .destinationAccountNumber("987654321")
                .destinationRoutingNumber("101050001")
                .externalAccountId("external_account_id")
                .requireApproval(true)
                .ultimateCreditorName("x")
                .ultimateDebtorName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.remittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.destinationAccountNumber()).isEqualTo("987654321")
        assertThat(body.destinationRoutingNumber()).isEqualTo("101050001")
        assertThat(body.externalAccountId()).isEqualTo("external_account_id")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.ultimateCreditorName()).isEqualTo("x")
        assertThat(body.ultimateDebtorName()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(100L)
                .creditorName("Ian Crease")
                .remittanceInformation("Invoice 29582")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.remittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
