// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionRetrieveParamsTest {

    @Test
    fun create() {
        EventSubscriptionRetrieveParams.builder()
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventSubscriptionRetrieveParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
