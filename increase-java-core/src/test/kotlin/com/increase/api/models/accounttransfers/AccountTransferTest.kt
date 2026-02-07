// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTransferTest {

    @Test
    fun create() {
        val accountTransfer =
            AccountTransfer.builder()
                .id("account_transfer_7k9qe1ysdgqztnt63l7n")
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .approval(
                    AccountTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .cancellation(
                    AccountTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    AccountTransfer.CreatedBy.builder()
                        .category(AccountTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            AccountTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            AccountTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            AccountTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .currency(AccountTransfer.Currency.USD)
                .description("Move money into savings")
                .destinationAccountId("account_uf16sut2ct5bevmq3eh")
                .destinationTransactionId("transaction_j3itv8dtk5o8pw3p1xj4")
                .idempotencyKey(null)
                .pendingTransactionId(null)
                .status(AccountTransfer.Status.COMPLETE)
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(AccountTransfer.Type.ACCOUNT_TRANSFER)
                .build()

        assertThat(accountTransfer.id()).isEqualTo("account_transfer_7k9qe1ysdgqztnt63l7n")
        assertThat(accountTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(accountTransfer.amount()).isEqualTo(100L)
        assertThat(accountTransfer.approval())
            .contains(
                AccountTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .approvedBy(null)
                    .build()
            )
        assertThat(accountTransfer.cancellation())
            .contains(
                AccountTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .canceledBy(null)
                    .build()
            )
        assertThat(accountTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(accountTransfer.createdBy())
            .contains(
                AccountTransfer.CreatedBy.builder()
                    .category(AccountTransfer.CreatedBy.Category.USER)
                    .apiKey(
                        AccountTransfer.CreatedBy.ApiKey.builder()
                            .description("description")
                            .build()
                    )
                    .oauthApplication(
                        AccountTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(
                        AccountTransfer.CreatedBy.User.builder().email("user@example.com").build()
                    )
                    .build()
            )
        assertThat(accountTransfer.currency()).isEqualTo(AccountTransfer.Currency.USD)
        assertThat(accountTransfer.description()).isEqualTo("Move money into savings")
        assertThat(accountTransfer.destinationAccountId()).isEqualTo("account_uf16sut2ct5bevmq3eh")
        assertThat(accountTransfer.destinationTransactionId())
            .contains("transaction_j3itv8dtk5o8pw3p1xj4")
        assertThat(accountTransfer.idempotencyKey()).isEmpty
        assertThat(accountTransfer.pendingTransactionId()).isEmpty
        assertThat(accountTransfer.status()).isEqualTo(AccountTransfer.Status.COMPLETE)
        assertThat(accountTransfer.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(accountTransfer.type()).isEqualTo(AccountTransfer.Type.ACCOUNT_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountTransfer =
            AccountTransfer.builder()
                .id("account_transfer_7k9qe1ysdgqztnt63l7n")
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .approval(
                    AccountTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .cancellation(
                    AccountTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    AccountTransfer.CreatedBy.builder()
                        .category(AccountTransfer.CreatedBy.Category.USER)
                        .apiKey(
                            AccountTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .oauthApplication(
                            AccountTransfer.CreatedBy.OAuthApplication.builder()
                                .name("name")
                                .build()
                        )
                        .user(
                            AccountTransfer.CreatedBy.User.builder()
                                .email("user@example.com")
                                .build()
                        )
                        .build()
                )
                .currency(AccountTransfer.Currency.USD)
                .description("Move money into savings")
                .destinationAccountId("account_uf16sut2ct5bevmq3eh")
                .destinationTransactionId("transaction_j3itv8dtk5o8pw3p1xj4")
                .idempotencyKey(null)
                .pendingTransactionId(null)
                .status(AccountTransfer.Status.COMPLETE)
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(AccountTransfer.Type.ACCOUNT_TRANSFER)
                .build()

        val roundtrippedAccountTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountTransfer),
                jacksonTypeRef<AccountTransfer>(),
            )

        assertThat(roundtrippedAccountTransfer).isEqualTo(accountTransfer)
    }
}
