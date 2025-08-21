// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.inboundwiretransfers.InboundWireTransferCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundWireTransferServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundWireTransferService = client.simulations().inboundWireTransfers()

        val inboundWireTransfer =
            inboundWireTransferService.create(
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

        inboundWireTransfer.validate()
    }
}
