// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafibalances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntrafiBalanceTest {

    @Test
    fun create() {
        val intrafiBalance =
            IntrafiBalance.builder()
                .id("intrafi_balance_8lgtn3pz0ktekaekw29t")
                .addBalance(
                    IntrafiBalance.Balance.builder()
                        .id("intrafi_detailed_balance_qp4v28t1htqu5lsp0rz8")
                        .balance(1750L)
                        .bank("Example Bank")
                        .bankLocation(
                            IntrafiBalance.Balance.BankLocation.builder()
                                .city("New York")
                                .state("NY")
                                .build()
                        )
                        .fdicCertificateNumber("314159")
                        .build()
                )
                .currency(IntrafiBalance.Currency.CAD)
                .effectiveDate(LocalDate.parse("2020-01-31"))
                .totalBalance(1750L)
                .type(IntrafiBalance.Type.INTRAFI_BALANCE)
                .build()

        assertThat(intrafiBalance.id()).isEqualTo("intrafi_balance_8lgtn3pz0ktekaekw29t")
        assertThat(intrafiBalance.balances())
            .containsExactly(
                IntrafiBalance.Balance.builder()
                    .id("intrafi_detailed_balance_qp4v28t1htqu5lsp0rz8")
                    .balance(1750L)
                    .bank("Example Bank")
                    .bankLocation(
                        IntrafiBalance.Balance.BankLocation.builder()
                            .city("New York")
                            .state("NY")
                            .build()
                    )
                    .fdicCertificateNumber("314159")
                    .build()
            )
        assertThat(intrafiBalance.currency()).isEqualTo(IntrafiBalance.Currency.CAD)
        assertThat(intrafiBalance.effectiveDate()).isEqualTo(LocalDate.parse("2020-01-31"))
        assertThat(intrafiBalance.totalBalance()).isEqualTo(1750L)
        assertThat(intrafiBalance.type()).isEqualTo(IntrafiBalance.Type.INTRAFI_BALANCE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intrafiBalance =
            IntrafiBalance.builder()
                .id("intrafi_balance_8lgtn3pz0ktekaekw29t")
                .addBalance(
                    IntrafiBalance.Balance.builder()
                        .id("intrafi_detailed_balance_qp4v28t1htqu5lsp0rz8")
                        .balance(1750L)
                        .bank("Example Bank")
                        .bankLocation(
                            IntrafiBalance.Balance.BankLocation.builder()
                                .city("New York")
                                .state("NY")
                                .build()
                        )
                        .fdicCertificateNumber("314159")
                        .build()
                )
                .currency(IntrafiBalance.Currency.CAD)
                .effectiveDate(LocalDate.parse("2020-01-31"))
                .totalBalance(1750L)
                .type(IntrafiBalance.Type.INTRAFI_BALANCE)
                .build()

        val roundtrippedIntrafiBalance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intrafiBalance),
                jacksonTypeRef<IntrafiBalance>(),
            )

        assertThat(roundtrippedIntrafiBalance).isEqualTo(intrafiBalance)
    }
}
