// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
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
                    .creditorAddress(
                        WireDrawdownRequestCreateParams.CreditorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("x")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .creditorName("National Phonograph Company")
                    .debtorAccountNumber("987654321")
                    .debtorAddress(
                        WireDrawdownRequestCreateParams.DebtorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("x")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .debtorName("Ian Crease")
                    .debtorRoutingNumber("101050001")
                    .unstructuredRemittanceInformation("Invoice 29582")
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
            wireDrawdownRequestServiceAsync.retrieve("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

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
