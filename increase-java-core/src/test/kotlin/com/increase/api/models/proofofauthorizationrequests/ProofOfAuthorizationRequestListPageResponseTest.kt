// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProofOfAuthorizationRequestListPageResponseTest {

    @Test
    fun create() {
        val proofOfAuthorizationRequestListPageResponse =
            ProofOfAuthorizationRequestListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(proofOfAuthorizationRequestListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(proofOfAuthorizationRequestListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val proofOfAuthorizationRequestListPageResponse =
            ProofOfAuthorizationRequestListPageResponse.builder()
                .addData(
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
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedProofOfAuthorizationRequestListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(proofOfAuthorizationRequestListPageResponse),
                jacksonTypeRef<ProofOfAuthorizationRequestListPageResponse>(),
            )

        assertThat(roundtrippedProofOfAuthorizationRequestListPageResponse)
            .isEqualTo(proofOfAuthorizationRequestListPageResponse)
    }
}
