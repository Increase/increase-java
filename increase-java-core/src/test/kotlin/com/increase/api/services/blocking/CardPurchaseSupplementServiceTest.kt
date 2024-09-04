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
import com.increase.api.services.blocking.CardPurchaseSupplementService
import com.increase.api.models.CardPurchaseSupplementListPage
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CardPurchaseSupplementServiceTest {

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardPurchaseSupplementService = client.cardPurchaseSupplements()
      val cardPurchaseSupplement = cardPurchaseSupplementService.retrieve(CardPurchaseSupplementRetrieveParams.builder()
          .cardPurchaseSupplementId("card_purchase_supplement_id")
          .build())
      println(cardPurchaseSupplement)
      cardPurchaseSupplement.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardPurchaseSupplementService = client.cardPurchaseSupplements()
      val cardPurchaseSupplementList = cardPurchaseSupplementService.list(CardPurchaseSupplementListParams.builder().build())
      println(cardPurchaseSupplementList)
      cardPurchaseSupplementList.data().forEach {
          it.validate()
      }
    }
}
