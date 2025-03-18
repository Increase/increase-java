// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

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
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("canceled_by")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    AccountTransfer.CreatedBy.builder()
                        .apiKey(
                            AccountTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .category(AccountTransfer.CreatedBy.Category.API_KEY)
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
                .currency(AccountTransfer.Currency.CAD)
                .description("Move money into savings")
                .destinationAccountId("account_uf16sut2ct5bevmq3eh")
                .destinationTransactionId("transaction_j3itv8dtk5o8pw3p1xj4")
                .idempotencyKey(null)
                .network(AccountTransfer.Network.ACCOUNT)
                .pendingTransactionId(null)
                .status(AccountTransfer.Status.PENDING_APPROVAL)
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
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("canceled_by")
                    .build()
            )
        assertThat(accountTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(accountTransfer.createdBy())
            .contains(
                AccountTransfer.CreatedBy.builder()
                    .apiKey(
                        AccountTransfer.CreatedBy.ApiKey.builder()
                            .description("description")
                            .build()
                    )
                    .category(AccountTransfer.CreatedBy.Category.API_KEY)
                    .oauthApplication(
                        AccountTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(
                        AccountTransfer.CreatedBy.User.builder().email("user@example.com").build()
                    )
                    .build()
            )
        assertThat(accountTransfer.currency()).isEqualTo(AccountTransfer.Currency.CAD)
        assertThat(accountTransfer.description()).isEqualTo("Move money into savings")
        assertThat(accountTransfer.destinationAccountId()).isEqualTo("account_uf16sut2ct5bevmq3eh")
        assertThat(accountTransfer.destinationTransactionId())
            .contains("transaction_j3itv8dtk5o8pw3p1xj4")
        assertThat(accountTransfer.idempotencyKey()).isEmpty
        assertThat(accountTransfer.network()).isEqualTo(AccountTransfer.Network.ACCOUNT)
        assertThat(accountTransfer.pendingTransactionId()).isEmpty
        assertThat(accountTransfer.status()).isEqualTo(AccountTransfer.Status.PENDING_APPROVAL)
        assertThat(accountTransfer.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(accountTransfer.type()).isEqualTo(AccountTransfer.Type.ACCOUNT_TRANSFER)
    }
}
