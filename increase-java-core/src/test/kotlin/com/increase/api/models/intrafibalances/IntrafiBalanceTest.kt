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
                .addBalance(
                    IntrafiBalance.Balance.builder()
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
                .currency(IntrafiBalance.Currency.USD)
                .effectiveDate(LocalDate.parse("2020-01-31"))
                .totalBalance(1750L)
                .type(IntrafiBalance.Type.INTRAFI_BALANCE)
                .build()

        assertThat(intrafiBalance.balances())
            .containsExactly(
                IntrafiBalance.Balance.builder()
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
        assertThat(intrafiBalance.currency()).isEqualTo(IntrafiBalance.Currency.USD)
        assertThat(intrafiBalance.effectiveDate()).isEqualTo(LocalDate.parse("2020-01-31"))
        assertThat(intrafiBalance.totalBalance()).isEqualTo(1750L)
        assertThat(intrafiBalance.type()).isEqualTo(IntrafiBalance.Type.INTRAFI_BALANCE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intrafiBalance =
            IntrafiBalance.builder()
                .addBalance(
                    IntrafiBalance.Balance.builder()
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
                .currency(IntrafiBalance.Currency.USD)
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
