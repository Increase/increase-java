// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.intrafi

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.IntrafiExclusionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExclusionServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exclusionService = client.intrafi().exclusions()
        val intrafiExclusion =
            exclusionService.create(
                IntrafiExclusionCreateParams.builder().bankName("x").entityId("string").build()
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
        val exclusionService = client.intrafi().exclusions()
        val intrafiExclusion =
            exclusionService.retrieve(
                IntrafiExclusionRetrieveParams.builder().intrafiExclusionId("string").build()
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
        val exclusionService = client.intrafi().exclusions()
        val intrafiExclusionList =
            exclusionService.list(IntrafiExclusionListParams.builder().build())
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
        val exclusionService = client.intrafi().exclusions()
        val intrafiExclusion =
            exclusionService.archive(
                IntrafiExclusionArchiveParams.builder().intrafiExclusionId("string").build()
            )
        println(intrafiExclusion)
        intrafiExclusion.validate()
    }
}
