// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionListPageResponseTest {

    @Test
    fun create() {
        val eventSubscriptionListPageResponse =
            EventSubscriptionListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(eventSubscriptionListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(eventSubscriptionListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventSubscriptionListPageResponse =
            EventSubscriptionListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedEventSubscriptionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventSubscriptionListPageResponse),
                jacksonTypeRef<EventSubscriptionListPageResponse>(),
            )

        assertThat(roundtrippedEventSubscriptionListPageResponse)
            .isEqualTo(eventSubscriptionListPageResponse)
    }
}
