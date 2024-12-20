// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferStopPaymentParamsTest {

    @Test
    fun createCheckTransferStopPaymentParams() {
        CheckTransferStopPaymentParams.builder()
            .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
            .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .contains(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .build()
        assertThat(params).isNotNull
        // path param "checkTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("check_transfer_30b43acfu9vw8fyc4f5")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
