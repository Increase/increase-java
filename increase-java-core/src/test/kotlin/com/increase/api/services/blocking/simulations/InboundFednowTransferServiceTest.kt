// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.inboundfednowtransfers.InboundFednowTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundFednowTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundFednowTransferService = client.simulations().inboundFednowTransfers()

        val inboundFednowTransfer =
            inboundFednowTransferService.create(
                InboundFednowTransferCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(1000L)
                    .debtorAccountNumber("x")
                    .debtorName("x")
                    .debtorRoutingNumber("xxxxxxxxx")
                    .unstructuredRemittanceInformation("x")
                    .build()
            )

        inboundFednowTransfer.validate()
    }
}
