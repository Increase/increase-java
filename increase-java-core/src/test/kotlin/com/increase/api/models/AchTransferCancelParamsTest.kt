package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*

class AchTransferCancelParamsTest {

    @Test
    fun createAchTransferCancelParams() {
      AchTransferCancelParams.builder()
          .achTransferId("string")
          .build()
    }

    @Test
    fun getPathParam() {
      val params = AchTransferCancelParams.builder()
          .achTransferId("string")
          .build()
      assertThat(params).isNotNull
      // path param "achTransferId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
