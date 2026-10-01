// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestForPayment
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListPageAsync
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundRealTimePaymentsRequestsForPaymentServiceAsync {

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
    ): InboundRealTimePaymentsRequestsForPaymentServiceAsync

    /** Retrieve an Inbound Real-Time Payments Request for Payment */
    fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String
    ): CompletableFuture<InboundRealTimePaymentsRequestForPayment> =
        retrieve(
            inboundRealTimePaymentsRequestForPaymentId,
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        )

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String,
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams =
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsRequestForPayment> =
        retrieve(
            params
                .toBuilder()
                .inboundRealTimePaymentsRequestForPaymentId(
                    inboundRealTimePaymentsRequestForPaymentId
                )
                .build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String,
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams =
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
    ): CompletableFuture<InboundRealTimePaymentsRequestForPayment> =
        retrieve(inboundRealTimePaymentsRequestForPaymentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsRequestForPayment>

    /** @see retrieve */
    fun retrieve(
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams
    ): CompletableFuture<InboundRealTimePaymentsRequestForPayment> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundRealTimePaymentsRequestForPayment> =
        retrieve(
            inboundRealTimePaymentsRequestForPaymentId,
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Real-Time Payments Requests for Payment */
    fun list(): CompletableFuture<InboundRealTimePaymentsRequestsForPaymentListPageAsync> =
        list(InboundRealTimePaymentsRequestsForPaymentListParams.none())

    /** @see list */
    fun list(
        params: InboundRealTimePaymentsRequestsForPaymentListParams =
            InboundRealTimePaymentsRequestsForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsRequestsForPaymentListPageAsync>

    /** @see list */
    fun list(
        params: InboundRealTimePaymentsRequestsForPaymentListParams =
            InboundRealTimePaymentsRequestsForPaymentListParams.none()
    ): CompletableFuture<InboundRealTimePaymentsRequestsForPaymentListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InboundRealTimePaymentsRequestsForPaymentListPageAsync> =
        list(InboundRealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsRequestsForPaymentServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundRealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_requests_for_payment/{inbound_real_time_payments_request_for_payment_id}`,
         * but is otherwise the same as
         * [InboundRealTimePaymentsRequestsForPaymentServiceAsync.retrieve].
         */
        fun retrieve(
            inboundRealTimePaymentsRequestForPaymentId: String
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsRequestForPayment>> =
            retrieve(
                inboundRealTimePaymentsRequestForPaymentId,
                InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            )

        /** @see retrieve */
        fun retrieve(
            inboundRealTimePaymentsRequestForPaymentId: String,
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams =
                InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsRequestForPayment>> =
            retrieve(
                params
                    .toBuilder()
                    .inboundRealTimePaymentsRequestForPaymentId(
                        inboundRealTimePaymentsRequestForPaymentId
                    )
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundRealTimePaymentsRequestForPaymentId: String,
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams =
                InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsRequestForPayment>> =
            retrieve(inboundRealTimePaymentsRequestForPaymentId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsRequestForPayment>>

        /** @see retrieve */
        fun retrieve(
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsRequestForPayment>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundRealTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsRequestForPayment>> =
            retrieve(
                inboundRealTimePaymentsRequestForPaymentId,
                InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_requests_for_payment`,
         * but is otherwise the same as
         * [InboundRealTimePaymentsRequestsForPaymentServiceAsync.list].
         */
        fun list():
            CompletableFuture<
                HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPageAsync>
            > = list(InboundRealTimePaymentsRequestsForPaymentListParams.none())

        /** @see list */
        fun list(
            params: InboundRealTimePaymentsRequestsForPaymentListParams =
                InboundRealTimePaymentsRequestsForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPageAsync>
        >

        /** @see list */
        fun list(
            params: InboundRealTimePaymentsRequestsForPaymentListParams =
                InboundRealTimePaymentsRequestsForPaymentListParams.none()
        ): CompletableFuture<
            HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPageAsync>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPageAsync>
        > = list(InboundRealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)
    }
}
