// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireDrawdownRequestListPageResponseTest {

    @Test
    fun create() {
        val inboundWireDrawdownRequestListPageResponse =
            InboundWireDrawdownRequestListPageResponse.builder()
                .addData(
                    InboundWireDrawdownRequest.builder()
                        .id("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
                        .amount(10000L)
                        .beneficiaryAccountNumber("987654321")
                        .beneficiaryAddressLine1("33 Liberty Street")
                        .beneficiaryAddressLine2("New York, NY, 10045")
                        .beneficiaryAddressLine3(null)
                        .beneficiaryName("Ian Crease")
                        .beneficiaryRoutingNumber("101050001")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency("USD")
                        .messageToRecipient("Invoice 29582")
                        .originatorAccountNumber("987654321")
                        .originatorAddressLine1("33 Liberty Street")
                        .originatorAddressLine2("New York, NY, 10045")
                        .originatorAddressLine3(null)
                        .originatorName("Ian Crease")
                        .originatorRoutingNumber("101050001")
                        .originatorToBeneficiaryInformationLine1(null)
                        .originatorToBeneficiaryInformationLine2(null)
                        .originatorToBeneficiaryInformationLine3(null)
                        .originatorToBeneficiaryInformationLine4(null)
                        .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundWireDrawdownRequestListPageResponse.data())
            .containsExactly(
                InboundWireDrawdownRequest.builder()
                    .id("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
                    .amount(10000L)
                    .beneficiaryAccountNumber("987654321")
                    .beneficiaryAddressLine1("33 Liberty Street")
                    .beneficiaryAddressLine2("New York, NY, 10045")
                    .beneficiaryAddressLine3(null)
                    .beneficiaryName("Ian Crease")
                    .beneficiaryRoutingNumber("101050001")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .currency("USD")
                    .messageToRecipient("Invoice 29582")
                    .originatorAccountNumber("987654321")
                    .originatorAddressLine1("33 Liberty Street")
                    .originatorAddressLine2("New York, NY, 10045")
                    .originatorAddressLine3(null)
                    .originatorName("Ian Crease")
                    .originatorRoutingNumber("101050001")
                    .originatorToBeneficiaryInformationLine1(null)
                    .originatorToBeneficiaryInformationLine2(null)
                    .originatorToBeneficiaryInformationLine3(null)
                    .originatorToBeneficiaryInformationLine4(null)
                    .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                    .build()
            )
        assertThat(inboundWireDrawdownRequestListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundWireDrawdownRequestListPageResponse =
            InboundWireDrawdownRequestListPageResponse.builder()
                .addData(
                    InboundWireDrawdownRequest.builder()
                        .id("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
                        .amount(10000L)
                        .beneficiaryAccountNumber("987654321")
                        .beneficiaryAddressLine1("33 Liberty Street")
                        .beneficiaryAddressLine2("New York, NY, 10045")
                        .beneficiaryAddressLine3(null)
                        .beneficiaryName("Ian Crease")
                        .beneficiaryRoutingNumber("101050001")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency("USD")
                        .messageToRecipient("Invoice 29582")
                        .originatorAccountNumber("987654321")
                        .originatorAddressLine1("33 Liberty Street")
                        .originatorAddressLine2("New York, NY, 10045")
                        .originatorAddressLine3(null)
                        .originatorName("Ian Crease")
                        .originatorRoutingNumber("101050001")
                        .originatorToBeneficiaryInformationLine1(null)
                        .originatorToBeneficiaryInformationLine2(null)
                        .originatorToBeneficiaryInformationLine3(null)
                        .originatorToBeneficiaryInformationLine4(null)
                        .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundWireDrawdownRequestListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireDrawdownRequestListPageResponse),
                jacksonTypeRef<InboundWireDrawdownRequestListPageResponse>(),
            )

        assertThat(roundtrippedInboundWireDrawdownRequestListPageResponse)
            .isEqualTo(inboundWireDrawdownRequestListPageResponse)
    }
}
