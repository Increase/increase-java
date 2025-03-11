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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal
     * Reserve due to error conditions. This will also create a
     * [Transaction](#transaction) to account for the returned funds. This Wire
     * Transfer must first have a `status` of `complete`.
     */
    fun reverse(params: WireTransferReverseParams): CompletableFuture<WireTransfer> =
        reverse(
          params, RequestOptions.none()
        )

    /** @see [reverse] */
    fun reverse(params: WireTransferReverseParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WireTransfer>

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_creating`.
     */
    fun submit(params: WireTransferSubmitParams): CompletableFuture<WireTransfer> =
        submit(
          params, RequestOptions.none()
        )

    /** @see [submit] */
    fun submit(params: WireTransferSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WireTransfer>

    /**
     * A view of [WireTransferServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/wire_transfers/{wire_transfer_id}/reverse`, but is otherwise
         * the same as [WireTransferServiceAsync.reverse].
         */
        @MustBeClosed
        fun reverse(params: WireTransferReverseParams): CompletableFuture<HttpResponseFor<WireTransfer>> =
            reverse(
              params, RequestOptions.none()
            )

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(params: WireTransferReverseParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<WireTransfer>>

        /**
         * Returns a raw HTTP response for
         * `post /simulations/wire_transfers/{wire_transfer_id}/submit`, but is otherwise
         * the same as [WireTransferServiceAsync.submit].
         */
        @MustBeClosed
        fun submit(params: WireTransferSubmitParams): CompletableFuture<HttpResponseFor<WireTransfer>> =
            submit(
              params, RequestOptions.none()
            )

        /** @see [submit] */
        @MustBeClosed
        fun submit(params: WireTransferSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<WireTransfer>>
    }
}
