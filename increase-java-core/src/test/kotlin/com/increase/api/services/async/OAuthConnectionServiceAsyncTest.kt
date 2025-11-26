// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthConnectionServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionServiceAsync = client.oauthConnections()

        val oauthConnectionFuture =
            oauthConnectionServiceAsync.retrieve("connection_dauknoksyr4wilz4e6my")

        val oauthConnection = oauthConnectionFuture.get()
        oauthConnection.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionServiceAsync = client.oauthConnections()

        val oauthConnectionsFuture =
            oauthConnectionServiceAsync.list(
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

        val oauthConnections = oauthConnectionsFuture.get()
        oauthConnections.validate()
    }
}
