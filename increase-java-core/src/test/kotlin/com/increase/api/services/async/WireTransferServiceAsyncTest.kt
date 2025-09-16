// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireTransferServiceAsyncTest {

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
                    .remittance(
                        WireTransferCreateParams.Remittance.builder()
                            .category(WireTransferCreateParams.Remittance.Category.UNSTRUCTURED)
                            .tax(
                                WireTransferCreateParams.Remittance.Tax.builder()
                                    .date(LocalDate.parse("2019-12-27"))
                                    .identificationNumber("xxxxxxxxx")
                                    .typeCode("xxxxx")
                                    .build()
                            )
                            .unstructured(
                                WireTransferCreateParams.Remittance.Unstructured.builder()
                                    .message("New account transfer")
                                    .build()
                            )
                            .build()
                    )
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
            wireTransferServiceAsync.retrieve("wire_transfer_5akynk7dqsq25qwk9q2u")

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
            wireTransferServiceAsync.approve("wire_transfer_5akynk7dqsq25qwk9q2u")

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
            wireTransferServiceAsync.cancel("wire_transfer_5akynk7dqsq25qwk9q2u")

        val wireTransfer = wireTransferFuture.get()
        wireTransfer.validate()
    }
}
