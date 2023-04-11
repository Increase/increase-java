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
          .apiKey("test-api-key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.create(AccountTransferCreateParams.builder()
          .accountId("string")
          .amount(123L)
          .description("x")
          .destinationAccountId("string")
          .requireApproval(true)
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.retrieve(AccountTransferRetrieveParams.builder()
          .accountTransferId("string")
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
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
          .apiKey("test-api-key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.approve(AccountTransferApproveParams.builder()
          .accountTransferId("string")
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }

    @Test
    fun callCancel() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val accountTransferService = client.accountTransfers()
      val accountTransfer = accountTransferService.cancel(AccountTransferCancelParams.builder()
          .accountTransferId("string")
          .build())
      println(accountTransfer)
      accountTransfer.validate()
    }
}
