// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthConnectionListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("oauth_application_id", "oauth_application_id")
                    .put("status.in", listOf("active").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = OAuthConnectionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
