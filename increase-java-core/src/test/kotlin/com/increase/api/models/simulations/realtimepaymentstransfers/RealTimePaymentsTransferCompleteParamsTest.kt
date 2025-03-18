// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.realtimepaymentstransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsTransferCompleteParamsTest {

    @Test
    fun create() {
        RealTimePaymentsTransferCompleteParams.builder()
            .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
            .rejection(
                RealTimePaymentsTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        RealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                            .ACCOUNT_CLOSED
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .rejection(
                    RealTimePaymentsTransferCompleteParams.Rejection.builder()
                        .rejectReasonCode(
                            RealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                                .ACCOUNT_CLOSED
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.rejection())
            .contains(
                RealTimePaymentsTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        RealTimePaymentsTransferCompleteParams.Rejection.RejectReasonCode
                            .ACCOUNT_CLOSED
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsTransferCompleteParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                .build()

        val body = params._body()

        assertNotNull(body)
    }
}
