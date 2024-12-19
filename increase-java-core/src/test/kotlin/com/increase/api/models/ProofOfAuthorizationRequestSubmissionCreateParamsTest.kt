// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestSubmissionCreateParamsTest {

    @Test
    fun createProofOfAuthorizationRequestSubmissionCreateParams() {
        ProofOfAuthorizationRequestSubmissionCreateParams.builder()
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
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.authorizationTerms()).isEqualTo("I agree to the terms of service.")
        assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(body.authorizerEmail()).isEqualTo("user@example.com")
        assertThat(body.authorizerName()).isEqualTo("Ian Crease")
        assertThat(body.customerHasBeenOffboarded()).isEqualTo(true)
        assertThat(body.proofOfAuthorizationRequestId())
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        assertThat(body.validatedAccountOwnershipViaCredential()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithAccountStatement()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithMicrodeposit()).isEqualTo(true)
        assertThat(body.authorizerCompany()).isEqualTo("National Phonograph Company")
        assertThat(body.authorizerIpAddress()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.authorizationTerms()).isEqualTo("I agree to the terms of service.")
        assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(body.authorizerEmail()).isEqualTo("user@example.com")
        assertThat(body.authorizerName()).isEqualTo("Ian Crease")
        assertThat(body.customerHasBeenOffboarded()).isEqualTo(true)
        assertThat(body.proofOfAuthorizationRequestId())
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        assertThat(body.validatedAccountOwnershipViaCredential()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithAccountStatement()).isEqualTo(true)
        assertThat(body.validatedAccountOwnershipWithMicrodeposit()).isEqualTo(true)
    }
}
