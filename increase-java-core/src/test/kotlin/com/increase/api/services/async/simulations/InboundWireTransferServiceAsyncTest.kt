// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.inboundwiretransfers.InboundWireTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireTransferServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferServiceAsync = client.simulations().inboundWireTransfers()

        val inboundWireTransferFuture =
            inboundWireTransferServiceAsync.create(
                InboundWireTransferCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(1000L)
                    .creditorAddressLine1("x")
                    .creditorAddressLine2("x")
                    .creditorAddressLine3("x")
                    .creditorName("x")
                    .debtorAddressLine1("x")
                    .debtorAddressLine2("x")
                    .debtorAddressLine3("x")
                    .debtorName("x")
                    .endToEndIdentification("x")
                    .instructingAgentRoutingNumber("x")
                    .instructionIdentification("x")
                    .uniqueEndToEndTransactionReference("x")
                    .unstructuredRemittanceInformation("x")
                    .wireDrawdownRequestId("wire_drawdown_request_id")
                    .build()
            )

        val inboundWireTransfer = inboundWireTransferFuture.get()
        inboundWireTransfer.validate()
    }
}
