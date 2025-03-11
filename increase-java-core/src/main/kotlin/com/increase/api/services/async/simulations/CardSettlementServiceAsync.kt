// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.cardsettlements.CardSettlementCreateParams
import com.increase.api.models.transactions.Transaction
import java.util.concurrent.CompletableFuture

interface CardSettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the settlement of an authorization by a card acquirer. After a card authorization
     * is created, the merchant will eventually send a settlement. This simulates that event, which
     * may occur many days after the purchase in production. The amount settled can be different
     * from the amount originally authorized, for example, when adding a tip to a restaurant bill.
     */
    fun create(params: CardSettlementCreateParams): CompletableFuture<Transaction> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /**
     * A view of [CardSettlementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_settlements`, but is otherwise
         * the same as [CardSettlementServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CardSettlementCreateParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CardSettlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>
    }
}
