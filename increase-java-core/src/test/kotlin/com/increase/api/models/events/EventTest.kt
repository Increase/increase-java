// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventTest {

    @Test
    fun createEvent() {
      val event = Event.builder()
          .id("event_001dzz0r20rzr4zrhrr1364hy80")
          .associatedObjectId("account_in71c4amph0vgo2qllky")
          .associatedObjectType("account")
          .category(Event.Category.ACCOUNT_CREATED)
          .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .type(Event.Type.EVENT)
          .build()
      assertThat(event).isNotNull
      assertThat(event.id()).isEqualTo("event_001dzz0r20rzr4zrhrr1364hy80")
      assertThat(event.associatedObjectId()).isEqualTo("account_in71c4amph0vgo2qllky")
      assertThat(event.associatedObjectType()).isEqualTo("account")
      assertThat(event.category()).isEqualTo(Event.Category.ACCOUNT_CREATED)
      assertThat(event.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
      assertThat(event.type()).isEqualTo(Event.Type.EVENT)
    }
}
