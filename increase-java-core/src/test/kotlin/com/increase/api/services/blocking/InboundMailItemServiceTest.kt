// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.inboundmailitems.InboundMailItemActionParams
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundMailItemServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()

        val inboundMailItem =
            inboundMailItemService.retrieve("inbound_mail_item_q6rrg7mmqpplx80zceev")

        inboundMailItem.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()

        val inboundMailItems =
            inboundMailItemService.list(
                InboundMailItemListParams.builder()
                    .createdAt(
                        InboundMailItemListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .lockboxId("lockbox_id")
                    .build()
            )

        inboundMailItems.validate()
    }

    @Test
    fun action() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemService = client.inboundMailItems()

        val inboundMailItem =
            inboundMailItemService.action(
                InboundMailItemActionParams.builder()
                    .inboundMailItemId("inbound_mail_item_q6rrg7mmqpplx80zceev")
                    .addCheck(
                        InboundMailItemActionParams.Check.builder()
                            .action(InboundMailItemActionParams.Check.Action.DEPOSIT)
                            .account("account_in71c4amph0vgo2qllky")
                            .build()
                    )
                    .addCheck(
                        InboundMailItemActionParams.Check.builder()
                            .action(InboundMailItemActionParams.Check.Action.IGNORE)
                            .account("account")
                            .build()
                    )
                    .build()
            )

        inboundMailItem.validate()
    }
}
