// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsTransferCreateParamsTest {

    @Test
    fun create() {
        RealTimePaymentsTransferCreateParams.builder()
            .amount(100L)
            .creditorName("Ian Crease")
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .unstructuredRemittanceInformation("Invoice 29582")
            .accountNumber("987654321")
            .debtorName("debtor_name")
            .externalAccountId("external_account_id")
            .requireApproval(true)
            .routingNumber("101050001")
            .ultimateCreditorName("ultimate_creditor_name")
            .ultimateDebtorName("ultimate_debtor_name")
            .build()
    }

    @Test
    fun body() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(100L)
                .creditorName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("Invoice 29582")
                .accountNumber("987654321")
                .debtorName("debtor_name")
                .externalAccountId("external_account_id")
                .requireApproval(true)
                .routingNumber("101050001")
                .ultimateCreditorName("ultimate_creditor_name")
                .ultimateDebtorName("ultimate_debtor_name")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.accountNumber()).contains("987654321")
        assertThat(body.debtorName()).contains("debtor_name")
        assertThat(body.externalAccountId()).contains("external_account_id")
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.routingNumber()).contains("101050001")
        assertThat(body.ultimateCreditorName()).contains("ultimate_creditor_name")
        assertThat(body.ultimateDebtorName()).contains("ultimate_debtor_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(100L)
                .creditorName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
    }
}
