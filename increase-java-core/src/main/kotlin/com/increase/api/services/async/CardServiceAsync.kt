// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cards.Card
import com.increase.api.models.cards.CardCreateDetailsIframeParams
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetails
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardIframeUrl
import com.increase.api.models.cards.CardListPageAsync
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync

    /** Create a Card */
    fun create(params: CardCreateParams): CompletableFuture<Card> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card>

    /** Retrieve a Card */
    fun retrieve(cardId: String): CompletableFuture<Card> =
        retrieve(cardId, CardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card> = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
    ): CompletableFuture<Card> = retrieve(cardId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card>

    /** @see retrieve */
    fun retrieve(params: CardRetrieveParams): CompletableFuture<Card> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(cardId: String, requestOptions: RequestOptions): CompletableFuture<Card> =
        retrieve(cardId, CardRetrieveParams.none(), requestOptions)

    /** Update a Card */
    fun update(cardId: String): CompletableFuture<Card> = update(cardId, CardUpdateParams.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card> = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
    ): CompletableFuture<Card> = update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Card>

    /** @see update */
    fun update(params: CardUpdateParams): CompletableFuture<Card> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(cardId: String, requestOptions: RequestOptions): CompletableFuture<Card> =
        update(cardId, CardUpdateParams.none(), requestOptions)

    /** List Cards */
    fun list(): CompletableFuture<CardListPageAsync> = list(CardListParams.none())

    /** @see list */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardListPageAsync>

    /** @see list */
    fun list(params: CardListParams = CardListParams.none()): CompletableFuture<CardListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardListPageAsync> =
        list(CardListParams.none(), requestOptions)

    /**
     * Create an iframe URL for a Card to display the card details. More details about styling and
     * usage can be found in the [documentation](/documentation/embedded-card-component).
     */
    fun createDetailsIframe(cardId: String): CompletableFuture<CardIframeUrl> =
        createDetailsIframe(cardId, CardCreateDetailsIframeParams.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardIframeUrl> =
        createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
    ): CompletableFuture<CardIframeUrl> = createDetailsIframe(cardId, params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        params: CardCreateDetailsIframeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardIframeUrl>

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        params: CardCreateDetailsIframeParams
    ): CompletableFuture<CardIframeUrl> = createDetailsIframe(params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardIframeUrl> =
        createDetailsIframe(cardId, CardCreateDetailsIframeParams.none(), requestOptions)

    /**
     * Sensitive details for a Card include the primary account number, expiry, card verification
     * code, and PIN.
     */
    fun details(cardId: String): CompletableFuture<CardDetails> =
        details(cardId, CardDetailsParams.none())

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailsParams = CardDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails> =
        details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailsParams = CardDetailsParams.none(),
    ): CompletableFuture<CardDetails> = details(cardId, params, RequestOptions.none())

    /** @see details */
    fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails>

    /** @see details */
    fun details(params: CardDetailsParams): CompletableFuture<CardDetails> =
        details(params, RequestOptions.none())

    /** @see details */
    fun details(cardId: String, requestOptions: RequestOptions): CompletableFuture<CardDetails> =
        details(cardId, CardDetailsParams.none(), requestOptions)

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        fun create(params: CardCreateParams): CompletableFuture<HttpResponseFor<Card>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>>

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}`, but is otherwise the same as
         * [CardServiceAsync.retrieve].
         */
        fun retrieve(cardId: String): CompletableFuture<HttpResponseFor<Card>> =
            retrieve(cardId, CardRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Card>> =
            retrieve(cardId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>>

        /** @see retrieve */
        fun retrieve(params: CardRetrieveParams): CompletableFuture<HttpResponseFor<Card>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> =
            retrieve(cardId, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}`, but is otherwise the same as
         * [CardServiceAsync.update].
         */
        fun update(cardId: String): CompletableFuture<HttpResponseFor<Card>> =
            update(cardId, CardUpdateParams.none())

        /** @see update */
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Card>> = update(cardId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Card>>

        /** @see update */
        fun update(params: CardUpdateParams): CompletableFuture<HttpResponseFor<Card>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            cardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> =
            update(cardId, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(CardListParams.none())

        /** @see list */
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>>

        /** @see list */
        fun list(
            params: CardListParams = CardListParams.none()
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/create_details_iframe`, but is
         * otherwise the same as [CardServiceAsync.createDetailsIframe].
         */
        fun createDetailsIframe(cardId: String): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(cardId, CardCreateDetailsIframeParams.none())

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            cardId: String,
            params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            cardId: String,
            params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(cardId, params, RequestOptions.none())

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            params: CardCreateDetailsIframeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>>

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            params: CardCreateDetailsIframeParams
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(params, RequestOptions.none())

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            cardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(cardId, CardCreateDetailsIframeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardServiceAsync.details].
         */
        fun details(cardId: String): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(cardId, CardDetailsParams.none())

        /** @see details */
        fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see details */
        fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(cardId, params, RequestOptions.none())

        /** @see details */
        fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>>

        /** @see details */
        fun details(params: CardDetailsParams): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(params, RequestOptions.none())

        /** @see details */
        fun details(
            cardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(cardId, CardDetailsParams.none(), requestOptions)
    }
}
