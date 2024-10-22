// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.WireTransferListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WireTransferServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.create(
                WireTransferCreateParams.builder()
                    .accountId("account_id")
                    .amount(123L)
                    .beneficiaryName("x")
                    .messageToRecipient("x")
                    .accountNumber("x")
                    .beneficiaryAddressLine1("x")
                    .beneficiaryAddressLine2("x")
                    .beneficiaryAddressLine3("x")
                    .externalAccountId("external_account_id")
                    .originatorAddressLine1("x")
                    .originatorAddressLine2("x")
                    .originatorAddressLine3("x")
                    .originatorName("x")
                    .requireApproval(true)
                    .routingNumber("xxxxxxxxx")
                    .sourceAccountNumberId("source_account_number_id")
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
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.retrieve(
                WireTransferRetrieveParams.builder().wireTransferId("wire_transfer_id").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
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
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.approve(
                WireTransferApproveParams.builder().wireTransferId("wire_transfer_id").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }

    @Test
    fun callCancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()
        val wireTransfer =
            wireTransferService.cancel(
                WireTransferCancelParams.builder().wireTransferId("wire_transfer_id").build()
            )
        println(wireTransfer)
        wireTransfer.validate()
    }
}
