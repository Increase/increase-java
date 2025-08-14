// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPushTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferService = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferService.create(
                CardPushTransferCreateParams.builder()
                    .amount(100L)
                    .businessApplicationIdentifier(
                        CardPushTransferCreateParams.BusinessApplicationIdentifier
                            .FUNDS_DISBURSEMENT
                    )
                    .cardTokenId("outbound_card_token_zlt0ml6youq3q7vcdlg0")
                    .merchantCategoryCode("1234")
                    .merchantCityName("New York")
                    .merchantName("Acme Corp")
                    .merchantNamePrefix("Acme")
                    .merchantPostalCode("10045")
                    .merchantState("NY")
                    .recipientName("Ian Crease")
                    .senderAddressCity("New York")
                    .senderAddressLine1("33 Liberty Street")
                    .senderAddressPostalCode("10045")
                    .senderAddressState("NY")
                    .senderName("Ian Crease")
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .requireApproval(true)
                    .build()
            )

        cardPushTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferService = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferService.retrieve("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        cardPushTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferService = client.cardPushTransfers()

        val page = cardPushTransferService.list()

        page.response().validate()
    }

    @Test
    fun approve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferService = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferService.approve("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        cardPushTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferService = client.cardPushTransfers()

        val cardPushTransfer =
            cardPushTransferService.cancel("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        cardPushTransfer.validate()
    }
}
