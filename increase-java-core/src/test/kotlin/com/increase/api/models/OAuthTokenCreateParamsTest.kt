// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthTokenCreateParamsTest {

    @Test
    fun createOAuthTokenCreateParams() {
        OAuthTokenCreateParams.builder()
            .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
            .clientId("12345")
            .clientSecret("supersecret")
            .code("123")
            .productionToken("x")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            OAuthTokenCreateParams.builder()
                .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
                .clientId("12345")
                .clientSecret("supersecret")
                .code("123")
                .productionToken("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.grantType()).isEqualTo(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
        assertThat(body.clientId()).isEqualTo("12345")
        assertThat(body.clientSecret()).isEqualTo("supersecret")
        assertThat(body.code()).isEqualTo("123")
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
