@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams
import java.util.concurrent.CompletableFuture

interface BookkeepingEntryServiceAsync {

    /** List Bookkeeping Entries */
    @JvmOverloads
    fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntryListPageAsync>
}
