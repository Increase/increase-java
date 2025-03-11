// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListPageAsync
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Real-Time Payments Transfer */
    fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams): CompletableFuture<InboundRealTimePaymentsTransfer> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<InboundRealTimePaymentsTransfer>

    /** List Inbound Real-Time Payments Transfers */
    fun list(): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> = list(InboundRealTimePaymentsTransferListParams.none())

    /** @see [list] */
    fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync>

    /** @see [list] */
    fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none()): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundRealTimePaymentsTransferListPageAsync> = list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsTransferServiceAsync] that provides access to
     * raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`,
         * but is otherwise the same as
         * [InboundRealTimePaymentsTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: InboundRealTimePaymentsTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransfer>>

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but
         * is otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> = list(InboundRealTimePaymentsTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: InboundRealTimePaymentsTransferListParams = InboundRealTimePaymentsTransferListParams.none()): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>> = list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
