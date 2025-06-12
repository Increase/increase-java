// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySet
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetCreateParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListPage
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetRetrieveParams
import java.util.function.Consumer

interface BookkeepingEntrySetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookkeepingEntrySetService

    /** Create a Bookkeeping Entry Set */
    fun create(params: BookkeepingEntrySetCreateParams): BookkeepingEntrySet =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** Retrieve a Bookkeeping Entry Set */
    fun retrieve(bookkeepingEntrySetId: String): BookkeepingEntrySet =
        retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        bookkeepingEntrySetId: String,
        params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet =
        retrieve(
            params.toBuilder().bookkeepingEntrySetId(bookkeepingEntrySetId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        bookkeepingEntrySetId: String,
        params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
    ): BookkeepingEntrySet = retrieve(bookkeepingEntrySetId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** @see [retrieve] */
    fun retrieve(params: BookkeepingEntrySetRetrieveParams): BookkeepingEntrySet =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        bookkeepingEntrySetId: String,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySet =
        retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none(), requestOptions)

    /** List Bookkeeping Entry Sets */
    fun list(): BookkeepingEntrySetListPage = list(BookkeepingEntrySetListParams.none())

    /** @see [list] */
    fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySetListPage

    /** @see [list] */
    fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none()
    ): BookkeepingEntrySetListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BookkeepingEntrySetListPage =
        list(BookkeepingEntrySetListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntrySetService] that provides access to raw HTTP responses for each
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
        ): BookkeepingEntrySetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetService.create].
         */
        @MustBeClosed
        fun create(params: BookkeepingEntrySetCreateParams): HttpResponseFor<BookkeepingEntrySet> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}`,
         * but is otherwise the same as [BookkeepingEntrySetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bookkeepingEntrySetId: String): HttpResponseFor<BookkeepingEntrySet> =
            retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String,
            params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet> =
            retrieve(
                params.toBuilder().bookkeepingEntrySetId(bookkeepingEntrySetId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String,
            params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
        ): HttpResponseFor<BookkeepingEntrySet> =
            retrieve(bookkeepingEntrySetId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntrySetRetrieveParams
        ): HttpResponseFor<BookkeepingEntrySet> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntrySetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySet> =
            retrieve(
                bookkeepingEntrySetId,
                BookkeepingEntrySetRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BookkeepingEntrySetListPage> =
            list(BookkeepingEntrySetListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySetListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none()
        ): HttpResponseFor<BookkeepingEntrySetListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookkeepingEntrySetListPage> =
            list(BookkeepingEntrySetListParams.none(), requestOptions)
    }
}
