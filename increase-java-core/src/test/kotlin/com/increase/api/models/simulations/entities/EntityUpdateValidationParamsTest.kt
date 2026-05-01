// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.entities

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityUpdateValidationParamsTest {

    @Test
    fun create() {
        EntityUpdateValidationParams.builder()
            .entityId("entity_n8y8tnk2p9339ti393yi")
            .addIssue(
                EntityUpdateValidationParams.Issue.builder()
                    .category(EntityUpdateValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityUpdateValidationParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .addIssue(
                    EntityUpdateValidationParams.Issue.builder()
                        .category(EntityUpdateValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EntityUpdateValidationParams.builder()
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .addIssue(
                    EntityUpdateValidationParams.Issue.builder()
                        .category(EntityUpdateValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.issues())
            .containsExactly(
                EntityUpdateValidationParams.Issue.builder()
                    .category(EntityUpdateValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                    .build()
            )
    }
}
