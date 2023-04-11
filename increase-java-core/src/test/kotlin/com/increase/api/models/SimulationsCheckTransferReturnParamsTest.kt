package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationsCheckTransferReturnParamsTest {

    @Test
    fun createSimulationsCheckTransferReturnParams() {
        SimulationsCheckTransferReturnParams.builder()
            .checkTransferId("string")
            .reason(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationsCheckTransferReturnParams.builder()
                .checkTransferId("string")
                .reason(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationsCheckTransferReturnParams.builder()
                .checkTransferId("string")
                .reason(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationsCheckTransferReturnParams.builder()
                .checkTransferId("string")
                .reason(SimulationsCheckTransferReturnParams.Reason.MAIL_DELIVERY_FAILURE)
                .build()
        assertThat(params).isNotNull
        // path param "checkTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
