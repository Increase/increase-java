// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundMailItemServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemServiceAsync = client.inboundMailItems()

        val inboundMailItemFuture =
            inboundMailItemServiceAsync.retrieve("inbound_mail_item_q6rrg7mmqpplx80zceev")

        val inboundMailItem = inboundMailItemFuture.get()
        inboundMailItem.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundMailItemServiceAsync = client.inboundMailItems()

        val pageFuture = inboundMailItemServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
