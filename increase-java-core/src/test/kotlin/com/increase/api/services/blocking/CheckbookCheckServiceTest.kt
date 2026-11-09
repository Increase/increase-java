// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckbookCheckServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookCheckService = client.checkbookChecks()

        val checkbookCheck = checkbookCheckService.retrieve("checkbook_check_klgh3z50guf6jcnfhibb")

        checkbookCheck.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookCheckService = client.checkbookChecks()

        val page = checkbookCheckService.list()

        page.response().validate()
    }

    @Test
    fun stop() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookCheckService = client.checkbookChecks()

        val checkbookCheck = checkbookCheckService.stop("checkbook_check_klgh3z50guf6jcnfhibb")

        checkbookCheck.validate()
    }
}
