package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferReturnCreateParamsTest {

    @Test
    fun createInboundAchTransferReturnCreateParams() {
        InboundAchTransferReturnCreateParams.builder()
            .transactionId("string")
            .reason(InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferReturnCreateParams.builder()
                .transactionId("string")
                .reason(
                    InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("string")
        assertThat(body.reason())
            .isEqualTo(
                InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferReturnCreateParams.builder()
                .transactionId("string")
                .reason(
                    InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.transactionId()).isEqualTo("string")
        assertThat(body.reason())
            .isEqualTo(
                InboundAchTransferReturnCreateParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
            )
    }
}
