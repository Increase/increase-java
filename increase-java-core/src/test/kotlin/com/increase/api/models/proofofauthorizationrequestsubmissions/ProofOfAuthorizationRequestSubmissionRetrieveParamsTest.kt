// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestSubmissionRetrieveParamsTest {

    @Test
    fun create() {
        ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
            .proofOfAuthorizationRequestSubmissionId(
                "proof_of_authorization_request_submission_uqhqroiley7n0097vizn"
            )
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
                .proofOfAuthorizationRequestSubmissionId(
                    "proof_of_authorization_request_submission_uqhqroiley7n0097vizn"
                )
                .build()
        assertThat(params).isNotNull
        // path param "proofOfAuthorizationRequestSubmissionId"
        assertThat(params.getPathParam(0))
            .isEqualTo("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
