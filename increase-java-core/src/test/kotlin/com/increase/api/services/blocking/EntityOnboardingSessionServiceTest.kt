// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EntityOnboardingSessionServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionService = client.entityOnboardingSessions()

        val entityOnboardingSession =
            entityOnboardingSessionService.create(
                EntityOnboardingSessionCreateParams.builder()
                    .programId("program_i2v2os4mwza1oetokh9i")
                    .redirectUrl("https://example.com/onboarding/session")
                    .entityId("entity_id")
                    .build()
            )

        entityOnboardingSession.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionService = client.entityOnboardingSessions()

        val entityOnboardingSession =
            entityOnboardingSessionService.retrieve(
                "entity_onboarding_session_wid2ug11fsmvh3k9hymd"
            )

        entityOnboardingSession.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionService = client.entityOnboardingSessions()

        val page = entityOnboardingSessionService.list()

        page.response().validate()
    }

    @Test
    fun expire() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val entityOnboardingSessionService = client.entityOnboardingSessions()

        val entityOnboardingSession =
            entityOnboardingSessionService.expire("entity_onboarding_session_wid2ug11fsmvh3k9hymd")

        entityOnboardingSession.validate()
    }
}
