// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundRealTimePaymentsTransferReturnParamsTest {

    @Test
    fun create() {
        InboundRealTimePaymentsTransferReturnParams.builder()
            .inboundRealTimePaymentsTransferId(
                "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
            )
            .amount(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundRealTimePaymentsTransferReturnParams.builder()
                .inboundRealTimePaymentsTransferId(
                    "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundRealTimePaymentsTransferReturnParams.builder()
                .inboundRealTimePaymentsTransferId(
                    "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                )
                .amount(1L)
                .build()

        val body = params._body()

        assertThat(body.amount()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundRealTimePaymentsTransferReturnParams.builder()
                .inboundRealTimePaymentsTransferId(
                    "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
                )
                .build()

        val body = params._body()
    }
}
