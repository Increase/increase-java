// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardIncrementCreateParams

interface CardIncrementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    @JvmOverloads
    fun create(
        params: SimulationCardIncrementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * A view of [CardIncrementService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_increments`, but is otherwise the
         * same as [CardIncrementService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationCardIncrementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>
    }
}
