package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositTest {

    @Test
    fun createCheckDeposit() {
        val checkDeposit =
            CheckDeposit.builder()
                .id("string")
                .amount(123L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(CheckDeposit.Currency.CAD)
                .status(CheckDeposit.Status.PENDING)
                .accountId("string")
                .frontImageFileId("string")
                .backImageFileId("string")
                .transactionId("string")
                .depositAcceptance(
                    CheckDeposit.DepositAcceptance.builder()
                        .amount(123L)
                        .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                        .accountNumber("string")
                        .routingNumber("string")
                        .auxiliaryOnUs("string")
                        .serialNumber("string")
                        .checkDepositId("string")
                        .build()
                )
                .depositRejection(
                    CheckDeposit.DepositRejection.builder()
                        .amount(123L)
                        .currency(CheckDeposit.DepositRejection.Currency.CAD)
                        .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .depositReturn(
                    CheckDeposit.DepositReturn.builder()
                        .amount(123L)
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(CheckDeposit.DepositReturn.Currency.CAD)
                        .checkDepositId("string")
                        .transactionId("string")
                        .returnReason(
                            CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                        )
                        .build()
                )
                .type(CheckDeposit.Type.CHECK_DEPOSIT)
                .build()
        assertThat(checkDeposit).isNotNull
        assertThat(checkDeposit.id()).isEqualTo("string")
        assertThat(checkDeposit.amount()).isEqualTo(123L)
        assertThat(checkDeposit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(checkDeposit.currency()).isEqualTo(CheckDeposit.Currency.CAD)
        assertThat(checkDeposit.status()).isEqualTo(CheckDeposit.Status.PENDING)
        assertThat(checkDeposit.accountId()).isEqualTo("string")
        assertThat(checkDeposit.frontImageFileId()).isEqualTo("string")
        assertThat(checkDeposit.backImageFileId()).contains("string")
        assertThat(checkDeposit.transactionId()).contains("string")
        assertThat(checkDeposit.depositAcceptance())
            .contains(
                CheckDeposit.DepositAcceptance.builder()
                    .amount(123L)
                    .currency(CheckDeposit.DepositAcceptance.Currency.CAD)
                    .accountNumber("string")
                    .routingNumber("string")
                    .auxiliaryOnUs("string")
                    .serialNumber("string")
                    .checkDepositId("string")
                    .build()
            )
        assertThat(checkDeposit.depositRejection())
            .contains(
                CheckDeposit.DepositRejection.builder()
                    .amount(123L)
                    .currency(CheckDeposit.DepositRejection.Currency.CAD)
                    .reason(CheckDeposit.DepositRejection.Reason.INCOMPLETE_IMAGE)
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(checkDeposit.depositReturn())
            .contains(
                CheckDeposit.DepositReturn.builder()
                    .amount(123L)
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(CheckDeposit.DepositReturn.Currency.CAD)
                    .checkDepositId("string")
                    .transactionId("string")
                    .returnReason(
                        CheckDeposit.DepositReturn.ReturnReason.ACH_CONVERSION_NOT_SUPPORTED
                    )
                    .build()
            )
        assertThat(checkDeposit.type()).isEqualTo(CheckDeposit.Type.CHECK_DEPOSIT)
    }
}
