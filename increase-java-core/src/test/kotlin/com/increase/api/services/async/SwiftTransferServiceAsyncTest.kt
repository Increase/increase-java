// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.swifttransfers.SwiftTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SwiftTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swiftTransferServiceAsync = client.swiftTransfers()

        val swiftTransferFuture =
            swiftTransferServiceAsync.create(
                SwiftTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .accountNumber("987654321")
                    .bankIdentificationCode("ECBFDEFFTPP")
                    .creditorAddress(
                        SwiftTransferCreateParams.CreditorAddress.builder()
                            .city("Frankfurt")
                            .country("DE")
                            .line1("Sonnemannstrasse 20")
                            .line2("x")
                            .postalCode("60314")
                            .state("x")
                            .build()
                    )
                    .creditorName("Ian Crease")
                    .debtorAddress(
                        SwiftTransferCreateParams.DebtorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("x")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .debtorName("National Phonograph Company")
                    .instructedAmount(100L)
                    .instructedCurrency(SwiftTransferCreateParams.InstructedCurrency.USD)
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .unstructuredRemittanceInformation("New Swift transfer")
                    .requireApproval(true)
                    .routingNumber("x")
                    .build()
            )

        val swiftTransfer = swiftTransferFuture.get()
        swiftTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swiftTransferServiceAsync = client.swiftTransfers()

        val swiftTransferFuture =
            swiftTransferServiceAsync.retrieve("swift_transfer_29h21xkng03788zwd3fh")

        val swiftTransfer = swiftTransferFuture.get()
        swiftTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swiftTransferServiceAsync = client.swiftTransfers()

        val pageFuture = swiftTransferServiceAsync.list()

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
        val swiftTransferServiceAsync = client.swiftTransfers()

        val swiftTransferFuture =
            swiftTransferServiceAsync.approve("swift_transfer_29h21xkng03788zwd3fh")

        val swiftTransfer = swiftTransferFuture.get()
        swiftTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val swiftTransferServiceAsync = client.swiftTransfers()

        val swiftTransferFuture =
            swiftTransferServiceAsync.cancel("swift_transfer_29h21xkng03788zwd3fh")

        val swiftTransfer = swiftTransferFuture.get()
        swiftTransfer.validate()
    }
}
