// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.ProofOfAuthorizationRequest

class ProofOfAuthorizationRequestTest {

    @Test
    fun createProofOfAuthorizationRequest() {
      val proofOfAuthorizationRequest = ProofOfAuthorizationRequest.builder()
          .id("id")
          .achTransfers(listOf(ProofOfAuthorizationRequest.AchTransfer.builder()
              .id("id")
              .build()))
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .dueOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .type(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
      assertThat(proofOfAuthorizationRequest).isNotNull
      assertThat(proofOfAuthorizationRequest.id()).isEqualTo("id")
      assertThat(proofOfAuthorizationRequest.achTransfers()).containsExactly(ProofOfAuthorizationRequest.AchTransfer.builder()
          .id("id")
          .build())
      assertThat(proofOfAuthorizationRequest.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(proofOfAuthorizationRequest.dueOn()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(proofOfAuthorizationRequest.type()).isEqualTo(ProofOfAuthorizationRequest.Type.PROOF_OF_AUTHORIZATION_REQUEST)
      assertThat(proofOfAuthorizationRequest.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
