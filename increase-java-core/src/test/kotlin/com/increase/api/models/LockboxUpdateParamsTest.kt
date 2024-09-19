// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.LockboxUpdateParams
import com.increase.api.models.LockboxUpdateParams.LockboxUpdateBody

class LockboxUpdateParamsTest {

    @Test
    fun createLockboxUpdateParams() {
      LockboxUpdateParams.builder()
          .lockboxId("lockbox_id")
          .description("x")
          .recipientName("x")
          .status(LockboxUpdateParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun getBody() {
      val params = LockboxUpdateParams.builder()
          .lockboxId("lockbox_id")
          .description("x")
          .recipientName("x")
          .status(LockboxUpdateParams.Status.ACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.recipientName()).isEqualTo("x")
      assertThat(body.status()).isEqualTo(LockboxUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = LockboxUpdateParams.builder()
          .lockboxId("lockbox_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = LockboxUpdateParams.builder()
          .lockboxId("lockbox_id")
          .build()
      assertThat(params).isNotNull
      // path param "lockboxId"
      assertThat(params.getPathParam(0)).isEqualTo("lockbox_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
