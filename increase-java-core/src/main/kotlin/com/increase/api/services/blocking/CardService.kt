// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Card
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetails
import com.increase.api.models.CardDetailsParams
import com.increase.api.models.CardListPage
import com.increase.api.models.CardListParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardUpdateParams

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Card */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Retrieve a Card */
    @JvmOverloads
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Update a Card */
    @JvmOverloads
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** List Cards */
    @JvmOverloads
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListPage

    /** List Cards */
    fun list(requestOptions: RequestOptions): CardListPage =
        list(CardListParams.none(), requestOptions)

    /** Retrieve sensitive details for a Card */
    @JvmOverloads
    fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}`, but is otherwise the same as
         * [CardService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}`, but is otherwise the same as
         * [CardService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListPage>

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardListPage> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardService.details].
         */
        @JvmOverloads
        @MustBeClosed
        fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>
    }
}
