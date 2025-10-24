// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundfednowtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFednowTransferCreateParamsTest {

    @Test
    fun create() {
        InboundFednowTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .debtorAccountNumber("x")
            .debtorName("x")
            .debtorRoutingNumber("xxxxxxxxx")
            .unstructuredRemittanceInformation("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundFednowTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .debtorAccountNumber("x")
                .debtorName("x")
                .debtorRoutingNumber("xxxxxxxxx")
                .unstructuredRemittanceInformation("x")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.debtorAccountNumber()).contains("x")
        assertThat(body.debtorName()).contains("x")
        assertThat(body.debtorRoutingNumber()).contains("xxxxxxxxx")
        assertThat(body.unstructuredRemittanceInformation()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundFednowTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
