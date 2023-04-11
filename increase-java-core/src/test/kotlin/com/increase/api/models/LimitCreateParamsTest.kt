package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.LimitCreateParams.LimitCreateBody

class LimitCreateParamsTest {

    @Test
    fun createLimitCreateParams() {
      LimitCreateParams.builder()
          .metric(LimitCreateParams.Metric.COUNT)
          .interval(LimitCreateParams.Interval.TRANSACTION)
          .modelId("x")
          .value(123L)
          .build()
    }

    @Test
    fun getBody() {
      val params = LimitCreateParams.builder()
          .metric(LimitCreateParams.Metric.COUNT)
          .interval(LimitCreateParams.Interval.TRANSACTION)
          .modelId("x")
          .value(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.metric()).isEqualTo(LimitCreateParams.Metric.COUNT)
      assertThat(body.interval()).isEqualTo(LimitCreateParams.Interval.TRANSACTION)
      assertThat(body.modelId()).isEqualTo("x")
      assertThat(body.value()).isEqualTo(123L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = LimitCreateParams.builder()
          .metric(LimitCreateParams.Metric.COUNT)
          .modelId("x")
          .value(123L)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.metric()).isEqualTo(LimitCreateParams.Metric.COUNT)
      assertThat(body.modelId()).isEqualTo("x")
      assertThat(body.value()).isEqualTo(123L)
    }
}
