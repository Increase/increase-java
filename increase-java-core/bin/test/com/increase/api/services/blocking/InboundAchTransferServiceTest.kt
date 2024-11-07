// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.InboundAchTransferListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundAchTransferServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.retrieve(
                InboundAchTransferRetrieveParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_id")
                    .build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransferList =
            inboundAchTransferService.list(InboundAchTransferListParams.builder().build())
        println(inboundAchTransferList)
        inboundAchTransferList.data().forEach { it.validate() }
    }

    @Test
    fun callCreateNotificationOfChange() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.createNotificationOfChange(
                InboundAchTransferCreateNotificationOfChangeParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_id")
                    .updatedAccountNumber("x")
                    .updatedRoutingNumber("x")
                    .build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }

    @Test
    fun callDecline() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.decline(
                InboundAchTransferDeclineParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_id")
                    .reason(InboundAchTransferDeclineParams.Reason.INSUFFICIENT_FUNDS)
                    .build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }

    @Test
    fun callTransferReturn() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.transferReturn(
                InboundAchTransferTransferReturnParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_id")
                    .reason(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
                    .build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }
}
