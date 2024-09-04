// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthTokenCreateParamsTest {

    @Test
    fun createOAuthTokenCreateParams() {
        OAuthTokenCreateParams.builder()
            .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
            .clientId("x")
            .clientSecret("x")
            .code("x")
            .productionToken("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            OAuthTokenCreateParams.builder()
                .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
                .clientId("x")
                .clientSecret("x")
                .code("x")
                .productionToken("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.grantType()).isEqualTo(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.clientId()).isEqualTo("x")
        assertThat(body.clientSecret()).isEqualTo("x")
        assertThat(body.code()).isEqualTo("x")
        assertThat(body.productionToken()).isEqualTo("x")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            OAuthTokenCreateParams.builder()
                .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.grantType()).isEqualTo(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
    }
}
