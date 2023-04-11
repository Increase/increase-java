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
import com.increase.api.services.blocking.AccountNumberService
import com.increase.api.models.AccountNumberListPage
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class AccountNumberServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountNumberService = client.accountNumbers()
      val accountNumber = accountNumberService.create(AccountNumberCreateParams.builder()
          .accountId("string")
          .name("x")
          .build())
      println(accountNumber)
      accountNumber.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountNumberService = client.accountNumbers()
      val accountNumber = accountNumberService.retrieve(AccountNumberRetrieveParams.builder()
          .accountNumberId("string")
          .build())
      println(accountNumber)
      accountNumber.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountNumberService = client.accountNumbers()
      val accountNumber = accountNumberService.update(AccountNumberUpdateParams.builder()
          .accountNumberId("string")
          .name("x")
          .status(AccountNumberUpdateParams.Status.ACTIVE)
          .build())
      println(accountNumber)
      accountNumber.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountNumberService = client.accountNumbers()
      val accountNumberList = accountNumberService.list(AccountNumberListParams.builder().build())
      println(accountNumberList)
      accountNumberList.data().forEach {
          it.validate()
      }
    }
}
