// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.checktransfers.CheckTransferCreateParams
import com.increase.api.models.checktransfers.CheckTransferStopPaymentParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.checkTransfers()

        val checkTransfer =
            checkTransferService.create(
                CheckTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .checkNumber("x")
                    .physicalCheck(
                        CheckTransferCreateParams.PhysicalCheck.builder()
                            .mailingAddress(
                                CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                                    .city("New York")
                                    .line1("33 Liberty Street")
                                    .postalCode("10045")
                                    .state("NY")
                                    .line2("x")
                                    .build()
                            )
                            .memo("Check payment")
                            .recipientName("Ian Crease")
                            .attachmentFileId("attachment_file_id")
                            .note("x")
                            .addPayee(
                                CheckTransferCreateParams.PhysicalCheck.Payee.builder()
                                    .contents("x")
                                    .build()
                            )
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
                            .shippingMethod(
                                CheckTransferCreateParams.PhysicalCheck.ShippingMethod
                                    .USPS_FIRST_CLASS
                            )
                            .signatureText("Ian Crease")
                            .build()
                    )
                    .requireApproval(true)
                    .thirdParty(
                        CheckTransferCreateParams.ThirdParty.builder().recipientName("x").build()
                    )
                    .build()
            )

        checkTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.checkTransfers()

        val checkTransfer = checkTransferService.retrieve("check_transfer_30b43acfu9vw8fyc4f5")

        checkTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.checkTransfers()

        val page = checkTransferService.list()

        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.checkTransfers()

        val checkTransfer = checkTransferService.approve("check_transfer_30b43acfu9vw8fyc4f5")

        checkTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.checkTransfers()

        val checkTransfer = checkTransferService.cancel("check_transfer_30b43acfu9vw8fyc4f5")

        checkTransfer.validate()
    }

    @Test
    fun stopPayment() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.checkTransfers()

        val checkTransfer =
            checkTransferService.stopPayment(
                CheckTransferStopPaymentParams.builder()
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                    .build()
            )

        checkTransfer.validate()
    }
}
