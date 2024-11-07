// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferStopPaymentParamsTest {

    @Test
    fun createCheckTransferStopPaymentParams() {
        CheckTransferStopPaymentParams.builder()
            .checkTransferId("check_transfer_id")
            .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_id")
                .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason())
            .isEqualTo(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CheckTransferStopPaymentParams.builder().checkTransferId("check_transfer_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CheckTransferStopPaymentParams.builder().checkTransferId("check_transfer_id").build()
        assertThat(params).isNotNull
        // path param "checkTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("check_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
