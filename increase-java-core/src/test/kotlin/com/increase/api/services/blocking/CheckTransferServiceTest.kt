package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.CheckTransferListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.checkTransfers()
        val checkTransfer =
            checkTransferService.create(
                CheckTransferCreateParams.builder()
                    .accountId("string")
                    .amount(123L)
                    .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                    .physicalCheck(
                        CheckTransferCreateParams.PhysicalCheck.builder()
                            .mailingAddress(
                                CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                                    .city("x")
                                    .line1("x")
                                    .postalCode("x")
                                    .state("x")
                                    .line2("x")
                                    .name("x")
                                    .build()
                            )
                            .memo("x")
                            .recipientName("x")
                            .note("x")
                            .returnAddress(
                                CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                                    .city("x")
                                    .line1("x")
                                    .name("x")
                                    .postalCode("x")
                                    .state("x")
                                    .line2("x")
                                    .build()
                            )
                            .build()
                    )
                    .requireApproval(true)
                    .sourceAccountNumberId("string")
                    .uniqueIdentifier("x")
                    .build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.checkTransfers()
        val checkTransfer =
            checkTransferService.retrieve(
                CheckTransferRetrieveParams.builder().checkTransferId("string").build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.checkTransfers()
        val checkTransferList = checkTransferService.list(CheckTransferListParams.builder().build())
        println(checkTransferList)
        checkTransferList.data().forEach { it.validate() }
    }

    @Test
    fun callApprove() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.checkTransfers()
        val checkTransfer =
            checkTransferService.approve(
                CheckTransferApproveParams.builder().checkTransferId("string").build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }

    @Test
    fun callCancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.checkTransfers()
        val checkTransfer =
            checkTransferService.cancel(
                CheckTransferCancelParams.builder().checkTransferId("string").build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }

    @Disabled("Prism doesn't accept no request body being sent but returns 415 if it is sent")
    @Test
    fun callStopPayment() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val checkTransferService = client.checkTransfers()
        val checkTransfer =
            checkTransferService.stopPayment(
                CheckTransferStopPaymentParams.builder()
                    .checkTransferId("string")
                    .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                    .build()
            )
        println(checkTransfer)
        checkTransfer.validate()
    }
}
