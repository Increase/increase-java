// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferApproveParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCancelParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListResponse
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RealTimePaymentsTransferServiceAsync

    /** Create a Real-Time Payments Transfer */
    fun create(
        params: RealTimePaymentsTransferCreateParams
    ): CompletableFuture<RealTimePaymentsTransfer> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** Retrieve a Real-Time Payments Transfer */
    fun retrieve(realTimePaymentsTransferId: String): CompletableFuture<RealTimePaymentsTransfer> =
        retrieve(realTimePaymentsTransferId, RealTimePaymentsTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferRetrieveParams =
            RealTimePaymentsTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        retrieve(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferRetrieveParams =
            RealTimePaymentsTransferRetrieveParams.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        retrieve(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** @see retrieve */
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams
    ): CompletableFuture<RealTimePaymentsTransfer> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        retrieve(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Real-Time Payments Transfers */
    fun list(): CompletableFuture<RealTimePaymentsTransferListResponse> =
        list(RealTimePaymentsTransferListParams.none())

    /** @see list */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransferListResponse>

    /** @see list */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none()
    ): CompletableFuture<RealTimePaymentsTransferListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransferListResponse> =
        list(RealTimePaymentsTransferListParams.none(), requestOptions)

    /** Approves a Real-Time Payments Transfer in a pending_approval state. */
    fun approve(realTimePaymentsTransferId: String): CompletableFuture<RealTimePaymentsTransfer> =
        approve(realTimePaymentsTransferId, RealTimePaymentsTransferApproveParams.none())

    /** @see approve */
    fun approve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferApproveParams =
            RealTimePaymentsTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        approve(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see approve */
    fun approve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferApproveParams = RealTimePaymentsTransferApproveParams.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        approve(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: RealTimePaymentsTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** @see approve */
    fun approve(
        params: RealTimePaymentsTransferApproveParams
    ): CompletableFuture<RealTimePaymentsTransfer> = approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        approve(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferApproveParams.none(),
            requestOptions,
        )

    /** Cancels a Real-Time Payments Transfer in a pending_approval state. */
    fun cancel(realTimePaymentsTransferId: String): CompletableFuture<RealTimePaymentsTransfer> =
        cancel(realTimePaymentsTransferId, RealTimePaymentsTransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCancelParams = RealTimePaymentsTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        cancel(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see cancel */
    fun cancel(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCancelParams = RealTimePaymentsTransferCancelParams.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        cancel(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: RealTimePaymentsTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** @see cancel */
    fun cancel(
        params: RealTimePaymentsTransferCancelParams
    ): CompletableFuture<RealTimePaymentsTransfer> = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        cancel(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferCancelParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsTransferServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RealTimePaymentsTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /real_time_payments_transfers`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.create].
         */
        fun create(
            params: RealTimePaymentsTransferCreateParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_transfers/{real_time_payments_transfer_id}`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.retrieve].
         */
        fun retrieve(
            realTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(realTimePaymentsTransferId, RealTimePaymentsTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferRetrieveParams =
                RealTimePaymentsTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferRetrieveParams =
                RealTimePaymentsTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListResponse>> =
            list(RealTimePaymentsTransferListParams.none())

        /** @see list */
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListResponse>>

        /** @see list */
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListResponse>> =
            list(RealTimePaymentsTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_transfers/{real_time_payments_transfer_id}/approve`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.approve].
         */
        fun approve(
            realTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            approve(realTimePaymentsTransferId, RealTimePaymentsTransferApproveParams.none())

        /** @see approve */
        fun approve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferApproveParams =
                RealTimePaymentsTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            approve(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see approve */
        fun approve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferApproveParams =
                RealTimePaymentsTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            approve(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: RealTimePaymentsTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /** @see approve */
        fun approve(
            params: RealTimePaymentsTransferApproveParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            approve(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferApproveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_transfers/{real_time_payments_transfer_id}/cancel`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.cancel].
         */
        fun cancel(
            realTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            cancel(realTimePaymentsTransferId, RealTimePaymentsTransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCancelParams =
                RealTimePaymentsTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            cancel(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see cancel */
        fun cancel(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCancelParams =
                RealTimePaymentsTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            cancel(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: RealTimePaymentsTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /** @see cancel */
        fun cancel(
            params: RealTimePaymentsTransferCancelParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            cancel(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferCancelParams.none(),
                requestOptions,
            )
    }
}
