// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthTokenTest {

    @Test
    fun createOAuthToken() {
        val oauthToken =
            OAuthToken.builder()
                .accessToken("access_token")
                .tokenType(OAuthToken.TokenType.BEARER)
                .type(OAuthToken.Type.OAUTH_TOKEN)
                .build()
        assertThat(oauthToken).isNotNull
        assertThat(oauthToken.accessToken()).isEqualTo("access_token")
        assertThat(oauthToken.tokenType()).isEqualTo(OAuthToken.TokenType.BEARER)
        assertThat(oauthToken.type()).isEqualTo(OAuthToken.Type.OAUTH_TOKEN)
    }
}
