// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cards.Card
import com.increase.api.models.cards.CardCreateDetailsIframeParams
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetails
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardIframeUrl
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardListResponse
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams
import com.increase.api.models.cards.CardUpdatePinParams
import java.util.function.Consumer

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService

    /** Create a Card */
    fun create(params: CardCreateParams): Card = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Retrieve a Card */
    fun retrieve(cardId: String): Card = retrieve(cardId, CardRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(cardId: String, params: CardRetrieveParams = CardRetrieveParams.none()): Card =
        retrieve(cardId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see retrieve */
    fun retrieve(params: CardRetrieveParams): Card = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(cardId: String, requestOptions: RequestOptions): Card =
        retrieve(cardId, CardRetrieveParams.none(), requestOptions)

    /** Update a Card */
    fun update(cardId: String): Card = update(cardId, CardUpdateParams.none())

    /** @see update */
    fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    fun update(cardId: String, params: CardUpdateParams = CardUpdateParams.none()): Card =
        update(cardId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see update */
    fun update(params: CardUpdateParams): Card = update(params, RequestOptions.none())

    /** @see update */
    fun update(cardId: String, requestOptions: RequestOptions): Card =
        update(cardId, CardUpdateParams.none(), requestOptions)

    /** List Cards */
    fun list(): CardListResponse = list(CardListParams.none())

    /** @see list */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** @see list */
    fun list(params: CardListParams = CardListParams.none()): CardListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /**
     * Create an iframe URL for a Card to display the card details. More details about styling and
     * usage can be found in the [documentation](/documentation/embedded-card-component).
     */
    fun createDetailsIframe(cardId: String): CardIframeUrl =
        createDetailsIframe(cardId, CardCreateDetailsIframeParams.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl =
        createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        cardId: String,
        params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
    ): CardIframeUrl = createDetailsIframe(cardId, params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(
        params: CardCreateDetailsIframeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl

    /** @see createDetailsIframe */
    fun createDetailsIframe(params: CardCreateDetailsIframeParams): CardIframeUrl =
        createDetailsIframe(params, RequestOptions.none())

    /** @see createDetailsIframe */
    fun createDetailsIframe(cardId: String, requestOptions: RequestOptions): CardIframeUrl =
        createDetailsIframe(cardId, CardCreateDetailsIframeParams.none(), requestOptions)

    /**
     * Sensitive details for a Card include the primary account number, expiry, card verification
     * code, and PIN.
     */
    fun details(cardId: String): CardDetails = details(cardId, CardDetailsParams.none())

    /** @see details */
    fun details(
        cardId: String,
        params: CardDetailsParams = CardDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see details */
    fun details(cardId: String, params: CardDetailsParams = CardDetailsParams.none()): CardDetails =
        details(cardId, params, RequestOptions.none())

    /** @see details */
    fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** @see details */
    fun details(params: CardDetailsParams): CardDetails = details(params, RequestOptions.none())

    /** @see details */
    fun details(cardId: String, requestOptions: RequestOptions): CardDetails =
        details(cardId, CardDetailsParams.none(), requestOptions)

    /** Update a Card's PIN */
    fun updatePin(cardId: String, params: CardUpdatePinParams): CardDetails =
        updatePin(cardId, params, RequestOptions.none())

    /** @see updatePin */
    fun updatePin(
        cardId: String,
        params: CardUpdatePinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = updatePin(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see updatePin */
    fun updatePin(params: CardUpdatePinParams): CardDetails =
        updatePin(params, RequestOptions.none())

    /** @see updatePin */
    fun updatePin(
        params: CardUpdatePinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardService.create].
         */
        @MustBeClosed
        fun create(params: CardCreateParams): HttpResponseFor<Card> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}`, but is otherwise the same as
         * [CardService.retrieve].
         */
        @MustBeClosed
        fun retrieve(cardId: String): HttpResponseFor<Card> =
            retrieve(cardId, CardRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
        ): HttpResponseFor<Card> = retrieve(cardId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CardRetrieveParams): HttpResponseFor<Card> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(cardId: String, requestOptions: RequestOptions): HttpResponseFor<Card> =
            retrieve(cardId, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}`, but is otherwise the same as
         * [CardService.update].
         */
        @MustBeClosed
        fun update(cardId: String): HttpResponseFor<Card> = update(cardId, CardUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> = update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
        ): HttpResponseFor<Card> = update(cardId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see update */
        @MustBeClosed
        fun update(params: CardUpdateParams): HttpResponseFor<Card> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(cardId: String, requestOptions: RequestOptions): HttpResponseFor<Card> =
            update(cardId, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CardListResponse> = list(CardListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none()
        ): HttpResponseFor<CardListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListResponse> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/create_details_iframe`, but is
         * otherwise the same as [CardService.createDetailsIframe].
         */
        @MustBeClosed
        fun createDetailsIframe(cardId: String): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, CardCreateDetailsIframeParams.none())

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            cardId: String,
            params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            cardId: String,
            params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, params, RequestOptions.none())

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            params: CardCreateDetailsIframeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl>

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            params: CardCreateDetailsIframeParams
        ): HttpResponseFor<CardIframeUrl> = createDetailsIframe(params, RequestOptions.none())

        /** @see createDetailsIframe */
        @MustBeClosed
        fun createDetailsIframe(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, CardCreateDetailsIframeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardService.details].
         */
        @MustBeClosed
        fun details(cardId: String): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailsParams.none())

        /** @see details */
        @MustBeClosed
        fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see details */
        @MustBeClosed
        fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
        ): HttpResponseFor<CardDetails> = details(cardId, params, RequestOptions.none())

        /** @see details */
        @MustBeClosed
        fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /** @see details */
        @MustBeClosed
        fun details(params: CardDetailsParams): HttpResponseFor<CardDetails> =
            details(params, RequestOptions.none())

        /** @see details */
        @MustBeClosed
        fun details(cardId: String, requestOptions: RequestOptions): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/update_pin`, but is otherwise the
         * same as [CardService.updatePin].
         */
        @MustBeClosed
        fun updatePin(cardId: String, params: CardUpdatePinParams): HttpResponseFor<CardDetails> =
            updatePin(cardId, params, RequestOptions.none())

        /** @see updatePin */
        @MustBeClosed
        fun updatePin(
            cardId: String,
            params: CardUpdatePinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            updatePin(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see updatePin */
        @MustBeClosed
        fun updatePin(params: CardUpdatePinParams): HttpResponseFor<CardDetails> =
            updatePin(params, RequestOptions.none())

        /** @see updatePin */
        @MustBeClosed
        fun updatePin(
            params: CardUpdatePinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>
    }
}
