package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.Event

class EventTest {

    @Test
    fun createEvent() {
      val event = Event.builder()
          .associatedObjectId("string")
          .associatedObjectType("string")
          .category(Event.Category.ACCOUNT_CREATED)
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .id("string")
          .type(Event.Type.EVENT)
          .build()
      assertThat(event).isNotNull
      assertThat(event.associatedObjectId()).isEqualTo("string")
      assertThat(event.associatedObjectType()).isEqualTo("string")
      assertThat(event.category()).isEqualTo(Event.Category.ACCOUNT_CREATED)
      assertThat(event.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(event.id()).isEqualTo("string")
      assertThat(event.type()).isEqualTo(Event.Type.EVENT)
    }
}
