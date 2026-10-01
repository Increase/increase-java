// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestForPayment
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCancelParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCreateParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListPageAsync
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RealTimePaymentsRequestsForPaymentServiceAsync {

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
    ): RealTimePaymentsRequestsForPaymentServiceAsync

    /** Create a Real-Time Payments Request for Payment */
    fun create(
        params: RealTimePaymentsRequestsForPaymentCreateParams
    ): CompletableFuture<RealTimePaymentsRequestForPayment> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RealTimePaymentsRequestsForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** Retrieve a Real-Time Payments Request for Payment */
    fun retrieve(
        realTimePaymentsRequestForPaymentId: String
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
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
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
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
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
        retrieve(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** @see retrieve */
    fun retrieve(
        params: RealTimePaymentsRequestsForPaymentRetrieveParams
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
        retrieve(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions,
        )

    /** List Real-Time Payments Requests for Payment */
    fun list(): CompletableFuture<RealTimePaymentsRequestsForPaymentListPageAsync> =
        list(RealTimePaymentsRequestsForPaymentListParams.none())

    /** @see list */
    fun list(
        params: RealTimePaymentsRequestsForPaymentListParams =
            RealTimePaymentsRequestsForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestsForPaymentListPageAsync>

    /** @see list */
    fun list(
        params: RealTimePaymentsRequestsForPaymentListParams =
            RealTimePaymentsRequestsForPaymentListParams.none()
    ): CompletableFuture<RealTimePaymentsRequestsForPaymentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsRequestsForPaymentListPageAsync> =
        list(RealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

    /** Cancels a Real-Time Payments Request for Payment that is still awaiting payment. */
    fun cancel(
        realTimePaymentsRequestForPaymentId: String
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
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
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
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
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
        cancel(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: RealTimePaymentsRequestsForPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsRequestForPayment>

    /** @see cancel */
    fun cancel(
        params: RealTimePaymentsRequestsForPaymentCancelParams
    ): CompletableFuture<RealTimePaymentsRequestForPayment> = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        realTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsRequestForPayment> =
        cancel(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsRequestsForPaymentServiceAsync] that provides access to raw HTTP
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
        ): RealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /real_time_payments_requests_for_payment`, but is
         * otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.create].
         */
        fun create(
            params: RealTimePaymentsRequestsForPaymentCreateParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RealTimePaymentsRequestsForPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}`,
         * but is otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.retrieve].
         */
        fun retrieve(
            realTimePaymentsRequestForPaymentId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
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
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
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
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            retrieve(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>>

        /** @see retrieve */
        fun retrieve(
            params: RealTimePaymentsRequestsForPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            realTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            retrieve(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /real_time_payments_requests_for_payment`, but is
         * otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.list].
         */
        fun list():
            CompletableFuture<HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync>> =
            list(RealTimePaymentsRequestsForPaymentListParams.none())

        /** @see list */
        fun list(
            params: RealTimePaymentsRequestsForPaymentListParams =
                RealTimePaymentsRequestsForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync>>

        /** @see list */
        fun list(
            params: RealTimePaymentsRequestsForPaymentListParams =
                RealTimePaymentsRequestsForPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync>> =
            list(RealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}/cancel`,
         * but is otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.cancel].
         */
        fun cancel(
            realTimePaymentsRequestForPaymentId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
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
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
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
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            cancel(realTimePaymentsRequestForPaymentId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: RealTimePaymentsRequestsForPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>>

        /** @see cancel */
        fun cancel(
            params: RealTimePaymentsRequestsForPaymentCancelParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            realTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsRequestForPayment>> =
            cancel(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
                requestOptions,
            )
    }
}
