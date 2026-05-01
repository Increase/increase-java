// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.entities.EntityUpdateValidationParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceTest {

    @Test
    fun updateValidation() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.simulations().entities()

        val entity =
            entityService.updateValidation(
                EntityUpdateValidationParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .addIssue(
                        EntityUpdateValidationParams.Issue.builder()
                            .category(
                                EntityUpdateValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER
                            )
                            .build()
                    )
                    .build()
            )

        entity.validate()
    }
}
