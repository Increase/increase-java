// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OAuthConnectionServiceTest {

    @Test
    fun retrieve() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val oauthConnectionService = client.oauthConnections()

      val oauthConnection = oauthConnectionService.retrieve(OAuthConnectionRetrieveParams.builder()
          .oauthConnectionId("connection_dauknoksyr4wilz4e6my")
          .build())

      oauthConnection.validate()
    }

    @Test
    fun list() {
      val client = IncreaseOkHttpClient.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val oauthConnectionService = client.oauthConnections()

      val page = oauthConnectionService.list()

      page.response().validate()
    }
}
