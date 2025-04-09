// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountNumberListPageResponseTest {

    @Test
    fun create() {
        val accountNumberListPageResponse =
            AccountNumberListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(accountNumberListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(accountNumberListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountNumberListPageResponse =
            AccountNumberListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedAccountNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountNumberListPageResponse),
                jacksonTypeRef<AccountNumberListPageResponse>(),
            )

        assertThat(roundtrippedAccountNumberListPageResponse)
            .isEqualTo(accountNumberListPageResponse)
    }
}
