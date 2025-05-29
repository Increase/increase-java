// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListPageAsync
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Payment */
    fun retrieve(cardPaymentId: String): CompletableFuture<CardPayment> =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment> =
        retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
    ): CompletableFuture<CardPayment> = retrieve(cardPaymentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

    /** @see [retrieve] */
    fun retrieve(params: CardPaymentRetrieveParams): CompletableFuture<CardPayment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        cardPaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPayment> =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

    /** List Card Payments */
    fun list(): CompletableFuture<CardPaymentListPageAsync> = list(CardPaymentListParams.none())

    /** @see [list] */
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPaymentListPageAsync>

    /** @see [list] */
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none()
    ): CompletableFuture<CardPaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardPaymentListPageAsync> =
        list(CardPaymentListParams.none(), requestOptions)

    /**
     * A view of [CardPaymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /card_payments/{card_payment_id}`, but is otherwise
         * the same as [CardPaymentServiceAsync.retrieve].
         */
        fun retrieve(cardPaymentId: String): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(cardPaymentId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /** @see [retrieve] */
        fun retrieve(
            params: CardPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            cardPaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPayment>> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> =
            list(CardPaymentListParams.none())

        /** @see [list] */
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>>

        /** @see [list] */
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
