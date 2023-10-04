// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferTransferReturnParamsTest {

    @Test
    fun createInboundAchTransferTransferReturnParams() {
        InboundAchTransferTransferReturnParams.builder()
            .inboundAchTransferId("string")
            .reason(InboundAchTransferTransferReturnParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("string")
                .reason(
                    InboundAchTransferTransferReturnParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(
                InboundAchTransferTransferReturnParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("string")
                .reason(
                    InboundAchTransferTransferReturnParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(
                InboundAchTransferTransferReturnParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
            )
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("string")
                .reason(
                    InboundAchTransferTransferReturnParams.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                )
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
