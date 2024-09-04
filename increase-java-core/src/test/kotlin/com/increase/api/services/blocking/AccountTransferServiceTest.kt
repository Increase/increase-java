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
import com.increase.api.services.blocking.AccountTransferService
import com.increase.api.models.AccountTransferListPage
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.create(AccountTransferCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .description("x")
          .destinationAccountId("destination_account_id")
          .requireApproval(true)
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.retrieve(AccountTransferRetrieveParams.builder()
          .accountTransferId("account_transfer_id")
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransferList = accountTransferService.list(AccountTransferListParams.builder().build())
      println(accountTransferList)
      accountTransferList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callApprove() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.approve(AccountTransferApproveParams.builder()
          .accountTransferId("account_transfer_id")
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }

    @Test
    fun callCancel() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.cancel(AccountTransferCancelParams.builder()
          .accountTransferId("account_transfer_id")
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }
}
