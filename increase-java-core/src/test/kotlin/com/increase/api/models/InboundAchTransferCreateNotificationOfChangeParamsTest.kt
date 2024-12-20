// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun createInboundAchTransferCreateNotificationOfChangeParams() {
        InboundAchTransferCreateNotificationOfChangeParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
            .updatedAccountNumber("987654321")
            .updatedRoutingNumber("101050001")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .updatedAccountNumber("987654321")
                .updatedRoutingNumber("101050001")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.updatedAccountNumber()).contains("987654321")
        assertThat(body.updatedRoutingNumber()).contains("101050001")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
