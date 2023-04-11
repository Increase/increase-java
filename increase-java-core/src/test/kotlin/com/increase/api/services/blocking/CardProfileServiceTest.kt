package com.increase.api.services.blocking

import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import com.increase.api.TestServerExtension
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.services.blocking.CardProfileService
import com.increase.api.models.CardProfileListPage
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CardProfileServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardProfileService = client.cardProfiles()
      val cardProfile = cardProfileService.create(CardProfileCreateParams.builder()
          .description("x")
          .digitalWallets(CardProfileCreateParams.DigitalWallets.builder()
              .textColor(CardProfileCreateParams.DigitalWallets.TextColor.builder()
                  .red(123L)
                  .green(123L)
                  .blue(123L)
                  .build())
              .issuerName("x")
              .cardDescription("x")
              .contactWebsite("string")
              .contactEmail("x")
              .contactPhone("x")
              .backgroundImageFileId("string")
              .appIconFileId("string")
              .build())
          .build())
      println(cardProfile)
      cardProfile.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardProfileService = client.cardProfiles()
      val cardProfile = cardProfileService.retrieve(CardProfileRetrieveParams.builder()
          .cardProfileId("string")
          .build())
      println(cardProfile)
      cardProfile.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardProfileService = client.cardProfiles()
      val cardProfileList = cardProfileService.list(CardProfileListParams.builder().build())
      println(cardProfileList)
      cardProfileList.data().forEach {
          it.validate()
      }
    }
}
