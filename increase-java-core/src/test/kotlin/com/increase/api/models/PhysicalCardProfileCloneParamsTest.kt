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
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCloneParams.PhysicalCardProfileCloneBody

class PhysicalCardProfileCloneParamsTest {

    @Test
    fun createPhysicalCardProfileCloneParams() {
      PhysicalCardProfileCloneParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .carrierImageFileId("carrier_image_file_id")
          .contactPhone("x")
          .description("x")
          .frontImageFileId("front_image_file_id")
          .frontText(PhysicalCardProfileCloneParams.FrontText.builder()
              .line1("x")
              .line2("x")
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = PhysicalCardProfileCloneParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .carrierImageFileId("carrier_image_file_id")
          .contactPhone("x")
          .description("x")
          .frontImageFileId("front_image_file_id")
          .frontText(PhysicalCardProfileCloneParams.FrontText.builder()
              .line1("x")
              .line2("x")
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.carrierImageFileId()).isEqualTo("carrier_image_file_id")
      assertThat(body.contactPhone()).isEqualTo("x")
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.frontImageFileId()).isEqualTo("front_image_file_id")
      assertThat(body.frontText()).isEqualTo(PhysicalCardProfileCloneParams.FrontText.builder()
          .line1("x")
          .line2("x")
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = PhysicalCardProfileCloneParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = PhysicalCardProfileCloneParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .build()
      assertThat(params).isNotNull
      // path param "physicalCardProfileId"
      assertThat(params.getPathParam(0)).isEqualTo("physical_card_profile_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
