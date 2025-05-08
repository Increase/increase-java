// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPageAsync
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardPurchaseSupplementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Purchase Supplement */
    fun retrieve(cardPurchaseSupplementId: String): CompletableFuture<CardPurchaseSupplement> =
        retrieve(cardPurchaseSupplementId, CardPurchaseSupplementRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        cardPurchaseSupplementId: String,
        params: CardPurchaseSupplementRetrieveParams = CardPurchaseSupplementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPurchaseSupplement> =
        retrieve(
            params.toBuilder().cardPurchaseSupplementId(cardPurchaseSupplementId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        cardPurchaseSupplementId: String,
        params: CardPurchaseSupplementRetrieveParams = CardPurchaseSupplementRetrieveParams.none(),
    ): CompletableFuture<CardPurchaseSupplement> =
        retrieve(cardPurchaseSupplementId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPurchaseSupplement>

    /** @see [retrieve] */
    fun retrieve(
        params: CardPurchaseSupplementRetrieveParams
    ): CompletableFuture<CardPurchaseSupplement> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        cardPurchaseSupplementId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPurchaseSupplement> =
        retrieve(
            cardPurchaseSupplementId,
            CardPurchaseSupplementRetrieveParams.none(),
            requestOptions,
        )

    /** List Card Purchase Supplements */
    fun list(): CompletableFuture<CardPurchaseSupplementListPageAsync> =
        list(CardPurchaseSupplementListParams.none())

    /** @see [list] */
    fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPurchaseSupplementListPageAsync>

    /** @see [list] */
    fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none()
    ): CompletableFuture<CardPurchaseSupplementListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<CardPurchaseSupplementListPageAsync> =
        list(CardPurchaseSupplementListParams.none(), requestOptions)

    /**
     * A view of [CardPurchaseSupplementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /card_purchase_supplements/{card_purchase_supplement_id}`, but is otherwise the same as
         * [CardPurchaseSupplementServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> =
            retrieve(cardPurchaseSupplementId, CardPurchaseSupplementRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String,
            params: CardPurchaseSupplementRetrieveParams =
                CardPurchaseSupplementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> =
            retrieve(
                params.toBuilder().cardPurchaseSupplementId(cardPurchaseSupplementId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String,
            params: CardPurchaseSupplementRetrieveParams =
                CardPurchaseSupplementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> =
            retrieve(cardPurchaseSupplementId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardPurchaseSupplementRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> =
            retrieve(
                cardPurchaseSupplementId,
                CardPurchaseSupplementRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /card_purchase_supplements`, but is otherwise the
         * same as [CardPurchaseSupplementServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CardPurchaseSupplementListPageAsync>> =
            list(CardPurchaseSupplementListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplementListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none()
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplementListPageAsync>> =
            list(CardPurchaseSupplementListParams.none(), requestOptions)
    }
}
