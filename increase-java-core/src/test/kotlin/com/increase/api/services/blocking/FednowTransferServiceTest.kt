// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.fednowtransfers.FednowTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FednowTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fednowTransferService = client.fednowTransfers()

        val fednowTransfer =
            fednowTransferService.create(
                FednowTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .creditorName("Ian Crease")
                    .debtorName("National Phonograph Company")
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .accountNumber("987654321")
                    .creditorAddress(
                        FednowTransferCreateParams.CreditorAddress.builder()
                            .city("New York")
                            .postalCode("10045")
                            .state("NY")
                            .line1("33 Liberty Street")
                            .build()
                    )
                    .debtorAddress(
                        FednowTransferCreateParams.DebtorAddress.builder()
                            .city("x")
                            .postalCode("x")
                            .state("x")
                            .line1("x")
                            .build()
                    )
                    .externalAccountId("external_account_id")
                    .requireApproval(true)
                    .routingNumber("101050001")
                    .build()
            )

        fednowTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fednowTransferService = client.fednowTransfers()

        val fednowTransfer = fednowTransferService.retrieve("fednow_transfer_4i0mptrdu1mueg1196bg")

        fednowTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fednowTransferService = client.fednowTransfers()

        val page = fednowTransferService.list()

        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fednowTransferService = client.fednowTransfers()

        val fednowTransfer = fednowTransferService.approve("fednow_transfer_4i0mptrdu1mueg1196bg")

        fednowTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fednowTransferService = client.fednowTransfers()

        val fednowTransfer = fednowTransferService.cancel("fednow_transfer_4i0mptrdu1mueg1196bg")

        fednowTransfer.validate()
    }
}
