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
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val bookkeepingEntryService = client.bookkeepingEntries()
        val bookkeepingEntryList =
            bookkeepingEntryService.list(BookkeepingEntryListParams.builder().build())
        println(bookkeepingEntryList)
        bookkeepingEntryList.data().forEach { it.validate() }
    }
}
