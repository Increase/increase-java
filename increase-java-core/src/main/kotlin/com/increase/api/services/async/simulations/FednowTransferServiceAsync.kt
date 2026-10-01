// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.simulations.fednowtransfers.FednowTransferCompleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FednowTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FednowTransferServiceAsync

    /**
     * Simulates submission of a [FedNow Transfer](#fednow-transfers) and handling the response from
     * the destination financial institution. This transfer must first have a `status` of
     * `pending_submitting`.
     */
    fun complete(fednowTransferId: String): CompletableFuture<FednowTransfer> =
        complete(fednowTransferId, FednowTransferCompleteParams.none())

    /** @see complete */
    fun complete(
        fednowTransferId: String,
        params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer> =
        complete(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see complete */
    fun complete(
        fednowTransferId: String,
        params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
    ): CompletableFuture<FednowTransfer> = complete(fednowTransferId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: FednowTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FednowTransfer>

    /** @see complete */
    fun complete(params: FednowTransferCompleteParams): CompletableFuture<FednowTransfer> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        fednowTransferId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FednowTransfer> =
        complete(fednowTransferId, FednowTransferCompleteParams.none(), requestOptions)

    /**
     * A view of [FednowTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FednowTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/fednow_transfers/{fednow_transfer_id}/complete`, but is otherwise the same
         * as [FednowTransferServiceAsync.complete].
         */
        fun complete(fednowTransferId: String): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            complete(fednowTransferId, FednowTransferCompleteParams.none())

        /** @see complete */
        fun complete(
            fednowTransferId: String,
            params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            complete(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see complete */
        fun complete(
            fednowTransferId: String,
            params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            complete(fednowTransferId, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: FednowTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FednowTransfer>>

        /** @see complete */
        fun complete(
            params: FednowTransferCompleteParams
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FednowTransfer>> =
            complete(fednowTransferId, FednowTransferCompleteParams.none(), requestOptions)
    }
}
