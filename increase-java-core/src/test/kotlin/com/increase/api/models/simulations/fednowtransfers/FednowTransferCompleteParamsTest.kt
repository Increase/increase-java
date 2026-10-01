// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.fednowtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FednowTransferCompleteParamsTest {

    @Test
    fun create() {
        FednowTransferCompleteParams.builder()
            .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
            .rejection(
                FednowTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        FednowTransferCompleteParams.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FednowTransferCompleteParams.builder()
                .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fednow_transfer_4i0mptrdu1mueg1196bg")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FednowTransferCompleteParams.builder()
                .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
                .rejection(
                    FednowTransferCompleteParams.Rejection.builder()
                        .rejectReasonCode(
                            FednowTransferCompleteParams.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.rejection())
            .contains(
                FednowTransferCompleteParams.Rejection.builder()
                    .rejectReasonCode(
                        FednowTransferCompleteParams.Rejection.RejectReasonCode.ACCOUNT_CLOSED
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FednowTransferCompleteParams.builder()
                .fednowTransferId("fednow_transfer_4i0mptrdu1mueg1196bg")
                .build()

        val body = params._body()
    }
}
