// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityOnboardingSessionListParamsTest {

    @Test
    fun create() {
        EntityOnboardingSessionListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .status(
                EntityOnboardingSessionListParams.Status.builder()
                    .addIn(EntityOnboardingSessionListParams.Status.In.ACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EntityOnboardingSessionListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .status(
                    EntityOnboardingSessionListParams.Status.builder()
                        .addIn(EntityOnboardingSessionListParams.Status.In.ACTIVE)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("idempotency_key", "x")
                    .put("limit", "1")
                    .put("status.in", listOf("active").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EntityOnboardingSessionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
