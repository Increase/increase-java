// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthApplicationRetrieveParamsTest {

    @Test
    fun create() {
        OAuthApplicationRetrieveParams.builder()
            .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OAuthApplicationRetrieveParams.builder()
                .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("application_gj9ufmpgh5i56k4vyriy")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
