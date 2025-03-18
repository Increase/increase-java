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
                    .beneficiaryAccountNumber("987654321")
                    .beneficiaryRoutingNumber("101050001")
                    .currency("USD")
                    .messageToRecipient("Invoice 29582")
                    .originatorAccountNumber("987654321")
                    .originatorRoutingNumber("101050001")
                    .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .beneficiaryAddressLine1("33 Liberty Street")
                    .beneficiaryAddressLine2("New York, NY, 10045")
                    .beneficiaryAddressLine3("x")
                    .beneficiaryName("Ian Crease")
                    .originatorAddressLine1("33 Liberty Street")
                    .originatorAddressLine2("New York, NY, 10045")
                    .originatorAddressLine3("x")
                    .originatorName("Ian Crease")
                    .originatorToBeneficiaryInformationLine1("x")
                    .originatorToBeneficiaryInformationLine2("x")
                    .originatorToBeneficiaryInformationLine3("x")
                    .originatorToBeneficiaryInformationLine4("x")
                    .build()
            )

        val inboundWireDrawdownRequest = inboundWireDrawdownRequestFuture.get()
        inboundWireDrawdownRequest.validate()
    }
}
