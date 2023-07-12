package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferCreateParamsTest {

    @Test
    fun createRealTimePaymentsTransferCreateParams() {
        RealTimePaymentsTransferCreateParams.builder()
            .sourceAccountNumberId("string")
            .destinationAccountNumber("x")
            .destinationRoutingNumber("xxxxxxxxx")
            .externalAccountId("string")
            .amount(123L)
            .creditorName("x")
            .remittanceInformation("x")
            .requireApproval(true)
            .uniqueIdentifier("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .sourceAccountNumberId("string")
                .destinationAccountNumber("x")
                .destinationRoutingNumber("xxxxxxxxx")
                .externalAccountId("string")
                .amount(123L)
                .creditorName("x")
                .remittanceInformation("x")
                .requireApproval(true)
                .uniqueIdentifier("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.sourceAccountNumberId()).isEqualTo("string")
        assertThat(body.destinationAccountNumber()).isEqualTo("x")
        assertThat(body.destinationRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.externalAccountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.creditorName()).isEqualTo("x")
        assertThat(body.remittanceInformation()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.uniqueIdentifier()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .sourceAccountNumberId("string")
                .amount(123L)
                .creditorName("x")
                .remittanceInformation("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.sourceAccountNumberId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.creditorName()).isEqualTo("x")
        assertThat(body.remittanceInformation()).isEqualTo("x")
    }
}
