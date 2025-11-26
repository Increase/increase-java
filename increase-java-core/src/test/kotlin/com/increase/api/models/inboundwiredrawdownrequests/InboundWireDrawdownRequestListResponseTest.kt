// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireDrawdownRequestListResponseTest {

    @Test
    fun create() {
        val inboundWireDrawdownRequestListResponse =
            InboundWireDrawdownRequestListResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundWireDrawdownRequestListResponse.data())
            .containsExactly(
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
            )
        assertThat(inboundWireDrawdownRequestListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundWireDrawdownRequestListResponse =
            InboundWireDrawdownRequestListResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedInboundWireDrawdownRequestListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireDrawdownRequestListResponse),
                jacksonTypeRef<InboundWireDrawdownRequestListResponse>(),
            )

        assertThat(roundtrippedInboundWireDrawdownRequestListResponse)
            .isEqualTo(inboundWireDrawdownRequestListResponse)
    }
}
