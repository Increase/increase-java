// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiretransfers.WireTransfer
import com.increase.api.models.wiretransfers.WireTransferApproveParams
import com.increase.api.models.wiretransfers.WireTransferCancelParams
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import com.increase.api.models.wiretransfers.WireTransferListPageAsync
import com.increase.api.models.wiretransfers.WireTransferListParams
import com.increase.api.models.wiretransfers.WireTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface WireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Transfer */
    fun create(params: WireTransferCreateParams): CompletableFuture<WireTransfer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** Retrieve a Wire Transfer */
    fun retrieve(wireTransferId: String): CompletableFuture<WireTransfer> =
        retrieve(wireTransferId, WireTransferRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        wireTransferId: String,
        params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer> =
        retrieve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        wireTransferId: String,
        params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
    ): CompletableFuture<WireTransfer> = retrieve(wireTransferId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** @see [retrieve] */
    fun retrieve(params: WireTransferRetrieveParams): CompletableFuture<WireTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        wireTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        retrieve(wireTransferId, WireTransferRetrieveParams.none(), requestOptions)

    /** List Wire Transfers */
    fun list(): CompletableFuture<WireTransferListPageAsync> = list(WireTransferListParams.none())

    /** @see [list] */
    fun list(
        params: WireTransferListParams = WireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransferListPageAsync>

    /** @see [list] */
    fun list(
        params: WireTransferListParams = WireTransferListParams.none()
    ): CompletableFuture<WireTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<WireTransferListPageAsync> =
        list(WireTransferListParams.none(), requestOptions)

    /** Approve a Wire Transfer */
    fun approve(wireTransferId: String): CompletableFuture<WireTransfer> =
        approve(wireTransferId, WireTransferApproveParams.none())

    /** @see [approve] */
    fun approve(
        wireTransferId: String,
        params: WireTransferApproveParams = WireTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer> =
        approve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [approve] */
    fun approve(
        wireTransferId: String,
        params: WireTransferApproveParams = WireTransferApproveParams.none(),
    ): CompletableFuture<WireTransfer> = approve(wireTransferId, params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** @see [approve] */
    fun approve(params: WireTransferApproveParams): CompletableFuture<WireTransfer> =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        wireTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        approve(wireTransferId, WireTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Wire Transfer */
    fun cancel(wireTransferId: String): CompletableFuture<WireTransfer> =
        cancel(wireTransferId, WireTransferCancelParams.none())

    /** @see [cancel] */
    fun cancel(
        wireTransferId: String,
        params: WireTransferCancelParams = WireTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer> =
        cancel(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [cancel] */
    fun cancel(
        wireTransferId: String,
        params: WireTransferCancelParams = WireTransferCancelParams.none(),
    ): CompletableFuture<WireTransfer> = cancel(wireTransferId, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** @see [cancel] */
    fun cancel(params: WireTransferCancelParams): CompletableFuture<WireTransfer> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        wireTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        cancel(wireTransferId, WireTransferCancelParams.none(), requestOptions)

    /**
     * A view of [WireTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.create].
         */
        fun create(
            params: WireTransferCreateParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /**
         * Returns a raw HTTP response for `get /wire_transfers/{wire_transfer_id}`, but is
         * otherwise the same as [WireTransferServiceAsync.retrieve].
         */
        fun retrieve(wireTransferId: String): CompletableFuture<HttpResponseFor<WireTransfer>> =
            retrieve(wireTransferId, WireTransferRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            wireTransferId: String,
            params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            retrieve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            wireTransferId: String,
            params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            retrieve(wireTransferId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /** @see [retrieve] */
        fun retrieve(
            params: WireTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            retrieve(wireTransferId, WireTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> =
            list(WireTransferListParams.none())

        /** @see [list] */
        fun list(
            params: WireTransferListParams = WireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>>

        /** @see [list] */
        fun list(
            params: WireTransferListParams = WireTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> =
            list(WireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/approve`, but is
         * otherwise the same as [WireTransferServiceAsync.approve].
         */
        fun approve(wireTransferId: String): CompletableFuture<HttpResponseFor<WireTransfer>> =
            approve(wireTransferId, WireTransferApproveParams.none())

        /** @see [approve] */
        fun approve(
            wireTransferId: String,
            params: WireTransferApproveParams = WireTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            approve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [approve] */
        fun approve(
            wireTransferId: String,
            params: WireTransferApproveParams = WireTransferApproveParams.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            approve(wireTransferId, params, RequestOptions.none())

        /** @see [approve] */
        fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /** @see [approve] */
        fun approve(
            params: WireTransferApproveParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = approve(params, RequestOptions.none())

        /** @see [approve] */
        fun approve(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            approve(wireTransferId, WireTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/cancel`, but is
         * otherwise the same as [WireTransferServiceAsync.cancel].
         */
        fun cancel(wireTransferId: String): CompletableFuture<HttpResponseFor<WireTransfer>> =
            cancel(wireTransferId, WireTransferCancelParams.none())

        /** @see [cancel] */
        fun cancel(
            wireTransferId: String,
            params: WireTransferCancelParams = WireTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            cancel(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [cancel] */
        fun cancel(
            wireTransferId: String,
            params: WireTransferCancelParams = WireTransferCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            cancel(wireTransferId, params, RequestOptions.none())

        /** @see [cancel] */
        fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /** @see [cancel] */
        fun cancel(
            params: WireTransferCancelParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = cancel(params, RequestOptions.none())

        /** @see [cancel] */
        fun cancel(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            cancel(wireTransferId, WireTransferCancelParams.none(), requestOptions)
    }
}
