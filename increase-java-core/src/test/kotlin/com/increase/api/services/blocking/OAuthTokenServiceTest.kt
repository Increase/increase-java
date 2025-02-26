// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.OAuthTokenCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OAuthTokenServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthTokenService = client.oauthTokens()

        val oauthToken =
            oauthTokenService.create(
                OAuthTokenCreateParams.builder()
                    .grantType(OAuthTokenCreateParams.GrantType.AUTHORIZATION_CODE)
                    .clientId("12345")
                    .clientSecret("supersecret")
                    .code("123")
                    .productionToken("x")
                    .build()
            )

        oauthToken.validate()
    }
}
