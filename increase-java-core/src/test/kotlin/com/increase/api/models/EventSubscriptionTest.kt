package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.EventSubscription

class EventSubscriptionTest {

    @Test
    fun createEventSubscription() {
      val eventSubscription = EventSubscription.builder()
          .id("string")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .status(EventSubscription.Status.ACTIVE)
          .selectedEventCategory(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
          .url("string")
          .sharedSecret("string")
          .type(EventSubscription.Type.EVENT_SUBSCRIPTION)
          .build()
      assertThat(eventSubscription).isNotNull
      assertThat(eventSubscription.id()).isEqualTo("string")
      assertThat(eventSubscription.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(eventSubscription.status()).isEqualTo(EventSubscription.Status.ACTIVE)
      assertThat(eventSubscription.selectedEventCategory()).contains(EventSubscription.SelectedEventCategory.ACCOUNT_CREATED)
      assertThat(eventSubscription.url()).isEqualTo("string")
      assertThat(eventSubscription.sharedSecret()).isEqualTo("string")
      assertThat(eventSubscription.type()).isEqualTo(EventSubscription.Type.EVENT_SUBSCRIPTION)
    }
}
