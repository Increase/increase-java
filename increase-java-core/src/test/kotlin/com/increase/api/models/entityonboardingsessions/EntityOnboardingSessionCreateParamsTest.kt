// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityOnboardingSessionCreateParamsTest {

    @Test
    fun create() {
        EntityOnboardingSessionCreateParams.builder()
            .programId("program_i2v2os4mwza1oetokh9i")
            .redirectUrl("https://example.com/onboarding/session")
            .entityId("entity_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            EntityOnboardingSessionCreateParams.builder()
                .programId("program_i2v2os4mwza1oetokh9i")
                .redirectUrl("https://example.com/onboarding/session")
                .entityId("entity_id")
                .build()

        val body = params._body()

        assertThat(body.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(body.redirectUrl()).isEqualTo("https://example.com/onboarding/session")
        assertThat(body.entityId()).contains("entity_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EntityOnboardingSessionCreateParams.builder()
                .programId("program_i2v2os4mwza1oetokh9i")
                .redirectUrl("https://example.com/onboarding/session")
                .build()

        val body = params._body()

        assertThat(body.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
        assertThat(body.redirectUrl()).isEqualTo("https://example.com/onboarding/session")
    }
}
