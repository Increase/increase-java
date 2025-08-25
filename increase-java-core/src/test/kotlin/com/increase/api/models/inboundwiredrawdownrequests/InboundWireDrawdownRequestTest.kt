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
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorAccountNumber("987654321")
                .creditorAddressLine1("33 Liberty Street")
                .creditorAddressLine2("New York, NY, 10045")
                .creditorAddressLine3(null)
                .creditorName("Ian Crease")
                .creditorRoutingNumber("101050001")
                .currency("USD")
                .debtorAddressLine1("33 Liberty Street")
                .debtorAddressLine2("New York, NY, 10045")
                .debtorAddressLine3(null)
                .debtorName("Ian Crease")
                .endToEndIdentification("Invoice 29582")
                .inputMessageAccountabilityData(null)
                .instructionIdentification(null)
                .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                .uniqueEndToEndTransactionReference(null)
                .unstructuredRemittanceInformation(null)
                .build()

        assertThat(inboundWireDrawdownRequest.id())
            .isEqualTo("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
        assertThat(inboundWireDrawdownRequest.amount()).isEqualTo(10000L)
        assertThat(inboundWireDrawdownRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundWireDrawdownRequest.creditorAccountNumber()).isEqualTo("987654321")
        assertThat(inboundWireDrawdownRequest.creditorAddressLine1()).contains("33 Liberty Street")
        assertThat(inboundWireDrawdownRequest.creditorAddressLine2())
            .contains("New York, NY, 10045")
        assertThat(inboundWireDrawdownRequest.creditorAddressLine3()).isEmpty
        assertThat(inboundWireDrawdownRequest.creditorName()).contains("Ian Crease")
        assertThat(inboundWireDrawdownRequest.creditorRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundWireDrawdownRequest.currency()).isEqualTo("USD")
        assertThat(inboundWireDrawdownRequest.debtorAddressLine1()).contains("33 Liberty Street")
        assertThat(inboundWireDrawdownRequest.debtorAddressLine2()).contains("New York, NY, 10045")
        assertThat(inboundWireDrawdownRequest.debtorAddressLine3()).isEmpty
        assertThat(inboundWireDrawdownRequest.debtorName()).contains("Ian Crease")
        assertThat(inboundWireDrawdownRequest.endToEndIdentification()).contains("Invoice 29582")
        assertThat(inboundWireDrawdownRequest.inputMessageAccountabilityData()).isEmpty
        assertThat(inboundWireDrawdownRequest.instructionIdentification()).isEmpty
        assertThat(inboundWireDrawdownRequest.recipientAccountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundWireDrawdownRequest.type())
            .isEqualTo(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
        assertThat(inboundWireDrawdownRequest.uniqueEndToEndTransactionReference()).isEmpty
        assertThat(inboundWireDrawdownRequest.unstructuredRemittanceInformation()).isEmpty
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundWireDrawdownRequest =
            InboundWireDrawdownRequest.builder()
                .id("inbound_wire_drawdown_request_u5a92ikqhz1ytphn799e")
                .amount(10000L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorAccountNumber("987654321")
                .creditorAddressLine1("33 Liberty Street")
                .creditorAddressLine2("New York, NY, 10045")
                .creditorAddressLine3(null)
                .creditorName("Ian Crease")
                .creditorRoutingNumber("101050001")
                .currency("USD")
                .debtorAddressLine1("33 Liberty Street")
                .debtorAddressLine2("New York, NY, 10045")
                .debtorAddressLine3(null)
                .debtorName("Ian Crease")
                .endToEndIdentification("Invoice 29582")
                .inputMessageAccountabilityData(null)
                .instructionIdentification(null)
                .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                .uniqueEndToEndTransactionReference(null)
                .unstructuredRemittanceInformation(null)
                .build()

        val roundtrippedInboundWireDrawdownRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireDrawdownRequest),
                jacksonTypeRef<InboundWireDrawdownRequest>(),
            )

        assertThat(roundtrippedInboundWireDrawdownRequest).isEqualTo(inboundWireDrawdownRequest)
    }
}
