// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListResponse
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BookkeepingEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookkeepingEntryServiceAsync

    /** Retrieve a Bookkeeping Entry */
    fun retrieve(bookkeepingEntryId: String): CompletableFuture<BookkeepingEntry> =
        retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bookkeepingEntryId: String,
        params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntry> =
        retrieve(params.toBuilder().bookkeepingEntryId(bookkeepingEntryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bookkeepingEntryId: String,
        params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
    ): CompletableFuture<BookkeepingEntry> =
        retrieve(bookkeepingEntryId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntry>

    /** @see retrieve */
    fun retrieve(params: BookkeepingEntryRetrieveParams): CompletableFuture<BookkeepingEntry> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bookkeepingEntryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingEntry> =
        retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none(), requestOptions)

    /** List Bookkeeping Entries */
    fun list(): CompletableFuture<BookkeepingEntryListResponse> =
        list(BookkeepingEntryListParams.none())

    /** @see list */
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntryListResponse>

    /** @see list */
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none()
    ): CompletableFuture<BookkeepingEntryListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BookkeepingEntryListResponse> =
        list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookkeepingEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is
         * otherwise the same as [BookkeepingEntryServiceAsync.retrieve].
         */
        fun retrieve(
            bookkeepingEntryId: String
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> =
            retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            bookkeepingEntryId: String,
            params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> =
            retrieve(
                params.toBuilder().bookkeepingEntryId(bookkeepingEntryId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            bookkeepingEntryId: String,
            params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> =
            retrieve(bookkeepingEntryId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>>

        /** @see retrieve */
        fun retrieve(
            params: BookkeepingEntryRetrieveParams
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            bookkeepingEntryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingEntry>> =
            retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BookkeepingEntryListResponse>> =
            list(BookkeepingEntryListParams.none())

        /** @see list */
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListResponse>>

        /** @see list */
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none()
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BookkeepingEntryListResponse>> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
