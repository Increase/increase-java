// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture

interface BookkeepingEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Bookkeeping Entry */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntry>

    /** List Bookkeeping Entries */
    @JvmOverloads
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntryListPageAsync>

    /** List Bookkeeping Entries */
    fun list(requestOptions: RequestOptions): CompletableFuture<BookkeepingEntryListPageAsync> =
        list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is
         * otherwise the same as [BookkeepingEntryServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListPageAsync>> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
