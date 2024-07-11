// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceTest {

    @Disabled("Prism tests are broken")
    @Test
    fun callComplete() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.simulations().accountTransfers()
        val accountTransfer =
            accountTransferService.complete(
                SimulationAccountTransferCompleteParams.builder()
                    .accountTransferId("account_transfer_id")
                    .build()
            )
        println(accountTransfer)
        accountTransfer.validate()
    }
}
