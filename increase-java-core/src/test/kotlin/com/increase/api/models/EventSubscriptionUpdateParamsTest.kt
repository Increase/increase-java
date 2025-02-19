// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionUpdateParamsTest {

    @Test
    fun create() {
        EventSubscriptionUpdateParams.builder()
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .status(EventSubscriptionUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .status(EventSubscriptionUpdateParams.Status.ACTIVE)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.status()).contains(EventSubscriptionUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionId"
        assertThat(params.getPathParam(0))
            .isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
