// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.ProofOfAuthorizationRequestSubmissionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProofOfAuthorizationRequestSubmissionServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestSubmissionService =
            client.proofOfAuthorizationRequestSubmissions()
        val proofOfAuthorizationRequestSubmission =
            proofOfAuthorizationRequestSubmissionService.create(
                ProofOfAuthorizationRequestSubmissionCreateParams.builder()
                    .authorizationTerms("x")
                    .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .authorizerEmail("x")
                    .authorizerName("x")
                    .customerHasBeenOffboarded(true)
                    .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
                    .validatedAccountOwnershipViaCredential(true)
                    .validatedAccountOwnershipWithAccountStatement(true)
                    .validatedAccountOwnershipWithMicrodeposit(true)
                    .authorizerCompany("x")
                    .authorizerIpAddress("x")
                    .build()
            )
        println(proofOfAuthorizationRequestSubmission)
        proofOfAuthorizationRequestSubmission.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestSubmissionService =
            client.proofOfAuthorizationRequestSubmissions()
        val proofOfAuthorizationRequestSubmission =
            proofOfAuthorizationRequestSubmissionService.retrieve(
                ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
                    .proofOfAuthorizationRequestSubmissionId(
                        "proof_of_authorization_request_submission_id"
                    )
                    .build()
            )
        println(proofOfAuthorizationRequestSubmission)
        proofOfAuthorizationRequestSubmission.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val proofOfAuthorizationRequestSubmissionService =
            client.proofOfAuthorizationRequestSubmissions()
        val proofOfAuthorizationRequestSubmissionList =
            proofOfAuthorizationRequestSubmissionService.list(
                ProofOfAuthorizationRequestSubmissionListParams.builder().build()
            )
        println(proofOfAuthorizationRequestSubmissionList)
        proofOfAuthorizationRequestSubmissionList.data().forEach { it.validate() }
    }
}
