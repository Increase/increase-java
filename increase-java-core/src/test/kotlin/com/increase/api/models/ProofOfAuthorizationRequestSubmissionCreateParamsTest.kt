// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestSubmissionCreateParamsTest {

    @Test
    fun createProofOfAuthorizationRequestSubmissionCreateParams() {
        ProofOfAuthorizationRequestSubmissionCreateParams.builder()
            .authorizationTerms("x")
            .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .authorizerEmail("x")
            .authorizerName("x")
            .proofOfAuthorizationRequestId("string")
            .authorizerCompany("x")
            .authorizerIpAddress("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ProofOfAuthorizationRequestSubmissionCreateParams.builder()
                .authorizationTerms("x")
                .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .authorizerEmail("x")
                .authorizerName("x")
                .proofOfAuthorizationRequestId("string")
                .authorizerCompany("x")
                .authorizerIpAddress("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.authorizationTerms()).isEqualTo("x")
        assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.authorizerEmail()).isEqualTo("x")
        assertThat(body.authorizerName()).isEqualTo("x")
        assertThat(body.proofOfAuthorizationRequestId()).isEqualTo("string")
        assertThat(body.authorizerCompany()).isEqualTo("x")
        assertThat(body.authorizerIpAddress()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ProofOfAuthorizationRequestSubmissionCreateParams.builder()
                .authorizationTerms("x")
                .authorizedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .authorizerEmail("x")
                .authorizerName("x")
                .proofOfAuthorizationRequestId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.authorizationTerms()).isEqualTo("x")
        assertThat(body.authorizedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.authorizerEmail()).isEqualTo("x")
        assertThat(body.authorizerName()).isEqualTo("x")
        assertThat(body.proofOfAuthorizationRequestId()).isEqualTo("string")
    }
}
