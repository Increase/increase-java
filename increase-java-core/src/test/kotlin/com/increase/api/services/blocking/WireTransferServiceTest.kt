// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import com.increase.api.models.wiretransfers.WireTransferListParams
import java.time.LocalDate
import java.time.OffsetDateTime
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
                    .creditor(
                        WireTransferCreateParams.Creditor.builder()
                            .name("Ian Crease")
                            .address(
                                WireTransferCreateParams.Creditor.Address.builder()
                                    .unstructured(
                                        WireTransferCreateParams.Creditor.Address.Unstructured
                                            .builder()
                                            .line1("33 Liberty Street")
                                            .line2("New York")
                                            .line3("NY 10045")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
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
                    .accountNumber("987654321")
                    .debtor(
                        WireTransferCreateParams.Debtor.builder()
                            .name("x")
                            .address(
                                WireTransferCreateParams.Debtor.Address.builder()
                                    .unstructured(
                                        WireTransferCreateParams.Debtor.Address.Unstructured
                                            .builder()
                                            .line1("x")
                                            .line2("x")
                                            .line3("x")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .externalAccountId("external_account_id")
                    .inboundWireDrawdownRequestId("inbound_wire_drawdown_request_id")
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

        val wireTransfers =
            wireTransferService.list(
                WireTransferListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        WireTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .externalAccountId("external_account_id")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        wireTransfers.validate()
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
