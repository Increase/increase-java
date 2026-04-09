// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entityonboardingsessions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityOnboardingSessionExpireParamsTest {

    @Test
    fun create() {
        EntityOnboardingSessionExpireParams.builder()
            .entityOnboardingSessionId("entity_onboarding_session_wid2ug11fsmvh3k9hymd")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EntityOnboardingSessionExpireParams.builder()
                .entityOnboardingSessionId("entity_onboarding_session_wid2ug11fsmvh3k9hymd")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("entity_onboarding_session_wid2ug11fsmvh3k9hymd")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
