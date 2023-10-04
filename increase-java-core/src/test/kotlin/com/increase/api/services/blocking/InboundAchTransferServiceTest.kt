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
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.retrieve(
                InboundAchTransferRetrieveParams.builder().inboundAchTransferId("string").build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransferList =
            inboundAchTransferService.list(InboundAchTransferListParams.builder().build())
        println(inboundAchTransferList)
        inboundAchTransferList.data().forEach { it.validate() }
    }

    @Test
    fun callDecline() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.decline(
                InboundAchTransferDeclineParams.builder().inboundAchTransferId("string").build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }

    @Test
    fun callNotificationOfChange() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.notificationOfChange(
                InboundAchTransferNotificationOfChangeParams.builder()
                    .inboundAchTransferId("string")
                    .updatedAccountNumber("x")
                    .updatedRoutingNumber("x")
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
                .apiKey("test-api-key")
                .build()
        val inboundAchTransferService = client.inboundAchTransfers()
        val inboundAchTransfer =
            inboundAchTransferService.transferReturn(
                InboundAchTransferTransferReturnParams.builder()
                    .inboundAchTransferId("string")
                    .reason(
                        InboundAchTransferTransferReturnParams.Reason
                            .AUTHORIZATION_REVOKED_BY_CUSTOMER
                    )
                    .build()
            )
        println(inboundAchTransfer)
        inboundAchTransfer.validate()
    }
}
