// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionRetrieveParamsTest {

    @Test
    fun createRealTimeDecisionRetrieveParams() {
        RealTimeDecisionRetrieveParams.builder().realTimeDecisionId("real_time_decision_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimeDecisionRetrieveParams.builder()
                .realTimeDecisionId("real_time_decision_id")
                .build()
        assertThat(params).isNotNull
        // path param "realTimeDecisionId"
        assertThat(params.getPathParam(0)).isEqualTo("real_time_decision_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
