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
          .apiKey("test-api-key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccount = externalAccountService.create(ExternalAccountCreateParams.builder()
          .routingNumber("xxxxxxxxx")
          .accountNumber("x")
          .funding(ExternalAccountCreateParams.Funding.CHECKING)
          .description("x")
          .build())
      println(externalAccount)
      externalAccount.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccount = externalAccountService.retrieve(ExternalAccountRetrieveParams.builder()
          .externalAccountId("string")
          .build())
      println(externalAccount)
      externalAccount.validate()
    }

    @Test
    fun callUpdate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccount = externalAccountService.update(ExternalAccountUpdateParams.builder()
          .externalAccountId("string")
          .description("x")
          .status(ExternalAccountUpdateParams.Status.ACTIVE)
          .build())
      println(externalAccount)
      externalAccount.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val externalAccountService = client.externalAccounts()
      val externalAccountList = externalAccountService.list(ExternalAccountListParams.builder().build())
      println(externalAccountList)
      externalAccountList.data().forEach {
          it.validate()
      }
    }
}
