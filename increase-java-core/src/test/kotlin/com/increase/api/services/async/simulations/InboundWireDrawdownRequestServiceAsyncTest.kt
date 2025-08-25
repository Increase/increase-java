// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.inboundwiredrawdownrequests.InboundWireDrawdownRequestCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireDrawdownRequestServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireDrawdownRequestServiceAsync =
            client.simulations().inboundWireDrawdownRequests()

        val inboundWireDrawdownRequestFuture =
            inboundWireDrawdownRequestServiceAsync.create(
                InboundWireDrawdownRequestCreateParams.builder()
                    .amount(10000L)
                    .creditorAccountNumber("987654321")
                    .creditorRoutingNumber("101050001")
                    .currency("USD")
                    .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .creditorAddressLine1("33 Liberty Street")
                    .creditorAddressLine2("New York, NY, 10045")
                    .creditorAddressLine3("x")
                    .creditorName("Ian Crease")
                    .debtorAccountNumber("987654321")
                    .debtorAddressLine1("33 Liberty Street")
                    .debtorAddressLine2("New York, NY, 10045")
                    .debtorAddressLine3("x")
                    .debtorName("Ian Crease")
                    .debtorRoutingNumber("101050001")
                    .endToEndIdentification("x")
                    .instructionIdentification("x")
                    .uniqueEndToEndTransactionReference("x")
                    .unstructuredRemittanceInformation("x")
                    .build()
            )

        val inboundWireDrawdownRequest = inboundWireDrawdownRequestFuture.get()
        inboundWireDrawdownRequest.validate()
    }
}
