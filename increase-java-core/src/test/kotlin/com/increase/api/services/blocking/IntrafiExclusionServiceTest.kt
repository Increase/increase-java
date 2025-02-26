// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntrafiExclusionServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()

        val intrafiExclusion =
            intrafiExclusionService.create(
                IntrafiExclusionCreateParams.builder()
                    .bankName("Example Bank")
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .build()
            )

        intrafiExclusion.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()

        val intrafiExclusion =
            intrafiExclusionService.retrieve(
                IntrafiExclusionRetrieveParams.builder()
                    .intrafiExclusionId("account_in71c4amph0vgo2qllky")
                    .build()
            )

        intrafiExclusion.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()

        val page = intrafiExclusionService.list()

        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()

        val intrafiExclusion =
            intrafiExclusionService.archive(
                IntrafiExclusionArchiveParams.builder()
                    .intrafiExclusionId("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                    .build()
            )

        intrafiExclusion.validate()
    }
}
