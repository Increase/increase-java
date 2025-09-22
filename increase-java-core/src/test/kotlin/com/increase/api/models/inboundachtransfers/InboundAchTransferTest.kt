// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferTest {

    @Test
    fun create() {
        val inboundAchTransfer =
            InboundAchTransfer.builder()
                .id("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .acceptance(
                    InboundAchTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .addenda(
                    InboundAchTransfer.Addenda.builder()
                        .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                        .freeform(
                            InboundAchTransfer.Addenda.Freeform.builder()
                                .addEntry(
                                    InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("payment_related_information")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .amount(100L)
                .automaticallyResolvesAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .decline(
                    InboundAchTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                        .build()
                )
                .direction(InboundAchTransfer.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2023-04-02"))
                .internationalAddenda(
                    InboundAchTransfer.InternationalAddenda.builder()
                        .destinationCountryCode("US")
                        .destinationCurrencyCode("USD")
                        .foreignExchangeIndicator(
                            InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                                .FIXED_TO_FIXED
                        )
                        .foreignExchangeReference(null)
                        .foreignExchangeReferenceIndicator(
                            InboundAchTransfer.InternationalAddenda
                                .ForeignExchangeReferenceIndicator
                                .BLANK
                        )
                        .foreignPaymentAmount(199L)
                        .foreignTraceNumber(null)
                        .internationalTransactionTypeCode(
                            InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                                .INTERNET_INITIATED
                        )
                        .originatingCurrencyCode("USD")
                        .originatingDepositoryFinancialInstitutionBranchCountry("US")
                        .originatingDepositoryFinancialInstitutionId("091000019")
                        .originatingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .OriginatingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .originatingDepositoryFinancialInstitutionName("WELLS FARGO BANK")
                        .originatorCity("BERLIN")
                        .originatorCountry("DE")
                        .originatorIdentification("770510487A")
                        .originatorName("BERGHAIN")
                        .originatorPostalCode("50825")
                        .originatorStateOrProvince(null)
                        .originatorStreetAddress("Ruedersdorferstr. 7")
                        .paymentRelatedInformation(null)
                        .paymentRelatedInformation2(null)
                        .receiverCity("BEVERLY HILLS")
                        .receiverCountry("US")
                        .receiverIdentificationNumber("1018790279274")
                        .receiverPostalCode("90210")
                        .receiverStateOrProvince("CA")
                        .receiverStreetAddress("123 FAKE ST")
                        .receivingCompanyOrIndividualName("IAN CREASE")
                        .receivingDepositoryFinancialInstitutionCountry("US")
                        .receivingDepositoryFinancialInstitutionId("101050001")
                        .receivingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .ReceivingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .receivingDepositoryFinancialInstitutionName(
                            "BLUE RIDGE BANK, NATIONAL ASSOCIATI"
                        )
                        .build()
                )
                .notificationOfChange(
                    InboundAchTransfer.NotificationOfChange.builder()
                        .updatedAccountNumber("updated_account_number")
                        .updatedRoutingNumber("updated_routing_number")
                        .build()
                )
                .originatorCompanyDescriptiveDate("230401")
                .originatorCompanyDiscretionaryData("WEB AUTOPAY")
                .originatorCompanyEntryDescription("INVOICE 2468")
                .originatorCompanyId("0987654321")
                .originatorCompanyName("PAYROLL COMPANY")
                .originatorRoutingNumber("101050001")
                .receiverIdNumber(null)
                .receiverName("Ian Crease")
                .settlement(
                    InboundAchTransfer.Settlement.builder()
                        .settledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .settlementSchedule(
                            InboundAchTransfer.Settlement.SettlementSchedule.SAME_DAY
                        )
                        .build()
                )
                .standardEntryClassCode(
                    InboundAchTransfer.StandardEntryClassCode.INTERNET_INITIATED
                )
                .status(InboundAchTransfer.Status.ACCEPTED)
                .traceNumber("021000038461022")
                .transferReturn(
                    InboundAchTransfer.TransferReturn.builder()
                        .reason(InboundAchTransfer.TransferReturn.Reason.INSUFFICIENT_FUNDS)
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .type(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
                .build()

        assertThat(inboundAchTransfer.id()).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        assertThat(inboundAchTransfer.acceptance())
            .contains(
                InboundAchTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )
        assertThat(inboundAchTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundAchTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundAchTransfer.addenda())
            .contains(
                InboundAchTransfer.Addenda.builder()
                    .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransfer.Addenda.Freeform.builder()
                            .addEntry(
                                InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("payment_related_information")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(inboundAchTransfer.amount()).isEqualTo(100L)
        assertThat(inboundAchTransfer.automaticallyResolvesAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundAchTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundAchTransfer.decline())
            .contains(
                InboundAchTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .declinedTransactionId("declined_transaction_id")
                    .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                    .build()
            )
        assertThat(inboundAchTransfer.direction()).isEqualTo(InboundAchTransfer.Direction.CREDIT)
        assertThat(inboundAchTransfer.effectiveDate()).isEqualTo(LocalDate.parse("2023-04-02"))
        assertThat(inboundAchTransfer.internationalAddenda())
            .contains(
                InboundAchTransfer.InternationalAddenda.builder()
                    .destinationCountryCode("US")
                    .destinationCurrencyCode("USD")
                    .foreignExchangeIndicator(
                        InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                            .FIXED_TO_FIXED
                    )
                    .foreignExchangeReference(null)
                    .foreignExchangeReferenceIndicator(
                        InboundAchTransfer.InternationalAddenda.ForeignExchangeReferenceIndicator
                            .BLANK
                    )
                    .foreignPaymentAmount(199L)
                    .foreignTraceNumber(null)
                    .internationalTransactionTypeCode(
                        InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                            .INTERNET_INITIATED
                    )
                    .originatingCurrencyCode("USD")
                    .originatingDepositoryFinancialInstitutionBranchCountry("US")
                    .originatingDepositoryFinancialInstitutionId("091000019")
                    .originatingDepositoryFinancialInstitutionIdQualifier(
                        InboundAchTransfer.InternationalAddenda
                            .OriginatingDepositoryFinancialInstitutionIdQualifier
                            .NATIONAL_CLEARING_SYSTEM_NUMBER
                    )
                    .originatingDepositoryFinancialInstitutionName("WELLS FARGO BANK")
                    .originatorCity("BERLIN")
                    .originatorCountry("DE")
                    .originatorIdentification("770510487A")
                    .originatorName("BERGHAIN")
                    .originatorPostalCode("50825")
                    .originatorStateOrProvince(null)
                    .originatorStreetAddress("Ruedersdorferstr. 7")
                    .paymentRelatedInformation(null)
                    .paymentRelatedInformation2(null)
                    .receiverCity("BEVERLY HILLS")
                    .receiverCountry("US")
                    .receiverIdentificationNumber("1018790279274")
                    .receiverPostalCode("90210")
                    .receiverStateOrProvince("CA")
                    .receiverStreetAddress("123 FAKE ST")
                    .receivingCompanyOrIndividualName("IAN CREASE")
                    .receivingDepositoryFinancialInstitutionCountry("US")
                    .receivingDepositoryFinancialInstitutionId("101050001")
                    .receivingDepositoryFinancialInstitutionIdQualifier(
                        InboundAchTransfer.InternationalAddenda
                            .ReceivingDepositoryFinancialInstitutionIdQualifier
                            .NATIONAL_CLEARING_SYSTEM_NUMBER
                    )
                    .receivingDepositoryFinancialInstitutionName(
                        "BLUE RIDGE BANK, NATIONAL ASSOCIATI"
                    )
                    .build()
            )
        assertThat(inboundAchTransfer.notificationOfChange())
            .contains(
                InboundAchTransfer.NotificationOfChange.builder()
                    .updatedAccountNumber("updated_account_number")
                    .updatedRoutingNumber("updated_routing_number")
                    .build()
            )
        assertThat(inboundAchTransfer.originatorCompanyDescriptiveDate()).contains("230401")
        assertThat(inboundAchTransfer.originatorCompanyDiscretionaryData()).contains("WEB AUTOPAY")
        assertThat(inboundAchTransfer.originatorCompanyEntryDescription()).isEqualTo("INVOICE 2468")
        assertThat(inboundAchTransfer.originatorCompanyId()).isEqualTo("0987654321")
        assertThat(inboundAchTransfer.originatorCompanyName()).isEqualTo("PAYROLL COMPANY")
        assertThat(inboundAchTransfer.originatorRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundAchTransfer.receiverIdNumber()).isEmpty
        assertThat(inboundAchTransfer.receiverName()).contains("Ian Crease")
        assertThat(inboundAchTransfer.settlement())
            .isEqualTo(
                InboundAchTransfer.Settlement.builder()
                    .settledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .settlementSchedule(InboundAchTransfer.Settlement.SettlementSchedule.SAME_DAY)
                    .build()
            )
        assertThat(inboundAchTransfer.standardEntryClassCode())
            .isEqualTo(InboundAchTransfer.StandardEntryClassCode.INTERNET_INITIATED)
        assertThat(inboundAchTransfer.status()).isEqualTo(InboundAchTransfer.Status.ACCEPTED)
        assertThat(inboundAchTransfer.traceNumber()).isEqualTo("021000038461022")
        assertThat(inboundAchTransfer.transferReturn())
            .contains(
                InboundAchTransfer.TransferReturn.builder()
                    .reason(InboundAchTransfer.TransferReturn.Reason.INSUFFICIENT_FUNDS)
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundAchTransfer.type())
            .isEqualTo(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundAchTransfer =
            InboundAchTransfer.builder()
                .id("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .acceptance(
                    InboundAchTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .addenda(
                    InboundAchTransfer.Addenda.builder()
                        .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                        .freeform(
                            InboundAchTransfer.Addenda.Freeform.builder()
                                .addEntry(
                                    InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("payment_related_information")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .amount(100L)
                .automaticallyResolvesAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .decline(
                    InboundAchTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                        .build()
                )
                .direction(InboundAchTransfer.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2023-04-02"))
                .internationalAddenda(
                    InboundAchTransfer.InternationalAddenda.builder()
                        .destinationCountryCode("US")
                        .destinationCurrencyCode("USD")
                        .foreignExchangeIndicator(
                            InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                                .FIXED_TO_FIXED
                        )
                        .foreignExchangeReference(null)
                        .foreignExchangeReferenceIndicator(
                            InboundAchTransfer.InternationalAddenda
                                .ForeignExchangeReferenceIndicator
                                .BLANK
                        )
                        .foreignPaymentAmount(199L)
                        .foreignTraceNumber(null)
                        .internationalTransactionTypeCode(
                            InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                                .INTERNET_INITIATED
                        )
                        .originatingCurrencyCode("USD")
                        .originatingDepositoryFinancialInstitutionBranchCountry("US")
                        .originatingDepositoryFinancialInstitutionId("091000019")
                        .originatingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .OriginatingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .originatingDepositoryFinancialInstitutionName("WELLS FARGO BANK")
                        .originatorCity("BERLIN")
                        .originatorCountry("DE")
                        .originatorIdentification("770510487A")
                        .originatorName("BERGHAIN")
                        .originatorPostalCode("50825")
                        .originatorStateOrProvince(null)
                        .originatorStreetAddress("Ruedersdorferstr. 7")
                        .paymentRelatedInformation(null)
                        .paymentRelatedInformation2(null)
                        .receiverCity("BEVERLY HILLS")
                        .receiverCountry("US")
                        .receiverIdentificationNumber("1018790279274")
                        .receiverPostalCode("90210")
                        .receiverStateOrProvince("CA")
                        .receiverStreetAddress("123 FAKE ST")
                        .receivingCompanyOrIndividualName("IAN CREASE")
                        .receivingDepositoryFinancialInstitutionCountry("US")
                        .receivingDepositoryFinancialInstitutionId("101050001")
                        .receivingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .ReceivingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .receivingDepositoryFinancialInstitutionName(
                            "BLUE RIDGE BANK, NATIONAL ASSOCIATI"
                        )
                        .build()
                )
                .notificationOfChange(
                    InboundAchTransfer.NotificationOfChange.builder()
                        .updatedAccountNumber("updated_account_number")
                        .updatedRoutingNumber("updated_routing_number")
                        .build()
                )
                .originatorCompanyDescriptiveDate("230401")
                .originatorCompanyDiscretionaryData("WEB AUTOPAY")
                .originatorCompanyEntryDescription("INVOICE 2468")
                .originatorCompanyId("0987654321")
                .originatorCompanyName("PAYROLL COMPANY")
                .originatorRoutingNumber("101050001")
                .receiverIdNumber(null)
                .receiverName("Ian Crease")
                .settlement(
                    InboundAchTransfer.Settlement.builder()
                        .settledAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .settlementSchedule(
                            InboundAchTransfer.Settlement.SettlementSchedule.SAME_DAY
                        )
                        .build()
                )
                .standardEntryClassCode(
                    InboundAchTransfer.StandardEntryClassCode.INTERNET_INITIATED
                )
                .status(InboundAchTransfer.Status.ACCEPTED)
                .traceNumber("021000038461022")
                .transferReturn(
                    InboundAchTransfer.TransferReturn.builder()
                        .reason(InboundAchTransfer.TransferReturn.Reason.INSUFFICIENT_FUNDS)
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .type(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
                .build()

        val roundtrippedInboundAchTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundAchTransfer),
                jacksonTypeRef<InboundAchTransfer>(),
            )

        assertThat(roundtrippedInboundAchTransfer).isEqualTo(inboundAchTransfer)
    }
}
