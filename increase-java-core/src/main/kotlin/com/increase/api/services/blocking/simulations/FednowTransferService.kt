// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.simulations.fednowtransfers.FednowTransferCompleteParams
import java.util.function.Consumer

interface FednowTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FednowTransferService

    /**
     * Simulates submission of a [FedNow Transfer](#fednow-transfers) and handling the response from
     * the destination financial institution. This transfer must first have a `status` of
     * `pending_submitting`.
     */
    fun complete(fednowTransferId: String): FednowTransfer =
        complete(fednowTransferId, FednowTransferCompleteParams.none())

    /** @see complete */
    fun complete(
        fednowTransferId: String,
        params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        complete(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see complete */
    fun complete(
        fednowTransferId: String,
        params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
    ): FednowTransfer = complete(fednowTransferId, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: FednowTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see complete */
    fun complete(params: FednowTransferCompleteParams): FednowTransfer =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        complete(fednowTransferId, FednowTransferCompleteParams.none(), requestOptions)

    /**
     * A view of [FednowTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FednowTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/fednow_transfers/{fednow_transfer_id}/complete`, but is otherwise the same
         * as [FednowTransferService.complete].
         */
        @MustBeClosed
        fun complete(fednowTransferId: String): HttpResponseFor<FednowTransfer> =
            complete(fednowTransferId, FednowTransferCompleteParams.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            fednowTransferId: String,
            params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            complete(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see complete */
        @MustBeClosed
        fun complete(
            fednowTransferId: String,
            params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
        ): HttpResponseFor<FednowTransfer> =
            complete(fednowTransferId, params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: FednowTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see complete */
        @MustBeClosed
        fun complete(params: FednowTransferCompleteParams): HttpResponseFor<FednowTransfer> =
            complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            complete(fednowTransferId, FednowTransferCompleteParams.none(), requestOptions)
    }
}
