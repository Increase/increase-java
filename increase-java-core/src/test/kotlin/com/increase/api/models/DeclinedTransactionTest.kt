package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeclinedTransactionTest {

    @Test
    fun createDeclinedTransaction() {
        val declinedTransaction =
            DeclinedTransaction.builder()
                .id("string")
                .accountId("string")
                .amount(123L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(DeclinedTransaction.Currency.CAD)
                .description("string")
                .routeId("string")
                .routeType(DeclinedTransaction.RouteType.ACCOUNT_NUMBER)
                .source(
                    DeclinedTransaction.Source.builder()
                        .achDecline(
                            DeclinedTransaction.Source.AchDecline.builder()
                                .id("string")
                                .amount(123L)
                                .originatorCompanyDescriptiveDate("string")
                                .originatorCompanyDiscretionaryData("string")
                                .originatorCompanyId("string")
                                .originatorCompanyName("string")
                                .reason(
                                    DeclinedTransaction.Source.AchDecline.Reason.ACH_ROUTE_CANCELED
                                )
                                .receiverIdNumber("string")
                                .receiverName("string")
                                .traceNumber("string")
                                .type(DeclinedTransaction.Source.AchDecline.Type.ACH_DECLINE)
                                .build()
                        )
                        .cardDecline(
                            DeclinedTransaction.Source.CardDecline.builder()
                                .amount(123L)
                                .currency(DeclinedTransaction.Source.CardDecline.Currency.CAD)
                                .digitalWalletTokenId("string")
                                .merchantAcceptorId("string")
                                .merchantCategoryCode("string")
                                .merchantCity("string")
                                .merchantCountry("string")
                                .merchantDescriptor("string")
                                .merchantState("string")
                                .networkDetails(
                                    DeclinedTransaction.Source.CardDecline.NetworkDetails.builder()
                                        .category(
                                            DeclinedTransaction.Source.CardDecline.NetworkDetails
                                                .Category
                                                .VISA
                                        )
                                        .visa(
                                            DeclinedTransaction.Source.CardDecline.NetworkDetails
                                                .Visa
                                                .builder()
                                                .electronicCommerceIndicator(
                                                    DeclinedTransaction.Source.CardDecline
                                                        .NetworkDetails
                                                        .Visa
                                                        .ElectronicCommerceIndicator
                                                        .MAIL_PHONE_ORDER
                                                )
                                                .pointOfServiceEntryMode(
                                                    DeclinedTransaction.Source.CardDecline
                                                        .NetworkDetails
                                                        .Visa
                                                        .PointOfServiceEntryMode
                                                        .UNKNOWN
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .physicalCardId("string")
                                .realTimeDecisionId("string")
                                .reason(
                                    DeclinedTransaction.Source.CardDecline.Reason.CARD_NOT_ACTIVE
                                )
                                .build()
                        )
                        .category(DeclinedTransaction.Source.Category.ACH_DECLINE)
                        .checkDecline(
                            DeclinedTransaction.Source.CheckDecline.builder()
                                .amount(123L)
                                .auxiliaryOnUs("string")
                                .reason(
                                    DeclinedTransaction.Source.CheckDecline.Reason
                                        .ACH_ROUTE_DISABLED
                                )
                                .build()
                        )
                        .inboundRealTimePaymentsTransferDecline(
                            DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline
                                .builder()
                                .amount(123L)
                                .creditorName("string")
                                .currency(
                                    DeclinedTransaction.Source
                                        .InboundRealTimePaymentsTransferDecline
                                        .Currency
                                        .CAD
                                )
                                .debtorAccountNumber("string")
                                .debtorName("string")
                                .debtorRoutingNumber("string")
                                .reason(
                                    DeclinedTransaction.Source
                                        .InboundRealTimePaymentsTransferDecline
                                        .Reason
                                        .ACCOUNT_NUMBER_CANCELED
                                )
                                .remittanceInformation("string")
                                .transactionIdentification("string")
                                .build()
                        )
                        .internationalAchDecline(
                            DeclinedTransaction.Source.InternationalAchDecline.builder()
                                .amount(123L)
                                .destinationCountryCode("string")
                                .destinationCurrencyCode("string")
                                .foreignExchangeIndicator(
                                    DeclinedTransaction.Source.InternationalAchDecline
                                        .ForeignExchangeIndicator
                                        .FIXED_TO_VARIABLE
                                )
                                .foreignExchangeReference("string")
                                .foreignExchangeReferenceIndicator(
                                    DeclinedTransaction.Source.InternationalAchDecline
                                        .ForeignExchangeReferenceIndicator
                                        .FOREIGN_EXCHANGE_RATE
                                )
                                .foreignPaymentAmount(123L)
                                .foreignTraceNumber("string")
                                .internationalTransactionTypeCode(
                                    DeclinedTransaction.Source.InternationalAchDecline
                                        .InternationalTransactionTypeCode
                                        .ANNUITY
                                )
                                .originatingCurrencyCode("string")
                                .originatingDepositoryFinancialInstitutionBranchCountry("string")
                                .originatingDepositoryFinancialInstitutionId("string")
                                .originatingDepositoryFinancialInstitutionIdQualifier(
                                    DeclinedTransaction.Source.InternationalAchDecline
                                        .OriginatingDepositoryFinancialInstitutionIdQualifier
                                        .NATIONAL_CLEARING_SYSTEM_NUMBER
                                )
                                .originatingDepositoryFinancialInstitutionName("string")
                                .originatorCity("string")
                                .originatorCompanyEntryDescription("string")
                                .originatorCountry("string")
                                .originatorIdentification("string")
                                .originatorName("string")
                                .originatorPostalCode("string")
                                .originatorStateOrProvince("string")
                                .originatorStreetAddress("string")
                                .paymentRelatedInformation("string")
                                .paymentRelatedInformation2("string")
                                .receiverCity("string")
                                .receiverCountry("string")
                                .receiverIdentificationNumber("string")
                                .receiverPostalCode("string")
                                .receiverStateOrProvince("string")
                                .receiverStreetAddress("string")
                                .receivingCompanyOrIndividualName("string")
                                .receivingDepositoryFinancialInstitutionCountry("string")
                                .receivingDepositoryFinancialInstitutionId("string")
                                .receivingDepositoryFinancialInstitutionIdQualifier(
                                    DeclinedTransaction.Source.InternationalAchDecline
                                        .ReceivingDepositoryFinancialInstitutionIdQualifier
                                        .NATIONAL_CLEARING_SYSTEM_NUMBER
                                )
                                .receivingDepositoryFinancialInstitutionName("string")
                                .traceNumber("string")
                                .build()
                        )
                        .wireDecline(
                            DeclinedTransaction.Source.WireDecline.builder()
                                .amount(123L)
                                .beneficiaryAddressLine1("string")
                                .beneficiaryAddressLine2("string")
                                .beneficiaryAddressLine3("string")
                                .beneficiaryName("string")
                                .beneficiaryReference("string")
                                .description("string")
                                .inputMessageAccountabilityData("string")
                                .originatorAddressLine1("string")
                                .originatorAddressLine2("string")
                                .originatorAddressLine3("string")
                                .originatorName("string")
                                .originatorToBeneficiaryInformationLine1("string")
                                .originatorToBeneficiaryInformationLine2("string")
                                .originatorToBeneficiaryInformationLine3("string")
                                .originatorToBeneficiaryInformationLine4("string")
                                .reason(
                                    DeclinedTransaction.Source.WireDecline.Reason
                                        .ACCOUNT_NUMBER_CANCELED
                                )
                                .build()
                        )
                        .build()
                )
                .type(DeclinedTransaction.Type.DECLINED_TRANSACTION)
                .build()
        assertThat(declinedTransaction).isNotNull
        assertThat(declinedTransaction.id()).isEqualTo("string")
        assertThat(declinedTransaction.accountId()).isEqualTo("string")
        assertThat(declinedTransaction.amount()).isEqualTo(123L)
        assertThat(declinedTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(declinedTransaction.currency()).isEqualTo(DeclinedTransaction.Currency.CAD)
        assertThat(declinedTransaction.description()).isEqualTo("string")
        assertThat(declinedTransaction.routeId()).contains("string")
        assertThat(declinedTransaction.routeType())
            .contains(DeclinedTransaction.RouteType.ACCOUNT_NUMBER)
        assertThat(declinedTransaction.source())
            .isEqualTo(
                DeclinedTransaction.Source.builder()
                    .achDecline(
                        DeclinedTransaction.Source.AchDecline.builder()
                            .id("string")
                            .amount(123L)
                            .originatorCompanyDescriptiveDate("string")
                            .originatorCompanyDiscretionaryData("string")
                            .originatorCompanyId("string")
                            .originatorCompanyName("string")
                            .reason(DeclinedTransaction.Source.AchDecline.Reason.ACH_ROUTE_CANCELED)
                            .receiverIdNumber("string")
                            .receiverName("string")
                            .traceNumber("string")
                            .type(DeclinedTransaction.Source.AchDecline.Type.ACH_DECLINE)
                            .build()
                    )
                    .cardDecline(
                        DeclinedTransaction.Source.CardDecline.builder()
                            .amount(123L)
                            .currency(DeclinedTransaction.Source.CardDecline.Currency.CAD)
                            .digitalWalletTokenId("string")
                            .merchantAcceptorId("string")
                            .merchantCategoryCode("string")
                            .merchantCity("string")
                            .merchantCountry("string")
                            .merchantDescriptor("string")
                            .merchantState("string")
                            .networkDetails(
                                DeclinedTransaction.Source.CardDecline.NetworkDetails.builder()
                                    .category(
                                        DeclinedTransaction.Source.CardDecline.NetworkDetails
                                            .Category
                                            .VISA
                                    )
                                    .visa(
                                        DeclinedTransaction.Source.CardDecline.NetworkDetails.Visa
                                            .builder()
                                            .electronicCommerceIndicator(
                                                DeclinedTransaction.Source.CardDecline
                                                    .NetworkDetails
                                                    .Visa
                                                    .ElectronicCommerceIndicator
                                                    .MAIL_PHONE_ORDER
                                            )
                                            .pointOfServiceEntryMode(
                                                DeclinedTransaction.Source.CardDecline
                                                    .NetworkDetails
                                                    .Visa
                                                    .PointOfServiceEntryMode
                                                    .UNKNOWN
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .physicalCardId("string")
                            .realTimeDecisionId("string")
                            .reason(DeclinedTransaction.Source.CardDecline.Reason.CARD_NOT_ACTIVE)
                            .build()
                    )
                    .category(DeclinedTransaction.Source.Category.ACH_DECLINE)
                    .checkDecline(
                        DeclinedTransaction.Source.CheckDecline.builder()
                            .amount(123L)
                            .auxiliaryOnUs("string")
                            .reason(
                                DeclinedTransaction.Source.CheckDecline.Reason.ACH_ROUTE_DISABLED
                            )
                            .build()
                    )
                    .inboundRealTimePaymentsTransferDecline(
                        DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline.builder()
                            .amount(123L)
                            .creditorName("string")
                            .currency(
                                DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline
                                    .Currency
                                    .CAD
                            )
                            .debtorAccountNumber("string")
                            .debtorName("string")
                            .debtorRoutingNumber("string")
                            .reason(
                                DeclinedTransaction.Source.InboundRealTimePaymentsTransferDecline
                                    .Reason
                                    .ACCOUNT_NUMBER_CANCELED
                            )
                            .remittanceInformation("string")
                            .transactionIdentification("string")
                            .build()
                    )
                    .internationalAchDecline(
                        DeclinedTransaction.Source.InternationalAchDecline.builder()
                            .amount(123L)
                            .destinationCountryCode("string")
                            .destinationCurrencyCode("string")
                            .foreignExchangeIndicator(
                                DeclinedTransaction.Source.InternationalAchDecline
                                    .ForeignExchangeIndicator
                                    .FIXED_TO_VARIABLE
                            )
                            .foreignExchangeReference("string")
                            .foreignExchangeReferenceIndicator(
                                DeclinedTransaction.Source.InternationalAchDecline
                                    .ForeignExchangeReferenceIndicator
                                    .FOREIGN_EXCHANGE_RATE
                            )
                            .foreignPaymentAmount(123L)
                            .foreignTraceNumber("string")
                            .internationalTransactionTypeCode(
                                DeclinedTransaction.Source.InternationalAchDecline
                                    .InternationalTransactionTypeCode
                                    .ANNUITY
                            )
                            .originatingCurrencyCode("string")
                            .originatingDepositoryFinancialInstitutionBranchCountry("string")
                            .originatingDepositoryFinancialInstitutionId("string")
                            .originatingDepositoryFinancialInstitutionIdQualifier(
                                DeclinedTransaction.Source.InternationalAchDecline
                                    .OriginatingDepositoryFinancialInstitutionIdQualifier
                                    .NATIONAL_CLEARING_SYSTEM_NUMBER
                            )
                            .originatingDepositoryFinancialInstitutionName("string")
                            .originatorCity("string")
                            .originatorCompanyEntryDescription("string")
                            .originatorCountry("string")
                            .originatorIdentification("string")
                            .originatorName("string")
                            .originatorPostalCode("string")
                            .originatorStateOrProvince("string")
                            .originatorStreetAddress("string")
                            .paymentRelatedInformation("string")
                            .paymentRelatedInformation2("string")
                            .receiverCity("string")
                            .receiverCountry("string")
                            .receiverIdentificationNumber("string")
                            .receiverPostalCode("string")
                            .receiverStateOrProvince("string")
                            .receiverStreetAddress("string")
                            .receivingCompanyOrIndividualName("string")
                            .receivingDepositoryFinancialInstitutionCountry("string")
                            .receivingDepositoryFinancialInstitutionId("string")
                            .receivingDepositoryFinancialInstitutionIdQualifier(
                                DeclinedTransaction.Source.InternationalAchDecline
                                    .ReceivingDepositoryFinancialInstitutionIdQualifier
                                    .NATIONAL_CLEARING_SYSTEM_NUMBER
                            )
                            .receivingDepositoryFinancialInstitutionName("string")
                            .traceNumber("string")
                            .build()
                    )
                    .wireDecline(
                        DeclinedTransaction.Source.WireDecline.builder()
                            .amount(123L)
                            .beneficiaryAddressLine1("string")
                            .beneficiaryAddressLine2("string")
                            .beneficiaryAddressLine3("string")
                            .beneficiaryName("string")
                            .beneficiaryReference("string")
                            .description("string")
                            .inputMessageAccountabilityData("string")
                            .originatorAddressLine1("string")
                            .originatorAddressLine2("string")
                            .originatorAddressLine3("string")
                            .originatorName("string")
                            .originatorToBeneficiaryInformationLine1("string")
                            .originatorToBeneficiaryInformationLine2("string")
                            .originatorToBeneficiaryInformationLine3("string")
                            .originatorToBeneficiaryInformationLine4("string")
                            .reason(
                                DeclinedTransaction.Source.WireDecline.Reason
                                    .ACCOUNT_NUMBER_CANCELED
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(declinedTransaction.type())
            .isEqualTo(DeclinedTransaction.Type.DECLINED_TRANSACTION)
    }
}
