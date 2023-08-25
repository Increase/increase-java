package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferReturnCreateParamsTest {

    @Test
    fun createInboundAchTransferReturnCreateParams() {
        InboundAchTransferReturnCreateParams.builder()
            .reason(InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
            .transactionId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferReturnCreateParams.builder()
                .reason(
                    InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .transactionId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(
                InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
            )
        assertThat(body.transactionId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferReturnCreateParams.builder()
                .reason(
                    InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .transactionId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(
                InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
            )
        assertThat(body.transactionId()).isEqualTo("string")
    }
}
