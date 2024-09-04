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
import com.increase.api.models.SimulationInboundMailItemCreateParams
import com.increase.api.models.SimulationInboundMailItemCreateParams.SimulationInboundMailItemCreateBody

class SimulationInboundMailItemCreateParamsTest {

    @Test
    fun createSimulationInboundMailItemCreateParams() {
      SimulationInboundMailItemCreateParams.builder()
          .amount(123L)
          .lockboxId("lockbox_id")
          .contentsFileId("contents_file_id")
          .build()
    }

    @Test
    fun getBody() {
      val params = SimulationInboundMailItemCreateParams.builder()
          .amount(123L)
          .lockboxId("lockbox_id")
          .contentsFileId("contents_file_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.lockboxId()).isEqualTo("lockbox_id")
      assertThat(body.contentsFileId()).isEqualTo("contents_file_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = SimulationInboundMailItemCreateParams.builder()
          .amount(123L)
          .lockboxId("lockbox_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.amount()).isEqualTo(123L)
      assertThat(body.lockboxId()).isEqualTo("lockbox_id")
    }
}
