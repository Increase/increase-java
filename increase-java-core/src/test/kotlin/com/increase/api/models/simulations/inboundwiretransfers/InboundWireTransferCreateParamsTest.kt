// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiretransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferCreateParamsTest {

    @Test
    fun create() {
        InboundWireTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .creditorAddressLine1("x")
            .creditorAddressLine2("x")
            .creditorAddressLine3("x")
            .creditorName("x")
            .debtorAddressLine1("x")
            .debtorAddressLine2("x")
            .debtorAddressLine3("x")
            .debtorName("x")
            .endToEndIdentification("x")
            .instructingAgentRoutingNumber("x")
            .instructionIdentification("x")
            .uniqueEndToEndTransactionReference("x")
            .unstructuredRemittanceInformation("x")
            .wireDrawdownRequestId("wire_drawdown_request_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .creditorAddressLine1("x")
                .creditorAddressLine2("x")
                .creditorAddressLine3("x")
                .creditorName("x")
                .debtorAddressLine1("x")
                .debtorAddressLine2("x")
                .debtorAddressLine3("x")
                .debtorName("x")
                .endToEndIdentification("x")
                .instructingAgentRoutingNumber("x")
                .instructionIdentification("x")
                .uniqueEndToEndTransactionReference("x")
                .unstructuredRemittanceInformation("x")
                .wireDrawdownRequestId("wire_drawdown_request_id")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.creditorAddressLine1()).contains("x")
        assertThat(body.creditorAddressLine2()).contains("x")
        assertThat(body.creditorAddressLine3()).contains("x")
        assertThat(body.creditorName()).contains("x")
        assertThat(body.debtorAddressLine1()).contains("x")
        assertThat(body.debtorAddressLine2()).contains("x")
        assertThat(body.debtorAddressLine3()).contains("x")
        assertThat(body.debtorName()).contains("x")
        assertThat(body.endToEndIdentification()).contains("x")
        assertThat(body.instructingAgentRoutingNumber()).contains("x")
        assertThat(body.instructionIdentification()).contains("x")
        assertThat(body.uniqueEndToEndTransactionReference()).contains("x")
        assertThat(body.unstructuredRemittanceInformation()).contains("x")
        assertThat(body.wireDrawdownRequestId()).contains("wire_drawdown_request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
