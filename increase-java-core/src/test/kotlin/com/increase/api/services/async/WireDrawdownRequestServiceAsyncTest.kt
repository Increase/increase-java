// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireDrawdownRequestServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.wireDrawdownRequests()

        val wireDrawdownRequestFuture =
            wireDrawdownRequestServiceAsync.create(
                WireDrawdownRequestCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(10000L)
                    .messageToRecipient("Invoice 29582")
                    .recipientAccountNumber("987654321")
                    .recipientName("Ian Crease")
                    .recipientRoutingNumber("101050001")
                    .originatorAddressLine1("x")
                    .originatorAddressLine2("x")
                    .originatorAddressLine3("x")
                    .originatorName("x")
                    .recipientAddressLine1("33 Liberty Street")
                    .recipientAddressLine2("New York, NY, 10045")
                    .recipientAddressLine3("x")
                    .build()
            )

        val wireDrawdownRequest = wireDrawdownRequestFuture.get()
        wireDrawdownRequest.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.wireDrawdownRequests()

        val wireDrawdownRequestFuture =
            wireDrawdownRequestServiceAsync.retrieve(
                WireDrawdownRequestRetrieveParams.builder()
                    .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                    .build()
            )

        val wireDrawdownRequest = wireDrawdownRequestFuture.get()
        wireDrawdownRequest.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestServiceAsync = client.wireDrawdownRequests()

        val pageFuture = wireDrawdownRequestServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
