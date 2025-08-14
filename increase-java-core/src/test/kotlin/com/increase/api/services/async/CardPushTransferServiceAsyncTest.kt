// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPushTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransferFuture =
            cardPushTransferServiceAsync.create(
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

        val cardPushTransfer = cardPushTransferFuture.get()
        cardPushTransfer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransferFuture =
            cardPushTransferServiceAsync.retrieve(
                "outbound_card_push_transfer_e0z9rdpamraczh4tvwye"
            )

        val cardPushTransfer = cardPushTransferFuture.get()
        cardPushTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val pageFuture = cardPushTransferServiceAsync.list()

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
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransferFuture =
            cardPushTransferServiceAsync.approve("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        val cardPushTransfer = cardPushTransferFuture.get()
        cardPushTransfer.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPushTransferServiceAsync = client.cardPushTransfers()

        val cardPushTransferFuture =
            cardPushTransferServiceAsync.cancel("outbound_card_push_transfer_e0z9rdpamraczh4tvwye")

        val cardPushTransfer = cardPushTransferFuture.get()
        cardPushTransfer.validate()
    }
}
