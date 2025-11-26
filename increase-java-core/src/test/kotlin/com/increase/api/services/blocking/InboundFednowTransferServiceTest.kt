// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundFednowTransferServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferService = client.inboundFednowTransfers()

        val inboundFednowTransfer =
            inboundFednowTransferService.retrieve("inbound_fednow_transfer_ctxxbc07oh5ke5w1hk20")

        inboundFednowTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferService = client.inboundFednowTransfers()

        val inboundFednowTransfers =
            inboundFednowTransferService.list(
                InboundFednowTransferListParams.builder()
                    .accountId("account_id")
                    .accountNumberId("account_number_id")
                    .createdAt(
                        InboundFednowTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        inboundFednowTransfers.validate()
    }
}
