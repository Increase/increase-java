// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture

interface BookkeepingEntryServiceAsync {

    /** Retrieve a Bookkeeping Entry */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntry>

    /** List Bookkeeping Entries */
    @JvmOverloads
    fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookkeepingEntryListPageAsync>
}
