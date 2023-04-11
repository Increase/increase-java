package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class ExternalAccountListParamsTest {

    @Test
    fun createExternalAccountListParams() {
      ExternalAccountListParams.builder()
          .cursor("string")
          .limit(123L)
          .status(ExternalAccountListParams.Status.builder()
              .in_(listOf(ExternalAccountListParams.Status.In.ACTIVE))
              .build())
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = ExternalAccountListParams.builder()
          .cursor("string")
          .limit(123L)
          .status(ExternalAccountListParams.Status.builder()
              .in_(listOf(ExternalAccountListParams.Status.In.ACTIVE))
              .build())
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("string"))
      expected.put("limit", listOf("123"))
      ExternalAccountListParams.Status.builder()
          .in_(listOf(ExternalAccountListParams.Status.In.ACTIVE))
          .build().forEachQueryParam { key, values -> 
          expected.put("status.$key", values)
      }
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = ExternalAccountListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
