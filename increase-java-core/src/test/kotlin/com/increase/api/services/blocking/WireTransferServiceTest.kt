package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.WireTransferListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WireTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.create(
                WireTransferCreateParams.builder()
                    .accountId("string")
                    .accountNumber("x")
                    .routingNumber("xxxxxxxxx")
                    .externalAccountId("string")
                    .amount(123L)
                    .messageToRecipient("x")
                    .beneficiaryName("x")
                    .beneficiaryAddressLine1("x")
                    .beneficiaryAddressLine2("x")
                    .beneficiaryAddressLine3("x")
                    .requireApproval(true)
                    .uniqueIdentifier("x")
                    .build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.retrieve(
                WireTransferRetrieveParams.builder().wireTransferId("string").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransferList = wireTransferService.list(WireTransferListParams.builder().build())
        println(wireTransferList)
        wireTransferList.data().forEach { it.validate() }
    }

    @Test
    fun callApprove() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.approve(
                WireTransferApproveParams.builder().wireTransferId("string").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Test
    fun callCancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.cancel(
                WireTransferCancelParams.builder().wireTransferId("string").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Disabled("Prism tests are broken")
    @Test
    fun callReverse() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.reverse(
                WireTransferReverseParams.builder().wireTransferId("string").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Disabled("Prism tests are broken")
    @Test
    fun callSubmit() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.submit(
                WireTransferSubmitParams.builder().wireTransferId("string").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }
}
