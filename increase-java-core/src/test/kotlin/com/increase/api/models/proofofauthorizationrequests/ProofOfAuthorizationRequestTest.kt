// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestTest {

    @Test
    fun create() {
        val proofOfAuthorizationRequest =
            ProofOfAuthorizationRequest.builder()
                .id("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
                .addAchTransfer(
                    ProofOfAuthorizationRequest.AchTransfer.builder()
                        .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .dueOn(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
                .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .build()

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val proofOfAuthorizationRequest =
            ProofOfAuthorizationRequest.builder()
                .id("proof_of_authorization_request_iwp8no25h3rjvil6ad3b")
                .addAchTransfer(
                    ProofOfAuthorizationRequest.AchTransfer.builder()
                        .id("ach_transfer_uoxatyh3lt5evrsdvo7q")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .dueOn(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .type(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
                .updatedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .build()

        val roundtrippedProofOfAuthorizationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(proofOfAuthorizationRequest),
                jacksonTypeRef<ProofOfAuthorizationRequest>(),
            )

        assertThat(roundtrippedProofOfAuthorizationRequest).isEqualTo(proofOfAuthorizationRequest)
    }
}
