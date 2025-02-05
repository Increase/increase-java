// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationRealTimePaymentsTransferCompleteParamsTest {

    @Test
    fun create() {
        SimulationRealTimePaymentsTransferCompleteParams.builder()
            .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
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
    fun body() {
        val params =
            SimulationRealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.rejection())
            .contains(
                SimulationRealTimePaymentsTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        SimulationRealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                            .ACCOUNT_CLOSED
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationRealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationRealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .build()
        assertThat(params).isNotNull
        // path param "realTimePaymentsTransferId"
        assertThat(params.getPathParam(0))
            .isEqualTo("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
