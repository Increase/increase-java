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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("proof_of_authorization_request_id", "proof_of_authorization_request_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProofOfAuthorizationRequestSubmissionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
