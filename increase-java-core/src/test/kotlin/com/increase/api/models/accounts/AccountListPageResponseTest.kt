// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListPageResponseTest {

    @Test
    fun create() {
        val accountListPageResponse =
            AccountListPageResponse.builder()
                .addData(
                    Account.builder()
                        .id("account_in71c4amph0vgo2qllky")
                        .bank(Account.Bank.FIRST_INTERNET_BANK)
                        .closedAt(null)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency(Account.Currency.USD)
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .idempotencyKey(null)
                        .informationalEntityId(null)
                        .interestAccrued("0.01")
                        .interestAccruedAt(LocalDate.parse("2020-01-31"))
                        .interestRate("0.055")
                        .name("My first account!")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .status(Account.Status.OPEN)
                        .type(Account.Type.ACCOUNT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(accountListPageResponse.data())
            .containsExactly(
                Account.builder()
                    .id("account_in71c4amph0vgo2qllky")
                    .bank(Account.Bank.FIRST_INTERNET_BANK)
                    .closedAt(null)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .currency(Account.Currency.USD)
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .idempotencyKey(null)
                    .informationalEntityId(null)
                    .interestAccrued("0.01")
                    .interestAccruedAt(LocalDate.parse("2020-01-31"))
                    .interestRate("0.055")
                    .name("My first account!")
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .status(Account.Status.OPEN)
                    .type(Account.Type.ACCOUNT)
                    .build()
            )
        assertThat(accountListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountListPageResponse =
            AccountListPageResponse.builder()
                .addData(
                    Account.builder()
                        .id("account_in71c4amph0vgo2qllky")
                        .bank(Account.Bank.FIRST_INTERNET_BANK)
                        .closedAt(null)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency(Account.Currency.USD)
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .idempotencyKey(null)
                        .informationalEntityId(null)
                        .interestAccrued("0.01")
                        .interestAccruedAt(LocalDate.parse("2020-01-31"))
                        .interestRate("0.055")
                        .name("My first account!")
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .status(Account.Status.OPEN)
                        .type(Account.Type.ACCOUNT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedAccountListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountListPageResponse),
                jacksonTypeRef<AccountListPageResponse>(),
            )

        assertThat(roundtrippedAccountListPageResponse).isEqualTo(accountListPageResponse)
    }
}
