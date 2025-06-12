// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams
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

    /**
     * Simulates submission of a [Real-Time Payments Transfer](#real-time-payments-transfers) and
     * handling the response from the destination financial institution. This transfer must first
     * have a `status` of `pending_submission`.
     */
    fun complete(realTimePaymentsTransferId: String): CompletableFuture<RealTimePaymentsTransfer> =
        complete(realTimePaymentsTransferId, RealTimePaymentsTransferCompleteParams.none())

    /** @see [complete] */
    fun complete(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCompleteParams =
            RealTimePaymentsTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        complete(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see [complete] */
    fun complete(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCompleteParams =
            RealTimePaymentsTransferCompleteParams.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        complete(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        params: RealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** @see [complete] */
    fun complete(
        params: RealTimePaymentsTransferCompleteParams
    ): CompletableFuture<RealTimePaymentsTransfer> = complete(params, RequestOptions.none())

    /** @see [complete] */
    fun complete(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        complete(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferCompleteParams.none(),
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
         * Returns a raw HTTP response for `post
         * /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete`, but
         * is otherwise the same as [RealTimePaymentsTransferServiceAsync.complete].
         */
        fun complete(
            realTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            complete(realTimePaymentsTransferId, RealTimePaymentsTransferCompleteParams.none())

        /** @see [complete] */
        fun complete(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCompleteParams =
                RealTimePaymentsTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            complete(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see [complete] */
        fun complete(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCompleteParams =
                RealTimePaymentsTransferCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            complete(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see [complete] */
        fun complete(
            params: RealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /** @see [complete] */
        fun complete(
            params: RealTimePaymentsTransferCompleteParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            complete(params, RequestOptions.none())

        /** @see [complete] */
        fun complete(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            complete(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferCompleteParams.none(),
                requestOptions,
            )
    }
}
