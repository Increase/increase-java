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
import com.increase.api.models.PhysicalCardUpdateParams
import com.increase.api.models.PhysicalCardUpdateParams.PhysicalCardUpdateBody

class PhysicalCardUpdateParamsTest {

    @Test
    fun createPhysicalCardUpdateParams() {
      PhysicalCardUpdateParams.builder()
          .physicalCardId("physical_card_id")
          .status(PhysicalCardUpdateParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun getBody() {
      val params = PhysicalCardUpdateParams.builder()
          .physicalCardId("physical_card_id")
          .status(PhysicalCardUpdateParams.Status.ACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PhysicalCardUpdateParams.builder()
          .physicalCardId("physical_card_id")
          .status(PhysicalCardUpdateParams.Status.ACTIVE)
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.status()).isEqualTo(PhysicalCardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun getPathParam() {
      val params = PhysicalCardUpdateParams.builder()
          .physicalCardId("physical_card_id")
          .status(PhysicalCardUpdateParams.Status.ACTIVE)
          .build()
      assertThat(params).isNotNull
      // path param "physicalCardId"
      assertThat(params.getPathParam(0)).isEqualTo("physical_card_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
