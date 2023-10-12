// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.OauthConnectionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OauthConnectionServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionService = client.oauthConnections()
        val oauthConnection =
            oauthConnectionService.retrieve(
                OauthConnectionRetrieveParams.builder().oauthConnectionId("string").build()
            )
        println(oauthConnection)
        oauthConnection.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthConnectionService = client.oauthConnections()
        val oauthConnectionList =
            oauthConnectionService.list(OauthConnectionListParams.builder().build())
        println(oauthConnectionList)
        oauthConnectionList.data().forEach { it.validate() }
    }
}
