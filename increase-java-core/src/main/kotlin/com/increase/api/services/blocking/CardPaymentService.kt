// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListPage
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams
import java.util.function.Consumer

interface CardPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPaymentService

    /** Retrieve a Card Payment */
    fun retrieve(cardPaymentId: String): CardPayment =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment =
        retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
    ): CardPayment = retrieve(cardPaymentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** @see retrieve */
    fun retrieve(params: CardPaymentRetrieveParams): CardPayment =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(cardPaymentId: String, requestOptions: RequestOptions): CardPayment =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

    /** List Card Payments */
    fun list(): CardPaymentListPage = list(CardPaymentListParams.none())

    /** @see list */
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPaymentListPage

    /** @see list */
    fun list(params: CardPaymentListParams = CardPaymentListParams.none()): CardPaymentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CardPaymentListPage =
        list(CardPaymentListParams.none(), requestOptions)

    /**
     * A view of [CardPaymentService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardPaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /card_payments/{card_payment_id}`, but is otherwise
         * the same as [CardPaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(cardPaymentId: String): HttpResponseFor<CardPayment> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment> =
            retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        ): HttpResponseFor<CardPayment> = retrieve(cardPaymentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CardPaymentRetrieveParams): HttpResponseFor<CardPayment> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CardPaymentListPage> = list(CardPaymentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none()
        ): HttpResponseFor<CardPaymentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardPaymentListPage> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
