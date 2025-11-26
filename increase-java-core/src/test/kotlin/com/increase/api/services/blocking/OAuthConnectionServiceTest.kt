// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthConnectionServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionService = client.oauthConnections()

        val oauthConnection = oauthConnectionService.retrieve("connection_dauknoksyr4wilz4e6my")

        oauthConnection.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionService = client.oauthConnections()

        val oauthConnections =
            oauthConnectionService.list(
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
            )

        oauthConnections.validate()
    }
}
