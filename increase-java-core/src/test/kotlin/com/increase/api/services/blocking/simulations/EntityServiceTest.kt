// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.entities.EntityValidationParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceTest {

    @Test
    fun validation() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityService = client.simulations().entities()

        val entity =
            entityService.validation(
                EntityValidationParams.builder()
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .addIssue(
                        EntityValidationParams.Issue.builder()
                            .category(EntityValidationParams.Issue.Category.ENTITY_TAX_IDENTIFIER)
                            .build()
                    )
                    .status(EntityValidationParams.Status.INVALID)
                    .build()
            )

        entity.validate()
    }
}
