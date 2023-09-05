package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferNotificationOfChangeParamsTest {

    @Test
    fun createInboundAchTransferNotificationOfChangeParams() {
        InboundAchTransferNotificationOfChangeParams.builder()
            .inboundAchTransferId("string")
            .updatedAccountNumber("x")
            .updatedRoutingNumber("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferNotificationOfChangeParams.builder()
                .inboundAchTransferId("string")
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
            InboundAchTransferNotificationOfChangeParams.builder()
                .inboundAchTransferId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferNotificationOfChangeParams.builder()
                .inboundAchTransferId("string")
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
