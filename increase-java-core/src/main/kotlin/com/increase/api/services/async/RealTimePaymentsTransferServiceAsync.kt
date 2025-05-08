// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListPageAsync
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Transfer */
    fun create(
        params: RealTimePaymentsTransferCreateParams
    ): CompletableFuture<RealTimePaymentsTransfer> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** Retrieve a Real-Time Payments Transfer */
    fun retrieve(realTimePaymentsTransferId: String): CompletableFuture<RealTimePaymentsTransfer> =
        retrieve(realTimePaymentsTransferId, RealTimePaymentsTransferRetrieveParams.none())

    /** @see [retrieve] */
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

    /** @see [retrieve] */
    fun retrieve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferRetrieveParams =
            RealTimePaymentsTransferRetrieveParams.none(),
    ): CompletableFuture<RealTimePaymentsTransfer> =
        retrieve(realTimePaymentsTransferId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** @see [retrieve] */
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams
    ): CompletableFuture<RealTimePaymentsTransfer> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
    fun list(): CompletableFuture<RealTimePaymentsTransferListPageAsync> =
        list(RealTimePaymentsTransferListParams.none())

    /** @see [list] */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync>

    /** @see [list] */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none()
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync> =
        list(RealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [RealTimePaymentsTransferServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_transfers`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsTransferCreateParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_transfers/{real_time_payments_transfer_id}`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsTransferId: String
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(realTimePaymentsTransferId, RealTimePaymentsTransferRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
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

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferRetrieveParams =
                RealTimePaymentsTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(realTimePaymentsTransferId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
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
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListPageAsync>> =
            list(RealTimePaymentsTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListPageAsync>> =
            list(RealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
