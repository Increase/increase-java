// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundRealTimePaymentsRequestsForPaymentServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsRequestsForPaymentServiceAsync =
            client.inboundRealTimePaymentsRequestsForPayment()

        val inboundRealTimePaymentsRequestForPaymentFuture =
            inboundRealTimePaymentsRequestsForPaymentServiceAsync.retrieve(
                "inbound_real_time_payments_request_for_payment_j9c5rm4hr6qf34en8tky"
            )

        val inboundRealTimePaymentsRequestForPayment =
            inboundRealTimePaymentsRequestForPaymentFuture.get()
        inboundRealTimePaymentsRequestForPayment.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundRealTimePaymentsRequestsForPaymentServiceAsync =
            client.inboundRealTimePaymentsRequestsForPayment()

        val pageFuture = inboundRealTimePaymentsRequestsForPaymentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
