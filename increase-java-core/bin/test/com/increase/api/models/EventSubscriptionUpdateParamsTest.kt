// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionUpdateParamsTest {

    @Test
    fun createEventSubscriptionUpdateParams() {
        EventSubscriptionUpdateParams.builder()
            .eventSubscriptionId("event_subscription_id")
            .status(EventSubscriptionUpdateParams.Status.ACTIVE)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_id")
                .status(EventSubscriptionUpdateParams.Status.ACTIVE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.status()).isEqualTo(EventSubscriptionUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            EventSubscriptionUpdateParams.builder()
                .eventSubscriptionId("event_subscription_id")
                .build()
        assertThat(params).isNotNull
        // path param "eventSubscriptionId"
        assertThat(params.getPathParam(0)).isEqualTo("event_subscription_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
