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
import com.increase.api.services.blocking.CardService
import com.increase.api.models.CardListPage
import com.increase.api.models.CardListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CardServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardService = client.cards()
      val card = cardService.create(CardCreateParams.builder()
          .accountId("string")
          .description("x")
          .billingAddress(CardCreateParams.BillingAddress.builder()
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .postalCode("x")
              .build())
          .digitalWallet(CardCreateParams.DigitalWallet.builder()
              .email("x")
              .phone("x")
              .cardProfileId("string")
              .build())
          .build())
      println(card)
      card.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardService = client.cards()
      val card = cardService.retrieve(CardRetrieveParams.builder()
          .cardId("string")
          .build())
      println(card)
      card.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardService = client.cards()
      val card = cardService.update(CardUpdateParams.builder()
          .cardId("string")
          .description("x")
          .status(CardUpdateParams.Status.ACTIVE)
          .billingAddress(CardUpdateParams.BillingAddress.builder()
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .postalCode("x")
              .build())
          .digitalWallet(CardUpdateParams.DigitalWallet.builder()
              .email("x")
              .phone("x")
              .cardProfileId("string")
              .build())
          .build())
      println(card)
      card.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardService = client.cards()
      val cardList = cardService.list(CardListParams.builder().build())
      println(cardList)
      cardList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callRetrieveSensitiveDetails() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardService = client.cards()
      val cardDetails = cardService.retrieveSensitiveDetails(CardRetrieveSensitiveDetailsParams.builder()
          .cardId("string")
          .build())
      println(cardDetails)
      cardDetails.validate()
    }
}
