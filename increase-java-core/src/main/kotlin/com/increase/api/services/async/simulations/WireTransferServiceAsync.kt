// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.wiretransfers.WireTransferReverseParams
import com.increase.api.models.simulations.wiretransfers.WireTransferSubmitParams
import com.increase.api.models.wiretransfers.WireTransfer
import java.util.concurrent.CompletableFuture

interface WireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal Reserve due to
     * error conditions. This will also create a [Transaction](#transaction) to account for the
     * returned funds. This Wire Transfer must first have a `status` of `complete`.
     */
    fun reverse(wireTransferId: String): CompletableFuture<WireTransfer> =
        reverse(wireTransferId, WireTransferReverseParams.none())

    /** @see [reverse] */
    fun reverse(
        wireTransferId: String,
        params: WireTransferReverseParams = WireTransferReverseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer> =
        reverse(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [reverse] */
    fun reverse(
        wireTransferId: String,
        params: WireTransferReverseParams = WireTransferReverseParams.none(),
    ): CompletableFuture<WireTransfer> = reverse(wireTransferId, params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: WireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** @see [reverse] */
    fun reverse(params: WireTransferReverseParams): CompletableFuture<WireTransfer> =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        wireTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        reverse(wireTransferId, WireTransferReverseParams.none(), requestOptions)

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_creating`.
     */
    fun submit(wireTransferId: String): CompletableFuture<WireTransfer> =
        submit(wireTransferId, WireTransferSubmitParams.none())

    /** @see [submit] */
    fun submit(
        wireTransferId: String,
        params: WireTransferSubmitParams = WireTransferSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer> =
        submit(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see [submit] */
    fun submit(
        wireTransferId: String,
        params: WireTransferSubmitParams = WireTransferSubmitParams.none(),
    ): CompletableFuture<WireTransfer> = submit(wireTransferId, params, RequestOptions.none())

    /** @see [submit] */
    fun submit(
        params: WireTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /** @see [submit] */
    fun submit(params: WireTransferSubmitParams): CompletableFuture<WireTransfer> =
        submit(params, RequestOptions.none())

    /** @see [submit] */
    fun submit(
        wireTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireTransfer> =
        submit(wireTransferId, WireTransferSubmitParams.none(), requestOptions)

    /**
     * A view of [WireTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/wire_transfers/{wire_transfer_id}/reverse`, but is otherwise the same as
         * [WireTransferServiceAsync.reverse].
         */
        @MustBeClosed
        fun reverse(wireTransferId: String): CompletableFuture<HttpResponseFor<WireTransfer>> =
            reverse(wireTransferId, WireTransferReverseParams.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            wireTransferId: String,
            params: WireTransferReverseParams = WireTransferReverseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            reverse(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            wireTransferId: String,
            params: WireTransferReverseParams = WireTransferReverseParams.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            reverse(wireTransferId, params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: WireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: WireTransferReverseParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            reverse(wireTransferId, WireTransferReverseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/wire_transfers/{wire_transfer_id}/submit`, but is otherwise the same as
         * [WireTransferServiceAsync.submit].
         */
        @MustBeClosed
        fun submit(wireTransferId: String): CompletableFuture<HttpResponseFor<WireTransfer>> =
            submit(wireTransferId, WireTransferSubmitParams.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            wireTransferId: String,
            params: WireTransferSubmitParams = WireTransferSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            submit(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            wireTransferId: String,
            params: WireTransferSubmitParams = WireTransferSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            submit(wireTransferId, params, RequestOptions.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            params: WireTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            params: WireTransferSubmitParams
        ): CompletableFuture<HttpResponseFor<WireTransfer>> = submit(params, RequestOptions.none())

        /** @see [submit] */
        @MustBeClosed
        fun submit(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireTransfer>> =
            submit(wireTransferId, WireTransferSubmitParams.none(), requestOptions)
    }
}
