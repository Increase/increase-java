// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardincrements.CardIncrementCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardIncrementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardIncrementServiceAsync

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    fun create(params: CardIncrementCreateParams): CompletableFuture<CardPayment> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardIncrementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /**
     * A view of [CardIncrementServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardIncrementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_increments`, but is otherwise the
         * same as [CardIncrementServiceAsync.create].
         */
        fun create(
            params: CardIncrementCreateParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardIncrementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>
    }
}
