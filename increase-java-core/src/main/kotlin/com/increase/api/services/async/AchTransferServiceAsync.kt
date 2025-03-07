// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferListPageAsync
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.AchTransferRetrieveParams
import java.util.concurrent.CompletableFuture

interface AchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an ACH Transfer */
    fun create(params: AchTransferCreateParams): CompletableFuture<AchTransfer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** Retrieve an ACH Transfer */
    fun retrieve(params: AchTransferRetrieveParams): CompletableFuture<AchTransfer> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** List ACH Transfers */
    fun list(): CompletableFuture<AchTransferListPageAsync> = list(AchTransferListParams.none())

    /** @see [list] */
    fun list(
        params: AchTransferListParams = AchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransferListPageAsync>

    /** @see [list] */
    fun list(
        params: AchTransferListParams = AchTransferListParams.none()
    ): CompletableFuture<AchTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AchTransferListPageAsync> =
        list(AchTransferListParams.none(), requestOptions)

    /** Approves an ACH Transfer in a pending_approval state. */
    fun approve(params: AchTransferApproveParams): CompletableFuture<AchTransfer> =
        approve(params, RequestOptions.none())

    /** @see [approve] */
    fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /** Cancels an ACH Transfer in a pending_approval state. */
    fun cancel(params: AchTransferCancelParams): CompletableFuture<AchTransfer> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AchTransfer>

    /**
     * A view of [AchTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /ach_transfers`, but is otherwise the same as
         * [AchTransferServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AchTransferCreateParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AchTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `get /ach_transfers/{ach_transfer_id}`, but is otherwise
         * the same as [AchTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AchTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `get /ach_transfers`, but is otherwise the same as
         * [AchTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>> =
            list(AchTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchTransferListParams = AchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AchTransferListParams = AchTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AchTransferListPageAsync>> =
            list(AchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/approve`, but is
         * otherwise the same as [AchTransferServiceAsync.approve].
         */
        @MustBeClosed
        fun approve(
            params: AchTransferApproveParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = approve(params, RequestOptions.none())

        /** @see [approve] */
        @MustBeClosed
        fun approve(
            params: AchTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>

        /**
         * Returns a raw HTTP response for `post /ach_transfers/{ach_transfer_id}/cancel`, but is
         * otherwise the same as [AchTransferServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: AchTransferCancelParams
        ): CompletableFuture<HttpResponseFor<AchTransfer>> = cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: AchTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AchTransfer>>
    }
}
