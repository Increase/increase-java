// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationRealTimePaymentsTransferCompleteParamsTest {

    @Test
    fun createSimulationRealTimePaymentsTransferCompleteParams() {
        SimulationRealTimePaymentsTransferCompleteParams.builder()
            .realTimePaymentsTransferId("real_time_payments_transfer_id")
            .rejection(
                SimulationRealTimePaymentsTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        SimulationRealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                            .ACCOUNT_CLOSED
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationRealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_id")
                .rejection(
                    SimulationRealTimePaymentsTransferCompleteParams.Rejection.builder()
                        .rejectReasonCode(
                            SimulationRealTimePaymentsTransferCompleteParams.Rejection
                                .RejectReasonCode
                                .ACCOUNT_CLOSED
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rejection())
            .isEqualTo(
                SimulationRealTimePaymentsTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        SimulationRealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                            .ACCOUNT_CLOSED
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationRealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationRealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_id")
                .build()
        assertThat(params).isNotNull
        // path param "realTimePaymentsTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("real_time_payments_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
