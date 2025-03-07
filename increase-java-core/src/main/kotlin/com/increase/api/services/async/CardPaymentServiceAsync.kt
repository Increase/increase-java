// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPageAsync
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Payment */
    fun retrieve(params: CardPaymentRetrieveParams): CompletableFuture<CardPayment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardPayment>

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
        @MustBeClosed
        fun retrieve(
            params: CardPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardPayment>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPayment>>

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> =
            list(CardPaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
