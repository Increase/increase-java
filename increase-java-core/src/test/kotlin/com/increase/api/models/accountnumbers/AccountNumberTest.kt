// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountNumberTest {

    @Test
    fun create() {
        val accountNumber =
            AccountNumber.builder()
                .id("account_number_v18nkfqm6afpsrvy82b2")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .inboundAch(
                    AccountNumber.InboundAch.builder()
                        .debitStatus(AccountNumber.InboundAch.DebitStatus.BLOCKED)
                        .build()
                )
                .inboundChecks(
                    AccountNumber.InboundChecks.builder()
                        .status(AccountNumber.InboundChecks.Status.CHECK_TRANSFERS_ONLY)
                        .build()
                )
                .name("ACH")
                .routingNumber("101050001")
                .status(AccountNumber.Status.ACTIVE)
                .type(AccountNumber.Type.ACCOUNT_NUMBER)
                .build()

        assertThat(accountNumber.id()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(accountNumber.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(accountNumber.accountNumber()).isEqualTo("987654321")
        assertThat(accountNumber.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(accountNumber.idempotencyKey()).isEmpty
        assertThat(accountNumber.inboundAch())
            .isEqualTo(
                AccountNumber.InboundAch.builder()
                    .debitStatus(AccountNumber.InboundAch.DebitStatus.BLOCKED)
                    .build()
            )
        assertThat(accountNumber.inboundChecks())
            .isEqualTo(
                AccountNumber.InboundChecks.builder()
                    .status(AccountNumber.InboundChecks.Status.CHECK_TRANSFERS_ONLY)
                    .build()
            )
        assertThat(accountNumber.name()).isEqualTo("ACH")
        assertThat(accountNumber.routingNumber()).isEqualTo("101050001")
        assertThat(accountNumber.status()).isEqualTo(AccountNumber.Status.ACTIVE)
        assertThat(accountNumber.type()).isEqualTo(AccountNumber.Type.ACCOUNT_NUMBER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountNumber =
            AccountNumber.builder()
                .id("account_number_v18nkfqm6afpsrvy82b2")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .inboundAch(
                    AccountNumber.InboundAch.builder()
                        .debitStatus(AccountNumber.InboundAch.DebitStatus.BLOCKED)
                        .build()
                )
                .inboundChecks(
                    AccountNumber.InboundChecks.builder()
                        .status(AccountNumber.InboundChecks.Status.CHECK_TRANSFERS_ONLY)
                        .build()
                )
                .name("ACH")
                .routingNumber("101050001")
                .status(AccountNumber.Status.ACTIVE)
                .type(AccountNumber.Type.ACCOUNT_NUMBER)
                .build()

        val roundtrippedAccountNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountNumber),
                jacksonTypeRef<AccountNumber>(),
            )

        assertThat(roundtrippedAccountNumber).isEqualTo(accountNumber)
    }
}
