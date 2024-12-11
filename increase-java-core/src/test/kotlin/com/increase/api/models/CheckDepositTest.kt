// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositTest {

    @Test
    fun createCheckDeposit() {
        val checkDeposit =
            CheckDeposit.builder()
                .id("check_deposit_f06n9gpg7sxn8t19lfc1")
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .depositAcceptance(
                    CheckDeposit.DepositAcceptance.builder()
                        .accountNumber("account_number")
                        .amount(0L)
                        .auxiliaryOnUs("auxiliary_on_us")
                        .checkDepositId("check_deposit_id")
                        .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                        .routingNumber("routing_number")
                        .serialNumber("serial_number")
                        .build()
                )
                .depositRejection(
                    CheckDeposit.DepositRejection.builder()
                        .amount(0L)
                        .checkDepositId("check_deposit_id")
                        .currency(CheckDeposit.DepositRejection.Currency.CAD)
                        .declinedTransactionId("declined_transaction_id")
                        .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .depositReturn(
                    CheckDeposit.DepositReturn.builder()
                        .amount(0L)
                        .checkDepositId("check_deposit_id")
                        .currency(CheckDeposit.DepositReturn.Currency.CAD)
                        .returnReason(
                            CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                        )
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .depositSubmission(
                    CheckDeposit.DepositSubmission.builder()
                        .backFileId("back_file_id")
                        .frontFileId("front_file_id")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                .inboundFundsHold(
                    CheckDeposit.InboundFundsHold.builder()
                        .id("id")
                        .amount(0L)
                        .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(CheckDeposit.InboundFundsHold.Currency.CAD)
                        .heldTransactionId("held_transaction_id")
                        .pendingTransactionId("pending_transaction_id")
                        .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(CheckDeposit.InboundFundsHold.Status.HELD)
                        .type(CheckDeposit.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                        .build()
                )
                .status(CheckDeposit.Status.PENDING)
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(CheckDeposit.Type.CHECK_DEPOSIT)
                .build()
        assertThat(checkDeposit).isNotNull
        assertThat(checkDeposit.id()).isEqualTo("check_deposit_f06n9gpg7sxn8t19lfc1")
        assertThat(checkDeposit.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(checkDeposit.amount()).isEqualTo(1000L)
        assertThat(checkDeposit.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(checkDeposit.depositAcceptance())
            .contains(
                CheckDeposit.DepositAcceptance.builder()
                    .accountNumber("account_number")
                    .amount(0L)
                    .auxiliaryOnUs("auxiliary_on_us")
                    .checkDepositId("check_deposit_id")
                    .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                    .routingNumber("routing_number")
                    .serialNumber("serial_number")
                    .build()
            )
        assertThat(checkDeposit.depositRejection())
            .contains(
                CheckDeposit.DepositRejection.builder()
                    .amount(0L)
                    .checkDepositId("check_deposit_id")
                    .currency(CheckDeposit.DepositRejection.Currency.CAD)
                    .declinedTransactionId("declined_transaction_id")
                    .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkDeposit.depositReturn())
            .contains(
                CheckDeposit.DepositReturn.builder()
                    .amount(0L)
                    .checkDepositId("check_deposit_id")
                    .currency(CheckDeposit.DepositReturn.Currency.CAD)
                    .returnReason(
                        CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                    )
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(checkDeposit.depositSubmission())
            .contains(
                CheckDeposit.DepositSubmission.builder()
                    .backFileId("back_file_id")
                    .frontFileId("front_file_id")
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkDeposit.frontImageFileId()).isEqualTo("file_makxrc67oh9l6sg7w9yc")
        assertThat(checkDeposit.inboundFundsHold())
            .contains(
                CheckDeposit.InboundFundsHold.builder()
                    .id("id")
                    .amount(0L)
                    .automaticallyReleasesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(CheckDeposit.InboundFundsHold.Currency.CAD)
                    .heldTransactionId("held_transaction_id")
                    .pendingTransactionId("pending_transaction_id")
                    .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(CheckDeposit.InboundFundsHold.Status.HELD)
                    .type(CheckDeposit.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                    .build()
            )
        assertThat(checkDeposit.status()).isEqualTo(CheckDeposit.Status.PENDING)
        assertThat(checkDeposit.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(checkDeposit.type()).isEqualTo(CheckDeposit.Type.CHECK_DEPOSIT)
    }
}
