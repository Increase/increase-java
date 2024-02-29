// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.entities

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class IndustryCodeServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val industryCodeService = client.entities().industryCode()
        val entity =
            industryCodeService.create(
                EntityIndustryCodeCreateParams.builder()
                    .entityId("string")
                    .industryCode("x")
                    .build()
            )
        println(entity)
        entity.validate()
    }
}
