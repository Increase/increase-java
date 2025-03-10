// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.documents.DocumentCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DocumentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val documentServiceAsync = client.simulations().documents()

        val documentFuture =
            documentServiceAsync.create(
                DocumentCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
            )

        val document = documentFuture.get()
        document.validate()
    }
}
