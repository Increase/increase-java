// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferTest {

    @Test
    fun createInboundAchTransfer() {
        val inboundAchTransfer =
            InboundAchTransfer.builder()
                .id("id")
                .acceptance(
                    InboundAchTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .accountId("account_id")
                .accountNumberId("account_number_id")
                .addenda(
                    InboundAchTransfer.Addenda.builder()
                        .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                        .freeform(
                            InboundAchTransfer.Addenda.Freeform.builder()
                                .entries(
                                    listOf(
                                        InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation(
                                                "payment_related_information"
                                            )
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .amount(123L)
                .automaticallyResolvesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decline(
                    InboundAchTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                        .build()
                )
                .direction(InboundAchTransfer.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expectedSettlementSchedule(InboundAchTransfer.ExpectedSettlementSchedule.SAME_DAY)
                .internationalAddenda(
                    InboundAchTransfer.InternationalAddenda.builder()
                        .destinationCountryCode("destination_country_code")
                        .destinationCurrencyCode("destination_currency_code")
                        .foreignExchangeIndicator(
                            InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                                .FIXED_TO_VARIABLE
                        )
                        .foreignExchangeReference("foreign_exchange_reference")
                        .foreignExchangeReferenceIndicator(
                            InboundAchTransfer.InternationalAddenda
                                .ForeignExchangeReferenceIndicator
                                .FOREIGN_EXCHANGE_RATE
                        )
                        .foreignPaymentAmount(123L)
                        .foreignTraceNumber("foreign_trace_number")
                        .internationalTransactionTypeCode(
                            InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                                .ANNUITY
                        )
                        .originatingCurrencyCode("originating_currency_code")
                        .originatingDepositoryFinancialInstitutionBranchCountry(
                            "originating_depository_financial_institution_branch_country"
                        )
                        .originatingDepositoryFinancialInstitutionId(
                            "originating_depository_financial_institution_id"
                        )
                        .originatingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .OriginatingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .originatingDepositoryFinancialInstitutionName(
                            "originating_depository_financial_institution_name"
                        )
                        .originatorCity("originator_city")
                        .originatorCountry("originator_country")
                        .originatorIdentification("originator_identification")
                        .originatorName("originator_name")
                        .originatorPostalCode("originator_postal_code")
                        .originatorStateOrProvince("originator_state_or_province")
                        .originatorStreetAddress("originator_street_address")
                        .paymentRelatedInformation("payment_related_information")
                        .paymentRelatedInformation2("payment_related_information2")
                        .receiverCity("receiver_city")
                        .receiverCountry("receiver_country")
                        .receiverIdentificationNumber("receiver_identification_number")
                        .receiverPostalCode("receiver_postal_code")
                        .receiverStateOrProvince("receiver_state_or_province")
                        .receiverStreetAddress("receiver_street_address")
                        .receivingCompanyOrIndividualName("receiving_company_or_individual_name")
                        .receivingDepositoryFinancialInstitutionCountry(
                            "receiving_depository_financial_institution_country"
                        )
                        .receivingDepositoryFinancialInstitutionId(
                            "receiving_depository_financial_institution_id"
                        )
                        .receivingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .ReceivingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .receivingDepositoryFinancialInstitutionName(
                            "receiving_depository_financial_institution_name"
                        )
                        .build()
                )
                .notificationOfChange(
                    InboundAchTransfer.NotificationOfChange.builder()
                        .updatedAccountNumber("updated_account_number")
                        .updatedRoutingNumber("updated_routing_number")
                        .build()
                )
                .originatorCompanyDescriptiveDate("originator_company_descriptive_date")
                .originatorCompanyDiscretionaryData("originator_company_discretionary_data")
                .originatorCompanyEntryDescription("originator_company_entry_description")
                .originatorCompanyId("originator_company_id")
                .originatorCompanyName("originator_company_name")
                .originatorRoutingNumber("originator_routing_number")
                .receiverIdNumber("receiver_id_number")
                .receiverName("receiver_name")
                .standardEntryClassCode(
                    InboundAchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .status(InboundAchTransfer.Status.PENDING)
                .traceNumber("trace_number")
                .transferReturn(
                    InboundAchTransfer.TransferReturn.builder()
                        .reason(InboundAchTransfer.TransferReturn.Reason.INSUFFICIENT_FUNDS)
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .type(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
                .build()
        assertThat(inboundAchTransfer).isNotNull
        assertThat(inboundAchTransfer.id()).isEqualTo("id")
        assertThat(inboundAchTransfer.acceptance())
            .contains(
                InboundAchTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundAchTransfer.accountId()).isEqualTo("account_id")
        assertThat(inboundAchTransfer.accountNumberId()).isEqualTo("account_number_id")
        assertThat(inboundAchTransfer.addenda())
            .contains(
                InboundAchTransfer.Addenda.builder()
                    .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransfer.Addenda.Freeform.builder()
                            .entries(
                                listOf(
                                    InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("payment_related_information")
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(inboundAchTransfer.amount()).isEqualTo(123L)
        assertThat(inboundAchTransfer.automaticallyResolvesAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundAchTransfer.decline())
            .contains(
                InboundAchTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .declinedTransactionId("declined_transaction_id")
                    .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                    .build()
            )
        assertThat(inboundAchTransfer.direction()).isEqualTo(InboundAchTransfer.Direction.CREDIT)
        assertThat(inboundAchTransfer.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(inboundAchTransfer.expectedSettlementSchedule())
            .isEqualTo(InboundAchTransfer.ExpectedSettlementSchedule.SAME_DAY)
        assertThat(inboundAchTransfer.internationalAddenda())
            .contains(
                InboundAchTransfer.InternationalAddenda.builder()
                    .destinationCountryCode("destination_country_code")
                    .destinationCurrencyCode("destination_currency_code")
                    .foreignExchangeIndicator(
                        InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                            .FIXED_TO_VARIABLE
                    )
                    .foreignExchangeReference("foreign_exchange_reference")
                    .foreignExchangeReferenceIndicator(
                        InboundAchTransfer.InternationalAddenda.ForeignExchangeReferenceIndicator
                            .FOREIGN_EXCHANGE_RATE
                    )
                    .foreignPaymentAmount(123L)
                    .foreignTraceNumber("foreign_trace_number")
                    .internationalTransactionTypeCode(
                        InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                            .ANNUITY
                    )
                    .originatingCurrencyCode("originating_currency_code")
                    .originatingDepositoryFinancialInstitutionBranchCountry(
                        "originating_depository_financial_institution_branch_country"
                    )
                    .originatingDepositoryFinancialInstitutionId(
                        "originating_depository_financial_institution_id"
                    )
                    .originatingDepositoryFinancialInstitutionIdQualifier(
                        InboundAchTransfer.InternationalAddenda
                            .OriginatingDepositoryFinancialInstitutionIdQualifier
                            .NATIONAL_CLEARING_SYSTEM_NUMBER
                    )
                    .originatingDepositoryFinancialInstitutionName(
                        "originating_depository_financial_institution_name"
                    )
                    .originatorCity("originator_city")
                    .originatorCountry("originator_country")
                    .originatorIdentification("originator_identification")
                    .originatorName("originator_name")
                    .originatorPostalCode("originator_postal_code")
                    .originatorStateOrProvince("originator_state_or_province")
                    .originatorStreetAddress("originator_street_address")
                    .paymentRelatedInformation("payment_related_information")
                    .paymentRelatedInformation2("payment_related_information2")
                    .receiverCity("receiver_city")
                    .receiverCountry("receiver_country")
                    .receiverIdentificationNumber("receiver_identification_number")
                    .receiverPostalCode("receiver_postal_code")
                    .receiverStateOrProvince("receiver_state_or_province")
                    .receiverStreetAddress("receiver_street_address")
                    .receivingCompanyOrIndividualName("receiving_company_or_individual_name")
                    .receivingDepositoryFinancialInstitutionCountry(
                        "receiving_depository_financial_institution_country"
                    )
                    .receivingDepositoryFinancialInstitutionId(
                        "receiving_depository_financial_institution_id"
                    )
                    .receivingDepositoryFinancialInstitutionIdQualifier(
                        InboundAchTransfer.InternationalAddenda
                            .ReceivingDepositoryFinancialInstitutionIdQualifier
                            .NATIONAL_CLEARING_SYSTEM_NUMBER
                    )
                    .receivingDepositoryFinancialInstitutionName(
                        "receiving_depository_financial_institution_name"
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
        assertThat(inboundAchTransfer.originatorCompanyDescriptiveDate())
            .contains("originator_company_descriptive_date")
        assertThat(inboundAchTransfer.originatorCompanyDiscretionaryData())
            .contains("originator_company_discretionary_data")
        assertThat(inboundAchTransfer.originatorCompanyEntryDescription())
            .isEqualTo("originator_company_entry_description")
        assertThat(inboundAchTransfer.originatorCompanyId()).isEqualTo("originator_company_id")
        assertThat(inboundAchTransfer.originatorCompanyName()).isEqualTo("originator_company_name")
        assertThat(inboundAchTransfer.originatorRoutingNumber())
            .isEqualTo("originator_routing_number")
        assertThat(inboundAchTransfer.receiverIdNumber()).contains("receiver_id_number")
        assertThat(inboundAchTransfer.receiverName()).contains("receiver_name")
        assertThat(inboundAchTransfer.standardEntryClassCode())
            .isEqualTo(InboundAchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(inboundAchTransfer.status()).isEqualTo(InboundAchTransfer.Status.PENDING)
        assertThat(inboundAchTransfer.traceNumber()).isEqualTo("trace_number")
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
}
