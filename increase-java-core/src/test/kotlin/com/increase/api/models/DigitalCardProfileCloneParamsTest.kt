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
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCloneParams.DigitalCardProfileCloneBody

class DigitalCardProfileCloneParamsTest {

    @Test
    fun createDigitalCardProfileCloneParams() {
      DigitalCardProfileCloneParams.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .appIconFileId("app_icon_file_id")
          .backgroundImageFileId("background_image_file_id")
          .cardDescription("x")
          .contactEmail("x")
          .contactPhone("x")
          .contactWebsite("contact_website")
          .description("x")
          .issuerName("x")
          .textColor(DigitalCardProfileCloneParams.TextColor.builder()
              .blue(123L)
              .green(123L)
              .red(123L)
              .build())
          .build()
    }

    @Test
    fun getBody() {
      val params = DigitalCardProfileCloneParams.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .appIconFileId("app_icon_file_id")
          .backgroundImageFileId("background_image_file_id")
          .cardDescription("x")
          .contactEmail("x")
          .contactPhone("x")
          .contactWebsite("contact_website")
          .description("x")
          .issuerName("x")
          .textColor(DigitalCardProfileCloneParams.TextColor.builder()
              .blue(123L)
              .green(123L)
              .red(123L)
              .build())
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
      assertThat(body.appIconFileId()).isEqualTo("app_icon_file_id")
      assertThat(body.backgroundImageFileId()).isEqualTo("background_image_file_id")
      assertThat(body.cardDescription()).isEqualTo("x")
      assertThat(body.contactEmail()).isEqualTo("x")
      assertThat(body.contactPhone()).isEqualTo("x")
      assertThat(body.contactWebsite()).isEqualTo("contact_website")
      assertThat(body.description()).isEqualTo("x")
      assertThat(body.issuerName()).isEqualTo("x")
      assertThat(body.textColor()).isEqualTo(DigitalCardProfileCloneParams.TextColor.builder()
          .blue(123L)
          .green(123L)
          .red(123L)
          .build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
      val params = DigitalCardProfileCloneParams.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .build()
      val body = params.getBody()
      assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
      val params = DigitalCardProfileCloneParams.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .build()
      assertThat(params).isNotNull
      // path param "digitalCardProfileId"
      assertThat(params.getPathParam(0)).isEqualTo("digital_card_profile_id")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
