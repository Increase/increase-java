// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestSubmissionListParamsTest {

    @Test
    fun create() {
        ProofOfAuthorizationRequestSubmissionListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ProofOfAuthorizationRequestSubmissionListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .proofOfAuthorizationRequestId("proof_of_authorization_request_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        expected.put("proof_of_authorization_request_id", "proof_of_authorization_request_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProofOfAuthorizationRequestSubmissionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
