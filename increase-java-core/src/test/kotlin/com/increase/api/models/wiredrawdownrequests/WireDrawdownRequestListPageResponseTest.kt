// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestListPageResponseTest {

    @Test
    fun create() {
        val wireDrawdownRequestListPageResponse =
            WireDrawdownRequestListPageResponse.builder()
                .addData(
                    WireDrawdownRequest.builder()
                        .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(10000L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency("USD")
                        .fulfillmentInboundWireTransferId(
                            "inbound_wire_transfer_f228m6bmhtcxjco9pwp0"
                        )
                        .idempotencyKey(null)
                        .messageToRecipient("Invoice 29582")
                        .originatorAddressLine1(null)
                        .originatorAddressLine2(null)
                        .originatorAddressLine3(null)
                        .originatorName(null)
                        .recipientAccountNumber("987654321")
                        .recipientAddressLine1("33 Liberty Street")
                        .recipientAddressLine2("New York, NY, 10045")
                        .recipientAddressLine3(null)
                        .recipientName("Ian Crease")
                        .recipientRoutingNumber("101050001")
                        .status(WireDrawdownRequest.Status.FULFILLED)
                        .submission(
                            WireDrawdownRequest.Submission.builder()
                                .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                                .build()
                        )
                        .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(wireDrawdownRequestListPageResponse.data())
            .containsExactly(
                WireDrawdownRequest.builder()
                    .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(10000L)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .currency("USD")
                    .fulfillmentInboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                    .idempotencyKey(null)
                    .messageToRecipient("Invoice 29582")
                    .originatorAddressLine1(null)
                    .originatorAddressLine2(null)
                    .originatorAddressLine3(null)
                    .originatorName(null)
                    .recipientAccountNumber("987654321")
                    .recipientAddressLine1("33 Liberty Street")
                    .recipientAddressLine2("New York, NY, 10045")
                    .recipientAddressLine3(null)
                    .recipientName("Ian Crease")
                    .recipientRoutingNumber("101050001")
                    .status(WireDrawdownRequest.Status.FULFILLED)
                    .submission(
                        WireDrawdownRequest.Submission.builder()
                            .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                            .build()
                    )
                    .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                    .build()
            )
        assertThat(wireDrawdownRequestListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireDrawdownRequestListPageResponse =
            WireDrawdownRequestListPageResponse.builder()
                .addData(
                    WireDrawdownRequest.builder()
                        .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                        .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                        .amount(10000L)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .currency("USD")
                        .fulfillmentInboundWireTransferId(
                            "inbound_wire_transfer_f228m6bmhtcxjco9pwp0"
                        )
                        .idempotencyKey(null)
                        .messageToRecipient("Invoice 29582")
                        .originatorAddressLine1(null)
                        .originatorAddressLine2(null)
                        .originatorAddressLine3(null)
                        .originatorName(null)
                        .recipientAccountNumber("987654321")
                        .recipientAddressLine1("33 Liberty Street")
                        .recipientAddressLine2("New York, NY, 10045")
                        .recipientAddressLine3(null)
                        .recipientName("Ian Crease")
                        .recipientRoutingNumber("101050001")
                        .status(WireDrawdownRequest.Status.FULFILLED)
                        .submission(
                            WireDrawdownRequest.Submission.builder()
                                .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                                .build()
                        )
                        .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedWireDrawdownRequestListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireDrawdownRequestListPageResponse),
                jacksonTypeRef<WireDrawdownRequestListPageResponse>(),
            )

        assertThat(roundtrippedWireDrawdownRequestListPageResponse)
            .isEqualTo(wireDrawdownRequestListPageResponse)
    }
}
