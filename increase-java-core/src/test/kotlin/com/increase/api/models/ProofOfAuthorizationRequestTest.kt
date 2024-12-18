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
                .id("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
                .achTransfers(
                    listOf(
                        ProofOfAuthorizationRequest.AchTransfer.builder()
                            .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                            .build()
                    )
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .dueOn(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
                .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .build()
        assertThat(proofOfAuthorizationRequest).isNotNull
        assertThat(proofOfAuthorizationRequest.id())
            .isEqualTo("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
        assertThat(proofOfAuthorizationRequest.achTransfers())
            .containsExactly(
                ProofOfAuthorizationRequest.AchTransfer.builder()
                    .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )
        assertThat(proofOfAuthorizationRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(proofOfAuthorizationRequest.dueOn())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(proofOfAuthorizationRequest.type())
            .isEqualTo(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
        assertThat(proofOfAuthorizationRequest.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
    }
}
