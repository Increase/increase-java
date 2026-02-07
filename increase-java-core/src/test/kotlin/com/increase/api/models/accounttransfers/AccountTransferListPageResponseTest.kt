// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountTransferListPageResponseTest {

    @Test
    fun create() {
        val accountTransferListPageResponse =
            AccountTransferListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(accountTransferListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(accountTransferListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountTransferListPageResponse =
            AccountTransferListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedAccountTransferListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountTransferListPageResponse),
                jacksonTypeRef<AccountTransferListPageResponse>(),
            )

        assertThat(roundtrippedAccountTransferListPageResponse)
            .isEqualTo(accountTransferListPageResponse)
    }
}
