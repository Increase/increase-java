// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams
import java.time.OffsetDateTime
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

        val inboundAchTransfersFuture =
            inboundAchTransferServiceAsync.list(
                InboundAchTransferListParams.builder()
                    .accountId("account_id")
                    .accountNumberId("account_number_id")
                    .createdAt(
                        InboundAchTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .status(
                        InboundAchTransferListParams.Status.builder()
                            .addIn(InboundAchTransferListParams.Status.In.PENDING)
                            .build()
                    )
                    .build()
            )

        val inboundAchTransfers = inboundAchTransfersFuture.get()
        inboundAchTransfers.validate()
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
