// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPage
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementRetrieveParams
import java.util.function.Consumer

interface CardPurchaseSupplementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPurchaseSupplementService

    /** Retrieve a Card Purchase Supplement */
    fun retrieve(cardPurchaseSupplementId: String): CardPurchaseSupplement =
        retrieve(cardPurchaseSupplementId, CardPurchaseSupplementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardPurchaseSupplementId: String,
        params: CardPurchaseSupplementRetrieveParams = CardPurchaseSupplementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplement =
        retrieve(
            params.toBuilder().cardPurchaseSupplementId(cardPurchaseSupplementId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        cardPurchaseSupplementId: String,
        params: CardPurchaseSupplementRetrieveParams = CardPurchaseSupplementRetrieveParams.none(),
    ): CardPurchaseSupplement = retrieve(cardPurchaseSupplementId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplement

    /** @see retrieve */
    fun retrieve(params: CardPurchaseSupplementRetrieveParams): CardPurchaseSupplement =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardPurchaseSupplementId: String,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplement =
        retrieve(
            cardPurchaseSupplementId,
            CardPurchaseSupplementRetrieveParams.none(),
            requestOptions,
        )

    /** List Card Purchase Supplements */
    fun list(): CardPurchaseSupplementListPage = list(CardPurchaseSupplementListParams.none())

    /** @see list */
    fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplementListPage

    /** @see list */
    fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none()
    ): CardPurchaseSupplementListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CardPurchaseSupplementListPage =
        list(CardPurchaseSupplementListParams.none(), requestOptions)

    /**
     * A view of [CardPurchaseSupplementService] that provides access to raw HTTP responses for each
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
        ): CardPurchaseSupplementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /card_purchase_supplements/{card_purchase_supplement_id}`, but is otherwise the same as
         * [CardPurchaseSupplementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(cardPurchaseSupplementId: String): HttpResponseFor<CardPurchaseSupplement> =
            retrieve(cardPurchaseSupplementId, CardPurchaseSupplementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String,
            params: CardPurchaseSupplementRetrieveParams =
                CardPurchaseSupplementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplement> =
            retrieve(
                params.toBuilder().cardPurchaseSupplementId(cardPurchaseSupplementId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String,
            params: CardPurchaseSupplementRetrieveParams =
                CardPurchaseSupplementRetrieveParams.none(),
        ): HttpResponseFor<CardPurchaseSupplement> =
            retrieve(cardPurchaseSupplementId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplement>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardPurchaseSupplementRetrieveParams
        ): HttpResponseFor<CardPurchaseSupplement> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPurchaseSupplementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPurchaseSupplement> =
            retrieve(
                cardPurchaseSupplementId,
                CardPurchaseSupplementRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /card_purchase_supplements`, but is otherwise the
         * same as [CardPurchaseSupplementService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CardPurchaseSupplementListPage> =
            list(CardPurchaseSupplementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplementListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none()
        ): HttpResponseFor<CardPurchaseSupplementListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardPurchaseSupplementListPage> =
            list(CardPurchaseSupplementListParams.none(), requestOptions)
    }
}
