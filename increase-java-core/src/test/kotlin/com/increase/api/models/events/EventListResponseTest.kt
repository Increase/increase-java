// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListResponseTest {

    @Test
    fun create() {
        val eventListResponse =
            EventListResponse.builder()
                .addData(
                    Event.builder()
                        .id("event_001dzz0r20rzr4zrhrr1364hy80")
                        .associatedObjectId("account_in71c4amph0vgo2qllky")
                        .associatedObjectType("account")
                        .category(Event.Category.ACCOUNT_CREATED)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .type(Event.Type.EVENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(eventListResponse.data())
            .containsExactly(
                Event.builder()
                    .id("event_001dzz0r20rzr4zrhrr1364hy80")
                    .associatedObjectId("account_in71c4amph0vgo2qllky")
                    .associatedObjectType("account")
                    .category(Event.Category.ACCOUNT_CREATED)
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .type(Event.Type.EVENT)
                    .build()
            )
        assertThat(eventListResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.builder()
                .addData(
                    Event.builder()
                        .id("event_001dzz0r20rzr4zrhrr1364hy80")
                        .associatedObjectId("account_in71c4amph0vgo2qllky")
                        .associatedObjectType("account")
                        .category(Event.Category.ACCOUNT_CREATED)
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .type(Event.Type.EVENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }
}
