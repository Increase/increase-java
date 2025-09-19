// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailDetailsParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import com.increase.api.models.carddetails.CardDetails
import com.increase.api.models.carddetails.CardIframeUrl
import java.util.function.Consumer

interface CardDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDetailService

    /** Update a Card's PIN */
    fun update(cardId: String, params: CardDetailUpdateParams): CardDetails =
        update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(params: CardDetailUpdateParams): CardDetails = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /**
     * Create an iframe URL for a Card to display the card details. More details about styling and
     * usage can be found in the [documentation](/documentation/embedded-card-component).
     */
    fun createDetailsIframe(cardId: String): CardIframeUrl =
        createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl =
        createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
    ): CardIframeUrl = createDetailsIframe(cardId, params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        params: CardDetailCreateDetailsIframeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl

    /** @see createDetailsIframe */
    fun createDetailsIframe(params: CardDetailCreateDetailsIframeParams): CardIframeUrl =
        createDetailsIframe(params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(cardId: String, requestOptions: RequestOptions): CardIframeUrl =
        createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none(), requestOptions)

    /**
     * Sensitive details for a Card include the primary account number, expiry, card verification
     * code, and PIN.
     */
    fun details(cardId: String): CardDetails = details(cardId, CardDetailDetailsParams.none())

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
    ): CardDetails = details(cardId, params, RequestOptions.none())

    /** @see details */
    fun details(
        params: CardDetailDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** @see details */
    fun details(params: CardDetailDetailsParams): CardDetails =
        details(params, RequestOptions.none())

    /** @see details */
    fun details(cardId: String, requestOptions: RequestOptions): CardDetails =
        details(cardId, CardDetailDetailsParams.none(), requestOptions)

    /** A view of [CardDetailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardDetailService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}/details`, but is otherwise the
         * same as [CardDetailService.update].
         */
        @MustBeClosed
        fun update(cardId: String, params: CardDetailUpdateParams): HttpResponseFor<CardDetails> =
            update(cardId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CardDetailUpdateParams): HttpResponseFor<CardDetails> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/create_details_iframe`, but is
         * otherwise the same as [CardDetailService.createDetailsIframe].
         */
        @MustBeClosed
        fun createDetailsIframe(cardId: String): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none())

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            cardId: String,
            params: CardDetailCreateDetailsIframeParams =
                CardDetailCreateDetailsIframeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            cardId: String,
            params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, params, RequestOptions.none())

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            params: CardDetailCreateDetailsIframeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl>

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            params: CardDetailCreateDetailsIframeParams
        ): HttpResponseFor<CardIframeUrl> = createDetailsIframe(params, RequestOptions.none())

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardDetailService.details].
         */
        @MustBeClosed
        fun details(cardId: String): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailDetailsParams.none())

        /** @see details */
        @MustBeClosed
        fun details(
            cardId: String,
            params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see details */
        @MustBeClosed
        fun details(
            cardId: String,
            params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
        ): HttpResponseFor<CardDetails> = details(cardId, params, RequestOptions.none())

        /** @see details */
        @MustBeClosed
        fun details(
            params: CardDetailDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /** @see details */
        @MustBeClosed
        fun details(params: CardDetailDetailsParams): HttpResponseFor<CardDetails> =
            details(params, RequestOptions.none())

        /** @see details */
        @MustBeClosed
        fun details(cardId: String, requestOptions: RequestOptions): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailDetailsParams.none(), requestOptions)
    }
}
