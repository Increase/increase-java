// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()

        val wireTransfer =
            wireTransferService.create(
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
                    .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
                    .originatorAddressLine1("x")
                    .originatorAddressLine2("x")
                    .originatorAddressLine3("x")
                    .originatorName("x")
                    .requireApproval(true)
                    .routingNumber("101050001")
                    .sourceAccountNumberId("source_account_number_id")
                    .build()
            )

        wireTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()

        val wireTransfer = wireTransferService.retrieve("wire_transfer_5akynk7dqsq25qwk9q2u")

        wireTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()

        val page = wireTransferService.list()

        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()

        val wireTransfer = wireTransferService.approve("wire_transfer_5akynk7dqsq25qwk9q2u")

        wireTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireTransferService = client.wireTransfers()

        val wireTransfer = wireTransferService.cancel("wire_transfer_5akynk7dqsq25qwk9q2u")

        wireTransfer.validate()
    }
}
