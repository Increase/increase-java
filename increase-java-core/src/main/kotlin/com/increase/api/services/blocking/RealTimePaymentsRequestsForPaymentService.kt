// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestForPayment
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCancelParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCreateParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListPage
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentRetrieveParams
import java.util.function.Consumer

interface RealTimePaymentsRequestsForPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RealTimePaymentsRequestsForPaymentService

    /** Create a Real-Time Payments Request for Payment */
    fun create(
        params: RealTimePaymentsRequestsForPaymentCreateParams
    ): RealTimePaymentsRequestForPayment = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RealTimePaymentsRequestsForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** Retrieve a Real-Time Payments Request for Payment */
    fun retrieve(realTimePaymentsRequestForPaymentId: String): RealTimePaymentsRequestForPayment =
        retrieve(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        )

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsRequestForPaymentId: String,
        params: RealTimePaymentsRequestsForPaymentRetrieveParams =
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment =
        retrieve(
            params
                .toBuilder()
                .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                .build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsRequestForPaymentId: String,
        params: RealTimePaymentsRequestsForPaymentRetrieveParams =
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
    ): RealTimePaymentsRequestForPayment =
        retrieve(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** @see retrieve */
    fun retrieve(
        params: RealTimePaymentsRequestsForPaymentRetrieveParams
    ): RealTimePaymentsRequestForPayment = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        retrieve(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions,
        )

    /** List Real-Time Payments Requests for Payment */
    fun list(): RealTimePaymentsRequestsForPaymentListPage =
        list(RealTimePaymentsRequestsForPaymentListParams.none())

    /** @see list */
    fun list(
        params: RealTimePaymentsRequestsForPaymentListParams =
            RealTimePaymentsRequestsForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestsForPaymentListPage

    /** @see list */
    fun list(
        params: RealTimePaymentsRequestsForPaymentListParams =
            RealTimePaymentsRequestsForPaymentListParams.none()
    ): RealTimePaymentsRequestsForPaymentListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RealTimePaymentsRequestsForPaymentListPage =
        list(RealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

    /** Cancels a Real-Time Payments Request for Payment that is still awaiting payment. */
    fun cancel(realTimePaymentsRequestForPaymentId: String): RealTimePaymentsRequestForPayment =
        cancel(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
        )

    /** @see cancel */
    fun cancel(
        realTimePaymentsRequestForPaymentId: String,
        params: RealTimePaymentsRequestsForPaymentCancelParams =
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment =
        cancel(
            params
                .toBuilder()
                .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                .build(),
            requestOptions,
        )

    /** @see cancel */
    fun cancel(
        realTimePaymentsRequestForPaymentId: String,
        params: RealTimePaymentsRequestsForPaymentCancelParams =
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
    ): RealTimePaymentsRequestForPayment =
        cancel(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: RealTimePaymentsRequestsForPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** @see cancel */
    fun cancel(
        params: RealTimePaymentsRequestsForPaymentCancelParams
    ): RealTimePaymentsRequestForPayment = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        realTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        cancel(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsRequestsForPaymentService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RealTimePaymentsRequestsForPaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /real_time_payments_requests_for_payment`, but is
         * otherwise the same as [RealTimePaymentsRequestsForPaymentService.create].
         */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsRequestsForPaymentCreateParams
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsRequestsForPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}`,
         * but is otherwise the same as [RealTimePaymentsRequestsForPaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsRequestForPaymentId: String
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsRequestForPaymentId: String,
            params: RealTimePaymentsRequestsForPaymentRetrieveParams =
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(
                params
                    .toBuilder()
                    .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsRequestForPaymentId: String,
            params: RealTimePaymentsRequestsForPaymentRetrieveParams =
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsRequestsForPaymentRetrieveParams
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /real_time_payments_requests_for_payment`, but is
         * otherwise the same as [RealTimePaymentsRequestsForPaymentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPage> =
            list(RealTimePaymentsRequestsForPaymentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsRequestsForPaymentListParams =
                RealTimePaymentsRequestsForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsRequestsForPaymentListParams =
                RealTimePaymentsRequestsForPaymentListParams.none()
        ): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPage> =
            list(RealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}/cancel`,
         * but is otherwise the same as [RealTimePaymentsRequestsForPaymentService.cancel].
         */
        @MustBeClosed
        fun cancel(
            realTimePaymentsRequestForPaymentId: String
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
            )

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            realTimePaymentsRequestForPaymentId: String,
            params: RealTimePaymentsRequestsForPaymentCancelParams =
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(
                params
                    .toBuilder()
                    .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                    .build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            realTimePaymentsRequestForPaymentId: String,
            params: RealTimePaymentsRequestsForPaymentCancelParams =
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: RealTimePaymentsRequestsForPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: RealTimePaymentsRequestsForPaymentCancelParams
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            realTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
                requestOptions,
            )
    }
}
