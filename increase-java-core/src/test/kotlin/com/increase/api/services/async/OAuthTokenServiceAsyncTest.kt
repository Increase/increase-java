// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.oauthtokens.OAuthTokenCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OAuthTokenServiceAsyncTest {

    @Test
    fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val oauthTokenServiceAsync = client.oauthTokens()

      val oauthTokenFuture = oauthTokenServiceAsync.create(OAuthTokenCreateParams.builder()
          .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
          .clientId("12345")
          .clientSecret("supersecret")
          .code("123")
          .productionToken("x")
          .build())

      val oauthToken = oauthTokenFuture.get()
      oauthToken.validate()
    }
}
