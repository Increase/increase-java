// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundRealTimePaymentsTransferServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync = client.inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransferFuture =
            inboundRealTimePaymentsTransferServiceAsync.retrieve(
                "inbound_real_time_payments_transfer_63hlz498vcxg644hcrzr"
            )

        val inboundRealTimePaymentsTransfer = inboundRealTimePaymentsTransferFuture.get()
        inboundRealTimePaymentsTransfer.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsTransferServiceAsync = client.inboundRealTimePaymentsTransfers()

        val inboundRealTimePaymentsTransfersFuture =
            inboundRealTimePaymentsTransferServiceAsync.list(
                InboundRealTimePaymentsTransferListParams.builder()
                    .accountId("account_id")
                    .accountNumberId("account_number_id")
                    .createdAt(
                        InboundRealTimePaymentsTransferListParams.CreatedAt.builder()
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

        val inboundRealTimePaymentsTransfers = inboundRealTimePaymentsTransfersFuture.get()
        inboundRealTimePaymentsTransfers.validate()
    }
}
