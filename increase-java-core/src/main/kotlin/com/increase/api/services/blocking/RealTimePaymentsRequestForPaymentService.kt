// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPage
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams

interface RealTimePaymentsRequestForPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** Retrieve a Real-Time Payments Request for Payment */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** List Real-Time Payments Request for Payments */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsRequestForPaymentListParams =
            RealTimePaymentsRequestForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPaymentListPage

    /** List Real-Time Payments Request for Payments */
    fun list(requestOptions: RequestOptions): RealTimePaymentsRequestForPaymentListPage =
        list(RealTimePaymentsRequestForPaymentListParams.none(), requestOptions)

    /**
     * A view of [RealTimePaymentsRequestForPaymentService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: RealTimePaymentsRequestForPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_request_for_payments/{request_for_payment_id}`, but is otherwise the
         * same as [RealTimePaymentsRequestForPaymentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsRequestForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: RealTimePaymentsRequestForPaymentListParams =
                RealTimePaymentsRequestForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPaymentListPage>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentService.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsRequestForPaymentListPage> =
            list(RealTimePaymentsRequestForPaymentListParams.none(), requestOptions)
    }
}
