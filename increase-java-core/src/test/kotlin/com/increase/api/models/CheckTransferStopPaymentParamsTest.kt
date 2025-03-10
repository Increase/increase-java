// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckTransferStopPaymentParamsTest {

    @Test
    fun create() {
        CheckTransferStopPaymentParams.builder()
            .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
            .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
            .build()
    }

    @Test
    fun body() {
        val params =
            CheckTransferStopPaymentParams.builder()
                .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                .build()

        val body = params._body()

        assertNotNull(body)
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

        assertNotNull(body)
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
