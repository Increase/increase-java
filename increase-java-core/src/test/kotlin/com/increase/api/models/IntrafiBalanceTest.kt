// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IntrafiBalanceTest {

    @Test
    fun createIntrafiBalance() {
        val intrafiBalance =
            IntrafiBalance.builder()
                .id("string")
                .balances(
                    listOf(
                        IntrafiBalance.Balance.builder()
                            .id("string")
                            .balance(123L)
                            .bank("string")
                            .bankLocation(
                                IntrafiBalance.Balance.BankLocation.builder()
                                    .city("string")
                                    .state("string")
                                    .build()
                            )
                            .fdicCertificateNumber("string")
                            .build()
                    )
                )
                .currency(IntrafiBalance.Currency.CAD)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .totalBalance(123L)
                .type(IntrafiBalance.Type.INTRAFI_BALANCE)
                .build()
        assertThat(intrafiBalance).isNotNull
        assertThat(intrafiBalance.id()).isEqualTo("string")
        assertThat(intrafiBalance.balances())
            .containsExactly(
                IntrafiBalance.Balance.builder()
                    .id("string")
                    .balance(123L)
                    .bank("string")
                    .bankLocation(
                        IntrafiBalance.Balance.BankLocation.builder()
                            .city("string")
                            .state("string")
                            .build()
                    )
                    .fdicCertificateNumber("string")
                    .build()
            )
        assertThat(intrafiBalance.currency()).isEqualTo(IntrafiBalance.Currency.CAD)
        assertThat(intrafiBalance.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(intrafiBalance.totalBalance()).isEqualTo(123L)
        assertThat(intrafiBalance.type()).isEqualTo(IntrafiBalance.Type.INTRAFI_BALANCE)
    }
}
