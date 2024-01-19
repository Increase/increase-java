// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.WireDrawdownRequestListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WireDrawdownRequestServiceTest {

    @Disabled("Prism tests are broken")
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
                    .accountNumberId("string")
                    .amount(123L)
                    .messageToRecipient("x")
                    .recipientAccountNumber("x")
                    .recipientName("x")
                    .recipientRoutingNumber("xxxxxxxxx")
                    .originatorAddressLine1("x")
                    .originatorAddressLine2("x")
                    .originatorAddressLine3("x")
                    .originatorName("x")
                    .recipientAddressLine1("x")
                    .recipientAddressLine2("x")
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
                WireDrawdownRequestRetrieveParams.builder().wireDrawdownRequestId("string").build()
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
        val wireDrawdownRequestList =
            wireDrawdownRequestService.list(WireDrawdownRequestListParams.builder().build())
        println(wireDrawdownRequestList)
        wireDrawdownRequestList.data().forEach { it.validate() }
    }
}
