// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthApplicationServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationServiceAsync = client.oauthApplications()

        val oauthApplicationFuture =
            oauthApplicationServiceAsync.retrieve("application_gj9ufmpgh5i56k4vyriy")

        val oauthApplication = oauthApplicationFuture.get()
        oauthApplication.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationServiceAsync = client.oauthApplications()

        val pageFuture = oauthApplicationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
