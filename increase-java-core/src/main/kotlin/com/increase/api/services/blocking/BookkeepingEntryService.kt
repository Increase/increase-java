// File generated from our OpenAPI spec by Stainless.

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
    fun retrieve(params: BookkeepingEntryRetrieveParams): BookkeepingEntry =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry

    /** List Bookkeeping Entries */
    fun list(): BookkeepingEntryListPage = list(BookkeepingEntryListParams.none())

    /** @see [list] */
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntryListPage

    /** @see [list] */
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none()
    ): BookkeepingEntryListPage = list(params, RequestOptions.none())

    /** @see [list] */
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
        @MustBeClosed
        fun retrieve(params: BookkeepingEntryRetrieveParams): HttpResponseFor<BookkeepingEntry> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntry>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BookkeepingEntryListPage> =
            list(BookkeepingEntryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntryListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none()
        ): HttpResponseFor<BookkeepingEntryListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookkeepingEntryListPage> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
