// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardauthorizationexpirations.CardAuthorizationExpirationCreateParams
import java.util.function.Consumer

interface CardAuthorizationExpirationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardAuthorizationExpirationService

    /** Simulates expiring a Card Authorization immediately. */
    fun create(params: CardAuthorizationExpirationCreateParams): CardPayment =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * A view of [CardAuthorizationExpirationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardAuthorizationExpirationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_authorization_expirations`, but
         * is otherwise the same as [CardAuthorizationExpirationService.create].
         */
        @MustBeClosed
        fun create(params: CardAuthorizationExpirationCreateParams): HttpResponseFor<CardPayment> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CardAuthorizationExpirationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>
    }
}
