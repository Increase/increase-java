// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestSubmissionRetrieveParamsTest {

    @Test
    fun create() {
        ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
            .proofOfAuthorizationRequestSubmissionId(
                "proof_of_authorization_request_submission_uqhqroiley7n0097vizn"
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProofOfAuthorizationRequestSubmissionRetrieveParams.builder()
                .proofOfAuthorizationRequestSubmissionId(
                    "proof_of_authorization_request_submission_uqhqroiley7n0097vizn"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("proof_of_authorization_request_submission_uqhqroiley7n0097vizn")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
