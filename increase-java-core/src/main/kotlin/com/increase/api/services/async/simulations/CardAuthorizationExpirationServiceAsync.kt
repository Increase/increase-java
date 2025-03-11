// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardauthorizationexpirations.CardAuthorizationExpirationCreateParams
import java.util.concurrent.CompletableFuture

interface CardAuthorizationExpirationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates expiring a Card Authorization immediately. */
    fun create(params: CardAuthorizationExpirationCreateParams): CompletableFuture<CardPayment> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: CardAuthorizationExpirationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardPayment>

    /**
     * A view of [CardAuthorizationExpirationServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/card_authorization_expirations`, but is otherwise the same as
         * [CardAuthorizationExpirationServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: CardAuthorizationExpirationCreateParams): CompletableFuture<HttpResponseFor<CardPayment>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: CardAuthorizationExpirationCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<CardPayment>>
    }
}
