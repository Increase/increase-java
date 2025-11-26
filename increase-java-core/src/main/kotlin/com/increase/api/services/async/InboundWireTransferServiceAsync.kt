// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListResponse
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundWireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundWireTransferServiceAsync

    /** Retrieve an Inbound Wire Transfer */
    fun retrieve(inboundWireTransferId: String): CompletableFuture<InboundWireTransfer> =
        retrieve(inboundWireTransferId, InboundWireTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundWireTransferId: String,
        params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer> =
        retrieve(
            params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundWireTransferId: String,
        params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
    ): CompletableFuture<InboundWireTransfer> =
        retrieve(inboundWireTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer>

    /** @see retrieve */
    fun retrieve(
        params: InboundWireTransferRetrieveParams
    ): CompletableFuture<InboundWireTransfer> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundWireTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundWireTransfer> =
        retrieve(inboundWireTransferId, InboundWireTransferRetrieveParams.none(), requestOptions)

    /** List Inbound Wire Transfers */
    fun list(): CompletableFuture<InboundWireTransferListResponse> =
        list(InboundWireTransferListParams.none())

    /** @see list */
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransferListResponse>

    /** @see list */
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none()
    ): CompletableFuture<InboundWireTransferListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InboundWireTransferListResponse> =
        list(InboundWireTransferListParams.none(), requestOptions)

    /** Reverse an Inbound Wire Transfer */
    fun reverse(
        inboundWireTransferId: String,
        params: InboundWireTransferReverseParams,
    ): CompletableFuture<InboundWireTransfer> =
        reverse(inboundWireTransferId, params, RequestOptions.none())

    /** @see reverse */
    fun reverse(
        inboundWireTransferId: String,
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer> =
        reverse(
            params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
            requestOptions,
        )

    /** @see reverse */
    fun reverse(params: InboundWireTransferReverseParams): CompletableFuture<InboundWireTransfer> =
        reverse(params, RequestOptions.none())

    /** @see reverse */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundWireTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers/{inbound_wire_transfer_id}`,
         * but is otherwise the same as [InboundWireTransferServiceAsync.retrieve].
         */
        fun retrieve(
            inboundWireTransferId: String
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            retrieve(inboundWireTransferId, InboundWireTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboundWireTransferId: String,
            params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            retrieve(
                params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundWireTransferId: String,
            params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            retrieve(inboundWireTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: InboundWireTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundWireTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            retrieve(
                inboundWireTransferId,
                InboundWireTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundWireTransferListResponse>> =
            list(InboundWireTransferListParams.none())

        /** @see list */
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListResponse>>

        /** @see list */
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundWireTransferListResponse>> =
            list(InboundWireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_wire_transfers/{inbound_wire_transfer_id}/reverse`, but is otherwise the same as
         * [InboundWireTransferServiceAsync.reverse].
         */
        fun reverse(
            inboundWireTransferId: String,
            params: InboundWireTransferReverseParams,
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            reverse(inboundWireTransferId, params, RequestOptions.none())

        /** @see reverse */
        fun reverse(
            inboundWireTransferId: String,
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            reverse(
                params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
                requestOptions,
            )

        /** @see reverse */
        fun reverse(
            params: InboundWireTransferReverseParams
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            reverse(params, RequestOptions.none())

        /** @see reverse */
        fun reverse(
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>>
    }
}
