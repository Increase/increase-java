// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestSubmissionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestSubmissionServiceAsync =
            client.proofOfAuthorizationRequestSubmissions()

        val proofOfAuthorizationRequestSubmissionFuture =
            proofOfAuthorizationRequestSubmissionServiceAsync.create(
                ProofOfAuthorizationRequestSubmissionCreateParams.builder()
                    .authorizationTerms("I agree to the terms of service.")
                    .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .authorizerEmail("user@example.com")
                    .authorizerName("Ian Crease")
                    .customerHasBeenOffboarded(true)
                    .proofOfAuthorizationRequestId(
                        "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                    )
                    .validatedAccountOwnershipViaCredential(true)
                    .validatedAccountOwnershipWithAccountStatement(true)
                    .validatedAccountOwnershipWithMicrodeposit(true)
                    .authorizerCompany("National Phonograph Company")
                    .authorizerIpAddress("x")
                    .build()
            )

        val proofOfAuthorizationRequestSubmission =
            proofOfAuthorizationRequestSubmissionFuture.get()
        proofOfAuthorizationRequestSubmission.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestSubmissionServiceAsync =
            client.proofOfAuthorizationRequestSubmissions()

        val proofOfAuthorizationRequestSubmissionFuture =
            proofOfAuthorizationRequestSubmissionServiceAsync.retrieve(
                ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
                    .proofOfAuthorizationRequestSubmissionId(
                        "proof_of_authorization_request_submission_uqhqroiley7n0097vizn"
                    )
                    .build()
            )

        val proofOfAuthorizationRequestSubmission =
            proofOfAuthorizationRequestSubmissionFuture.get()
        proofOfAuthorizationRequestSubmission.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestSubmissionServiceAsync =
            client.proofOfAuthorizationRequestSubmissions()

        val pageFuture = proofOfAuthorizationRequestSubmissionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
