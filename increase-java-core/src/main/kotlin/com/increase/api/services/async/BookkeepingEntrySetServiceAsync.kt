// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySet
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetCreateParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListPageAsync
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetRetrieveParams
import java.util.concurrent.CompletableFuture

interface BookkeepingEntrySetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Bookkeeping Entry Set */
    fun create(params: BookkeepingEntrySetCreateParams): CompletableFuture<BookkeepingEntrySet> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySet>

    /** Retrieve a Bookkeeping Entry Set */
    fun retrieve(bookkeepingEntrySetId: String): CompletableFuture<BookkeepingEntrySet> =
        retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        bookkeepingEntrySetId: String,
        params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySet> =
        retrieve(
            params.toBuilder().bookkeepingEntrySetId(bookkeepingEntrySetId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        bookkeepingEntrySetId: String,
        params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
    ): CompletableFuture<BookkeepingEntrySet> =
        retrieve(bookkeepingEntrySetId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySet>

    /** @see [retrieve] */
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams
    ): CompletableFuture<BookkeepingEntrySet> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        bookkeepingEntrySetId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingEntrySet> =
        retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none(), requestOptions)

    /** List Bookkeeping Entry Sets */
    fun list(): CompletableFuture<BookkeepingEntrySetListPageAsync> =
        list(BookkeepingEntrySetListParams.none())

    /** @see [list] */
    fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySetListPageAsync>

    /** @see [list] */
    fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none()
    ): CompletableFuture<BookkeepingEntrySetListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BookkeepingEntrySetListPageAsync> =
        list(BookkeepingEntrySetListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntrySetServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: BookkeepingEntrySetCreateParams
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}`,
         * but is otherwise the same as [BookkeepingEntrySetServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>> =
            retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String,
            params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>> =
            retrieve(
                params.toBuilder().bookkeepingEntrySetId(bookkeepingEntrySetId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String,
            params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>> =
            retrieve(bookkeepingEntrySetId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntrySetRetrieveParams
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>> =
            retrieve(
                bookkeepingEntrySetId,
                BookkeepingEntrySetRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<BookkeepingEntrySetListPageAsync>> =
            list(BookkeepingEntrySetListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySetListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none()
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySetListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySetListPageAsync>> =
            list(BookkeepingEntrySetListParams.none(), requestOptions)
    }
}
