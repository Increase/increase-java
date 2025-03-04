// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.InboundWireTransferListPageAsync
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.InboundWireTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface InboundWireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Transfer */
    @JvmOverloads
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer>

    /** List Inbound Wire Transfers */
    @JvmOverloads
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransferListPageAsync>

    /** List Inbound Wire Transfers */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundWireTransferListPageAsync> =
        list(InboundWireTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundWireTransferServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers/{inbound_wire_transfer_id}`,
         * but is otherwise the same as [InboundWireTransferServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>> =
            list(InboundWireTransferListParams.none(), requestOptions)
    }
}
