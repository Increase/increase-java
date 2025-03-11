// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.simulations.carddisputes.CardDisputeActionParams
import java.util.concurrent.CompletableFuture

interface CardDisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * After a [Card Dispute](#card-disputes) is created in production, the dispute
     * will be reviewed. Since no review happens in sandbox, this endpoint simulates
     * moving a Card Dispute into a rejected or accepted state. A Card Dispute can only
     * be actioned one time and must have a status of `pending_reviewing`.
     */
    fun action(params: CardDisputeActionParams): CompletableFuture<CardDispute> =
        action(
          params, RequestOptions.none()
        )

    /** @see [action] */
    fun action(params: CardDisputeActionParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardDispute>

    /**
     * A view of [CardDisputeServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/card_disputes/{card_dispute_id}/action`, but is otherwise the
         * same as [CardDisputeServiceAsync.action].
         */
        @MustBeClosed
        fun action(params: CardDisputeActionParams): CompletableFuture<HttpResponseFor<CardDispute>> =
            action(
              params, RequestOptions.none()
            )

        /** @see [action] */
        @MustBeClosed
        fun action(params: CardDisputeActionParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CardDispute>>
    }
}
