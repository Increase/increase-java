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
import com.increase.api.services.blocking.AchTransferService
import com.increase.api.models.AchTransferListPage
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.*

@ExtendWith(TestServerExtension::class)
class AchTransferServiceTest {

    @Test
    fun callCreate() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achTransferService = client.achTransfers()
      val achTransfer = achTransferService.create(AchTransferCreateParams.builder()
          .accountId("account_id")
          .amount(123L)
          .statementDescriptor("x")
          .accountNumber("x")
          .addenda(AchTransferCreateParams.Addenda.builder()
              .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
              .freeform(AchTransferCreateParams.Addenda.Freeform.builder()
                  .entries(listOf(AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                      .paymentRelatedInformation("x")
                      .build()))
                  .build())
              .paymentOrderRemittanceAdvice(AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                  .invoices(listOf(AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.Invoice.builder()
                      .invoiceNumber("x")
                      .paidAmount(123L)
                      .build()))
                  .build())
              .build())
          .companyDescriptiveDate("x")
          .companyDiscretionaryData("x")
          .companyEntryDescription("x")
          .companyName("x")
          .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
          .externalAccountId("external_account_id")
          .funding(AchTransferCreateParams.Funding.CHECKING)
          .individualId("x")
          .individualName("x")
          .preferredEffectiveDate(AchTransferCreateParams.PreferredEffectiveDate.builder()
              .date(LocalDate.parse("2019-12-27"))
              .settlementSchedule(AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule.SAME_DAY)
              .build())
          .requireApproval(true)
          .routingNumber("xxxxxxxxx")
          .standardEntryClassCode(AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
          .build())
      println(achTransfer)
      achTransfer.validate()
    }

    @Test
    fun callRetrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achTransferService = client.achTransfers()
      val achTransfer = achTransferService.retrieve(AchTransferRetrieveParams.builder()
          .achTransferId("ach_transfer_id")
          .build())
      println(achTransfer)
      achTransfer.validate()
    }

    @Test
    fun callList() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achTransferService = client.achTransfers()
      val achTransferList = achTransferService.list(AchTransferListParams.builder().build())
      println(achTransferList)
      achTransferList.data().forEach {
          it.validate()
      }
    }

    @Test
    fun callApprove() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achTransferService = client.achTransfers()
      val achTransfer = achTransferService.approve(AchTransferApproveParams.builder()
          .achTransferId("ach_transfer_id")
          .build())
      println(achTransfer)
      achTransfer.validate()
    }

    @Test
    fun callCancel() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val achTransferService = client.achTransfers()
      val achTransfer = achTransferService.cancel(AchTransferCancelParams.builder()
          .achTransferId("ach_transfer_id")
          .build())
      println(achTransfer)
      achTransfer.validate()
    }
}
