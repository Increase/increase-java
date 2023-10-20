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
            .reason(InboundAchTransferTransferReturnParams.Reason.RETURNED_PER_ODFI_REQUEST)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("string")
                .reason(InboundAchTransferTransferReturnParams.Reason.RETURNED_PER_ODFI_REQUEST)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(InboundAchTransferTransferReturnParams.Reason.RETURNED_PER_ODFI_REQUEST)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("string")
                .reason(InboundAchTransferTransferReturnParams.Reason.RETURNED_PER_ODFI_REQUEST)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(InboundAchTransferTransferReturnParams.Reason.RETURNED_PER_ODFI_REQUEST)
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("string")
                .reason(InboundAchTransferTransferReturnParams.Reason.RETURNED_PER_ODFI_REQUEST)
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
