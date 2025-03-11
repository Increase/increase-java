// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestSubmissionServiceTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestSubmissionService = client.proofOfAuthorizationRequestSubmissions()

      val proofOfAuthorizationRequestSubmission = proofOfAuthorizationRequestSubmissionService.create(ProofOfAuthorizationRequestSubmissionCreateParams.builder()
          .authorizationTerms("I agree to the terms of service.")
          .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
          .authorizerEmail("user@example.com")
          .authorizerName("Ian Crease")
          .customerHasBeenOffboarded(true)
          .proofOfAuthorizationRequestId("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
          .validatedAccountOwnershipViaCredential(true)
          .validatedAccountOwnershipWithAccountStatement(true)
          .validatedAccountOwnershipWithMicrodeposit(true)
          .authorizerCompany("National Phonograph Company")
          .authorizerIpAddress("x")
          .build())

      proofOfAuthorizationRequestSubmission.validate()
    }

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestSubmissionService = client.proofOfAuthorizationRequestSubmissions()

      val proofOfAuthorizationRequestSubmission = proofOfAuthorizationRequestSubmissionService.retrieve(ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
          .proofOfAuthorizationRequestSubmissionId("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
          .build())

      proofOfAuthorizationRequestSubmission.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val proofOfAuthorizationRequestSubmissionService = client.proofOfAuthorizationRequestSubmissions()

      val page = proofOfAuthorizationRequestSubmissionService.list()

      page.response().validate()
    }
}
