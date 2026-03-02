// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengeAttemptsParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengesParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardAuthenticationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardAuthenticationServiceAsync

    /**
     * Simulates a Card Authentication attempt on a [Card](#cards). The attempt always results in a
     * [Card Payment](#card_payments) being created, either with a status that allows further action
     * or a terminal failed status.
     */
    fun create(params: CardAuthenticationCreateParams): CompletableFuture<CardPayment> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardAuthenticationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /**
     * Simulates an attempt at a Card Authentication Challenge. This updates the
     * `card_authentications` object under the [Card Payment](#card_payments). You can also attempt
     * the challenge by navigating to
     * https://dashboard.increase.com/card_authentication_simulation/:card_payment_id.
     */
    fun challengeAttempts(
        cardPaymentId: String,
        params: CardAuthenticationChallengeAttemptsParams,
    ): CompletableFuture<CardPayment> =
        challengeAttempts(cardPaymentId, params, RequestOptions.none())

    /** @see challengeAttempts */
    fun challengeAttempts(
        cardPaymentId: String,
        params: CardAuthenticationChallengeAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment> =
        challengeAttempts(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see challengeAttempts */
    fun challengeAttempts(
        params: CardAuthenticationChallengeAttemptsParams
    ): CompletableFuture<CardPayment> = challengeAttempts(params, RequestOptions.none())

    /** @see challengeAttempts */
    fun challengeAttempts(
        params: CardAuthenticationChallengeAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /**
     * Simulates starting a Card Authentication Challenge for an existing Card Authentication. This
     * updates the `card_authentications` object under the [Card Payment](#card_payments). To
     * attempt the challenge, use the
     * `/simulations/card_authentications/:card_payment_id/challenge_attempts` endpoint or navigate
     * to https://dashboard.increase.com/card_authentication_simulation/:card_payment_id.
     */
    fun challenges(cardPaymentId: String): CompletableFuture<CardPayment> =
        challenges(cardPaymentId, CardAuthenticationChallengesParams.none())

    /** @see challenges */
    fun challenges(
        cardPaymentId: String,
        params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment> =
        challenges(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see challenges */
    fun challenges(
        cardPaymentId: String,
        params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
    ): CompletableFuture<CardPayment> = challenges(cardPaymentId, params, RequestOptions.none())

    /** @see challenges */
    fun challenges(
        params: CardAuthenticationChallengesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /** @see challenges */
    fun challenges(params: CardAuthenticationChallengesParams): CompletableFuture<CardPayment> =
        challenges(params, RequestOptions.none())

    /** @see challenges */
    fun challenges(
        cardPaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPayment> =
        challenges(cardPaymentId, CardAuthenticationChallengesParams.none(), requestOptions)

    /**
     * A view of [CardAuthenticationServiceAsync] that provides access to raw HTTP responses for
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
        ): CardAuthenticationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_authentications`, but is
         * otherwise the same as [CardAuthenticationServiceAsync.create].
         */
        fun create(
            params: CardAuthenticationCreateParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardAuthenticationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/card_authentications/{card_payment_id}/challenge_attempts`, but is otherwise
         * the same as [CardAuthenticationServiceAsync.challengeAttempts].
         */
        fun challengeAttempts(
            cardPaymentId: String,
            params: CardAuthenticationChallengeAttemptsParams,
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challengeAttempts(cardPaymentId, params, RequestOptions.none())

        /** @see challengeAttempts */
        fun challengeAttempts(
            cardPaymentId: String,
            params: CardAuthenticationChallengeAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challengeAttempts(
                params.toBuilder().cardPaymentId(cardPaymentId).build(),
                requestOptions,
            )

        /** @see challengeAttempts */
        fun challengeAttempts(
            params: CardAuthenticationChallengeAttemptsParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challengeAttempts(params, RequestOptions.none())

        /** @see challengeAttempts */
        fun challengeAttempts(
            params: CardAuthenticationChallengeAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/card_authentications/{card_payment_id}/challenges`, but is otherwise the
         * same as [CardAuthenticationServiceAsync.challenges].
         */
        fun challenges(cardPaymentId: String): CompletableFuture<HttpResponseFor<CardPayment>> =
            challenges(cardPaymentId, CardAuthenticationChallengesParams.none())

        /** @see challenges */
        fun challenges(
            cardPaymentId: String,
            params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challenges(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

        /** @see challenges */
        fun challenges(
            cardPaymentId: String,
            params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challenges(cardPaymentId, params, RequestOptions.none())

        /** @see challenges */
        fun challenges(
            params: CardAuthenticationChallengesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /** @see challenges */
        fun challenges(
            params: CardAuthenticationChallengesParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challenges(params, RequestOptions.none())

        /** @see challenges */
        fun challenges(
            cardPaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            challenges(cardPaymentId, CardAuthenticationChallengesParams.none(), requestOptions)
    }
}
