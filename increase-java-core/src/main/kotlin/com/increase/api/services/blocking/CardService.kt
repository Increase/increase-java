// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cards.Card
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetails
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardListPage
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Card */
    fun create(params: CardCreateParams): Card = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Retrieve a Card */
    fun retrieve(cardId: String): Card = retrieve(cardId, CardRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(cardId: String, params: CardRetrieveParams = CardRetrieveParams.none()): Card =
        retrieve(cardId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see [retrieve] */
    fun retrieve(params: CardRetrieveParams): Card = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(cardId: String, requestOptions: RequestOptions): Card =
        retrieve(cardId, CardRetrieveParams.none(), requestOptions)

    /** Update a Card */
    fun update(cardId: String): Card = update(cardId, CardUpdateParams.none())

    /** @see [update] */
    fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see [update] */
    fun update(cardId: String, params: CardUpdateParams = CardUpdateParams.none()): Card =
        update(cardId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see [update] */
    fun update(params: CardUpdateParams): Card = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(cardId: String, requestOptions: RequestOptions): Card =
        update(cardId, CardUpdateParams.none(), requestOptions)

    /** List Cards */
    fun list(): CardListPage = list(CardListParams.none())

    /** @see [list] */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListPage

    /** @see [list] */
    fun list(params: CardListParams = CardListParams.none()): CardListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CardListPage =
        list(CardListParams.none(), requestOptions)

    /** Retrieve sensitive details for a Card */
    fun details(cardId: String): CardDetails = details(cardId, CardDetailsParams.none())

    /** @see [details] */
    fun details(
        cardId: String,
        params: CardDetailsParams = CardDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see [details] */
    fun details(cardId: String, params: CardDetailsParams = CardDetailsParams.none()): CardDetails =
        details(cardId, params, RequestOptions.none())

    /** @see [details] */
    fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** @see [details] */
    fun details(params: CardDetailsParams): CardDetails = details(params, RequestOptions.none())

    /** @see [details] */
    fun details(cardId: String, requestOptions: RequestOptions): CardDetails =
        details(cardId, CardDetailsParams.none(), requestOptions)

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardService.create].
         */
        @MustBeClosed
        fun create(params: CardCreateParams): HttpResponseFor<Card> =
            create(params, RequestOptions.none())

        /** @see [create] */
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

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
        ): HttpResponseFor<Card> = retrieve(cardId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: CardRetrieveParams): HttpResponseFor<Card> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(cardId: String, requestOptions: RequestOptions): HttpResponseFor<Card> =
            retrieve(cardId, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}`, but is otherwise the same as
         * [CardService.update].
         */
        @MustBeClosed
        fun update(cardId: String): HttpResponseFor<Card> = update(cardId, CardUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> = update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
        ): HttpResponseFor<Card> = update(cardId, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see [update] */
        @MustBeClosed
        fun update(params: CardUpdateParams): HttpResponseFor<Card> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(cardId: String, requestOptions: RequestOptions): HttpResponseFor<Card> =
            update(cardId, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<CardListPage> = list(CardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: CardListParams = CardListParams.none()): HttpResponseFor<CardListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListPage> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardService.details].
         */
        @MustBeClosed
        fun details(cardId: String): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailsParams.none())

        /** @see [details] */
        @MustBeClosed
        fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see [details] */
        @MustBeClosed
        fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
        ): HttpResponseFor<CardDetails> = details(cardId, params, RequestOptions.none())

        /** @see [details] */
        @MustBeClosed
        fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /** @see [details] */
        @MustBeClosed
        fun details(params: CardDetailsParams): HttpResponseFor<CardDetails> =
            details(params, RequestOptions.none())

        /** @see [details] */
        @MustBeClosed
        fun details(cardId: String, requestOptions: RequestOptions): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailsParams.none(), requestOptions)
    }
}
