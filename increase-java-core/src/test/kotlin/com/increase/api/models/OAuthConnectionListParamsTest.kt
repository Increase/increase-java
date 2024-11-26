// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthConnectionListParamsTest {

    @Test
    fun createOAuthConnectionListParams() {
        OAuthConnectionListParams.builder()
            .cursor("cursor")
            .limit(1L)
            .status(
                OAuthConnectionListParams.Status.builder()
                    .in_(listOf(OAuthConnectionListParams.Status.In.ACTIVE))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            OAuthConnectionListParams.builder()
                .cursor("cursor")
                .limit(1L)
                .status(
                    OAuthConnectionListParams.Status.builder()
                        .in_(listOf(OAuthConnectionListParams.Status.In.ACTIVE))
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        OAuthConnectionListParams.Status.builder()
            .in_(listOf(OAuthConnectionListParams.Status.In.ACTIVE))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = OAuthConnectionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
