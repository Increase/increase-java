// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingEntryServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryServiceAsync = client.bookkeepingEntries()

        val bookkeepingEntryFuture =
            bookkeepingEntryServiceAsync.retrieve(
                BookkeepingEntryRetrieveParams.builder()
                    .bookkeepingEntryId("bookkeeping_entry_ctjpajsj3ks2blx10375")
                    .build()
            )

        val bookkeepingEntry = bookkeepingEntryFuture.get()
        bookkeepingEntry.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryServiceAsync = client.bookkeepingEntries()

        val pageFuture = bookkeepingEntryServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
