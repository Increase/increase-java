// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListPageAsync
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListParams
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundFednowTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundFednowTransferServiceAsync

    /** Retrieve an Inbound FedNow Transfer */
    fun retrieve(inboundFednowTransferId: String): CompletableFuture<InboundFednowTransfer> =
        retrieve(inboundFednowTransferId, InboundFednowTransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        inboundFednowTransferId: String,
        params: InboundFednowTransferRetrieveParams = InboundFednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundFednowTransfer> =
        retrieve(
            params.toBuilder().inboundFednowTransferId(inboundFednowTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        inboundFednowTransferId: String,
        params: InboundFednowTransferRetrieveParams = InboundFednowTransferRetrieveParams.none(),
    ): CompletableFuture<InboundFednowTransfer> =
        retrieve(inboundFednowTransferId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InboundFednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundFednowTransfer>

    /** @see retrieve */
    fun retrieve(
        params: InboundFednowTransferRetrieveParams
    ): CompletableFuture<InboundFednowTransfer> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        inboundFednowTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundFednowTransfer> =
        retrieve(
            inboundFednowTransferId,
            InboundFednowTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound FedNow Transfers */
    fun list(): CompletableFuture<InboundFednowTransferListPageAsync> =
        list(InboundFednowTransferListParams.none())

    /** @see list */
    fun list(
        params: InboundFednowTransferListParams = InboundFednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundFednowTransferListPageAsync>

    /** @see list */
    fun list(
        params: InboundFednowTransferListParams = InboundFednowTransferListParams.none()
    ): CompletableFuture<InboundFednowTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<InboundFednowTransferListPageAsync> =
        list(InboundFednowTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundFednowTransferServiceAsync] that provides access to raw HTTP responses for
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
        ): InboundFednowTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_fednow_transfers/{inbound_fednow_transfer_id}`, but is otherwise the same as
         * [InboundFednowTransferServiceAsync.retrieve].
         */
        fun retrieve(
            inboundFednowTransferId: String
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> =
            retrieve(inboundFednowTransferId, InboundFednowTransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            inboundFednowTransferId: String,
            params: InboundFednowTransferRetrieveParams =
                InboundFednowTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> =
            retrieve(
                params.toBuilder().inboundFednowTransferId(inboundFednowTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            inboundFednowTransferId: String,
            params: InboundFednowTransferRetrieveParams = InboundFednowTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> =
            retrieve(inboundFednowTransferId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InboundFednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>>

        /** @see retrieve */
        fun retrieve(
            params: InboundFednowTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            inboundFednowTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> =
            retrieve(
                inboundFednowTransferId,
                InboundFednowTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_fednow_transfers`, but is otherwise the
         * same as [InboundFednowTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InboundFednowTransferListPageAsync>> =
            list(InboundFednowTransferListParams.none())

        /** @see list */
        fun list(
            params: InboundFednowTransferListParams = InboundFednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundFednowTransferListPageAsync>>

        /** @see list */
        fun list(
            params: InboundFednowTransferListParams = InboundFednowTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<InboundFednowTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InboundFednowTransferListPageAsync>> =
            list(InboundFednowTransferListParams.none(), requestOptions)
    }
}
