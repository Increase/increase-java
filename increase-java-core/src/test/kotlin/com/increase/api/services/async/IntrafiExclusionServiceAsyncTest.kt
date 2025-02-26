// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntrafiExclusionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusionFuture =
            intrafiExclusionServiceAsync.create(
                IntrafiExclusionCreateParams.builder()
                    .bankName("Example Bank")
                    .entityId("entity_n8y8tnk2p9339ti393yi")
                    .build()
            )

        val intrafiExclusion = intrafiExclusionFuture.get()
        intrafiExclusion.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusionFuture =
            intrafiExclusionServiceAsync.retrieve(
                IntrafiExclusionRetrieveParams.builder()
                    .intrafiExclusionId("account_in71c4amph0vgo2qllky")
                    .build()
            )

        val intrafiExclusion = intrafiExclusionFuture.get()
        intrafiExclusion.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val pageFuture = intrafiExclusionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionServiceAsync = client.intrafiExclusions()

        val intrafiExclusionFuture =
            intrafiExclusionServiceAsync.archive(
                IntrafiExclusionArchiveParams.builder()
                    .intrafiExclusionId("intrafi_exclusion_ygfqduuzpau3jqof6jyh")
                    .build()
            )

        val intrafiExclusion = intrafiExclusionFuture.get()
        intrafiExclusion.validate()
    }
}
