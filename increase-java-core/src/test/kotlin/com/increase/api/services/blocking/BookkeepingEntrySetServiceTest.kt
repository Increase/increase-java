// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BookkeepingEntrySetServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntrySetService = client.bookkeepingEntrySets()
        val bookkeepingEntrySet =
            bookkeepingEntrySetService.create(
                BookkeepingEntrySetCreateParams.builder()
                    .addEntry(
                        BookkeepingEntrySetCreateParams.Entry.builder()
                            .accountId("bookkeeping_account_9husfpw68pzmve9dvvc7")
                            .amount(100L)
                            .build()
                    )
                    .addEntry(
                        BookkeepingEntrySetCreateParams.Entry.builder()
                            .accountId("bookkeeping_account_t2obldz1rcu15zr54umg")
                            .amount(-100L)
                            .build()
                    )
                    .date(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )
        println(bookkeepingEntrySet)
        bookkeepingEntrySet.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntrySetService = client.bookkeepingEntrySets()
        val bookkeepingEntrySet =
            bookkeepingEntrySetService.retrieve(
                BookkeepingEntrySetRetrieveParams.builder()
                    .bookkeepingEntrySetId("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                    .build()
            )
        println(bookkeepingEntrySet)
        bookkeepingEntrySet.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bookkeepingEntrySetService = client.bookkeepingEntrySets()
        val bookkeepingEntrySetList = bookkeepingEntrySetService.list()
        println(bookkeepingEntrySetList)
        bookkeepingEntrySetList.data().forEach { it.validate() }
    }
}
