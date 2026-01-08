// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.swifttransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SwiftTransferCreateParamsTest {

    @Test
    fun create() {
        SwiftTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .accountNumber("987654321")
            .bankIdentificationCode("ECBFDEFFTPP")
            .creditorAddress(
                SwiftTransferCreateParams.CreditorAddress.builder()
                    .city("Frankfurt")
                    .country("DE")
                    .line1("Sonnemannstrasse 20")
                    .line2("x")
                    .postalCode("60314")
                    .state("x")
                    .build()
            )
            .creditorName("Ian Crease")
            .debtorAddress(
                SwiftTransferCreateParams.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("x")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
            .debtorName("National Phonograph Company")
            .instructedAmount(100L)
            .instructedCurrency(SwiftTransferCreateParams.InstructedCurrency.USD)
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .unstructuredRemittanceInformation("New Swift transfer")
            .requireApproval(true)
            .routingNumber("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            SwiftTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .bankIdentificationCode("ECBFDEFFTPP")
                .creditorAddress(
                    SwiftTransferCreateParams.CreditorAddress.builder()
                        .city("Frankfurt")
                        .country("DE")
                        .line1("Sonnemannstrasse 20")
                        .line2("x")
                        .postalCode("60314")
                        .state("x")
                        .build()
                )
                .creditorName("Ian Crease")
                .debtorAddress(
                    SwiftTransferCreateParams.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2("x")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .debtorName("National Phonograph Company")
                .instructedAmount(100L)
                .instructedCurrency(SwiftTransferCreateParams.InstructedCurrency.USD)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("New Swift transfer")
                .requireApproval(true)
                .routingNumber("x")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.bankIdentificationCode()).isEqualTo("ECBFDEFFTPP")
        assertThat(body.creditorAddress())
            .isEqualTo(
                SwiftTransferCreateParams.CreditorAddress.builder()
                    .city("Frankfurt")
                    .country("DE")
                    .line1("Sonnemannstrasse 20")
                    .line2("x")
                    .postalCode("60314")
                    .state("x")
                    .build()
            )
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.debtorAddress())
            .isEqualTo(
                SwiftTransferCreateParams.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("x")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(body.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(body.instructedAmount()).isEqualTo(100L)
        assertThat(body.instructedCurrency())
            .isEqualTo(SwiftTransferCreateParams.InstructedCurrency.USD)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("New Swift transfer")
        assertThat(body.requireApproval()).contains(true)
        assertThat(body.routingNumber()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SwiftTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .bankIdentificationCode("ECBFDEFFTPP")
                .creditorAddress(
                    SwiftTransferCreateParams.CreditorAddress.builder()
                        .city("Frankfurt")
                        .country("DE")
                        .line1("Sonnemannstrasse 20")
                        .build()
                )
                .creditorName("Ian Crease")
                .debtorAddress(
                    SwiftTransferCreateParams.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .build()
                )
                .debtorName("National Phonograph Company")
                .instructedAmount(100L)
                .instructedCurrency(SwiftTransferCreateParams.InstructedCurrency.USD)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("New Swift transfer")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.bankIdentificationCode()).isEqualTo("ECBFDEFFTPP")
        assertThat(body.creditorAddress())
            .isEqualTo(
                SwiftTransferCreateParams.CreditorAddress.builder()
                    .city("Frankfurt")
                    .country("DE")
                    .line1("Sonnemannstrasse 20")
                    .build()
            )
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.debtorAddress())
            .isEqualTo(
                SwiftTransferCreateParams.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .build()
            )
        assertThat(body.debtorName()).isEqualTo("National Phonograph Company")
        assertThat(body.instructedAmount()).isEqualTo(100L)
        assertThat(body.instructedCurrency())
            .isEqualTo(SwiftTransferCreateParams.InstructedCurrency.USD)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("New Swift transfer")
    }
}
