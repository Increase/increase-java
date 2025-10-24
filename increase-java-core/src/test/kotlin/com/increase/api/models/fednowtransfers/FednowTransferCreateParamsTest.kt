// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FednowTransferCreateParamsTest {

    @Test
    fun create() {
        FednowTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(100L)
            .creditorName("Ian Crease")
            .debtorName("National Phonograph Company")
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .unstructuredRemittanceInformation("Invoice 29582")
            .accountNumber("987654321")
            .creditorAddress(
                FednowTransferCreateParams.CreditorAddress.builder()
                    .city("New York")
                    .postalCode("10045")
                    .state("NY")
                    .line1("33 Liberty Street")
                    .build()
            )
            .debtorAddress(
                FednowTransferCreateParams.DebtorAddress.builder()
                    .city("x")
                    .postalCode("x")
                    .state("x")
                    .line1("x")
                    .build()
            )
            .externalAccountId("external_account_id")
            .requireApproval(true)
            .routingNumber("101050001")
            .build()
    }

    @Test
    fun body() {
        val params =
            FednowTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .creditorName("Ian Crease")
                .debtorName("National Phonograph Company")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("Invoice 29582")
                .accountNumber("987654321")
                .creditorAddress(
                    FednowTransferCreateParams.CreditorAddress.builder()
                        .city("New York")
                        .postalCode("10045")
                        .state("NY")
                        .line1("33 Liberty Street")
                        .build()
                )
                .debtorAddress(
                    FednowTransferCreateParams.DebtorAddress.builder()
                        .city("x")
                        .postalCode("x")
                        .state("x")
                        .line1("x")
                        .build()
                )
                .externalAccountId("external_account_id")
                .requireApproval(true)
                .routingNumber("101050001")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.accountNumber()).contains("987654321")
        assertThat(body.creditorAddress())
            .contains(
                FednowTransferCreateParams.CreditorAddress.builder()
                    .city("New York")
                    .postalCode("10045")
                    .state("NY")
                    .line1("33 Liberty Street")
                    .build()
            )
        assertThat(body.debtorAddress())
            .contains(
                FednowTransferCreateParams.DebtorAddress.builder()
                    .city("x")
                    .postalCode("x")
                    .state("x")
                    .line1("x")
                    .build()
            )
        assertThat(body.externalAccountId()).contains("external_account_id")
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.routingNumber()).contains("101050001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FednowTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .creditorName("Ian Crease")
                .debtorName("National Phonograph Company")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
    }
}
