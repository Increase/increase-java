// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
        EventSubscriptionCreateParams.builder()
            .url("https://website.com/webhooks")
            .oauthConnectionId("oauth_connection_id")
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
                .url("https://website.com/webhooks")
                .oauthConnectionId("oauth_connection_id")
                .selectedEventCategory(
                    EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED
                )
                .sharedSecret("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://website.com/webhooks")
        assertThat(body.oauthConnectionId()).isEqualTo("oauth_connection_id")
        assertThat(body.selectedEventCategory())
            .isEqualTo(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
        assertThat(body.sharedSecret()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            EventSubscriptionCreateParams.builder().url("https://website.com/webhooks").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.url()).isEqualTo("https://website.com/webhooks")
    }
}
