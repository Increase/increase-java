// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.simulations.carddisputes.CardDisputeActionParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardDisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDisputeServiceAsync

    /**
     * After a [Card Dispute](#card-disputes) is created in production, the dispute will initially
     * be in a `pending_user_submission_reviewing` state. Since no review or further action happens
     * in sandbox, this endpoint simulates moving a Card Dispute through its various states.
     */
    fun action(
        cardDisputeId: String,
        params: CardDisputeActionParams,
    ): CompletableFuture<CardDispute> = action(cardDisputeId, params, RequestOptions.none())

    /** @see action */
    fun action(
        cardDisputeId: String,
        params: CardDisputeActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute> =
        action(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see action */
    fun action(params: CardDisputeActionParams): CompletableFuture<CardDispute> =
        action(params, RequestOptions.none())

    /** @see action */
    fun action(
        params: CardDisputeActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardDispute>

    /**
     * A view of [CardDisputeServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardDisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/card_disputes/{card_dispute_id}/action`, but is otherwise the same as
         * [CardDisputeServiceAsync.action].
         */
        fun action(
            cardDisputeId: String,
            params: CardDisputeActionParams,
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            action(cardDisputeId, params, RequestOptions.none())

        /** @see action */
        fun action(
            cardDisputeId: String,
            params: CardDisputeActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>> =
            action(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see action */
        fun action(
            params: CardDisputeActionParams
        ): CompletableFuture<HttpResponseFor<CardDispute>> = action(params, RequestOptions.none())

        /** @see action */
        fun action(
            params: CardDisputeActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardDispute>>
    }
}
