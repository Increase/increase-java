// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.IntrafiExclusionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IntrafiExclusionServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()
        val intrafiExclusion =
            intrafiExclusionService.create(
                IntrafiExclusionCreateParams.builder().bankName("x").entityId("entity_id").build()
            )
        println(intrafiExclusion)
        intrafiExclusion.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()
        val intrafiExclusion =
            intrafiExclusionService.retrieve(
                IntrafiExclusionRetrieveParams.builder()
                    .intrafiExclusionId("intrafi_exclusion_id")
                    .build()
            )
        println(intrafiExclusion)
        intrafiExclusion.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()
        val intrafiExclusionList =
            intrafiExclusionService.list(IntrafiExclusionListParams.builder().build())
        println(intrafiExclusionList)
        intrafiExclusionList.data().forEach { it.validate() }
    }

    @Test
    fun callArchive() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiExclusionService = client.intrafiExclusions()
        val intrafiExclusion =
            intrafiExclusionService.archive(
                IntrafiExclusionArchiveParams.builder()
                    .intrafiExclusionId("intrafi_exclusion_id")
                    .build()
            )
        println(intrafiExclusion)
        intrafiExclusion.validate()
    }
}
