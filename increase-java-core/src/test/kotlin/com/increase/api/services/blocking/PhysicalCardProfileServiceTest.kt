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
import com.increase.api.services.blocking.PhysicalCardProfileService
import com.increase.api.models.PhysicalCardProfileListPage
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class PhysicalCardProfileServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardProfileService = client.physicalCardProfiles()
      val physicalCardProfile = physicalCardProfileService.create(PhysicalCardProfileCreateParams.builder()
          .carrierImageFileId("carrier_image_file_id")
          .contactPhone("x")
          .description("x")
          .frontImageFileId("front_image_file_id")
          .build())
      println(physicalCardProfile)
      physicalCardProfile.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardProfileService = client.physicalCardProfiles()
      val physicalCardProfile = physicalCardProfileService.retrieve(PhysicalCardProfileRetrieveParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .build())
      println(physicalCardProfile)
      physicalCardProfile.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardProfileService = client.physicalCardProfiles()
      val physicalCardProfileList = physicalCardProfileService.list(PhysicalCardProfileListParams.builder().build())
      println(physicalCardProfileList)
      physicalCardProfileList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callArchive() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardProfileService = client.physicalCardProfiles()
      val physicalCardProfile = physicalCardProfileService.archive(PhysicalCardProfileArchiveParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .build())
      println(physicalCardProfile)
      physicalCardProfile.validate()
    }

    @Test
    fun callClone() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardProfileService = client.physicalCardProfiles()
      val physicalCardProfile = physicalCardProfileService.clone(PhysicalCardProfileCloneParams.builder()
          .physicalCardProfileId("physical_card_profile_id")
          .carrierImageFileId("carrier_image_file_id")
          .contactPhone("x")
          .description("x")
          .frontImageFileId("front_image_file_id")
          .frontText(PhysicalCardProfileCloneParams.FrontText.builder()
              .line1("x")
              .line2("x")
              .build())
          .build())
      println(physicalCardProfile)
      physicalCardProfile.validate()
    }
}
