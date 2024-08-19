// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestTest {

    @Test
    fun createWireDrawdownRequest() {
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .id("id")
                .accountNumberId("account_number_id")
                .amount(123L)
                .currency("currency")
                .fulfillmentTransactionId("fulfillment_transaction_id")
                .idempotencyKey("idempotency_key")
                .messageToRecipient("message_to_recipient")
                .originatorAddressLine1("originator_address_line1")
                .originatorAddressLine2("originator_address_line2")
                .originatorAddressLine3("originator_address_line3")
                .originatorName("originator_name")
                .recipientAccountNumber("recipient_account_number")
                .recipientAddressLine1("recipient_address_line1")
                .recipientAddressLine2("recipient_address_line2")
                .recipientAddressLine3("recipient_address_line3")
                .recipientName("recipient_name")
                .recipientRoutingNumber("recipient_routing_number")
                .status(WireDrawdownRequest.Status.PENDING_SUBMISSION)
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("input_message_accountability_data")
                        .build()
                )
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .build()
        assertThat(wireDrawdownRequest).isNotNull
        assertThat(wireDrawdownRequest.id()).isEqualTo("id")
        assertThat(wireDrawdownRequest.accountNumberId()).isEqualTo("account_number_id")
        assertThat(wireDrawdownRequest.amount()).isEqualTo(123L)
        assertThat(wireDrawdownRequest.currency()).isEqualTo("currency")
        assertThat(wireDrawdownRequest.fulfillmentTransactionId())
            .contains("fulfillment_transaction_id")
        assertThat(wireDrawdownRequest.idempotencyKey()).contains("idempotency_key")
        assertThat(wireDrawdownRequest.messageToRecipient()).isEqualTo("message_to_recipient")
        assertThat(wireDrawdownRequest.originatorAddressLine1())
            .contains("originator_address_line1")
        assertThat(wireDrawdownRequest.originatorAddressLine2())
            .contains("originator_address_line2")
        assertThat(wireDrawdownRequest.originatorAddressLine3())
            .contains("originator_address_line3")
        assertThat(wireDrawdownRequest.originatorName()).contains("originator_name")
        assertThat(wireDrawdownRequest.recipientAccountNumber())
            .isEqualTo("recipient_account_number")
        assertThat(wireDrawdownRequest.recipientAddressLine1()).contains("recipient_address_line1")
        assertThat(wireDrawdownRequest.recipientAddressLine2()).contains("recipient_address_line2")
        assertThat(wireDrawdownRequest.recipientAddressLine3()).contains("recipient_address_line3")
        assertThat(wireDrawdownRequest.recipientName()).contains("recipient_name")
        assertThat(wireDrawdownRequest.recipientRoutingNumber())
            .isEqualTo("recipient_routing_number")
        assertThat(wireDrawdownRequest.status())
            .isEqualTo(WireDrawdownRequest.Status.PENDING_SUBMISSION)
        assertThat(wireDrawdownRequest.submission())
            .contains(
                WireDrawdownRequest.Submission.builder()
                    .inputMessageAccountabilityData("input_message_accountability_data")
                    .build()
            )
        assertThat(wireDrawdownRequest.type())
            .isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
    }
}
