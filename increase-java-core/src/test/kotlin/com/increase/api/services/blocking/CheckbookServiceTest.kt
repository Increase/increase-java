// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.checkbooks.CheckbookCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckbookServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookService = client.checkbooks()

        val checkbook =
            checkbookService.create(
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

        checkbook.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookService = client.checkbooks()

        val checkbook = checkbookService.retrieve("checkbook_7iudxhxum6vlkcjxmi8y")

        checkbook.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookService = client.checkbooks()

        val page = checkbookService.list()

        page.response().validate()
    }

    @Test
    fun stop() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkbookService = client.checkbooks()

        val checkbook = checkbookService.stop("checkbook_7iudxhxum6vlkcjxmi8y")

        checkbook.validate()
    }
}
