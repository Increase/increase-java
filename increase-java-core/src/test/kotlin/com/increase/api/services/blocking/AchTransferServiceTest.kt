// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.AchTransferListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.create(
                AchTransferCreateParams.builder()
                    .accountId("account_id")
                    .amount(-9999999999L)
                    .statementDescriptor("x")
                    .accountNumber("x")
                    .addenda(
                        AchTransferCreateParams.Addenda.builder()
                            .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                            .freeform(
                                AchTransferCreateParams.Addenda.Freeform.builder()
                                    .entries(
                                        listOf(
                                            AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                                .paymentRelatedInformation("x")
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .paymentOrderRemittanceAdvice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                    .builder()
                                    .invoices(
                                        listOf(
                                            AchTransferCreateParams.Addenda
                                                .PaymentOrderRemittanceAdvice
                                                .Invoice
                                                .builder()
                                                .invoiceNumber("x")
                                                .paidAmount(0L)
                                                .build()
                                        )
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyName("x")
                    .destinationAccountHolder(
                        AchTransferCreateParams.DestinationAccountHolder.BUSINESS
                    )
                    .externalAccountId("external_account_id")
                    .funding(AchTransferCreateParams.Funding.CHECKING)
                    .individualId("x")
                    .individualName("x")
                    .preferredEffectiveDate(
                        AchTransferCreateParams.PreferredEffectiveDate.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .settlementSchedule(
                                AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule
                                    .SAME_DAY
                            )
                            .build()
                    )
                    .requireApproval(true)
                    .routingNumber("xxxxxxxxx")
                    .standardEntryClassCode(
                        AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                    )
                    .transactionTiming(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
                    .build()
            )
        println(achTransfer)
        achTransfer.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.retrieve(
                AchTransferRetrieveParams.builder().achTransferId("ach_transfer_id").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransferList = achTransferService.list(AchTransferListParams.builder().build())
        println(achTransferList)
        achTransferList.data().forEach { it.validate() }
    }

    @Test
    fun callApprove() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.approve(
                AchTransferApproveParams.builder().achTransferId("ach_transfer_id").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }

    @Test
    fun callCancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.cancel(
                AchTransferCancelParams.builder().achTransferId("ach_transfer_id").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }
}
