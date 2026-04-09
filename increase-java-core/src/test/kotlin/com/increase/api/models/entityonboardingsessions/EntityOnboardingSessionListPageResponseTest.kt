// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityOnboardingSessionListPageResponseTest {

    @Test
    fun create() {
        val entityOnboardingSessionListPageResponse =
            EntityOnboardingSessionListPageResponse.builder()
                .addData(
                    EntityOnboardingSession.builder()
                        .id("entity_onboarding_session_wid2ug11fsmvh3k9hymd")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .expiresAt(OffsetDateTime.parse("2020-02-01T05:59:59+00:00"))
                        .idempotencyKey(null)
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .redirectUrl("https://example.com/onboarding/completed")
                        .sessionUrl(
                            "https://onboarding.increase.com/onboarding/sessions?id=HIrdj46cXyyNqT5RDcIR38dzPqzRBgTdG84XwzOz"
                        )
                        .status(EntityOnboardingSession.Status.ACTIVE)
                        .type(EntityOnboardingSession.Type.ENTITY_ONBOARDING_SESSION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(entityOnboardingSessionListPageResponse.data())
            .containsExactly(
                EntityOnboardingSession.builder()
                    .id("entity_onboarding_session_wid2ug11fsmvh3k9hymd")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .expiresAt(OffsetDateTime.parse("2020-02-01T05:59:59+00:00"))
                    .idempotencyKey(null)
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .redirectUrl("https://example.com/onboarding/completed")
                    .sessionUrl(
                        "https://onboarding.increase.com/onboarding/sessions?id=HIrdj46cXyyNqT5RDcIR38dzPqzRBgTdG84XwzOz"
                    )
                    .status(EntityOnboardingSession.Status.ACTIVE)
                    .type(EntityOnboardingSession.Type.ENTITY_ONBOARDING_SESSION)
                    .build()
            )
        assertThat(entityOnboardingSessionListPageResponse.nextCursor()).contains("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entityOnboardingSessionListPageResponse =
            EntityOnboardingSessionListPageResponse.builder()
                .addData(
                    EntityOnboardingSession.builder()
                        .id("entity_onboarding_session_wid2ug11fsmvh3k9hymd")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .entityId("entity_n8y8tnk2p9339ti393yi")
                        .expiresAt(OffsetDateTime.parse("2020-02-01T05:59:59+00:00"))
                        .idempotencyKey(null)
                        .programId("program_i2v2os4mwza1oetokh9i")
                        .redirectUrl("https://example.com/onboarding/completed")
                        .sessionUrl(
                            "https://onboarding.increase.com/onboarding/sessions?id=HIrdj46cXyyNqT5RDcIR38dzPqzRBgTdG84XwzOz"
                        )
                        .status(EntityOnboardingSession.Status.ACTIVE)
                        .type(EntityOnboardingSession.Type.ENTITY_ONBOARDING_SESSION)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedEntityOnboardingSessionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(entityOnboardingSessionListPageResponse),
                jacksonTypeRef<EntityOnboardingSessionListPageResponse>(),
            )

        assertThat(roundtrippedEntityOnboardingSessionListPageResponse)
            .isEqualTo(entityOnboardingSessionListPageResponse)
    }
}
