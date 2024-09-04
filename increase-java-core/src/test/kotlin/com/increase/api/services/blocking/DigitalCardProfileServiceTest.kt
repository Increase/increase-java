// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.BeforeEach
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.services.blocking.DigitalCardProfileService
import com.increase.api.models.DigitalCardProfileListPage
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class DigitalCardProfileServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val digitalCardProfileService = client.digitalCardProfiles()
      val digitalCardProfile = digitalCardProfileService.create(DigitalCardProfileCreateParams.builder()
          .appIconFileId("app_icon_file_id")
          .backgroundImageFileId("background_image_file_id")
          .cardDescription("x")
          .description("x")
          .issuerName("x")
          .contactEmail("x")
          .contactPhone("x")
          .contactWebsite("contact_website")
          .textColor(DigitalCardProfileCreateParams.TextColor.builder()
              .blue(123L)
              .green(123L)
              .red(123L)
              .build())
          .build())
      println(digitalCardProfile)
      digitalCardProfile.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val digitalCardProfileService = client.digitalCardProfiles()
      val digitalCardProfile = digitalCardProfileService.retrieve(DigitalCardProfileRetrieveParams.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .build())
      println(digitalCardProfile)
      digitalCardProfile.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val digitalCardProfileService = client.digitalCardProfiles()
      val digitalCardProfileList = digitalCardProfileService.list(DigitalCardProfileListParams.builder().build())
      println(digitalCardProfileList)
      digitalCardProfileList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callArchive() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val digitalCardProfileService = client.digitalCardProfiles()
      val digitalCardProfile = digitalCardProfileService.archive(DigitalCardProfileArchiveParams.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .build())
      println(digitalCardProfile)
      digitalCardProfile.validate()
    }

    @Test
    fun callClone() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val digitalCardProfileService = client.digitalCardProfiles()
      val digitalCardProfile = digitalCardProfileService.clone(DigitalCardProfileCloneParams.builder()
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
          .build())
      println(digitalCardProfile)
      digitalCardProfile.validate()
    }
}
