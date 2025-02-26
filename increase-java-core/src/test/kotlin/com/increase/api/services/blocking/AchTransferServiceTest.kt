// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()

        val achTransfer =
            achTransferService.create(
                AchTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .statementDescriptor("New ACH transfer")
                    .accountNumber("987654321")
                    .addenda(
                        AchTransferCreateParams.Addenda.builder()
                            .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                            .freeform(
                                AchTransferCreateParams.Addenda.Freeform.builder()
                                    .addEntry(
                                        AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation("x")
                                            .build()
                                    )
                                    .build()
                            )
                            .paymentOrderRemittanceAdvice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                    .builder()
                                    .addInvoice(
                                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                            .Invoice
                                            .builder()
                                            .invoiceNumber("x")
                                            .paidAmount(0L)
                                            .build()
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
                    .routingNumber("101050001")
                    .standardEntryClassCode(
                        AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                    )
                    .transactionTiming(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()

        val achTransfer =
            achTransferService.retrieve(
                AchTransferRetrieveParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()

        val page = achTransferService.list()

        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()

        val achTransfer =
            achTransferService.approve(
                AchTransferApproveParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferService = client.achTransfers()

        val achTransfer =
            achTransferService.cancel(
                AchTransferCancelParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }
}
