// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.SimulationCardRefundCreateParams
import com.increase.api.models.Transaction

interface CardRefundService {

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
    ): Transaction

    /** A view of [CardRefundService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_refunds`, but is otherwise the
         * same as [CardRefundService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationCardRefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>
    }
}
