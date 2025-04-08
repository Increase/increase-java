// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionTest {

    @Test
    fun create() {
        val eventSubscription =
            EventSubscription.builder()
                .id("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .oauthConnectionId(null)
                .selectedEventCategory(null)
                .status(EventSubscription.Status.ACTIVE)
                .type(EventSubscription.Type.EVENT_SUBSCRIPTION)
                .url("https://website.com/webhooks")
                .build()

        assertThat(eventSubscription.id())
            .isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        assertThat(eventSubscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(eventSubscription.idempotencyKey()).isEmpty
        assertThat(eventSubscription.oauthConnectionId()).isEmpty
        assertThat(eventSubscription.selectedEventCategory()).isEmpty
        assertThat(eventSubscription.status()).isEqualTo(EventSubscription.Status.ACTIVE)
        assertThat(eventSubscription.type()).isEqualTo(EventSubscription.Type.EVENT_SUBSCRIPTION)
        assertThat(eventSubscription.url()).isEqualTo("https://website.com/webhooks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventSubscription =
            EventSubscription.builder()
                .id("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .idempotencyKey(null)
                .oauthConnectionId(null)
                .selectedEventCategory(null)
                .status(EventSubscription.Status.ACTIVE)
                .type(EventSubscription.Type.EVENT_SUBSCRIPTION)
                .url("https://website.com/webhooks")
                .build()

        val roundtrippedEventSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventSubscription),
                jacksonTypeRef<EventSubscription>(),
            )

        assertThat(roundtrippedEventSubscription).isEqualTo(eventSubscription)
    }
}
