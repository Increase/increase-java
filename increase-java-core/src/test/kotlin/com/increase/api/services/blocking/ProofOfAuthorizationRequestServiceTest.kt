// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.ProofOfAuthorizationRequestListParams
import com.increase.api.models.ProofOfAuthorizationRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestService = client.proofOfAuthorizationRequests()
        val proofOfAuthorizationRequest =
            proofOfAuthorizationRequestService.retrieve(
                ProofOfAuthorizationRequestRetrieveParams.builder()
                    .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
                    .build()
            )
        println(proofOfAuthorizationRequest)
        proofOfAuthorizationRequest.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestService = client.proofOfAuthorizationRequests()
        val proofOfAuthorizationRequestList =
            proofOfAuthorizationRequestService.list(
                ProofOfAuthorizationRequestListParams.builder().build()
            )
        println(proofOfAuthorizationRequestList)
        proofOfAuthorizationRequestList.data().forEach { it.validate() }
    }
}
