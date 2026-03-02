// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengeAttemptsParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengesParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationCreateParams
import java.util.function.Consumer

interface CardAuthenticationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardAuthenticationService

    /**
     * Simulates a Card Authentication attempt on a [Card](#cards). The attempt always results in a
     * [Card Payment](#card_payments) being created, either with a status that allows further action
     * or a terminal failed status.
     */
    fun create(params: CardAuthenticationCreateParams): CardPayment =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardAuthenticationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * Simulates an attempt at a Card Authentication Challenge. This updates the
     * `card_authentications` object under the [Card Payment](#card_payments). You can also attempt
     * the challenge by navigating to
     * https://dashboard.increase.com/card_authentication_simulation/:card_payment_id.
     */
    fun challengeAttempts(
        cardPaymentId: String,
        params: CardAuthenticationChallengeAttemptsParams,
    ): CardPayment = challengeAttempts(cardPaymentId, params, RequestOptions.none())

    /** @see challengeAttempts */
    fun challengeAttempts(
        cardPaymentId: String,
        params: CardAuthenticationChallengeAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment =
        challengeAttempts(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see challengeAttempts */
    fun challengeAttempts(params: CardAuthenticationChallengeAttemptsParams): CardPayment =
        challengeAttempts(params, RequestOptions.none())

    /** @see challengeAttempts */
    fun challengeAttempts(
        params: CardAuthenticationChallengeAttemptsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * Simulates starting a Card Authentication Challenge for an existing Card Authentication. This
     * updates the `card_authentications` object under the [Card Payment](#card_payments). To
     * attempt the challenge, use the
     * `/simulations/card_authentications/:card_payment_id/challenge_attempts` endpoint or navigate
     * to https://dashboard.increase.com/card_authentication_simulation/:card_payment_id.
     */
    fun challenges(cardPaymentId: String): CardPayment =
        challenges(cardPaymentId, CardAuthenticationChallengesParams.none())

    /** @see challenges */
    fun challenges(
        cardPaymentId: String,
        params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment =
        challenges(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see challenges */
    fun challenges(
        cardPaymentId: String,
        params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
    ): CardPayment = challenges(cardPaymentId, params, RequestOptions.none())

    /** @see challenges */
    fun challenges(
        params: CardAuthenticationChallengesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** @see challenges */
    fun challenges(params: CardAuthenticationChallengesParams): CardPayment =
        challenges(params, RequestOptions.none())

    /** @see challenges */
    fun challenges(cardPaymentId: String, requestOptions: RequestOptions): CardPayment =
        challenges(cardPaymentId, CardAuthenticationChallengesParams.none(), requestOptions)

    /**
     * A view of [CardAuthenticationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardAuthenticationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_authentications`, but is
         * otherwise the same as [CardAuthenticationService.create].
         */
        @MustBeClosed
        fun create(params: CardAuthenticationCreateParams): HttpResponseFor<CardPayment> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardAuthenticationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/card_authentications/{card_payment_id}/challenge_attempts`, but is otherwise
         * the same as [CardAuthenticationService.challengeAttempts].
         */
        @MustBeClosed
        fun challengeAttempts(
            cardPaymentId: String,
            params: CardAuthenticationChallengeAttemptsParams,
        ): HttpResponseFor<CardPayment> =
            challengeAttempts(cardPaymentId, params, RequestOptions.none())

        /** @see challengeAttempts */
        @MustBeClosed
        fun challengeAttempts(
            cardPaymentId: String,
            params: CardAuthenticationChallengeAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment> =
            challengeAttempts(
                params.toBuilder().cardPaymentId(cardPaymentId).build(),
                requestOptions,
            )

        /** @see challengeAttempts */
        @MustBeClosed
        fun challengeAttempts(
            params: CardAuthenticationChallengeAttemptsParams
        ): HttpResponseFor<CardPayment> = challengeAttempts(params, RequestOptions.none())

        /** @see challengeAttempts */
        @MustBeClosed
        fun challengeAttempts(
            params: CardAuthenticationChallengeAttemptsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/card_authentications/{card_payment_id}/challenges`, but is otherwise the
         * same as [CardAuthenticationService.challenges].
         */
        @MustBeClosed
        fun challenges(cardPaymentId: String): HttpResponseFor<CardPayment> =
            challenges(cardPaymentId, CardAuthenticationChallengesParams.none())

        /** @see challenges */
        @MustBeClosed
        fun challenges(
            cardPaymentId: String,
            params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment> =
            challenges(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

        /** @see challenges */
        @MustBeClosed
        fun challenges(
            cardPaymentId: String,
            params: CardAuthenticationChallengesParams = CardAuthenticationChallengesParams.none(),
        ): HttpResponseFor<CardPayment> = challenges(cardPaymentId, params, RequestOptions.none())

        /** @see challenges */
        @MustBeClosed
        fun challenges(
            params: CardAuthenticationChallengesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /** @see challenges */
        @MustBeClosed
        fun challenges(params: CardAuthenticationChallengesParams): HttpResponseFor<CardPayment> =
            challenges(params, RequestOptions.none())

        /** @see challenges */
        @MustBeClosed
        fun challenges(
            cardPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> =
            challenges(cardPaymentId, CardAuthenticationChallengesParams.none(), requestOptions)
    }
}
