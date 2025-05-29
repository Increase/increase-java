// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.simulations.inboundwiretransfers.InboundWireTransferCreateParams
import java.util.concurrent.CompletableFuture

interface InboundWireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
    fun create(params: InboundWireTransferCreateParams): CompletableFuture<InboundWireTransfer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InboundWireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundWireTransfer>

    /**
     * A view of [InboundWireTransferServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_wire_transfers`, but is
         * otherwise the same as [InboundWireTransferServiceAsync.create].
         */
        fun create(
            params: InboundWireTransferCreateParams
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: InboundWireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundWireTransfer>>
    }
}
