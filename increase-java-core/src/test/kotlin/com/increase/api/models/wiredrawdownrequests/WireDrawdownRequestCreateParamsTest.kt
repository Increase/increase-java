// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestCreateParamsTest {

    @Test
    fun create() {
        WireDrawdownRequestCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(10000L)
            .creditorAddress(
                WireDrawdownRequestCreateParams.CreditorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("x")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
            .creditorName("National Phonograph Company")
            .debtorAddress(
                WireDrawdownRequestCreateParams.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("x")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
            .debtorName("Ian Crease")
            .unstructuredRemittanceInformation("Invoice 29582")
            .debtorAccountNumber("987654321")
            .debtorExternalAccountId("debtor_external_account_id")
            .debtorRoutingNumber("101050001")
            .build()
    }

    @Test
    fun body() {
        val params =
            WireDrawdownRequestCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .creditorAddress(
                    WireDrawdownRequestCreateParams.CreditorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2("x")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .creditorName("National Phonograph Company")
                .debtorAddress(
                    WireDrawdownRequestCreateParams.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2("x")
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .debtorName("Ian Crease")
                .unstructuredRemittanceInformation("Invoice 29582")
                .debtorAccountNumber("987654321")
                .debtorExternalAccountId("debtor_external_account_id")
                .debtorRoutingNumber("101050001")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.creditorAddress())
            .isEqualTo(
                WireDrawdownRequestCreateParams.CreditorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("x")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(body.creditorName()).isEqualTo("National Phonograph Company")
        assertThat(body.debtorAddress())
            .isEqualTo(
                WireDrawdownRequestCreateParams.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2("x")
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(body.debtorName()).isEqualTo("Ian Crease")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.debtorAccountNumber()).contains("987654321")
        assertThat(body.debtorExternalAccountId()).contains("debtor_external_account_id")
        assertThat(body.debtorRoutingNumber()).contains("101050001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WireDrawdownRequestCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .creditorAddress(
                    WireDrawdownRequestCreateParams.CreditorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .build()
                )
                .creditorName("National Phonograph Company")
                .debtorAddress(
                    WireDrawdownRequestCreateParams.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .build()
                )
                .debtorName("Ian Crease")
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.creditorAddress())
            .isEqualTo(
                WireDrawdownRequestCreateParams.CreditorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .build()
            )
        assertThat(body.creditorName()).isEqualTo("National Phonograph Company")
        assertThat(body.debtorAddress())
            .isEqualTo(
                WireDrawdownRequestCreateParams.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .build()
            )
        assertThat(body.debtorName()).isEqualTo("Ian Crease")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
    }
}
