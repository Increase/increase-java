// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.simulations.cardpurchasesupplements.CardPurchaseSupplementCreateParams
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

    /**
     * Simulates the creation of a Card Purchase Supplement (Level 3 data) for a card settlement.
     * This happens asynchronously in production when Visa sends enhanced transaction data about a
     * purchase.
     */
    fun create(params: CardPurchaseSupplementCreateParams): CardPurchaseSupplement =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardPurchaseSupplementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplement

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
         * Returns a raw HTTP response for `post /simulations/card_purchase_supplements`, but is
         * otherwise the same as [CardPurchaseSupplementService.create].
         */
        @MustBeClosed
        fun create(
            params: CardPurchaseSupplementCreateParams
        ): HttpResponseFor<CardPurchaseSupplement> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardPurchaseSupplementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplement>
    }
}
