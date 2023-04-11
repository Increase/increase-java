package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class EventSubscriptionListParamsTest {

    @Test
    fun createEventSubscriptionListParams() {
      EventSubscriptionListParams.builder()
          .cursor("string")
          .limit(123L)
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = EventSubscriptionListParams.builder()
          .cursor("string")
          .limit(123L)
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("string"))
      expected.put("limit", listOf("123"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = EventSubscriptionListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
