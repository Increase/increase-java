// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPageAsync
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams
import java.util.concurrent.CompletableFuture

interface InboundWireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Transfer */
    fun retrieve(
        params: InboundWireTransferRetrieveParams
    ): CompletableFuture<InboundWireTransfer> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer>

    /** List Inbound Wire Transfers */
    fun list(): CompletableFuture<InboundWireTransferListPageAsync> =
        list(InboundWireTransferListParams.none())

    /** @see [list] */
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransferListPageAsync>

    /** @see [list] */
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none()
    ): CompletableFuture<InboundWireTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundWireTransferListPageAsync> =
        list(InboundWireTransferListParams.none(), requestOptions)

    /** Reverse an Inbound Wire Transfer */
    fun reverse(params: InboundWireTransferReverseParams): CompletableFuture<InboundWireTransfer> =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer>

    /**
     * A view of [InboundWireTransferServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers/{inbound_wire_transfer_id}`,
         * but is otherwise the same as [InboundWireTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InboundWireTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>> =
            list(InboundWireTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListPageAsync>> =
            list(InboundWireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_wire_transfers/{inbound_wire_transfer_id}/reverse`, but is otherwise the same as
         * [InboundWireTransferServiceAsync.reverse].
         */
        @MustBeClosed
        fun reverse(
            params: InboundWireTransferReverseParams
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>>
    }
}
