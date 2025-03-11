// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestRetrieveParamsTest {

    @Test
    fun create() {
        ProofOfAuthorizationRequestRetrieveParams.builder()
            .proofOfAuthorizationRequestId("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            ProofOfAuthorizationRequestRetrieveParams.builder()
                .proofOfAuthorizationRequestId(
                    "proof_of_authorization_request_iwp8no25h3rjvil6ad3b"
                )
                .build()
        assertThat(params).isNotNull
        // path param "proofOfAuthorizationRequestId"
        assertThat(params.getPathParam(0))
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
