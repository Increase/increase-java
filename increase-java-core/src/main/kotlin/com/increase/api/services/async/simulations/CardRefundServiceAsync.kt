// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.SimulationCardRefundCreateParams
import com.increase.api.models.Transaction
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
    @JvmOverloads
    fun create(
        params: SimulationCardRefundCreateParams,
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationCardRefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>
    }
}
