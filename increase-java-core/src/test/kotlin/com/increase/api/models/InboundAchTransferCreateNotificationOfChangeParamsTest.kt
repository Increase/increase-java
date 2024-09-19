// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun createInboundAchTransferCreateNotificationOfChangeParams() {
        InboundAchTransferCreateNotificationOfChangeParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_id")
            .updatedAccountNumber("x")
            .updatedRoutingNumber("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .updatedAccountNumber("x")
                .updatedRoutingNumber("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.updatedAccountNumber()).isEqualTo("x")
        assertThat(body.updatedRoutingNumber()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_id")
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
