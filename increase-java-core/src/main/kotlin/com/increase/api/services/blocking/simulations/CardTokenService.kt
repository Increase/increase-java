// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.simulations.cardtokens.CardTokenCreateParams
import java.util.function.Consumer

interface CardTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardTokenService

    /** Simulates tokenizing a card in the sandbox environment. */
    fun create(): CardToken = create(CardTokenCreateParams.none())

    /** @see create */
    fun create(
        params: CardTokenCreateParams = CardTokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardToken

    /** @see create */
    fun create(params: CardTokenCreateParams = CardTokenCreateParams.none()): CardToken =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CardToken =
        create(CardTokenCreateParams.none(), requestOptions)

    /** A view of [CardTokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_tokens`, but is otherwise the
         * same as [CardTokenService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<CardToken> = create(CardTokenCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardTokenCreateParams = CardTokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardToken>

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardTokenCreateParams = CardTokenCreateParams.none()
        ): HttpResponseFor<CardToken> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<CardToken> =
            create(CardTokenCreateParams.none(), requestOptions)
    }
}
