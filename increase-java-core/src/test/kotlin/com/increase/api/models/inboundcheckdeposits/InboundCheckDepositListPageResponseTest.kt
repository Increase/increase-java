// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundCheckDepositListPageResponseTest {

    @Test
    fun create() {
        val inboundCheckDepositListPageResponse =
            InboundCheckDepositListPageResponse.builder()
                .addData(
                    InboundCheckDeposit.builder()
                        .id("inbound_check_deposit_zoshvqybq0cjjm31mra")
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .addAdjustment(
                            InboundCheckDeposit.Adjustment.builder()
                                .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .amount(0L)
                                .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
                                .transactionId("transaction_id")
                                .build()
                        )
                        .amount(1000L)
                        .backImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .bankOfFirstDepositRoutingNumber("101050001")
                        .checkNumber("123")
                        .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency(InboundCheckDeposit.Currency.USD)
                        .declinedAt(null)
                        .declinedTransactionId(null)
                        .depositReturn(
                            InboundCheckDeposit.DepositReturn.builder()
                                .reason(
                                    InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS
                                )
                                .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .transactionId("transaction_id")
                                .build()
                        )
                        .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .payeeNameAnalysis(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
                        .status(InboundCheckDeposit.Status.ACCEPTED)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundCheckDepositListPageResponse.data())
            .containsExactly(
                InboundCheckDeposit.builder()
                    .id("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .addAdjustment(
                        InboundCheckDeposit.Adjustment.builder()
                            .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .amount(0L)
                            .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
                            .transactionId("transaction_id")
                            .build()
                    )
                    .amount(1000L)
                    .backImageFileId("file_makxrc67oh9l6sg7w9yc")
                    .bankOfFirstDepositRoutingNumber("101050001")
                    .checkNumber("123")
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .currency(InboundCheckDeposit.Currency.USD)
                    .declinedAt(null)
                    .declinedTransactionId(null)
                    .depositReturn(
                        InboundCheckDeposit.DepositReturn.builder()
                            .reason(InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS)
                            .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .transactionId("transaction_id")
                            .build()
                    )
                    .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                    .payeeNameAnalysis(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
                    .status(InboundCheckDeposit.Status.ACCEPTED)
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
                    .build()
            )
        assertThat(inboundCheckDepositListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundCheckDepositListPageResponse =
            InboundCheckDepositListPageResponse.builder()
                .addData(
                    InboundCheckDeposit.builder()
                        .id("inbound_check_deposit_zoshvqybq0cjjm31mra")
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .accountId("account_in71c4amph0vgo2qllky")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .addAdjustment(
                            InboundCheckDeposit.Adjustment.builder()
                                .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .amount(0L)
                                .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
                                .transactionId("transaction_id")
                                .build()
                        )
                        .amount(1000L)
                        .backImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .bankOfFirstDepositRoutingNumber("101050001")
                        .checkNumber("123")
                        .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency(InboundCheckDeposit.Currency.USD)
                        .declinedAt(null)
                        .declinedTransactionId(null)
                        .depositReturn(
                            InboundCheckDeposit.DepositReturn.builder()
                                .reason(
                                    InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS
                                )
                                .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .transactionId("transaction_id")
                                .build()
                        )
                        .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                        .payeeNameAnalysis(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
                        .status(InboundCheckDeposit.Status.ACCEPTED)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundCheckDepositListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundCheckDepositListPageResponse),
                jacksonTypeRef<InboundCheckDepositListPageResponse>(),
            )

        assertThat(roundtrippedInboundCheckDepositListPageResponse)
            .isEqualTo(inboundCheckDepositListPageResponse)
    }
}
