// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.BookkeepingEntryListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingEntryServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryService = client.bookkeepingEntries()
        val bookkeepingEntry =
            bookkeepingEntryService.retrieve(
                BookkeepingEntryRetrieveParams.builder().bookkeepingEntryId("string").build()
            )
        println(bookkeepingEntry)
        bookkeepingEntry.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntryService = client.bookkeepingEntries()
        val bookkeepingEntryList =
            bookkeepingEntryService.list(BookkeepingEntryListParams.builder().build())
        println(bookkeepingEntryList)
        bookkeepingEntryList.data().forEach { it.validate() }
    }
}
