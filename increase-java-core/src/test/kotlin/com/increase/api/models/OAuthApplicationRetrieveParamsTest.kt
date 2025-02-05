// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthApplicationRetrieveParamsTest {

    @Test
    fun create() {
        OAuthApplicationRetrieveParams.builder()
            .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            OAuthApplicationRetrieveParams.builder()
                .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                .build()
        assertThat(params).isNotNull
        // path param "oauthApplicationId"
        assertThat(params.getPathParam(0)).isEqualTo("application_gj9ufmpgh5i56k4vyriy")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
