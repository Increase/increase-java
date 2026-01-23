// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnwrapWebhookEventTest {

    @Test
    fun create() {
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.builder()
                .id("event_001dzz0r20rzr4zrhrr1364hy80")
                .associatedObjectId("account_in71c4amph0vgo2qllky")
                .associatedObjectType("account")
                .category(UnwrapWebhookEvent.Category.ACCOUNT_CREATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(UnwrapWebhookEvent.Type.EVENT)
                .build()

        assertThat(unwrapWebhookEvent.id()).isEqualTo("event_001dzz0r20rzr4zrhrr1364hy80")
        assertThat(unwrapWebhookEvent.associatedObjectId())
            .isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(unwrapWebhookEvent.associatedObjectType()).isEqualTo("account")
        assertThat(unwrapWebhookEvent.category())
            .isEqualTo(UnwrapWebhookEvent.Category.ACCOUNT_CREATED)
        assertThat(unwrapWebhookEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(unwrapWebhookEvent.type()).isEqualTo(UnwrapWebhookEvent.Type.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.builder()
                .id("event_001dzz0r20rzr4zrhrr1364hy80")
                .associatedObjectId("account_in71c4amph0vgo2qllky")
                .associatedObjectType("account")
                .category(UnwrapWebhookEvent.Category.ACCOUNT_CREATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(UnwrapWebhookEvent.Type.EVENT)
                .build()

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }
}
