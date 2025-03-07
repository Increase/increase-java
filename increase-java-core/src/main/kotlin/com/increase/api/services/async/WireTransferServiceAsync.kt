// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPageAsync
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams
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
    fun retrieve(params: WireTransferRetrieveParams): CompletableFuture<WireTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

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
    fun approve(params: WireTransferApproveParams): CompletableFuture<WireTransfer> =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** Cancel a pending Wire Transfer */
    fun cancel(params: WireTransferCancelParams): CompletableFuture<WireTransfer> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /**
     * A view of [WireTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: WireTransferCreateParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /**
         * Returns a raw HTTP response for `get /wire_transfers/{wire_transfer_id}`, but is
         * otherwise the same as [WireTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: WireTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> =
            list(WireTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireTransferListParams = WireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WireTransferListParams = WireTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireTransferListPageAsync>> =
            list(WireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/approve`, but is
         * otherwise the same as [WireTransferServiceAsync.approve].
         */
        @MustBeClosed
        fun approve(
            params: WireTransferApproveParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/cancel`, but is
         * otherwise the same as [WireTransferServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: WireTransferCancelParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>
    }
}
