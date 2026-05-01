// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.entities.EntityUpdateValidationParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityServiceAsyncTest {

    @Test
    fun updateValidation() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityServiceAsync = client.simulations().entities()

        val entityFuture =
            entityServiceAsync.updateValidation(
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

        val entity = entityFuture.get()
        entity.validate()
    }
}
