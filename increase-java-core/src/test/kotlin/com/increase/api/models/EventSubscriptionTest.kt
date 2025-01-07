// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
        val eventSubscription =
            EventSubscription.builder()
                .id("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .oauthConnectionId(null)
                .selectedEventCategory(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
                .status(EventSubscription.Status.ACTIVE)
                .type(EventSubscription.Type.EVENT_SUBSCRIPTION)
                .url("https://website.com/webhooks")
                .build()
        assertThat(eventSubscription).isNotNull
        assertThat(eventSubscription.id())
            .isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        assertThat(eventSubscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(eventSubscription.idempotencyKey()).isEmpty
        assertThat(eventSubscription.oauthConnectionId()).isEmpty
        assertThat(eventSubscription.selectedEventCategory())
            .contains(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
        assertThat(eventSubscription.status()).isEqualTo(EventSubscription.Status.ACTIVE)
        assertThat(eventSubscription.type()).isEqualTo(EventSubscription.Type.EVENT_SUBSCRIPTION)
        assertThat(eventSubscription.url()).isEqualTo("https://website.com/webhooks")
    }
}
