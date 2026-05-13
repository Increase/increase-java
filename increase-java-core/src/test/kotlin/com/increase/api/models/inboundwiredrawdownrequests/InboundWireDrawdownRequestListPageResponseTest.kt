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
                        .inputMessageAccountabilityData("20220118MMQFMP0P000001")
                        .instructionIdentification("202201180000001")
                        .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                        .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                        .unstructuredRemittanceInformation("INVOICE 2468")
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(inboundWireDrawdownRequestListPageResponse.data())
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
                    .inputMessageAccountabilityData("20220118MMQFMP0P000001")
                    .instructionIdentification("202201180000001")
                    .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                    .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                    .unstructuredRemittanceInformation("INVOICE 2468")
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
                        .inputMessageAccountabilityData("20220118MMQFMP0P000001")
                        .instructionIdentification("202201180000001")
                        .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .type(InboundWireDrawdownRequest.Type.INBOUND_WIRE_DRAWDOWN_REQUEST)
                        .uniqueEndToEndTransactionReference("9a21e10a-7600-4a24-8ff3-2cbc5943c27a")
                        .unstructuredRemittanceInformation("INVOICE 2468")
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
