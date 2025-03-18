// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun create() {
        InboundAchTransferCreateNotificationOfChangeParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
            .updatedAccountNumber("987654321")
            .updatedRoutingNumber("101050001")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .updatedAccountNumber("987654321")
                .updatedRoutingNumber("101050001")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.updatedAccountNumber()).contains("987654321")
        assertThat(body.updatedRoutingNumber()).contains("101050001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
