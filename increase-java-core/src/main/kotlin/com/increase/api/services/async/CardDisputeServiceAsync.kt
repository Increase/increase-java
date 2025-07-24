// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListPageAsync
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardDisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDisputeServiceAsync

    /** Create a Card Dispute */
    fun create(params: CardDisputeCreateParams): CompletableFuture<CardDispute> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** Retrieve a Card Dispute */
    fun retrieve(cardDisputeId: String): CompletableFuture<CardDispute> =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
    ): CompletableFuture<CardDispute> = retrieve(cardDisputeId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /** @see retrieve */
    fun retrieve(params: CardDisputeRetrieveParams): CompletableFuture<CardDispute> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardDisputeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardDispute> =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

    /** List Card Disputes */
    fun list(): CompletableFuture<CardDisputeListPageAsync> = list(CardDisputeListParams.none())

    /** @see list */
    fun list(
        params: CardDisputeListParams = CardDisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDisputeListPageAsync>

    /** @see list */
    fun list(
        params: CardDisputeListParams = CardDisputeListParams.none()
    ): CompletableFuture<CardDisputeListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardDisputeListPageAsync> =
        list(CardDisputeListParams.none(), requestOptions)

    /**
     * A view of [CardDisputeServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardDisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_disputes`, but is otherwise the same as
         * [CardDisputeServiceAsync.create].
         */
        fun create(
            params: CardDisputeCreateParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /**
         * Returns a raw HTTP response for `get /card_disputes/{card_dispute_id}`, but is otherwise
         * the same as [CardDisputeServiceAsync.retrieve].
         */
        fun retrieve(cardDisputeId: String): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(cardDisputeId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>

        /** @see retrieve */
        fun retrieve(
            params: CardDisputeRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_disputes`, but is otherwise the same as
         * [CardDisputeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>> =
            list(CardDisputeListParams.none())

        /** @see list */
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>>

        /** @see list */
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none()
        ): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardDisputeListPageAsync>> =
            list(CardDisputeListParams.none(), requestOptions)
    }
}
