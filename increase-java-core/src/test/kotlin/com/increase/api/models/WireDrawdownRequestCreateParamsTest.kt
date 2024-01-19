// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestCreateParamsTest {

    @Test
    fun createWireDrawdownRequestCreateParams() {
        WireDrawdownRequestCreateParams.builder()
            .accountNumberId("string")
            .amount(123L)
            .messageToRecipient("x")
            .recipientAccountNumber("x")
            .recipientName("x")
            .recipientRoutingNumber("xxxxxxxxx")
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .recipientAddressLine1("x")
            .recipientAddressLine2("x")
            .recipientAddressLine3("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            WireDrawdownRequestCreateParams.builder()
                .accountNumberId("string")
                .amount(123L)
                .messageToRecipient("x")
                .recipientAccountNumber("x")
                .recipientName("x")
                .recipientRoutingNumber("xxxxxxxxx")
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .recipientAddressLine1("x")
                .recipientAddressLine2("x")
                .recipientAddressLine3("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.messageToRecipient()).isEqualTo("x")
        assertThat(body.recipientAccountNumber()).isEqualTo("x")
        assertThat(body.recipientName()).isEqualTo("x")
        assertThat(body.recipientRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.originatorAddressLine1()).isEqualTo("x")
        assertThat(body.originatorAddressLine2()).isEqualTo("x")
        assertThat(body.originatorAddressLine3()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("x")
        assertThat(body.recipientAddressLine1()).isEqualTo("x")
        assertThat(body.recipientAddressLine2()).isEqualTo("x")
        assertThat(body.recipientAddressLine3()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            WireDrawdownRequestCreateParams.builder()
                .accountNumberId("string")
                .amount(123L)
                .messageToRecipient("x")
                .recipientAccountNumber("x")
                .recipientName("x")
                .recipientRoutingNumber("xxxxxxxxx")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.messageToRecipient()).isEqualTo("x")
        assertThat(body.recipientAccountNumber()).isEqualTo("x")
        assertThat(body.recipientName()).isEqualTo("x")
        assertThat(body.recipientRoutingNumber()).isEqualTo("xxxxxxxxx")
    }
}
