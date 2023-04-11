package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.Limit

class LimitTest {

    @Test
    fun createLimit() {
      val limit = Limit.builder()
          .id("string")
          .interval(Limit.Interval.TRANSACTION)
          .metric(Limit.Metric.COUNT)
          .modelId("string")
          .modelType(Limit.ModelType.ACCOUNT)
          .status(Limit.Status.ACTIVE)
          .type(Limit.Type.LIMIT)
          .value(123L)
          .build()
      assertThat(limit).isNotNull
      assertThat(limit.id()).isEqualTo("string")
      assertThat(limit.interval()).contains(Limit.Interval.TRANSACTION)
      assertThat(limit.metric()).isEqualTo(Limit.Metric.COUNT)
      assertThat(limit.modelId()).isEqualTo("string")
      assertThat(limit.modelType()).isEqualTo(Limit.ModelType.ACCOUNT)
      assertThat(limit.status()).isEqualTo(Limit.Status.ACTIVE)
      assertThat(limit.type()).isEqualTo(Limit.Type.LIMIT)
      assertThat(limit.value()).isEqualTo(123L)
    }
}
