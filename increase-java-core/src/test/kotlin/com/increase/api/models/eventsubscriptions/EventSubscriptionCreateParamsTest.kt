// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun create() {
        EventSubscriptionCreateParams.builder()
            .url("https://website.com/webhooks")
            .oauthConnectionId("x")
            .selectedEventCategory(
                EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
            )
            .sharedSecret("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            EventSubscriptionCreateParams.builder()
                .url("https://website.com/webhooks")
                .oauthConnectionId("x")
                .selectedEventCategory(
                    EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
                )
                .sharedSecret("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.url()).isEqualTo("https://website.com/webhooks")
        assertThat(body.oauthConnectionId()).contains("x")
        assertThat(body.selectedEventCategory())
            .contains(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
        assertThat(body.sharedSecret()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventSubscriptionCreateParams.builder().url("https://website.com/webhooks").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.url()).isEqualTo("https://website.com/webhooks")
    }
}
