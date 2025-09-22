// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireTransferTest {

    @Test
    fun create() {
        val wireTransfer =
            WireTransfer.builder()
                .id("wire_transfer_5akynk7dqsq25qwk9q2u")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .amount(100L)
                .approval(
                    WireTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .beneficiaryAddressLine1(null)
                .beneficiaryAddressLine2(null)
                .beneficiaryAddressLine3(null)
                .beneficiaryName(null)
                .cancellation(
                    WireTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    WireTransfer.CreatedBy.builder()
                        .apiKey(
                            WireTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .category(WireTransfer.CreatedBy.Category.USER)
                        .oauthApplication(
                            WireTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            WireTransfer.CreatedBy.User.builder().email("user@example.com").build()
                        )
                        .build()
                )
                .currency(WireTransfer.Currency.USD)
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .idempotencyKey(null)
                .inboundWireDrawdownRequestId(null)
                .messageToRecipient("Message to recipient")
                .network(WireTransfer.Network.WIRE)
                .originatorAddressLine1(null)
                .originatorAddressLine2(null)
                .originatorAddressLine3(null)
                .originatorName(null)
                .pendingTransactionId(null)
                .remittance(
                    WireTransfer.Remittance.builder()
                        .category(WireTransfer.Remittance.Category.UNSTRUCTURED)
                        .tax(
                            WireTransfer.Remittance.Tax.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .identificationNumber("identification_number")
                                .typeCode("type_code")
                                .build()
                        )
                        .unstructured(
                            WireTransfer.Remittance.Unstructured.builder()
                                .message("Payment for invoice 12345")
                                .build()
                        )
                        .build()
                )
                .reversal(
                    WireTransfer.Reversal.builder()
                        .amount(12345L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .debtorRoutingNumber("101050001")
                        .description("Inbound wire reversal 2022021100335128")
                        .inputCycleDate(LocalDate.parse("2022-02-11"))
                        .inputMessageAccountabilityData("20220211B6B7HU2R011023")
                        .inputSequenceNumber("11023")
                        .inputSource("B6B7HU2R")
                        .instructionIdentification(null)
                        .returnReasonAdditionalInformation(null)
                        .returnReasonCode(null)
                        .returnReasonCodeDescription(null)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                        .build()
                )
                .routingNumber("101050001")
                .sourceAccountNumberId(null)
                .status(WireTransfer.Status.COMPLETE)
                .submission(
                    WireTransfer.Submission.builder()
                        .inputMessageAccountabilityData("20220118MMQFMP0P000002")
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(WireTransfer.Type.WIRE_TRANSFER)
                .build()

        assertThat(wireTransfer.id()).isEqualTo("wire_transfer_5akynk7dqsq25qwk9q2u")
        assertThat(wireTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(wireTransfer.accountNumber()).isEqualTo("987654321")
        assertThat(wireTransfer.amount()).isEqualTo(100L)
        assertThat(wireTransfer.approval())
            .contains(
                WireTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .approvedBy(null)
                    .build()
            )
        assertThat(wireTransfer.beneficiaryAddressLine1()).isEmpty
        assertThat(wireTransfer.beneficiaryAddressLine2()).isEmpty
        assertThat(wireTransfer.beneficiaryAddressLine3()).isEmpty
        assertThat(wireTransfer.beneficiaryName()).isEmpty
        assertThat(wireTransfer.cancellation())
            .contains(
                WireTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .canceledBy(null)
                    .build()
            )
        assertThat(wireTransfer.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(wireTransfer.createdBy())
            .contains(
                WireTransfer.CreatedBy.builder()
                    .apiKey(
                        WireTransfer.CreatedBy.ApiKey.builder().description("description").build()
                    )
                    .category(WireTransfer.CreatedBy.Category.USER)
                    .oauthApplication(
                        WireTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                    )
                    .user(WireTransfer.CreatedBy.User.builder().email("user@example.com").build())
                    .build()
            )
        assertThat(wireTransfer.currency()).isEqualTo(WireTransfer.Currency.USD)
        assertThat(wireTransfer.externalAccountId())
            .contains("external_account_ukk55lr923a3ac0pp7iv")
        assertThat(wireTransfer.idempotencyKey()).isEmpty
        assertThat(wireTransfer.inboundWireDrawdownRequestId()).isEmpty
        assertThat(wireTransfer.messageToRecipient()).isEqualTo("Message to recipient")
        assertThat(wireTransfer.network()).isEqualTo(WireTransfer.Network.WIRE)
        assertThat(wireTransfer.originatorAddressLine1()).isEmpty
        assertThat(wireTransfer.originatorAddressLine2()).isEmpty
        assertThat(wireTransfer.originatorAddressLine3()).isEmpty
        assertThat(wireTransfer.originatorName()).isEmpty
        assertThat(wireTransfer.pendingTransactionId()).isEmpty
        assertThat(wireTransfer.remittance())
            .contains(
                WireTransfer.Remittance.builder()
                    .category(WireTransfer.Remittance.Category.UNSTRUCTURED)
                    .tax(
                        WireTransfer.Remittance.Tax.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .identificationNumber("identification_number")
                            .typeCode("type_code")
                            .build()
                    )
                    .unstructured(
                        WireTransfer.Remittance.Unstructured.builder()
                            .message("Payment for invoice 12345")
                            .build()
                    )
                    .build()
            )
        assertThat(wireTransfer.reversal())
            .contains(
                WireTransfer.Reversal.builder()
                    .amount(12345L)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .debtorRoutingNumber("101050001")
                    .description("Inbound wire reversal 2022021100335128")
                    .inputCycleDate(LocalDate.parse("2022-02-11"))
                    .inputMessageAccountabilityData("20220211B6B7HU2R011023")
                    .inputSequenceNumber("11023")
                    .inputSource("B6B7HU2R")
                    .instructionIdentification(null)
                    .returnReasonAdditionalInformation(null)
                    .returnReasonCode(null)
                    .returnReasonCodeDescription(null)
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                    .build()
            )
        assertThat(wireTransfer.routingNumber()).isEqualTo("101050001")
        assertThat(wireTransfer.sourceAccountNumberId()).isEmpty
        assertThat(wireTransfer.status()).isEqualTo(WireTransfer.Status.COMPLETE)
        assertThat(wireTransfer.submission())
            .contains(
                WireTransfer.Submission.builder()
                    .inputMessageAccountabilityData("20220118MMQFMP0P000002")
                    .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
        assertThat(wireTransfer.transactionId()).contains("transaction_uyrp7fld2ium70oa7oi")
        assertThat(wireTransfer.type()).isEqualTo(WireTransfer.Type.WIRE_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireTransfer =
            WireTransfer.builder()
                .id("wire_transfer_5akynk7dqsq25qwk9q2u")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumber("987654321")
                .amount(100L)
                .approval(
                    WireTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .approvedBy(null)
                        .build()
                )
                .beneficiaryAddressLine1(null)
                .beneficiaryAddressLine2(null)
                .beneficiaryAddressLine3(null)
                .beneficiaryName(null)
                .cancellation(
                    WireTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .canceledBy(null)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdBy(
                    WireTransfer.CreatedBy.builder()
                        .apiKey(
                            WireTransfer.CreatedBy.ApiKey.builder()
                                .description("description")
                                .build()
                        )
                        .category(WireTransfer.CreatedBy.Category.USER)
                        .oauthApplication(
                            WireTransfer.CreatedBy.OAuthApplication.builder().name("name").build()
                        )
                        .user(
                            WireTransfer.CreatedBy.User.builder().email("user@example.com").build()
                        )
                        .build()
                )
                .currency(WireTransfer.Currency.USD)
                .externalAccountId("external_account_ukk55lr923a3ac0pp7iv")
                .idempotencyKey(null)
                .inboundWireDrawdownRequestId(null)
                .messageToRecipient("Message to recipient")
                .network(WireTransfer.Network.WIRE)
                .originatorAddressLine1(null)
                .originatorAddressLine2(null)
                .originatorAddressLine3(null)
                .originatorName(null)
                .pendingTransactionId(null)
                .remittance(
                    WireTransfer.Remittance.builder()
                        .category(WireTransfer.Remittance.Category.UNSTRUCTURED)
                        .tax(
                            WireTransfer.Remittance.Tax.builder()
                                .date(LocalDate.parse("2019-12-27"))
                                .identificationNumber("identification_number")
                                .typeCode("type_code")
                                .build()
                        )
                        .unstructured(
                            WireTransfer.Remittance.Unstructured.builder()
                                .message("Payment for invoice 12345")
                                .build()
                        )
                        .build()
                )
                .reversal(
                    WireTransfer.Reversal.builder()
                        .amount(12345L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .debtorRoutingNumber("101050001")
                        .description("Inbound wire reversal 2022021100335128")
                        .inputCycleDate(LocalDate.parse("2022-02-11"))
                        .inputMessageAccountabilityData("20220211B6B7HU2R011023")
                        .inputSequenceNumber("11023")
                        .inputSource("B6B7HU2R")
                        .instructionIdentification(null)
                        .returnReasonAdditionalInformation(null)
                        .returnReasonCode(null)
                        .returnReasonCodeDescription(null)
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                        .build()
                )
                .routingNumber("101050001")
                .sourceAccountNumberId(null)
                .status(WireTransfer.Status.COMPLETE)
                .submission(
                    WireTransfer.Submission.builder()
                        .inputMessageAccountabilityData("20220118MMQFMP0P000002")
                        .submittedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .type(WireTransfer.Type.WIRE_TRANSFER)
                .build()

        val roundtrippedWireTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireTransfer),
                jacksonTypeRef<WireTransfer>(),
            )

        assertThat(roundtrippedWireTransfer).isEqualTo(wireTransfer)
    }
}
