package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventTest {

    @Test
    fun createEvent() {
        val event =
            Event.builder()
                .id("string")
                .associatedObjectId("string")
                .associatedObjectType("string")
                .category(Event.Category.ACCOUNT_CREATED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(Event.Type.EVENT)
                .build()
        assertThat(event).isNotNull
        assertThat(event.id()).isEqualTo("string")
        assertThat(event.associatedObjectId()).isEqualTo("string")
        assertThat(event.associatedObjectType()).isEqualTo("string")
        assertThat(event.category()).isEqualTo(Event.Category.ACCOUNT_CREATED)
        assertThat(event.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.type()).isEqualTo(Event.Type.EVENT)
    }
}
