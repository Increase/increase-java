// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import java.time.OffsetDateTime
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
                    .presentmentAmount(
                        CardPushTransferCreateParams.PresentmentAmount.builder()
                            .currency(CardPushTransferCreateParams.PresentmentAmount.Currency.USD)
                            .value("1234.56")
                            .build()
                    )
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

        val cardPushTransfersFuture =
            cardPushTransferServiceAsync.list(
                CardPushTransferListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        CardPushTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .status(
                        CardPushTransferListParams.Status.builder()
                            .addIn(CardPushTransferListParams.Status.In.PENDING_APPROVAL)
                            .build()
                    )
                    .build()
            )

        val cardPushTransfers = cardPushTransfersFuture.get()
        cardPushTransfers.validate()
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
