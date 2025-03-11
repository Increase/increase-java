// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardfuelconfirmations.CardFuelConfirmationCreateParams

interface CardFuelConfirmationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This
     * happens asynchronously right after a fuel pump transaction is completed. A fuel
     * confirmation can only happen once per authorization.
     */
    fun create(params: CardFuelConfirmationCreateParams): CardPayment =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: CardFuelConfirmationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CardPayment

    /**
     * A view of [CardFuelConfirmationService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_fuel_confirmations`, but
         * is otherwise the same as [CardFuelConfirmationService.create].
         */
        @MustBeClosed
        fun create(params: CardFuelConfirmationCreateParams): HttpResponseFor<CardPayment> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: CardFuelConfirmationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CardPayment>
    }
}
