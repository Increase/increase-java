// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionRetrieveParamsTest {

    @Test
    fun createRealTimeDecisionRetrieveParams() {
        RealTimeDecisionRetrieveParams.builder()
            .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            RealTimeDecisionRetrieveParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .build()
        assertThat(params).isNotNull
        // path param "realTimeDecisionId"
        assertThat(params.getPathParam(0)).isEqualTo("real_time_decision_j76n2e810ezcg3zh5qtn")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
