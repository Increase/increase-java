// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.SimulationWireTransferReverseParams
import com.increase.api.models.SimulationWireTransferSubmitParams
import com.increase.api.models.WireTransfer
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
    @JvmOverloads
    fun reverse(
        params: SimulationWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_creating`.
     */
    @JvmOverloads
    fun submit(
        params: SimulationWireTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireTransfer>

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
        @JvmOverloads
        @MustBeClosed
        fun reverse(
            params: SimulationWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/wire_transfers/{wire_transfer_id}/submit`, but is otherwise the same as
         * [WireTransferServiceAsync.submit].
         */
        @JvmOverloads
        @MustBeClosed
        fun submit(
            params: SimulationWireTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireTransfer>>
    }
}
