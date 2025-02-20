// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPage
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams

interface BookkeepingEntryService {

    /** Retrieve a Bookkeeping Entry */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry

    /** List Bookkeeping Entries */
    @JvmOverloads
    fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntryListPage
}
