// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailDetailsParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import com.increase.api.models.carddetails.CardDetails
import com.increase.api.models.carddetails.CardIframeUrl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDetailServiceAsync

    /** Update a Card's PIN */
    fun update(cardId: String, params: CardDetailUpdateParams): CompletableFuture<CardDetails> =
        update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails> =
        update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(params: CardDetailUpdateParams): CompletableFuture<CardDetails> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails>

    /**
     * Create an iframe URL for a Card to display the card details. More details about styling and
     * usage can be found in the [documentation](/documentation/embedded-card-component).
     */
    fun createDetailsIframe(cardId: String): CompletableFuture<CardIframeUrl> =
        createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardIframeUrl> =
        createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
    ): CompletableFuture<CardIframeUrl> = createDetailsIframe(cardId, params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        params: CardDetailCreateDetailsIframeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardIframeUrl>

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        params: CardDetailCreateDetailsIframeParams
    ): CompletableFuture<CardIframeUrl> = createDetailsIframe(params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardIframeUrl> =
        createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none(), requestOptions)

    /**
     * Sensitive details for a Card include the primary account number, expiry, card verification
     * code, and PIN.
     */
    fun details(cardId: String): CompletableFuture<CardDetails> =
        details(cardId, CardDetailDetailsParams.none())

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails> =
        details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
    ): CompletableFuture<CardDetails> = details(cardId, params, RequestOptions.none())

    /** @see details */
    fun details(
        params: CardDetailDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDetails>

    /** @see details */
    fun details(params: CardDetailDetailsParams): CompletableFuture<CardDetails> =
        details(params, RequestOptions.none())

    /** @see details */
    fun details(cardId: String, requestOptions: RequestOptions): CompletableFuture<CardDetails> =
        details(cardId, CardDetailDetailsParams.none(), requestOptions)

    /**
     * A view of [CardDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}/details`, but is otherwise the
         * same as [CardDetailServiceAsync.update].
         */
        fun update(
            cardId: String,
            params: CardDetailUpdateParams,
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            update(cardId, params, RequestOptions.none())

        /** @see update */
        fun update(
            cardId: String,
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        fun update(
            params: CardDetailUpdateParams
        ): CompletableFuture<HttpResponseFor<CardDetails>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>>

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/create_details_iframe`, but is
         * otherwise the same as [CardDetailServiceAsync.createDetailsIframe].
         */
        fun createDetailsIframe(cardId: String): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none())

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            cardId: String,
            params: CardDetailCreateDetailsIframeParams =
                CardDetailCreateDetailsIframeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            cardId: String,
            params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(cardId, params, RequestOptions.none())

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            params: CardDetailCreateDetailsIframeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>>

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            params: CardDetailCreateDetailsIframeParams
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(params, RequestOptions.none())

        /** @see createDetailsIframe */
        fun createDetailsIframe(
            cardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardIframeUrl>> =
            createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardDetailServiceAsync.details].
         */
        fun details(cardId: String): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(cardId, CardDetailDetailsParams.none())

        /** @see details */
        fun details(
            cardId: String,
            params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see details */
        fun details(
            cardId: String,
            params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(cardId, params, RequestOptions.none())

        /** @see details */
        fun details(
            params: CardDetailDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDetails>>

        /** @see details */
        fun details(
            params: CardDetailDetailsParams
        ): CompletableFuture<HttpResponseFor<CardDetails>> = details(params, RequestOptions.none())

        /** @see details */
        fun details(
            cardId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardDetails>> =
            details(cardId, CardDetailDetailsParams.none(), requestOptions)
    }
}
