// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams

interface CardAuthorizationExpirationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates expiring a Card Authorization immediately. */
    fun create(params: SimulationCardAuthorizationExpirationCreateParams): CardPayment =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SimulationCardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * A view of [CardAuthorizationExpirationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_authorization_expirations`, but
         * is otherwise the same as [CardAuthorizationExpirationService.create].
         */
        @MustBeClosed
        fun create(
            params: SimulationCardAuthorizationExpirationCreateParams
        ): HttpResponseFor<CardPayment> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SimulationCardAuthorizationExpirationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>
    }
}
