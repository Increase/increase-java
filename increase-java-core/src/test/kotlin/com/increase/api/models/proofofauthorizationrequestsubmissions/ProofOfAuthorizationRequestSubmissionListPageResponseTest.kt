// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestSubmissionListPageResponseTest {

    @Test
    fun create() {
        val proofOfAuthorizationRequestSubmissionListPageResponse =
            ProofOfAuthorizationRequestSubmissionListPageResponse.builder()
                .addData(
                    ProofOfAuthorizationRequestSubmission.builder()
                        .id("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
                        .addAdditionalEvidenceFile(
                            ProofOfAuthorizationRequestSubmission.AdditionalEvidenceFile.builder()
                                .fileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .authorizationTerms("I agree to the terms.")
                        .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .authorizerCompany("National Phonograph Company")
                        .authorizerEmail("user@example.com")
                        .authorizerIpAddress("123.45.67.89")
                        .authorizerName("Ian Crease")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .customerHasBeenOffboarded(false)
                        .idempotencyKey(null)
                        .proofOfAuthorizationRequestId(
                            "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                        )
                        .status(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
                        .type(
                            ProofOfAuthorizationRequestSubmission.Type
                                .PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                        )
                        .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .validatedAccountOwnershipViaCredential(false)
                        .validatedAccountOwnershipWithAccountStatement(false)
                        .validatedAccountOwnershipWithMicrodeposit(true)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(proofOfAuthorizationRequestSubmissionListPageResponse.data())
            .containsExactly(
                ProofOfAuthorizationRequestSubmission.builder()
                    .id("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
                    .addAdditionalEvidenceFile(
                        ProofOfAuthorizationRequestSubmission.AdditionalEvidenceFile.builder()
                            .fileId("file_makxrc67oh9l6sg7w9yc")
                            .build()
                    )
                    .authorizationTerms("I agree to the terms.")
                    .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .authorizerCompany("National Phonograph Company")
                    .authorizerEmail("user@example.com")
                    .authorizerIpAddress("123.45.67.89")
                    .authorizerName("Ian Crease")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .customerHasBeenOffboarded(false)
                    .idempotencyKey(null)
                    .proofOfAuthorizationRequestId(
                        "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                    )
                    .status(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
                    .type(
                        ProofOfAuthorizationRequestSubmission.Type
                            .PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                    )
                    .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .validatedAccountOwnershipViaCredential(false)
                    .validatedAccountOwnershipWithAccountStatement(false)
                    .validatedAccountOwnershipWithMicrodeposit(true)
                    .build()
            )
        assertThat(proofOfAuthorizationRequestSubmissionListPageResponse.nextCursor())
            .contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val proofOfAuthorizationRequestSubmissionListPageResponse =
            ProofOfAuthorizationRequestSubmissionListPageResponse.builder()
                .addData(
                    ProofOfAuthorizationRequestSubmission.builder()
                        .id("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
                        .addAdditionalEvidenceFile(
                            ProofOfAuthorizationRequestSubmission.AdditionalEvidenceFile.builder()
                                .fileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .authorizationTerms("I agree to the terms.")
                        .authorizedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .authorizerCompany("National Phonograph Company")
                        .authorizerEmail("user@example.com")
                        .authorizerIpAddress("123.45.67.89")
                        .authorizerName("Ian Crease")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .customerHasBeenOffboarded(false)
                        .idempotencyKey(null)
                        .proofOfAuthorizationRequestId(
                            "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                        )
                        .status(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
                        .type(
                            ProofOfAuthorizationRequestSubmission.Type
                                .PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                        )
                        .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .validatedAccountOwnershipViaCredential(false)
                        .validatedAccountOwnershipWithAccountStatement(false)
                        .validatedAccountOwnershipWithMicrodeposit(true)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedProofOfAuthorizationRequestSubmissionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    proofOfAuthorizationRequestSubmissionListPageResponse
                ),
                jacksonTypeRef<ProofOfAuthorizationRequestSubmissionListPageResponse>(),
            )

        assertThat(roundtrippedProofOfAuthorizationRequestSubmissionListPageResponse)
            .isEqualTo(proofOfAuthorizationRequestSubmissionListPageResponse)
    }
}
