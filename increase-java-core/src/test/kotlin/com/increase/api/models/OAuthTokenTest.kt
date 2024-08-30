// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.OAuthToken

class OAuthTokenTest {

    @Test
    fun createOAuthToken() {
      val oauthToken = OAuthToken.builder()
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
