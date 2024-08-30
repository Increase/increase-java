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
import com.increase.api.services.blocking.ExternalAccountService
import com.increase.api.models.ExternalAccountListPage
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class ExternalAccountServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccount = externalAccountService.create(ExternalAccountCreateParams.builder()
          .accountNumber("x")
          .description("x")
          .routingNumber("xxxxxxxxx")
          .accountHolder(ExternalAccountCreateParams.AccountHolder.BUSINESS)
          .funding(ExternalAccountCreateParams.Funding.CHECKING)
          .build())
      println(externalAccount)
      externalAccount.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccount = externalAccountService.retrieve(ExternalAccountRetrieveParams.builder()
          .externalAccountId("external_account_id")
          .build())
      println(externalAccount)
      externalAccount.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccount = externalAccountService.update(ExternalAccountUpdateParams.builder()
          .externalAccountId("external_account_id")
          .accountHolder(ExternalAccountUpdateParams.AccountHolder.BUSINESS)
          .description("x")
          .funding(ExternalAccountUpdateParams.Funding.CHECKING)
          .status(ExternalAccountUpdateParams.Status.ACTIVE)
          .build())
      println(externalAccount)
      externalAccount.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccountList = externalAccountService.list(ExternalAccountListParams.builder().build())
      println(externalAccountList)
      externalAccountList.data().forEach {
          it.validate()
      }
    }
}
