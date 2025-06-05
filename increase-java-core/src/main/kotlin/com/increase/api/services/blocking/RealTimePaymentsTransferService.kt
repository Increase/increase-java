// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferApproveParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCancelParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListPage
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams

interface RealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Transfer */
    fun create(params: RealTimePaymentsTransferCreateParams): RealTimePaymentsTransfer =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** Retrieve a Real-Time Payments Transfer */
    fun retrieve(realTimePaymentsTransferId: String): RealTimePaymentsTransfer =
        retrieve(realTimePaymentsTransferId, RealTimePaymentsTransferRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferRetrieveParams =
            RealTimePaymentsTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        retrieve(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferRetrieveParams =
            RealTimePaymentsTransferRetrieveParams.none(),
    ): RealTimePaymentsTransfer =
        retrieve(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see [retrieve] */
    fun retrieve(params: RealTimePaymentsTransferRetrieveParams): RealTimePaymentsTransfer =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        retrieve(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Real-Time Payments Transfers */
    fun list(): RealTimePaymentsTransferListPage = list(RealTimePaymentsTransferListParams.none())

    /** @see [list] */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransferListPage

    /** @see [list] */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none()
    ): RealTimePaymentsTransferListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): RealTimePaymentsTransferListPage =
        list(RealTimePaymentsTransferListParams.none(), requestOptions)

    /** Approves an Real-Time Payments Transfer in a pending_approval state. */
    fun approve(realTimePaymentsTransferId: String): RealTimePaymentsTransfer =
        approve(realTimePaymentsTransferId, RealTimePaymentsTransferApproveParams.none())

    /** @see [approve] */
    fun approve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferApproveParams =
            RealTimePaymentsTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        approve(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see [approve] */
    fun approve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferApproveParams = RealTimePaymentsTransferApproveParams.none(),
    ): RealTimePaymentsTransfer = approve(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: RealTimePaymentsTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see [approve] */
    fun approve(params: RealTimePaymentsTransferApproveParams): RealTimePaymentsTransfer =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        approve(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferApproveParams.none(),
            requestOptions,
        )

    /** Cancels an Real-Time Payments Transfer in a pending_approval state. */
    fun cancel(realTimePaymentsTransferId: String): RealTimePaymentsTransfer =
        cancel(realTimePaymentsTransferId, RealTimePaymentsTransferCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCancelParams = RealTimePaymentsTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        cancel(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see [cancel] */
    fun cancel(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCancelParams = RealTimePaymentsTransferCancelParams.none(),
    ): RealTimePaymentsTransfer = cancel(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: RealTimePaymentsTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see [cancel] */
    fun cancel(params: RealTimePaymentsTransferCancelParams): RealTimePaymentsTransfer =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        cancel(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferCancelParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsTransferService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_transfers`, but is otherwise
         * the same as [RealTimePaymentsTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsTransferCreateParams
        ): HttpResponseFor<RealTimePaymentsTransfer> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_transfers/{real_time_payments_transfer_id}`, but is otherwise the
         * same as [RealTimePaymentsTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsTransferId: String
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            retrieve(realTimePaymentsTransferId, RealTimePaymentsTransferRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferRetrieveParams =
                RealTimePaymentsTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            retrieve(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferRetrieveParams =
                RealTimePaymentsTransferRetrieveParams.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            retrieve(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams
        ): HttpResponseFor<RealTimePaymentsTransfer> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            retrieve(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is otherwise the
         * same as [RealTimePaymentsTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RealTimePaymentsTransferListPage> =
            list(RealTimePaymentsTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none()
        ): HttpResponseFor<RealTimePaymentsTransferListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsTransferListPage> =
            list(RealTimePaymentsTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_transfers/{real_time_payments_transfer_id}/approve`, but is otherwise
         * the same as [RealTimePaymentsTransferService.approve].
         */
        @MustBeClosed
        fun approve(realTimePaymentsTransferId: String): HttpResponseFor<RealTimePaymentsTransfer> =
            approve(realTimePaymentsTransferId, RealTimePaymentsTransferApproveParams.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferApproveParams =
                RealTimePaymentsTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            approve(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferApproveParams =
                RealTimePaymentsTransferApproveParams.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            approve(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: RealTimePaymentsTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: RealTimePaymentsTransferApproveParams
        ): HttpResponseFor<RealTimePaymentsTransfer> = approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            approve(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferApproveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_transfers/{real_time_payments_transfer_id}/cancel`, but is otherwise
         * the same as [RealTimePaymentsTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(realTimePaymentsTransferId: String): HttpResponseFor<RealTimePaymentsTransfer> =
            cancel(realTimePaymentsTransferId, RealTimePaymentsTransferCancelParams.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCancelParams =
                RealTimePaymentsTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            cancel(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCancelParams =
                RealTimePaymentsTransferCancelParams.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            cancel(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: RealTimePaymentsTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: RealTimePaymentsTransferCancelParams
        ): HttpResponseFor<RealTimePaymentsTransfer> = cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            cancel(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferCancelParams.none(),
                requestOptions,
            )
    }
}
