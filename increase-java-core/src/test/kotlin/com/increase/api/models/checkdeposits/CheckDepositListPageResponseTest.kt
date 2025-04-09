// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckDepositListPageResponseTest {

    @Test
    fun create() {
        val checkDepositListPageResponse =
            CheckDepositListPageResponse.builder()
                .addData(
                    CheckDeposit.builder()
                        .id("check_deposit_f06n9gpg7sxn8t19lfc1")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .amount(1000L)
                        .backImageFileId(null)
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
                                    CheckDeposit.DepositReturn.ReturnReason
                                        .ACH_CONVERSION_NOT_SUPPORTED
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
                        .description(null)
                        .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .inboundFundsHold(
                            CheckDeposit.InboundFundsHold.builder()
                                .id("id")
                                .amount(0L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(CheckDeposit.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("held_transaction_id")
                                .pendingTransactionId("pending_transaction_id")
                                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(CheckDeposit.InboundFundsHold.Status.HELD)
                                .type(CheckDeposit.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                                .build()
                        )
                        .inboundMailItemId(null)
                        .lockboxId(null)
                        .status(CheckDeposit.Status.SUBMITTED)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(CheckDeposit.Type.CHECK_DEPOSIT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(checkDepositListPageResponse.data())
            .containsExactly(
                CheckDeposit.builder()
                    .id("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .backImageFileId(null)
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
                    .description(null)
                    .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                    .idempotencyKey(null)
                    .inboundFundsHold(
                        CheckDeposit.InboundFundsHold.builder()
                            .id("id")
                            .amount(0L)
                            .automaticallyReleasesAt(
                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(CheckDeposit.InboundFundsHold.Currency.CAD)
                            .heldTransactionId("held_transaction_id")
                            .pendingTransactionId("pending_transaction_id")
                            .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .status(CheckDeposit.InboundFundsHold.Status.HELD)
                            .type(CheckDeposit.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                            .build()
                    )
                    .inboundMailItemId(null)
                    .lockboxId(null)
                    .status(CheckDeposit.Status.SUBMITTED)
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .type(CheckDeposit.Type.CHECK_DEPOSIT)
                    .build()
            )
        assertThat(checkDepositListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkDepositListPageResponse =
            CheckDepositListPageResponse.builder()
                .addData(
                    CheckDeposit.builder()
                        .id("check_deposit_f06n9gpg7sxn8t19lfc1")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .amount(1000L)
                        .backImageFileId(null)
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
                                    CheckDeposit.DepositReturn.ReturnReason
                                        .ACH_CONVERSION_NOT_SUPPORTED
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
                        .description(null)
                        .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .idempotencyKey(null)
                        .inboundFundsHold(
                            CheckDeposit.InboundFundsHold.builder()
                                .id("id")
                                .amount(0L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(CheckDeposit.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("held_transaction_id")
                                .pendingTransactionId("pending_transaction_id")
                                .releasedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .status(CheckDeposit.InboundFundsHold.Status.HELD)
                                .type(CheckDeposit.InboundFundsHold.Type.INBOUND_FUNDS_HOLD)
                                .build()
                        )
                        .inboundMailItemId(null)
                        .lockboxId(null)
                        .status(CheckDeposit.Status.SUBMITTED)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(CheckDeposit.Type.CHECK_DEPOSIT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedCheckDepositListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkDepositListPageResponse),
                jacksonTypeRef<CheckDepositListPageResponse>(),
            )

        assertThat(roundtrippedCheckDepositListPageResponse).isEqualTo(checkDepositListPageResponse)
    }
}
