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
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.create(
                AchTransferCreateParams.builder()
                    .accountId("string")
                    .accountNumber("x")
                    .addendum("x")
                    .amount(123L)
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyName("x")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalAccountId("string")
                    .funding(AchTransferCreateParams.Funding.CHECKING)
                    .individualId("x")
                    .individualName("x")
                    .requireApproval(true)
                    .routingNumber("xxxxxxxxx")
                    .standardEntryClassCode(
                        AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                    )
                    .statementDescriptor("x")
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
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.retrieve(
                AchTransferRetrieveParams.builder().achTransferId("string").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
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
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.approve(
                AchTransferApproveParams.builder().achTransferId("string").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }

    @Test
    fun callCancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val achTransferService = client.achTransfers()
        val achTransfer =
            achTransferService.cancel(
                AchTransferCancelParams.builder().achTransferId("string").build()
            )
        println(achTransfer)
        achTransfer.validate()
    }
}
