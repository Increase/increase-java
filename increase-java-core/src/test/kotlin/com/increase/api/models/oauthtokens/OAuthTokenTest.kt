// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthtokens

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OAuthTokenTest {

    @Test
    fun createOAuthToken() {
      val oauthToken = OAuthToken.builder()
          .accessToken("12345")
          .tokenType(OAuthToken.TokenType.BEARER)
          .type(OAuthToken.Type.OAUTH_TOKEN)
          .build()
      assertThat(oauthToken).isNotNull
      assertThat(oauthToken.accessToken()).isEqualTo("12345")
      assertThat(oauthToken.tokenType()).isEqualTo(OAuthToken.TokenType.BEARER)
      assertThat(oauthToken.type()).isEqualTo(OAuthToken.Type.OAUTH_TOKEN)
    }
}
