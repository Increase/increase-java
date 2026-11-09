// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.checkbooks.CheckbookCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckbookServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookServiceAsync = client.checkbooks()

        val checkbookFuture =
            checkbookServiceAsync.create(
                CheckbookCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .mailingAddress(
                        CheckbookCreateParams.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .line2("line2")
                            .build()
                    )
                    .payer(
                        listOf(
                            CheckbookCreateParams.Payer.builder()
                                .contents("National Phonograph Company")
                                .build(),
                            CheckbookCreateParams.Payer.builder()
                                .contents("33 Liberty Street")
                                .build(),
                            CheckbookCreateParams.Payer.builder()
                                .contents("New York, NY 10045")
                                .build(),
                        )
                    )
                    .build()
            )

        val checkbook = checkbookFuture.get()
        checkbook.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookServiceAsync = client.checkbooks()

        val checkbookFuture = checkbookServiceAsync.retrieve("checkbook_7iudxhxum6vlkcjxmi8y")

        val checkbook = checkbookFuture.get()
        checkbook.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookServiceAsync = client.checkbooks()

        val pageFuture = checkbookServiceAsync.list()

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
        val checkbookServiceAsync = client.checkbooks()

        val checkbookFuture = checkbookServiceAsync.stop("checkbook_7iudxhxum6vlkcjxmi8y")

        val checkbook = checkbookFuture.get()
        checkbook.validate()
    }
}
