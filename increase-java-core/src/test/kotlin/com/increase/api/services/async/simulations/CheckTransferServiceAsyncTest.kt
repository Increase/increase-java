// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckTransferServiceAsyncTest {

    @Test
    fun mail() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkTransferServiceAsync = client.simulations().checkTransfers()

        val checkTransferFuture =
            checkTransferServiceAsync.mail("check_transfer_30b43acfu9vw8fyc4f5")

        val checkTransfer = checkTransferFuture.get()
        checkTransfer.validate()
    }
}
