// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckbookServiceAsyncTest {

    @Test
    fun mail() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookServiceAsync = client.simulations().checkbooks()

        val checkbookFuture = checkbookServiceAsync.mail("checkbook_7iudxhxum6vlkcjxmi8y")

        val checkbook = checkbookFuture.get()
        checkbook.validate()
    }
}
