// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPageAsync
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams
import java.util.concurrent.CompletableFuture

interface RealTimePaymentsRequestForPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** Retrieve a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** List Real-Time Payments Request for Payments */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsRequestForPaymentListParams =
            RealTimePaymentsRequestForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPaymentListPageAsync>

    /** List Real-Time Payments Request for Payments */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsRequestForPaymentListPageAsync> =
        list(RealTimePaymentsRequestForPaymentListParams.none(), requestOptions)

    /**
     * A view of [RealTimePaymentsRequestForPaymentServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: RealTimePaymentsRequestForPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_request_for_payments/{request_for_payment_id}`, but is otherwise the
         * same as [RealTimePaymentsRequestForPaymentServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsRequestForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: RealTimePaymentsRequestForPaymentListParams =
                RealTimePaymentsRequestForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPaymentListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPaymentListPageAsync>> =
            list(RealTimePaymentsRequestForPaymentListParams.none(), requestOptions)
    }
}
