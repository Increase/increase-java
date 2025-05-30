// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundAchTransferServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransferFuture =
            inboundAchTransferServiceAsync.retrieve("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")

        val inboundAchTransfer = inboundAchTransferFuture.get()
        inboundAchTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val pageFuture = inboundAchTransferServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun createNotificationOfChange() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransferFuture =
            inboundAchTransferServiceAsync.createNotificationOfChange(
                InboundAchTransferCreateNotificationOfChangeParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .updatedAccountNumber("987654321")
                    .updatedRoutingNumber("101050001")
                    .build()
            )

        val inboundAchTransfer = inboundAchTransferFuture.get()
        inboundAchTransfer.validate()
    }

    @Test
    fun decline() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransferFuture =
            inboundAchTransferServiceAsync.decline(
                InboundAchTransferDeclineParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .reason(InboundAchTransferDeclineParams.Reason.PAYMENT_STOPPED)
                    .build()
            )

        val inboundAchTransfer = inboundAchTransferFuture.get()
        inboundAchTransfer.validate()
    }

    @Test
    fun transferReturn() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransferFuture =
            inboundAchTransferServiceAsync.transferReturn(
                InboundAchTransferTransferReturnParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .reason(InboundAchTransferTransferReturnParams.Reason.PAYMENT_STOPPED)
                    .build()
            )

        val inboundAchTransfer = inboundAchTransferFuture.get()
        inboundAchTransfer.validate()
    }
}
