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
import com.increase.api.services.blocking.BookkeepingEntrySetService
import com.increase.api.models.BookkeepingEntrySetListPage
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class BookkeepingEntrySetServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingEntrySetService = client.bookkeepingEntrySets()
      val bookkeepingEntrySet = bookkeepingEntrySetService.create(BookkeepingEntrySetCreateParams.builder()
          .entries(listOf(BookkeepingEntrySetCreateParams.Entry.builder()
              .accountId("account_id")
              .amount(123L)
              .build()))
          .date(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .transactionId("transaction_id")
          .build())
      println(bookkeepingEntrySet)
      bookkeepingEntrySet.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingEntrySetService = client.bookkeepingEntrySets()
      val bookkeepingEntrySet = bookkeepingEntrySetService.retrieve(BookkeepingEntrySetRetrieveParams.builder()
          .bookkeepingEntrySetId("bookkeeping_entry_set_id")
          .build())
      println(bookkeepingEntrySet)
      bookkeepingEntrySet.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingEntrySetService = client.bookkeepingEntrySets()
      val bookkeepingEntrySetList = bookkeepingEntrySetService.list(BookkeepingEntrySetListParams.builder().build())
      println(bookkeepingEntrySetList)
      bookkeepingEntrySetList.data().forEach {
          it.validate()
      }
    }
}
