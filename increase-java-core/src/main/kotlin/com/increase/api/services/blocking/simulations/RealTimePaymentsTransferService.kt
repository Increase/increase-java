// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams

interface RealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates submission of a [Real-Time Payments Transfer](#real-time-payments-transfers) and
     * handling the response from the destination financial institution. This transfer must first
     * have a `status` of `pending_submission`.
     */
    fun complete(realTimePaymentsTransferId: String): RealTimePaymentsTransfer =
        complete(realTimePaymentsTransferId, RealTimePaymentsTransferCompleteParams.none())

    /** @see [complete] */
    fun complete(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCompleteParams =
            RealTimePaymentsTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        complete(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see [complete] */
    fun complete(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCompleteParams =
            RealTimePaymentsTransferCompleteParams.none(),
    ): RealTimePaymentsTransfer =
        complete(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: RealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see [complete] */
    fun complete(params: RealTimePaymentsTransferCompleteParams): RealTimePaymentsTransfer =
        complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        complete(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferCompleteParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsTransferService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete`, but
         * is otherwise the same as [RealTimePaymentsTransferService.complete].
         */
        @MustBeClosed
        fun complete(
            realTimePaymentsTransferId: String
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            complete(realTimePaymentsTransferId, RealTimePaymentsTransferCompleteParams.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCompleteParams =
                RealTimePaymentsTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            complete(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCompleteParams =
                RealTimePaymentsTransferCompleteParams.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            complete(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: RealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            params: RealTimePaymentsTransferCompleteParams
        ): HttpResponseFor<RealTimePaymentsTransfer> = complete(params, RequestOptions.none())

        /** @see [complete] */
        @MustBeClosed
        fun complete(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            complete(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferCompleteParams.none(),
                requestOptions,
            )
    }
}
