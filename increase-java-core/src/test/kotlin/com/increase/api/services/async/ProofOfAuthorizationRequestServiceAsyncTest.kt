// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestServiceAsync = client.proofOfAuthorizationRequests()

        val proofOfAuthorizationRequestFuture =
            proofOfAuthorizationRequestServiceAsync.retrieve(
                ProofOfAuthorizationRequestRetrieveParams.builder()
                    .proofOfAuthorizationRequestId(
                        "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                    )
                    .build()
            )

        val proofOfAuthorizationRequest = proofOfAuthorizationRequestFuture.get()
        proofOfAuthorizationRequest.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestServiceAsync = client.proofOfAuthorizationRequests()

        val pageFuture = proofOfAuthorizationRequestServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
