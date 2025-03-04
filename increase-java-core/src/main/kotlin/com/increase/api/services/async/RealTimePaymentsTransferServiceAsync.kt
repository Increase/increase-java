// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.RealTimePaymentsTransferCreateParams
import com.increase.api.models.RealTimePaymentsTransferListPageAsync
import com.increase.api.models.RealTimePaymentsTransferListParams
import com.increase.api.models.RealTimePaymentsTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Transfer */
    @JvmOverloads
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** Retrieve a Real-Time Payments Transfer */
    @JvmOverloads
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransfer>

    /** List Real-Time Payments Transfers */
    @JvmOverloads
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync>

    /** List Real-Time Payments Transfers */
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListPageAsync>> =
            list(RealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
