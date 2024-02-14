// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferCreateParamsTest {

    @Test
    fun createRealTimePaymentsTransferCreateParams() {
        RealTimePaymentsTransferCreateParams.builder()
            .amount(123L)
            .creditorName("x")
            .remittanceInformation("x")
            .sourceAccountNumberId("string")
            .debtorName("x")
            .destinationAccountNumber("x")
            .destinationRoutingNumber("xxxxxxxxx")
            .externalAccountId("string")
            .requireApproval(true)
            .ultimateCreditorName("x")
            .ultimateDebtorName("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(123L)
                .creditorName("x")
                .remittanceInformation("x")
                .sourceAccountNumberId("string")
                .debtorName("x")
                .destinationAccountNumber("x")
                .destinationRoutingNumber("xxxxxxxxx")
                .externalAccountId("string")
                .requireApproval(true)
                .ultimateCreditorName("x")
                .ultimateDebtorName("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.creditorName()).isEqualTo("x")
        assertThat(body.remittanceInformation()).isEqualTo("x")
        assertThat(body.sourceAccountNumberId()).isEqualTo("string")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.destinationAccountNumber()).isEqualTo("x")
        assertThat(body.destinationRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.externalAccountId()).isEqualTo("string")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.ultimateCreditorName()).isEqualTo("x")
        assertThat(body.ultimateDebtorName()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(123L)
                .creditorName("x")
                .remittanceInformation("x")
                .sourceAccountNumberId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.creditorName()).isEqualTo("x")
        assertThat(body.remittanceInformation()).isEqualTo("x")
        assertThat(body.sourceAccountNumberId()).isEqualTo("string")
    }
}
