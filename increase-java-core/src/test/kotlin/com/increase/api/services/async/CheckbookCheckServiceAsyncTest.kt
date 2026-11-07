// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckbookCheckServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookCheckServiceAsync = client.checkbookChecks()

        val checkbookCheckFuture =
            checkbookCheckServiceAsync.retrieve("checkbook_check_klgh3z50guf6jcnfhibb")

        val checkbookCheck = checkbookCheckFuture.get()
        checkbookCheck.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookCheckServiceAsync = client.checkbookChecks()

        val pageFuture = checkbookCheckServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun stop() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookCheckServiceAsync = client.checkbookChecks()

        val checkbookCheckFuture =
            checkbookCheckServiceAsync.stop("checkbook_check_klgh3z50guf6jcnfhibb")

        val checkbookCheck = checkbookCheckFuture.get()
        checkbookCheck.validate()
    }
}
