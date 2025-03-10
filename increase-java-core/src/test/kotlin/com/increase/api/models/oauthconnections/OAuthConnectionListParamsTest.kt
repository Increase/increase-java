// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthConnectionListParamsTest {

    @Test
    fun create() {
        OAuthConnectionListParams.builder()
            .cursor("cursor")
            .limit(1L)
            .oauthApplicationId("oauth_application_id")
            .status(
                OAuthConnectionListParams.Status.builder()
                    .addIn(OAuthConnectionListParams.Status.In.ACTIVE)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            OAuthConnectionListParams.builder()
                .cursor("cursor")
                .limit(1L)
                .oauthApplicationId("oauth_application_id")
                .status(
                    OAuthConnectionListParams.Status.builder()
                        .addIn(OAuthConnectionListParams.Status.In.ACTIVE)
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("oauth_application_id", "oauth_application_id")
        OAuthConnectionListParams.Status.builder()
            .addIn(OAuthConnectionListParams.Status.In.ACTIVE)
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OAuthConnectionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
