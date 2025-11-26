// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OAuthApplicationServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationService = client.oauthApplications()

        val oauthApplication = oauthApplicationService.retrieve("application_gj9ufmpgh5i56k4vyriy")

        oauthApplication.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val oauthApplicationService = client.oauthApplications()

        val oauthApplications =
            oauthApplicationService.list(
                OAuthApplicationListParams.builder()
                    .createdAt(
                        OAuthApplicationListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .status(
                        OAuthApplicationListParams.Status.builder()
                            .addIn(OAuthApplicationListParams.Status.In.ACTIVE)
                            .build()
                    )
                    .build()
            )

        oauthApplications.validate()
    }
}
