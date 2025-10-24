// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.simulations.inboundfednowtransfers.InboundFednowTransferCreateParams
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

    /** Simulates an [Inbound FedNow Transfer](#inbound-fednow-transfers) to your account. */
    fun create(
        params: InboundFednowTransferCreateParams
    ): CompletableFuture<InboundFednowTransfer> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InboundFednowTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundFednowTransfer>

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
         * Returns a raw HTTP response for `post /simulations/inbound_fednow_transfers`, but is
         * otherwise the same as [InboundFednowTransferServiceAsync.create].
         */
        fun create(
            params: InboundFednowTransferCreateParams
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InboundFednowTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundFednowTransfer>>
    }
}
