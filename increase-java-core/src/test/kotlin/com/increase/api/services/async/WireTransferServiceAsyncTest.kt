// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WireTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferServiceAsync = client.wireTransfers()

        val wireTransferFuture =
            wireTransferServiceAsync.create(
                WireTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .beneficiaryName("Ian Crease")
                    .messageToRecipient("New account transfer")
                    .accountNumber("987654321")
                    .beneficiaryAddressLine1("33 Liberty Street")
                    .beneficiaryAddressLine2("New York")
                    .beneficiaryAddressLine3("NY 10045")
                    .externalAccountId("external_account_id")
                    .originatorAddressLine1("x")
                    .originatorAddressLine2("x")
                    .originatorAddressLine3("x")
                    .originatorName("x")
                    .requireApproval(true)
                    .routingNumber("101050001")
                    .sourceAccountNumberId("source_account_number_id")
                    .build()
            )

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferServiceAsync = client.wireTransfers()

        val wireTransferFuture =
            wireTransferServiceAsync.retrieve(
                WireTransferRetrieveParams.builder()
                    .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                    .build()
            )

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferServiceAsync = client.wireTransfers()

        val pageFuture = wireTransferServiceAsync.list()

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
        val wireTransferServiceAsync = client.wireTransfers()

        val wireTransferFuture =
            wireTransferServiceAsync.approve(
                WireTransferApproveParams.builder()
                    .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                    .build()
            )

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferServiceAsync = client.wireTransfers()

        val wireTransferFuture =
            wireTransferServiceAsync.cancel(
                WireTransferCancelParams.builder()
                    .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                    .build()
            )

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }
}
