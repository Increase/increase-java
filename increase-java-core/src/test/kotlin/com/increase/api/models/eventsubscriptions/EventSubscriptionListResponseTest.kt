// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventSubscriptionListResponseTest {

    @Test
    fun create() {
        val eventSubscriptionListResponse =
            EventSubscriptionListResponse.builder()
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

        assertThat(eventSubscriptionListResponse.data())
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
        assertThat(eventSubscriptionListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventSubscriptionListResponse =
            EventSubscriptionListResponse.builder()
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

        val roundtrippedEventSubscriptionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventSubscriptionListResponse),
                jacksonTypeRef<EventSubscriptionListResponse>(),
            )

        assertThat(roundtrippedEventSubscriptionListResponse)
            .isEqualTo(eventSubscriptionListResponse)
    }
}
