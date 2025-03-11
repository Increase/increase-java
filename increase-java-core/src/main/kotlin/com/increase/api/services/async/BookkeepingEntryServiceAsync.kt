// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture

interface BookkeepingEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Bookkeeping Entry */
    fun retrieve(params: BookkeepingEntryRetrieveParams): CompletableFuture<BookkeepingEntry> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: BookkeepingEntryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BookkeepingEntry>

    /** List Bookkeeping Entries */
    fun list(): CompletableFuture<BookkeepingEntryListPageAsync> = list(BookkeepingEntryListParams.none())

    /** @see [list] */
    fun list(params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<BookkeepingEntryListPageAsync>

    /** @see [list] */
    fun list(params: BookkeepingEntryListParams = BookkeepingEntryListParams.none()): CompletableFuture<BookkeepingEntryListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BookkeepingEntryListPageAsync> = list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BookkeepingEntryRetrieveParams): CompletableFuture<HttpResponseFor<BookkeepingEntry>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: BookkeepingEntryRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BookkeepingEntry>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the
         * same as [BookkeepingEntryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>> = list(BookkeepingEntryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: BookkeepingEntryListParams = BookkeepingEntryListParams.none()): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>> = list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
