// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OAuthApplicationServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationService = client.oauthApplications()
        val oauthApplication =
            oauthApplicationService.retrieve(
                OAuthApplicationRetrieveParams.builder()
                    .oauthApplicationId("application_gj9ufmpgh5i56k4vyriy")
                    .build()
            )
        println(oauthApplication)
        oauthApplication.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationService = client.oauthApplications()
        val oauthApplicationList =
            oauthApplicationService.list(OAuthApplicationListParams.builder().build())
        println(oauthApplicationList)
        oauthApplicationList.data().forEach { it.validate() }
    }
}
