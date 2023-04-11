package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.models.*
import com.increase.api.models.LimitUpdateParams.LimitUpdateBody

class LimitUpdateParamsTest {

    @Test
    fun createLimitUpdateParams() {
      LimitUpdateParams.builder()
          .limitId("string")
          .status(LimitUpdateParams.Status.INACTIVE)
          .build()
    }

    @Test
    fun getBody() {
      val params = LimitUpdateParams.builder()
          .limitId("string")
          .status(LimitUpdateParams.Status.INACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.status()).isEqualTo(LimitUpdateParams.Status.INACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = LimitUpdateParams.builder()
          .limitId("string")
          .status(LimitUpdateParams.Status.INACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.status()).isEqualTo(LimitUpdateParams.Status.INACTIVE)
    }

    @Test
    fun getPathParam() {
      val params = LimitUpdateParams.builder()
          .limitId("string")
          .status(LimitUpdateParams.Status.INACTIVE)
          .build()
      assertThat(params).isNotNull
      // path param "limitId"
      assertThat(params.getPathParam(0)).isEqualTo("string")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
