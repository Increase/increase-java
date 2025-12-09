// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardbalanceinquiries.CardBalanceInquiryCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardBalanceInquiryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardBalanceInquiryServiceAsync

    /** Simulates a balance inquiry on a [Card](#cards). */
    fun create(): CompletableFuture<CardPayment> = create(CardBalanceInquiryCreateParams.none())

    /** @see create */
    fun create(
        params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /** @see create */
    fun create(
        params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none()
    ): CompletableFuture<CardPayment> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<CardPayment> =
        create(CardBalanceInquiryCreateParams.none(), requestOptions)

    /**
     * A view of [CardBalanceInquiryServiceAsync] that provides access to raw HTTP responses for
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
        ): CardBalanceInquiryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_balance_inquiries`, but is
         * otherwise the same as [CardBalanceInquiryServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<CardPayment>> =
            create(CardBalanceInquiryCreateParams.none())

        /** @see create */
        fun create(
            params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /** @see create */
        fun create(
            params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none()
        ): CompletableFuture<HttpResponseFor<CardPayment>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            create(CardBalanceInquiryCreateParams.none(), requestOptions)
    }
}
