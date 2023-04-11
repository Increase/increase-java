package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class LimitListParamsTest {

    @Test
    fun createLimitListParams() {
      LimitListParams.builder()
          .cursor("string")
          .limit(123L)
          .modelId("x")
          .status("x")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = LimitListParams.builder()
          .cursor("string")
          .limit(123L)
          .modelId("x")
          .status("x")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("string"))
      expected.put("limit", listOf("123"))
      expected.put("model_id", listOf("x"))
      expected.put("status", listOf("x"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = LimitListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
