// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WireDrawdownRequestServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.wireDrawdownRequests()
        val wireDrawdownRequest =
            wireDrawdownRequestService.create(
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
        println(wireDrawdownRequest)
        wireDrawdownRequest.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.wireDrawdownRequests()
        val wireDrawdownRequest =
            wireDrawdownRequestService.retrieve(
                WireDrawdownRequestRetrieveParams.builder()
                    .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                    .build()
            )
        println(wireDrawdownRequest)
        wireDrawdownRequest.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.wireDrawdownRequests()
        val wireDrawdownRequestList = wireDrawdownRequestService.list()
        println(wireDrawdownRequestList)
        wireDrawdownRequestList.data().forEach { it.validate() }
    }
}
