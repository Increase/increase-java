// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestSubmissionTest {

    @Test
    fun createProofOfAuthorizationRequestSubmission() {
        val proofOfAuthorizationRequestSubmission =
            ProofOfAuthorizationRequestSubmission.builder()
                .id("id")
                .authorizationTerms("authorization_terms")
                .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .authorizerCompany("authorizer_company")
                .authorizerEmail("authorizer_email")
                .authorizerIpAddress("authorizer_ip_address")
                .authorizerName("authorizer_name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customerHasBeenOffboarded(true)
                .idempotencyKey("idempotency_key")
                .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
                .status(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
                .type(
                    ProofOfAuthorizationRequestSubmission.Type
                        .PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .validatedAccountOwnershipViaCredential(true)
                .validatedAccountOwnershipWithAccountStatement(true)
                .validatedAccountOwnershipWithMicrodeposit(true)
                .build()
        assertThat(proofOfAuthorizationRequestSubmission).isNotNull
        assertThat(proofOfAuthorizationRequestSubmission.id()).isEqualTo("id")
        assertThat(proofOfAuthorizationRequestSubmission.authorizationTerms())
            .isEqualTo("authorization_terms")
        assertThat(proofOfAuthorizationRequestSubmission.authorizedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequestSubmission.authorizerCompany())
            .contains("authorizer_company")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerEmail())
            .contains("authorizer_email")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerIpAddress())
            .contains("authorizer_ip_address")
        assertThat(proofOfAuthorizationRequestSubmission.authorizerName())
            .contains("authorizer_name")
        assertThat(proofOfAuthorizationRequestSubmission.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequestSubmission.customerHasBeenOffboarded()).contains(true)
        assertThat(proofOfAuthorizationRequestSubmission.idempotencyKey())
            .contains("idempotency_key")
        assertThat(proofOfAuthorizationRequestSubmission.proofOfAuthorizationRequestId())
            .isEqualTo("proof_of_authorization_request_id")
        assertThat(proofOfAuthorizationRequestSubmission.status())
            .isEqualTo(ProofOfAuthorizationRequestSubmission.Status.PENDING_REVIEW)
        assertThat(proofOfAuthorizationRequestSubmission.type())
            .isEqualTo(
                ProofOfAuthorizationRequestSubmission.Type.PROOF_OF_AUTHORIZATION_REQUEST_SUBMISSION
            )
        assertThat(proofOfAuthorizationRequestSubmission.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequestSubmission.validatedAccountOwnershipViaCredential())
            .contains(true)
        assertThat(
                proofOfAuthorizationRequestSubmission
                    .validatedAccountOwnershipWithAccountStatement()
            )
            .contains(true)
        assertThat(
                proofOfAuthorizationRequestSubmission.validatedAccountOwnershipWithMicrodeposit()
            )
            .contains(true)
    }
}
