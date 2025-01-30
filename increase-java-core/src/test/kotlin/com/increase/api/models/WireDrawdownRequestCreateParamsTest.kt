// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestCreateParamsTest {

    @Test
    fun createWireDrawdownRequestCreateParams() {
        WireDrawdownRequestCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(10000L)
            .messageToRecipient("Invoice 29582")
            .recipientAccountNumber("987654321")
            .recipientName("Ian Crease")
            .recipientRoutingNumber("101050001")
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .recipientAddressLine1("33 Liberty Street")
            .recipientAddressLine2("New York, NY, 10045")
            .recipientAddressLine3("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            WireDrawdownRequestCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .messageToRecipient("Invoice 29582")
                .recipientAccountNumber("987654321")
                .recipientName("Ian Crease")
                .recipientRoutingNumber("101050001")
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .recipientAddressLine1("33 Liberty Street")
                .recipientAddressLine2("New York, NY, 10045")
                .recipientAddressLine3("x")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.messageToRecipient()).isEqualTo("Invoice 29582")
        assertThat(body.recipientAccountNumber()).isEqualTo("987654321")
        assertThat(body.recipientName()).isEqualTo("Ian Crease")
        assertThat(body.recipientRoutingNumber()).isEqualTo("101050001")
        assertThat(body.originatorAddressLine1()).contains("x")
        assertThat(body.originatorAddressLine2()).contains("x")
        assertThat(body.originatorAddressLine3()).contains("x")
        assertThat(body.originatorName()).contains("x")
        assertThat(body.recipientAddressLine1()).contains("33 Liberty Street")
        assertThat(body.recipientAddressLine2()).contains("New York, NY, 10045")
        assertThat(body.recipientAddressLine3()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WireDrawdownRequestCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .messageToRecipient("Invoice 29582")
                .recipientAccountNumber("987654321")
                .recipientName("Ian Crease")
                .recipientRoutingNumber("101050001")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.messageToRecipient()).isEqualTo("Invoice 29582")
        assertThat(body.recipientAccountNumber()).isEqualTo("987654321")
        assertThat(body.recipientName()).isEqualTo("Ian Crease")
        assertThat(body.recipientRoutingNumber()).isEqualTo("101050001")
    }
}
