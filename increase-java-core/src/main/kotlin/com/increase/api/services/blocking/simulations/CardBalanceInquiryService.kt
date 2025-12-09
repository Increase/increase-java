// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardbalanceinquiries.CardBalanceInquiryCreateParams
import java.util.function.Consumer

interface CardBalanceInquiryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardBalanceInquiryService

    /** Simulates a balance inquiry on a [Card](#cards). */
    fun create(): CardPayment = create(CardBalanceInquiryCreateParams.none())

    /** @see create */
    fun create(
        params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** @see create */
    fun create(
        params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none()
    ): CardPayment = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CardPayment =
        create(CardBalanceInquiryCreateParams.none(), requestOptions)

    /**
     * A view of [CardBalanceInquiryService] that provides access to raw HTTP responses for each
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
        ): CardBalanceInquiryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_balance_inquiries`, but is
         * otherwise the same as [CardBalanceInquiryService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<CardPayment> = create(CardBalanceInquiryCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none()
        ): HttpResponseFor<CardPayment> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<CardPayment> =
            create(CardBalanceInquiryCreateParams.none(), requestOptions)
    }
}
