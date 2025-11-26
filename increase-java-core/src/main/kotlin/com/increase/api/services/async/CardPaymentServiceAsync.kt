// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentListResponse
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPaymentServiceAsync

    /** Retrieve a Card Payment */
    fun retrieve(cardPaymentId: String): CompletableFuture<CardPayment> =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment> =
        retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
    ): CompletableFuture<CardPayment> = retrieve(cardPaymentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /** @see retrieve */
    fun retrieve(params: CardPaymentRetrieveParams): CompletableFuture<CardPayment> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        cardPaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPayment> =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

    /** List Card Payments */
    fun list(): CompletableFuture<CardPaymentListResponse> = list(CardPaymentListParams.none())

    /** @see list */
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPaymentListResponse>

    /** @see list */
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none()
    ): CompletableFuture<CardPaymentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardPaymentListResponse> =
        list(CardPaymentListParams.none(), requestOptions)

    /**
     * A view of [CardPaymentServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /card_payments/{card_payment_id}`, but is otherwise
         * the same as [CardPaymentServiceAsync.retrieve].
         */
        fun retrieve(cardPaymentId: String): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(cardPaymentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /** @see retrieve */
        fun retrieve(
            params: CardPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            cardPaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardPaymentListResponse>> =
            list(CardPaymentListParams.none())

        /** @see list */
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPaymentListResponse>>

        /** @see list */
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<CardPaymentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardPaymentListResponse>> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
