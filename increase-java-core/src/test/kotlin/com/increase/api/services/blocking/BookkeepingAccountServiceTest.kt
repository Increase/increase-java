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
import com.increase.api.services.blocking.BookkeepingAccountService
import com.increase.api.models.BookkeepingAccountListPage
import com.increase.api.models.BookkeepingAccountListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class BookkeepingAccountServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingAccountService = client.bookkeepingAccounts()
      val bookkeepingAccount = bookkeepingAccountService.create(BookkeepingAccountCreateParams.builder()
          .name("x")
          .accountId("account_id")
          .complianceCategory(BookkeepingAccountCreateParams.ComplianceCategory.COMMINGLED_CASH)
          .entityId("entity_id")
          .build())
      println(bookkeepingAccount)
      bookkeepingAccount.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingAccountService = client.bookkeepingAccounts()
      val bookkeepingAccount = bookkeepingAccountService.update(BookkeepingAccountUpdateParams.builder()
          .bookkeepingAccountId("bookkeeping_account_id")
          .name("x")
          .build())
      println(bookkeepingAccount)
      bookkeepingAccount.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingAccountService = client.bookkeepingAccounts()
      val bookkeepingAccountList = bookkeepingAccountService.list(BookkeepingAccountListParams.builder().build())
      println(bookkeepingAccountList)
      bookkeepingAccountList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callBalance() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val bookkeepingAccountService = client.bookkeepingAccounts()
      val bookkeepingBalanceLookup = bookkeepingAccountService.balance(BookkeepingAccountBalanceParams.builder()
          .bookkeepingAccountId("bookkeeping_account_id")
          .atTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())
      println(bookkeepingBalanceLookup)
      bookkeepingBalanceLookup.validate()
    }
}
