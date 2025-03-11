// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositTest {

    @Test
    fun createInboundCheckDeposit() {
      val inboundCheckDeposit = InboundCheckDeposit.builder()
          .id("inbound_check_deposit_zoshvqybq0cjjm31mra")
          .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .accountId("account_in71c4amph0vgo2qllky")
          .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
          .addAdjustment(InboundCheckDeposit.Adjustment.builder()
              .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .amount(0L)
              .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
              .transactionId("transaction_id")
              .build())
          .amount(1000L)
          .backImageFileId("file_makxrc67oh9l6sg7w9yc")
          .bankOfFirstDepositRoutingNumber("101050001")
          .checkNumber("123")
          .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
          .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .currency(InboundCheckDeposit.Currency.CAD)
          .declinedAt(null)
          .declinedTransactionId(null)
          .depositReturn(InboundCheckDeposit.DepositReturn.builder()
              .reason(InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS)
              .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .transactionId("transaction_id")
              .build())
          .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
          .payeeNameAnalysis(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
          .status(InboundCheckDeposit.Status.PENDING)
          .transactionId("transaction_uyrp7fld2ium70oa7oi")
          .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
          .build()
      assertThat(inboundCheckDeposit).isNotNull
      assertThat(inboundCheckDeposit.id()).isEqualTo("inbound_check_deposit_zoshvqybq0cjjm31mra")
      assertThat(inboundCheckDeposit.acceptedAt()).contains(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
      assertThat(inboundCheckDeposit.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
      assertThat(inboundCheckDeposit.accountNumberId()).contains("account_number_v18nkfqm6afpsrvy82b2")
      assertThat(inboundCheckDeposit.adjustments()).containsExactly(InboundCheckDeposit.Adjustment.builder()
          .adjustedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .amount(0L)
          .reason(InboundCheckDeposit.Adjustment.Reason.LATE_RETURN)
          .transactionId("transaction_id")
          .build())
      assertThat(inboundCheckDeposit.amount()).isEqualTo(1000L)
      assertThat(inboundCheckDeposit.backImageFileId()).contains("file_makxrc67oh9l6sg7w9yc")
      assertThat(inboundCheckDeposit.bankOfFirstDepositRoutingNumber()).contains("101050001")
      assertThat(inboundCheckDeposit.checkNumber()).contains("123")
      assertThat(inboundCheckDeposit.checkTransferId()).contains("check_transfer_30b43acfu9vw8fyc4f5")
      assertThat(inboundCheckDeposit.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
      assertThat(inboundCheckDeposit.currency()).isEqualTo(InboundCheckDeposit.Currency.CAD)
      assertThat(inboundCheckDeposit.declinedAt()).isEmpty
      assertThat(inboundCheckDeposit.declinedTransactionId()).isEmpty
      assertThat(inboundCheckDeposit.depositReturn()).contains(InboundCheckDeposit.DepositReturn.builder()
          .reason(InboundCheckDeposit.DepositReturn.Reason.ALTERED_OR_FICTITIOUS)
          .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .transactionId("transaction_id")
          .build())
      assertThat(inboundCheckDeposit.frontImageFileId()).contains("file_makxrc67oh9l6sg7w9yc")
      assertThat(inboundCheckDeposit.payeeNameAnalysis()).isEqualTo(InboundCheckDeposit.PayeeNameAnalysis.NAME_MATCHES)
      assertThat(inboundCheckDeposit.status()).isEqualTo(InboundCheckDeposit.Status.PENDING)
      assertThat(inboundCheckDeposit.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
      assertThat(inboundCheckDeposit.type()).isEqualTo(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
    }
}
