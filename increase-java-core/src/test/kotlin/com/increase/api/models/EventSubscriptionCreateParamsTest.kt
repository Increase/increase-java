package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.EventSubscriptionCreateParams.EventSubscriptionCreateBody

class EventSubscriptionCreateParamsTest {

    @Test
    fun createEventSubscriptionCreateParams() {
      EventSubscriptionCreateParams.builder()
          .url("string")
          .sharedSecret("x")
          .selectedEventCategory(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
          .build()
    }

    @Test
    fun getBody() {
      val params = EventSubscriptionCreateParams.builder()
          .url("string")
          .sharedSecret("x")
          .selectedEventCategory(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.url()).isEqualTo("string")
      assertThat(body.sharedSecret()).isEqualTo("x")
      assertThat(body.selectedEventCategory()).isEqualTo(EventSubscriptionCreateParams.SelectedEventCategory.ACCOUNT_CREATED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = EventSubscriptionCreateParams.builder()
          .url("string")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.url()).isEqualTo("string")
    }
}
