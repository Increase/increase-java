// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardReversalCreateParams
import java.util.concurrent.CompletableFuture

interface CardReversalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    fun create(params: SimulationCardReversalCreateParams): CompletableFuture<CardPayment> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SimulationCardReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /**
     * A view of [CardReversalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_reversals`, but is otherwise the
         * same as [CardReversalServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: SimulationCardReversalCreateParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SimulationCardReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>
    }
}
