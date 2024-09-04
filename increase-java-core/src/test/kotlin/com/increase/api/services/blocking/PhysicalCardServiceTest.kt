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
import com.increase.api.services.blocking.PhysicalCardService
import com.increase.api.models.PhysicalCardListPage
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class PhysicalCardServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardService = client.physicalCards()
      val physicalCard = physicalCardService.create(PhysicalCardCreateParams.builder()
          .cardId("card_id")
          .cardholder(PhysicalCardCreateParams.Cardholder.builder()
              .firstName("x")
              .lastName("x")
              .build())
          .shipment(PhysicalCardCreateParams.Shipment.builder()
              .address(PhysicalCardCreateParams.Shipment.Address.builder()
                  .city("x")
                  .line1("x")
                  .name("x")
                  .postalCode("x")
                  .state("x")
                  .line2("x")
                  .line3("x")
                  .phoneNumber("x")
                  .build())
              .method(PhysicalCardCreateParams.Shipment.Method.USPS)
              .build())
          .physicalCardProfileId("physical_card_profile_id")
          .build())
      println(physicalCard)
      physicalCard.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardService = client.physicalCards()
      val physicalCard = physicalCardService.retrieve(PhysicalCardRetrieveParams.builder()
          .physicalCardId("physical_card_id")
          .build())
      println(physicalCard)
      physicalCard.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardService = client.physicalCards()
      val physicalCard = physicalCardService.update(PhysicalCardUpdateParams.builder()
          .physicalCardId("physical_card_id")
          .status(PhysicalCardUpdateParams.Status.ACTIVE)
          .build())
      println(physicalCard)
      physicalCard.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val physicalCardService = client.physicalCards()
      val physicalCardList = physicalCardService.list(PhysicalCardListParams.builder().build())
      println(physicalCardList)
      physicalCardList.data().forEach {
          it.validate()
      }
    }
}
