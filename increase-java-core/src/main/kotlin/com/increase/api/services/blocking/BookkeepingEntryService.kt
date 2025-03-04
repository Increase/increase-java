// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPage
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams

interface BookkeepingEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Bookkeeping Entry */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry

    /** List Bookkeeping Entries */
    @JvmOverloads
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntryListPage

    /** List Bookkeeping Entries */
    fun list(requestOptions: RequestOptions): BookkeepingEntryListPage =
        list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is
         * otherwise the same as [BookkeepingEntryService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntry>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntryListPage>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookkeepingEntryListPage> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
