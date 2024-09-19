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
          .apiKey("My API Key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.create(CheckTransferCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .sourceAccountNumberId("source_account_number_id")
          .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
          .physicalCheck(CheckTransferCreateParams.PhysicalCheck.builder()
              .mailingAddress(CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                  .city("x")
                  .line1("x")
                  .postalCode("x")
                  .state("x")
                  .line2("x")
                  .name("x")
                  .build())
              .memo("x")
              .recipientName("x")
              .note("x")
              .returnAddress(CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                  .city("x")
                  .line1("x")
                  .name("x")
                  .postalCode("x")
                  .state("x")
                  .line2("x")
                  .build())
              .signatureText("x")
              .build())
          .requireApproval(true)
          .thirdParty(CheckTransferCreateParams.ThirdParty.builder()
              .checkNumber("x")
              .build())
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.retrieve(CheckTransferRetrieveParams.builder()
          .checkTransferId("check_transfer_id")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
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
          .apiKey("My API Key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.approve(CheckTransferApproveParams.builder()
          .checkTransferId("check_transfer_id")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callCancel() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.cancel(CheckTransferCancelParams.builder()
          .checkTransferId("check_transfer_id")
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }

    @Test
    fun callStopPayment() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val checkTransferService = client.checkTransfers()
      val checkTransfer = checkTransferService.stopPayment(CheckTransferStopPaymentParams.builder()
          .checkTransferId("check_transfer_id")
          .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
          .build())
      println(checkTransfer)
      checkTransfer.validate()
    }
}
