// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.entities.EntityValidationParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceAsyncTest {

    @Test
    fun validation() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityServiceAsync = client.simulations().entities()

        val entityFuture =
            entityServiceAsync.validation(
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

        val entity = entityFuture.get()
        entity.validate()
    }
}
