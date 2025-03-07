// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Card
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetails
import com.increase.api.models.CardDetailsParams
import com.increase.api.models.CardListPageAsync
import com.increase.api.models.CardListParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardUpdateParams
import java.util.concurrent.CompletableFuture

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Card */
    fun create(params: CardCreateParams): CompletableFuture<Card> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card>

    /** Retrieve a Card */
    fun retrieve(params: CardRetrieveParams): CompletableFuture<Card> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card>

    /** Update a Card */
    fun update(params: CardUpdateParams): CompletableFuture<Card> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card>

    /** List Cards */
    fun list(): CompletableFuture<CardListPageAsync> = list(CardListParams.none())

    /** @see [list] */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardListPageAsync>

    /** @see [list] */
    fun list(params: CardListParams = CardListParams.none()): CompletableFuture<CardListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardListPageAsync> =
        list(CardListParams.none(), requestOptions)

    /** Retrieve sensitive details for a Card */
    fun details(params: CardDetailsParams): CompletableFuture<CardDetails> =
        details(params, RequestOptions.none())

    /** @see [details] */
    fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails>

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: CardCreateParams): CompletableFuture<HttpResponseFor<Card>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>>

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}`, but is otherwise the same as
         * [CardServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CardRetrieveParams): CompletableFuture<HttpResponseFor<Card>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>>

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}`, but is otherwise the same as
         * [CardServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: CardUpdateParams): CompletableFuture<HttpResponseFor<Card>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>>

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(CardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none()
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardServiceAsync.details].
         */
        @MustBeClosed
        fun details(params: CardDetailsParams): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(params, RequestOptions.none())

        /** @see [details] */
        @MustBeClosed
        fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>>
    }
}
