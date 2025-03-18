// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BookkeepingEntryServiceTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryService = client.bookkeepingEntries()

        val bookkeepingEntry =
            bookkeepingEntryService.retrieve(
                BookkeepingEntryRetrieveParams.builder()
                    .bookkeepingEntryId("bookkeeping_entry_ctjpajsj3ks2blx10375")
                    .build()
            )

        bookkeepingEntry.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryService = client.bookkeepingEntries()

        val page = bookkeepingEntryService.list()

        page.response().validate()
    }
}
