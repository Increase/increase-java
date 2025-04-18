// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireDrawdownRequestTest {

    @Test
    fun create() {
        val inboundWireDrawdownRequest =
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

        assertThat(inboundWireDrawdownRequest.id())
            .isEqualTo("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
        assertThat(inboundWireDrawdownRequest.amount()).isEqualTo(10000L)
        assertThat(inboundWireDrawdownRequest.beneficiaryAccountNumber()).isEqualTo("987654321")
        assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine1())
            .contains("33 Liberty Street")
        assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine2())
            .contains("New York, NY, 10045")
        assertThat(inboundWireDrawdownRequest.beneficiaryAddressLine3()).isEmpty
        assertThat(inboundWireDrawdownRequest.beneficiaryName()).contains("Ian Crease")
        assertThat(inboundWireDrawdownRequest.beneficiaryRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundWireDrawdownRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundWireDrawdownRequest.currency()).isEqualTo("USD")
        assertThat(inboundWireDrawdownRequest.messageToRecipient()).contains("Invoice 29582")
        assertThat(inboundWireDrawdownRequest.originatorAccountNumber()).contains("987654321")
        assertThat(inboundWireDrawdownRequest.originatorAddressLine1())
            .contains("33 Liberty Street")
        assertThat(inboundWireDrawdownRequest.originatorAddressLine2())
            .contains("New York, NY, 10045")
        assertThat(inboundWireDrawdownRequest.originatorAddressLine3()).isEmpty
        assertThat(inboundWireDrawdownRequest.originatorName()).contains("Ian Crease")
        assertThat(inboundWireDrawdownRequest.originatorRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine1()).isEmpty
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine2()).isEmpty
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine3()).isEmpty
        assertThat(inboundWireDrawdownRequest.originatorToBeneficiaryInformationLine4()).isEmpty
        assertThat(inboundWireDrawdownRequest.recipientAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundWireDrawdownRequest.type())
            .isEqualTo(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundWireDrawdownRequest =
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

        val roundtrippedInboundWireDrawdownRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireDrawdownRequest),
                jacksonTypeRef<InboundWireDrawdownRequest>(),
            )

        assertThat(roundtrippedInboundWireDrawdownRequest).isEqualTo(inboundWireDrawdownRequest)
    }
}
