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
import com.increase.api.services.blocking.CheckTransferService
import com.increase.api.models.CheckTransferListPage
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class CheckTransferServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.create(CheckTransferCreateParams.builder()
          .accountId("string")
          .addressLine1("x")
          .addressLine2("x")
          .addressCity("x")
          .addressState("x")
          .addressZip("x")
          .returnAddress(CheckTransferCreateParams.ReturnAddress.builder()
              .name("x")
              .line1("x")
              .line2("x")
              .city("x")
              .state("x")
              .zip("x")
              .build())
          .amount(123L)
          .message("x")
          .note("x")
          .recipientName("x")
          .requireApproval(true)
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.retrieve(CheckTransferRetrieveParams.builder()
          .checkTransferId("string")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransferList = checkTransferService.list(CheckTransferListParams.builder().build())
      println(checkTransferList)
      checkTransferList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callApprove() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.approve(CheckTransferApproveParams.builder()
          .checkTransferId("string")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callCancel() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.cancel(CheckTransferCancelParams.builder()
          .checkTransferId("string")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Disabled("Prism doesn't accept no request body being sent but returns 415 if it is sent")
    @Test
    fun callStopPayment() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("test-api-key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.stopPayment(CheckTransferStopPaymentParams.builder()
          .checkTransferId("string")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }
}
