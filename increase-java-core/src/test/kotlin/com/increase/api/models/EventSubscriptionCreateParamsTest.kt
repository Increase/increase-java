// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
        EventSubscriptionCreateParams.builder()
            .url("string")
            .selectedEventCategory(
                EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
            )
            .sharedSecret("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EventSubscriptionCreateParams.builder()
                .url("string")
                .selectedEventCategory(
                    EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
                )
                .sharedSecret("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("string")
        assertThat(body.selectedEventCategory())
            .isEqualTo(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
        assertThat(body.sharedSecret()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EventSubscriptionCreateParams.builder().url("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("string")
    }
}
