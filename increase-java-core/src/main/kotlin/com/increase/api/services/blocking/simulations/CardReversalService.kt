// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardreversals.CardReversalCreateParams
import java.util.function.Consumer

interface CardReversalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardReversalService

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    fun create(params: CardReversalCreateParams): CardPayment =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * A view of [CardReversalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardReversalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_reversals`, but is otherwise the
         * same as [CardReversalService.create].
         */
        @MustBeClosed
        fun create(params: CardReversalCreateParams): HttpResponseFor<CardPayment> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>
    }
}
