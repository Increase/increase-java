// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionRetrieveParamsTest {

    @Test
    fun createEventSubscriptionRetrieveParams() {
        EventSubscriptionRetrieveParams.builder()
            .eventSubscriptionId("event_subscription_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionRetrieveParams.builder()
                .eventSubscriptionId("event_subscription_id")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("event_subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
