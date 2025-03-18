// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestRetrieveParamsTest {

    @Test
    fun create() {
        ProofOfAuthorizationRequestRetrieveParams.builder()
            .proofOfAuthorizationRequestId("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProofOfAuthorizationRequestRetrieveParams.builder()
                .proofOfAuthorizationRequestId(
                    "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                )
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
