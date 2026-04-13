// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.simulations.cardpurchasesupplements.CardPurchaseSupplementCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardPurchaseSupplementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPurchaseSupplementServiceAsync

    /**
     * Simulates the creation of a Card Purchase Supplement (Level 3 data) for a card settlement.
     * This happens asynchronously in production when Visa sends enhanced transaction data about a
     * purchase.
     */
    fun create(
        params: CardPurchaseSupplementCreateParams
    ): CompletableFuture<CardPurchaseSupplement> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardPurchaseSupplementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPurchaseSupplement>

    /**
     * A view of [CardPurchaseSupplementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardPurchaseSupplementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_purchase_supplements`, but is
         * otherwise the same as [CardPurchaseSupplementServiceAsync.create].
         */
        fun create(
            params: CardPurchaseSupplementCreateParams
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardPurchaseSupplementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>>
    }
}
