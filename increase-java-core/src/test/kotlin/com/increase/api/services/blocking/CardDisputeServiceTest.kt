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
import com.increase.api.services.blocking.CardDisputeService
import com.increase.api.models.CardDisputeListPage
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CardDisputeServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardDisputeService = client.cardDisputes()
      val cardDispute = cardDisputeService.create(CardDisputeCreateParams.builder()
          .disputedTransactionId("string")
          .explanation("x")
          .build())
      println(cardDispute)
      cardDispute.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardDisputeService = client.cardDisputes()
      val cardDispute = cardDisputeService.retrieve(CardDisputeRetrieveParams.builder()
          .cardDisputeId("string")
          .build())
      println(cardDispute)
      cardDispute.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val cardDisputeService = client.cardDisputes()
      val cardDisputeList = cardDisputeService.list(CardDisputeListParams.builder().build())
      println(cardDisputeList)
      cardDisputeList.data().forEach {
          it.validate()
      }
    }
}
