// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.checktransfers.CheckTransferMailParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckTransferServiceTest {

    @Test
    fun mail() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferService = client.simulations().checkTransfers()

        val checkTransfer =
            checkTransferService.mail(
                CheckTransferMailParams.builder()
                    .checkTransferId("check_transfer_30b43acfu9vw8fyc4f5")
                    .build()
            )

        checkTransfer.validate()
    }
}
