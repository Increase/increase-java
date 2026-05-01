// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityValidationParamsTest {

    @Test
    fun create() {
        EntityValidationParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .addIssue(
                EntityValidationParams.Issue.builder()
                    .category(EntityValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                    .build()
            )
            .status(EntityValidationParams.Status.INVALID)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityValidationParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .addIssue(
                    EntityValidationParams.Issue.builder()
                        .category(EntityValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                        .build()
                )
                .status(EntityValidationParams.Status.INVALID)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntityValidationParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .addIssue(
                    EntityValidationParams.Issue.builder()
                        .category(EntityValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                        .build()
                )
                .status(EntityValidationParams.Status.INVALID)
                .build()

        val body = params._body()

        assertThat(body.issues())
            .containsExactly(
                EntityValidationParams.Issue.builder()
                    .category(EntityValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                    .build()
            )
        assertThat(body.status()).isEqualTo(EntityValidationParams.Status.INVALID)
    }
}
