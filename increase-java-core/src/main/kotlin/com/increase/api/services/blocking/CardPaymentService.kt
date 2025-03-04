// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPage
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams

interface CardPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Payment */
    @JvmOverloads
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** List Card Payments */
    @JvmOverloads
    fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPaymentListPage

    /** List Card Payments */
    fun list(requestOptions: RequestOptions): CardPaymentListPage =
        list(CardPaymentListParams.none(), requestOptions)

    /**
     * A view of [CardPaymentService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /card_payments/{card_payment_id}`, but is otherwise
         * the same as [CardPaymentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPaymentListPage>

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardPaymentListPage> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
