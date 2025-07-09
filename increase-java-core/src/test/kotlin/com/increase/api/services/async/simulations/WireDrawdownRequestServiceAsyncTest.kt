// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireDrawdownRequestServiceAsyncTest {

    @Test
    fun refuse() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.simulations().wireDrawdownRequests()

        val wireDrawdownRequestFuture =
            wireDrawdownRequestServiceAsync.refuse("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        val wireDrawdownRequest = wireDrawdownRequestFuture.get()
        wireDrawdownRequest.validate()
    }
}
