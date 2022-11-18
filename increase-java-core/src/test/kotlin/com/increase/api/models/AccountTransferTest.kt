package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferTest {

    @Test
    fun createAccountTransfer() {
        val accountTransfer =
            AccountTransfer.builder()
                .id("string")
                .amount(123L)
                .accountId("string")
                .currency(AccountTransfer.Currency.CAD)
                .destinationAccountId("string")
                .destinationTransactionId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .network(AccountTransfer.Network.ACCOUNT)
                .status(AccountTransfer.Status.PENDING_SUBMISSION)
                .templateId("string")
                .transactionId("string")
                .approval(
                    AccountTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cancellation(
                    AccountTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .type(AccountTransfer.Type.ACCOUNT_TRANSFER)
                .build()
        assertThat(accountTransfer).isNotNull
        assertThat(accountTransfer.id()).isEqualTo("string")
        assertThat(accountTransfer.amount()).isEqualTo(123L)
        assertThat(accountTransfer.accountId()).isEqualTo("string")
        assertThat(accountTransfer.currency()).isEqualTo(AccountTransfer.Currency.CAD)
        assertThat(accountTransfer.destinationAccountId()).isEqualTo("string")
        assertThat(accountTransfer.destinationTransactionId()).contains("string")
        assertThat(accountTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountTransfer.description()).isEqualTo("string")
        assertThat(accountTransfer.network()).isEqualTo(AccountTransfer.Network.ACCOUNT)
        assertThat(accountTransfer.status()).isEqualTo(AccountTransfer.Status.PENDING_SUBMISSION)
        assertThat(accountTransfer.templateId()).contains("string")
        assertThat(accountTransfer.transactionId()).contains("string")
        assertThat(accountTransfer.approval())
            .contains(
                AccountTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountTransfer.cancellation())
            .contains(
                AccountTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(accountTransfer.type()).isEqualTo(AccountTransfer.Type.ACCOUNT_TRANSFER)
    }
}
