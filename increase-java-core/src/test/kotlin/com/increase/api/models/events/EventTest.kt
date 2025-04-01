// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventTest {

    @Test
    fun create() {
        val event =
            Event.builder()
                .id("event_001dzz0r20rzr4zrhrr1364hy80")
                .associatedObjectId("account_in71c4amph0vgo2qllky")
                .associatedObjectType("account")
                .category(Event.Category.ACCOUNT_CREATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(Event.Type.EVENT)
                .build()

        assertThat(event.id()).isEqualTo("event_001dzz0r20rzr4zrhrr1364hy80")
        assertThat(event.associatedObjectId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(event.associatedObjectType()).isEqualTo("account")
        assertThat(event.category()).isEqualTo(Event.Category.ACCOUNT_CREATED)
        assertThat(event.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(event.type()).isEqualTo(Event.Type.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val event =
            Event.builder()
                .id("event_001dzz0r20rzr4zrhrr1364hy80")
                .associatedObjectId("account_in71c4amph0vgo2qllky")
                .associatedObjectType("account")
                .category(Event.Category.ACCOUNT_CREATED)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(Event.Type.EVENT)
                .build()

        val roundtrippedEvent =
            jsonMapper.readValue(jsonMapper.writeValueAsString(event), jacksonTypeRef<Event>())

        assertThat(roundtrippedEvent).isEqualTo(event)
    }
}
