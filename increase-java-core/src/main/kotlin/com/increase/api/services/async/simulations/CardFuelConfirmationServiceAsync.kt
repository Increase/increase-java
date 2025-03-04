// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardFuelConfirmationCreateParams
import java.util.concurrent.CompletableFuture

interface CardFuelConfirmationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    @JvmOverloads
    fun create(
        params: SimulationCardFuelConfirmationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /**
     * A view of [CardFuelConfirmationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_fuel_confirmations`, but is
         * otherwise the same as [CardFuelConfirmationServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationCardFuelConfirmationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>
    }
}
