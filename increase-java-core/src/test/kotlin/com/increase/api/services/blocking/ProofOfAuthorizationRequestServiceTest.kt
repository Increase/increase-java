// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListParams
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestServiceTest {

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestService = client.proofOfAuthorizationRequests()

      val proofOfAuthorizationRequest = proofOfAuthorizationRequestService.retrieve(ProofOfAuthorizationRequestRetrieveParams.builder()
          .proofOfAuthorizationRequestId("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
          .build())

      proofOfAuthorizationRequest.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestService = client.proofOfAuthorizationRequests()

      val page = proofOfAuthorizationRequestService.list()

      page.response().validate()
    }
}
