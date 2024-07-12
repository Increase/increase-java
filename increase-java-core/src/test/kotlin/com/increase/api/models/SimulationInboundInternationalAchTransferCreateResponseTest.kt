// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundInternationalAchTransferCreateResponseTest {

    @Test
    fun createSimulationInboundInternationalAchTransferCreateResponse() {
        val simulationInboundInternationalAchTransferCreateResponse =
            SimulationInboundInternationalAchTransferCreateResponse.builder()
                .amount(123L)
                .destinationCountryCode("destination_country_code")
                .destinationCurrencyCode("destination_currency_code")
                .foreignExchangeIndicator(
                    SimulationInboundInternationalAchTransferCreateResponse.ForeignExchangeIndicator
                        .FIXED_TO_VARIABLE
                )
                .foreignExchangeReference("foreign_exchange_reference")
                .foreignExchangeReferenceIndicator(
                    SimulationInboundInternationalAchTransferCreateResponse
                        .ForeignExchangeReferenceIndicator
                        .FOREIGN_EXCHANGE_RATE
                )
                .foreignPaymentAmount(123L)
                .foreignTraceNumber("foreign_trace_number")
                .internationalTransactionTypeCode(
                    SimulationInboundInternationalAchTransferCreateResponse
                        .InternationalTransactionTypeCode
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
                    SimulationInboundInternationalAchTransferCreateResponse
                        .OriginatingDepositoryFinancialInstitutionIdQualifier
                        .NATIONAL_CLEARING_SYSTEM_NUMBER
                )
                .originatingDepositoryFinancialInstitutionName(
                    "originating_depository_financial_institution_name"
                )
                .originatorCity("originator_city")
                .originatorCompanyEntryDescription("originator_company_entry_description")
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
                    SimulationInboundInternationalAchTransferCreateResponse
                        .ReceivingDepositoryFinancialInstitutionIdQualifier
                        .NATIONAL_CLEARING_SYSTEM_NUMBER
                )
                .receivingDepositoryFinancialInstitutionName(
                    "receiving_depository_financial_institution_name"
                )
                .traceNumber("trace_number")
                .type(
                    SimulationInboundInternationalAchTransferCreateResponse.Type
                        .INBOUND_INTERNATIONAL_ACH_TRANSFER
                )
                .build()
        assertThat(simulationInboundInternationalAchTransferCreateResponse).isNotNull
        assertThat(simulationInboundInternationalAchTransferCreateResponse.amount()).isEqualTo(123L)
        assertThat(simulationInboundInternationalAchTransferCreateResponse.destinationCountryCode())
            .isEqualTo("destination_country_code")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.destinationCurrencyCode()
            )
            .isEqualTo("destination_currency_code")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.foreignExchangeIndicator()
            )
            .isEqualTo(
                SimulationInboundInternationalAchTransferCreateResponse.ForeignExchangeIndicator
                    .FIXED_TO_VARIABLE
            )
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.foreignExchangeReference()
            )
            .contains("foreign_exchange_reference")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .foreignExchangeReferenceIndicator()
            )
            .isEqualTo(
                SimulationInboundInternationalAchTransferCreateResponse
                    .ForeignExchangeReferenceIndicator
                    .FOREIGN_EXCHANGE_RATE
            )
        assertThat(simulationInboundInternationalAchTransferCreateResponse.foreignPaymentAmount())
            .isEqualTo(123L)
        assertThat(simulationInboundInternationalAchTransferCreateResponse.foreignTraceNumber())
            .contains("foreign_trace_number")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .internationalTransactionTypeCode()
            )
            .isEqualTo(
                SimulationInboundInternationalAchTransferCreateResponse
                    .InternationalTransactionTypeCode
                    .ANNUITY
            )
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.originatingCurrencyCode()
            )
            .isEqualTo("originating_currency_code")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .originatingDepositoryFinancialInstitutionBranchCountry()
            )
            .isEqualTo("originating_depository_financial_institution_branch_country")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .originatingDepositoryFinancialInstitutionId()
            )
            .isEqualTo("originating_depository_financial_institution_id")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .originatingDepositoryFinancialInstitutionIdQualifier()
            )
            .isEqualTo(
                SimulationInboundInternationalAchTransferCreateResponse
                    .OriginatingDepositoryFinancialInstitutionIdQualifier
                    .NATIONAL_CLEARING_SYSTEM_NUMBER
            )
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .originatingDepositoryFinancialInstitutionName()
            )
            .isEqualTo("originating_depository_financial_institution_name")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.originatorCity())
            .isEqualTo("originator_city")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .originatorCompanyEntryDescription()
            )
            .isEqualTo("originator_company_entry_description")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.originatorCountry())
            .isEqualTo("originator_country")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.originatorIdentification()
            )
            .isEqualTo("originator_identification")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.originatorName())
            .isEqualTo("originator_name")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.originatorPostalCode())
            .contains("originator_postal_code")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.originatorStateOrProvince()
            )
            .contains("originator_state_or_province")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.originatorStreetAddress()
            )
            .isEqualTo("originator_street_address")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.paymentRelatedInformation()
            )
            .contains("payment_related_information")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.paymentRelatedInformation2()
            )
            .contains("payment_related_information2")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.receiverCity())
            .isEqualTo("receiver_city")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.receiverCountry())
            .isEqualTo("receiver_country")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .receiverIdentificationNumber()
            )
            .contains("receiver_identification_number")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.receiverPostalCode())
            .contains("receiver_postal_code")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse.receiverStateOrProvince()
            )
            .contains("receiver_state_or_province")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.receiverStreetAddress())
            .isEqualTo("receiver_street_address")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .receivingCompanyOrIndividualName()
            )
            .isEqualTo("receiving_company_or_individual_name")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .receivingDepositoryFinancialInstitutionCountry()
            )
            .isEqualTo("receiving_depository_financial_institution_country")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .receivingDepositoryFinancialInstitutionId()
            )
            .isEqualTo("receiving_depository_financial_institution_id")
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .receivingDepositoryFinancialInstitutionIdQualifier()
            )
            .isEqualTo(
                SimulationInboundInternationalAchTransferCreateResponse
                    .ReceivingDepositoryFinancialInstitutionIdQualifier
                    .NATIONAL_CLEARING_SYSTEM_NUMBER
            )
        assertThat(
                simulationInboundInternationalAchTransferCreateResponse
                    .receivingDepositoryFinancialInstitutionName()
            )
            .isEqualTo("receiving_depository_financial_institution_name")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.traceNumber())
            .isEqualTo("trace_number")
        assertThat(simulationInboundInternationalAchTransferCreateResponse.type())
            .isEqualTo(
                SimulationInboundInternationalAchTransferCreateResponse.Type
                    .INBOUND_INTERNATIONAL_ACH_TRANSFER
            )
    }
}
