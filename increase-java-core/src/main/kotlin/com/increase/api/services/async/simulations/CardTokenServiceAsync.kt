// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.simulations.cardtokens.CardTokenCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardTokenServiceAsync

    /** Simulates tokenizing a card in the sandbox environment. */
    fun create(): CompletableFuture<CardToken> = create(CardTokenCreateParams.none())

    /** @see create */
    fun create(
        params: CardTokenCreateParams = CardTokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardToken>

    /** @see create */
    fun create(
        params: CardTokenCreateParams = CardTokenCreateParams.none()
    ): CompletableFuture<CardToken> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<CardToken> =
        create(CardTokenCreateParams.none(), requestOptions)

    /**
     * A view of [CardTokenServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_tokens`, but is otherwise the
         * same as [CardTokenServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<CardToken>> =
            create(CardTokenCreateParams.none())

        /** @see create */
        fun create(
            params: CardTokenCreateParams = CardTokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardToken>>

        /** @see create */
        fun create(
            params: CardTokenCreateParams = CardTokenCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CardToken>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<CardToken>> =
            create(CardTokenCreateParams.none(), requestOptions)
    }
}
