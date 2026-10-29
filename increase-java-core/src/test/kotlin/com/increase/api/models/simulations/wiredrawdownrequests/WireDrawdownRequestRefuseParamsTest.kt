// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.wiredrawdownrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestRefuseParamsTest {

    @Test
    fun create() {
        WireDrawdownRequestRefuseParams.builder()
            .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
            .refusalReasonAdditionalInformation("x")
            .refusalReasonCode(
                WireDrawdownRequestRefuseParams.RefusalReasonCode.INVALID_DEBTOR_ACCOUNT_NUMBER
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WireDrawdownRequestRefuseParams.builder()
                .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WireDrawdownRequestRefuseParams.builder()
                .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .refusalReasonAdditionalInformation("x")
                .refusalReasonCode(
                    WireDrawdownRequestRefuseParams.RefusalReasonCode.INVALID_DEBTOR_ACCOUNT_NUMBER
                )
                .build()

        val body = params._body()

        assertThat(body.refusalReasonAdditionalInformation()).contains("x")
        assertThat(body.refusalReasonCode())
            .contains(
                WireDrawdownRequestRefuseParams.RefusalReasonCode.INVALID_DEBTOR_ACCOUNT_NUMBER
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WireDrawdownRequestRefuseParams.builder()
                .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .build()

        val body = params._body()
    }
}
