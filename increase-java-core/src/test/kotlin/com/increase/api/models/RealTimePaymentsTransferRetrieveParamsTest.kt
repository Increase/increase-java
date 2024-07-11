// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimePaymentsTransferRetrieveParamsTest {

    @Test
    fun createRealTimePaymentsTransferRetrieveParams() {
        RealTimePaymentsTransferRetrieveParams.builder()
            .realTimePaymentsTransferId("real_time_payments_transfer_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimePaymentsTransferRetrieveParams.builder()
                .realTimePaymentsTransferId("real_time_payments_transfer_id")
                .build()
        assertThat(params).isNotNull
        // path param "realTimePaymentsTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("real_time_payments_transfer_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
