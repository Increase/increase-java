// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.cardrefunds.CardRefundCreateParams
import com.increase.api.models.transactions.Transaction
import java.util.concurrent.CompletableFuture

interface CardRefundServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates refunding a card transaction. The full value of the original sandbox transaction is
     * refunded.
     */
    fun create(params: CardRefundCreateParams): CompletableFuture<Transaction> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardRefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /**
     * A view of [CardRefundServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_refunds`, but is otherwise the
         * same as [CardRefundServiceAsync.create].
         */
        fun create(
            params: CardRefundCreateParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CardRefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>
    }
}
