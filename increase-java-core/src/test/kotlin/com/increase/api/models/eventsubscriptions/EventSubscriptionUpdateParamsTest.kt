// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionUpdateParamsTest {

    @Test
    fun create() {
        EventSubscriptionUpdateParams.builder()
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .status(EventSubscriptionUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .status(EventSubscriptionUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body.status()).contains(EventSubscriptionUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .build()

        val body = params._body()
    }
}
