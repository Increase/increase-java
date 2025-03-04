// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.InboundRealTimePaymentsTransferListPageAsync
import com.increase.api.models.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Real-Time Payments Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransfer>

    /** List Inbound Real-Time Payments Transfers */
    @JvmOverloads
    fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync>

    /** List Inbound Real-Time Payments Transfers */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> =
        list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsTransferServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>>

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> =
            list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
