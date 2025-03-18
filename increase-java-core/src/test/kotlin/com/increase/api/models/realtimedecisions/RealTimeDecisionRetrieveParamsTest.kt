// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimedecisions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimeDecisionRetrieveParamsTest {

    @Test
    fun create() {
        RealTimeDecisionRetrieveParams.builder()
            .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RealTimeDecisionRetrieveParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("real_time_decision_j76n2e810ezcg3zh5qtn")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
