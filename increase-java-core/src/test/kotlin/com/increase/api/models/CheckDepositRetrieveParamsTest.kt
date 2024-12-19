// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CheckDepositRetrieveParamsTest {

    @Test
    fun createCheckDepositRetrieveParams() {
        CheckDepositRetrieveParams.builder()
            .checkDepositId("check_deposit_instruction_q2shv7x9qhevfm71kor8")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            CheckDepositRetrieveParams.builder()
                .checkDepositId("check_deposit_instruction_q2shv7x9qhevfm71kor8")
                .build()
        assertThat(params).isNotNull
        // path param "checkDepositId"
        assertThat(params.getPathParam(0))
            .isEqualTo("check_deposit_instruction_q2shv7x9qhevfm71kor8")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
