// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.BookkeepingEntrySet
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetListPageAsync
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams
import java.util.concurrent.CompletableFuture

interface BookkeepingEntrySetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Bookkeeping Entry Set */
    @JvmOverloads
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySet>

    /** Retrieve a Bookkeeping Entry Set */
    @JvmOverloads
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySet>

    /** List Bookkeeping Entry Sets */
    @JvmOverloads
    fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingEntrySetListPageAsync>

    /** List Bookkeeping Entry Sets */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}`,
         * but is otherwise the same as [BookkeepingEntrySetServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySet>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySetListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BookkeepingEntrySetListPageAsync>> =
            list(BookkeepingEntrySetListParams.none(), requestOptions)
    }
}
