// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardfuelconfirmations.CardFuelConfirmationCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardFuelConfirmationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardFuelConfirmationServiceAsync

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    fun create(params: CardFuelConfirmationCreateParams): CompletableFuture<CardPayment> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardFuelConfirmationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /**
     * A view of [CardFuelConfirmationServiceAsync] that provides access to raw HTTP responses for
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
        ): CardFuelConfirmationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_fuel_confirmations`, but is
         * otherwise the same as [CardFuelConfirmationServiceAsync.create].
         */
        fun create(
            params: CardFuelConfirmationCreateParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CardFuelConfirmationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>
    }
}
