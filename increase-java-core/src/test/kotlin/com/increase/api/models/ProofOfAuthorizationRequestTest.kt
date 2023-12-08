// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProofOfAuthorizationRequestTest {

    @Test
    fun createProofOfAuthorizationRequest() {
        val proofOfAuthorizationRequest =
            ProofOfAuthorizationRequest.builder()
                .id("string")
                .achTransfers(
                    listOf(ProofOfAuthorizationRequest.AchTransfer.builder().id("string").build())
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(proofOfAuthorizationRequest).isNotNull
        assertThat(proofOfAuthorizationRequest.id()).isEqualTo("string")
        assertThat(proofOfAuthorizationRequest.achTransfers())
            .containsExactly(ProofOfAuthorizationRequest.AchTransfer.builder().id("string").build())
        assertThat(proofOfAuthorizationRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(proofOfAuthorizationRequest.type())
            .isEqualTo(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
        assertThat(proofOfAuthorizationRequest.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
