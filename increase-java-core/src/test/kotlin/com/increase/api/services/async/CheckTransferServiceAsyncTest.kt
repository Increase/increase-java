// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.checktransfers.CheckTransferApproveParams
import com.increase.api.models.checktransfers.CheckTransferCancelParams
import com.increase.api.models.checktransfers.CheckTransferCreateParams
import com.increase.api.models.checktransfers.CheckTransferRetrieveParams
import com.increase.api.models.checktransfers.CheckTransferStopPaymentParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.checkTransfers()

        val checkTransferFuture =
            checkTransferServiceAsync.create(
                CheckTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
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
                            .checkNumber("x")
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
                            .signatureText("Ian Crease")
                            .build()
                    )
                    .requireApproval(true)
                    .thirdParty(
                        CheckTransferCreateParams.ThirdParty.builder().checkNumber("x").build()
                    )
                    .build()
            )

        val checkTransfer = checkTransferFuture.get()
        checkTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.checkTransfers()

        val checkTransferFuture =
            checkTransferServiceAsync.retrieve(
                CheckTransferRetrieveParams.builder()
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .build()
            )

        val checkTransfer = checkTransferFuture.get()
        checkTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.checkTransfers()

        val pageFuture = checkTransferServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.checkTransfers()

        val checkTransferFuture =
            checkTransferServiceAsync.approve(
                CheckTransferApproveParams.builder()
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .build()
            )

        val checkTransfer = checkTransferFuture.get()
        checkTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.checkTransfers()

        val checkTransferFuture =
            checkTransferServiceAsync.cancel(
                CheckTransferCancelParams.builder()
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .build()
            )

        val checkTransfer = checkTransferFuture.get()
        checkTransfer.validate()
    }

    @Test
    fun stopPayment() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.checkTransfers()

        val checkTransferFuture =
            checkTransferServiceAsync.stopPayment(
                CheckTransferStopPaymentParams.builder()
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .reason(CheckTransferStopPaymentParams.Reason.MAIL_DELIVERY_FAILED)
                    .build()
            )

        val checkTransfer = checkTransferFuture.get()
        checkTransfer.validate()
    }
}
