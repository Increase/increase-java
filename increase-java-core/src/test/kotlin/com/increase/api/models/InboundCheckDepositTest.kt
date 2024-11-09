// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositTest {

    @Test
    fun createInboundCheckDeposit() {
        val inboundCheckDeposit =
            InboundCheckDeposit.builder()
                .id("id")
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .adjustments(
                    listOf(
                        InboundCheckDeposit.Adjustment.builder()
                            .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(123L)
                            .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
                            .transactionId("transaction_id")
                            .build()
                    )
                )
                .amount(123L)
                .backImageFileId("back_image_file_id")
                .bankOfFirstDepositRoutingNumber("bank_of_first_deposit_routing_number")
                .checkNumber("check_number")
                .checkTransferId("check_transfer_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(InboundCheckDeposit.Currency.CAD)
                .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .declinedTransactionId("declined_transaction_id")
                .depositReturn(
                    InboundCheckDeposit.DepositReturn.builder()
                        .reason(InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS)
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .frontImageFileId("front_image_file_id")
                .payeeNameAnalysis(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
                .status(InboundCheckDeposit.Status.PENDING)
                .transactionId("transaction_id")
                .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
                .build()
        assertThat(inboundCheckDeposit).isNotNull
        assertThat(inboundCheckDeposit.id()).isEqualTo("id")
        assertThat(inboundCheckDeposit.acceptedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.accountId()).isEqualTo("account_id")
        assertThat(inboundCheckDeposit.accountNumberId()).contains("account_number_id")
        assertThat(inboundCheckDeposit.adjustments())
            .containsExactly(
                InboundCheckDeposit.Adjustment.builder()
                    .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .amount(123L)
                    .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundCheckDeposit.amount()).isEqualTo(123L)
        assertThat(inboundCheckDeposit.backImageFileId()).contains("back_image_file_id")
        assertThat(inboundCheckDeposit.bankOfFirstDepositRoutingNumber())
            .contains("bank_of_first_deposit_routing_number")
        assertThat(inboundCheckDeposit.checkNumber()).contains("check_number")
        assertThat(inboundCheckDeposit.checkTransferId()).contains("check_transfer_id")
        assertThat(inboundCheckDeposit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.currency()).isEqualTo(InboundCheckDeposit.Currency.CAD)
        assertThat(inboundCheckDeposit.declinedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.declinedTransactionId()).contains("declined_transaction_id")
        assertThat(inboundCheckDeposit.depositReturn())
            .contains(
                InboundCheckDeposit.DepositReturn.builder()
                    .reason(InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS)
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundCheckDeposit.frontImageFileId()).contains("front_image_file_id")
        assertThat(inboundCheckDeposit.payeeNameAnalysis())
            .isEqualTo(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
        assertThat(inboundCheckDeposit.status()).isEqualTo(InboundCheckDeposit.Status.PENDING)
        assertThat(inboundCheckDeposit.transactionId()).contains("transaction_id")
        assertThat(inboundCheckDeposit.type())
            .isEqualTo(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
    }
}
