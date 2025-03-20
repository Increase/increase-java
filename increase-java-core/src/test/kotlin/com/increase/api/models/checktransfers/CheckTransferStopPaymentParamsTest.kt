// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTransferStopPaymentParamsTest {

    @Test
    fun create() {
        CheckTransferStopPaymentParams.builder()
            .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
            .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("check_transfer_30b43acfu9vw8fyc4f5")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                .build()

        val body = params._body()

        assertThat(body.reason())
            .contains(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .build()

        val body = params._body()
    }
}
