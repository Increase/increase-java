// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestTest {

    @Test
    fun createWireDrawdownRequest() {
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .id("string")
                .accountNumberId("string")
                .amount(123L)
                .currency("string")
                .fulfillmentTransactionId("string")
                .messageToRecipient("string")
                .recipientAccountNumber("string")
                .recipientAddressLine1("string")
                .recipientAddressLine2("string")
                .recipientAddressLine3("string")
                .recipientName("string")
                .recipientRoutingNumber("string")
                .status(WireDrawdownRequest.Status.PENDING_SUBMISSION)
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("string")
                        .build()
                )
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .build()
        assertThat(wireDrawdownRequest).isNotNull
        assertThat(wireDrawdownRequest.id()).isEqualTo("string")
        assertThat(wireDrawdownRequest.accountNumberId()).isEqualTo("string")
        assertThat(wireDrawdownRequest.amount()).isEqualTo(123L)
        assertThat(wireDrawdownRequest.currency()).isEqualTo("string")
        assertThat(wireDrawdownRequest.fulfillmentTransactionId()).contains("string")
        assertThat(wireDrawdownRequest.messageToRecipient()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAccountNumber()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine1()).contains("string")
        assertThat(wireDrawdownRequest.recipientAddressLine2()).contains("string")
        assertThat(wireDrawdownRequest.recipientAddressLine3()).contains("string")
        assertThat(wireDrawdownRequest.recipientName()).contains("string")
        assertThat(wireDrawdownRequest.recipientRoutingNumber()).isEqualTo("string")
        assertThat(wireDrawdownRequest.status())
            .isEqualTo(WireDrawdownRequest.Status.PENDING_SUBMISSION)
        assertThat(wireDrawdownRequest.submission())
            .contains(
                WireDrawdownRequest.Submission.builder()
                    .inputMessageAccountabilityData("string")
                    .build()
            )
        assertThat(wireDrawdownRequest.type())
            .isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
    }
}
