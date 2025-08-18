// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestTest {

    @Test
    fun create() {
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorAddress(
                    WireDrawdownRequest.CreditorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .creditorName("Ian Crease")
                .currency("USD")
                .debtorAccountNumber("987654321")
                .debtorAddress(
                    WireDrawdownRequest.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .debtorExternalAccountId(null)
                .debtorName("Ian Crease")
                .debtorRoutingNumber("101050001")
                .fulfillmentInboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .idempotencyKey(null)
                .status(WireDrawdownRequest.Status.FULFILLED)
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                        .build()
                )
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        assertThat(wireDrawdownRequest.id()).isEqualTo("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
        assertThat(wireDrawdownRequest.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(wireDrawdownRequest.amount()).isEqualTo(10000L)
        assertThat(wireDrawdownRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(wireDrawdownRequest.creditorAddress())
            .isEqualTo(
                WireDrawdownRequest.CreditorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(wireDrawdownRequest.creditorName()).isEqualTo("Ian Crease")
        assertThat(wireDrawdownRequest.currency()).isEqualTo("USD")
        assertThat(wireDrawdownRequest.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(wireDrawdownRequest.debtorAddress())
            .isEqualTo(
                WireDrawdownRequest.DebtorAddress.builder()
                    .city("New York")
                    .country("US")
                    .line1("33 Liberty Street")
                    .line2(null)
                    .postalCode("10045")
                    .state("NY")
                    .build()
            )
        assertThat(wireDrawdownRequest.debtorExternalAccountId()).isEmpty
        assertThat(wireDrawdownRequest.debtorName()).isEqualTo("Ian Crease")
        assertThat(wireDrawdownRequest.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(wireDrawdownRequest.fulfillmentInboundWireTransferId())
            .contains("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        assertThat(wireDrawdownRequest.idempotencyKey()).isEmpty
        assertThat(wireDrawdownRequest.status()).isEqualTo(WireDrawdownRequest.Status.FULFILLED)
        assertThat(wireDrawdownRequest.submission())
            .contains(
                WireDrawdownRequest.Submission.builder()
                    .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                    .build()
            )
        assertThat(wireDrawdownRequest.type())
            .isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
        assertThat(wireDrawdownRequest.unstructuredRemittanceInformation())
            .isEqualTo("Invoice 29582")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .creditorAddress(
                    WireDrawdownRequest.CreditorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .creditorName("Ian Crease")
                .currency("USD")
                .debtorAccountNumber("987654321")
                .debtorAddress(
                    WireDrawdownRequest.DebtorAddress.builder()
                        .city("New York")
                        .country("US")
                        .line1("33 Liberty Street")
                        .line2(null)
                        .postalCode("10045")
                        .state("NY")
                        .build()
                )
                .debtorExternalAccountId(null)
                .debtorName("Ian Crease")
                .debtorRoutingNumber("101050001")
                .fulfillmentInboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .idempotencyKey(null)
                .status(WireDrawdownRequest.Status.FULFILLED)
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                        .build()
                )
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val roundtrippedWireDrawdownRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireDrawdownRequest),
                jacksonTypeRef<WireDrawdownRequest>(),
            )

        assertThat(roundtrippedWireDrawdownRequest).isEqualTo(wireDrawdownRequest)
    }
}
