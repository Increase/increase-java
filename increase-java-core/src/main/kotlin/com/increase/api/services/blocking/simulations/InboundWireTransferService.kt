// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.simulations.inboundwiretransfers.InboundWireTransferCreateParams

interface InboundWireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
    fun create(params: InboundWireTransferCreateParams): InboundWireTransfer =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: InboundWireTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): InboundWireTransfer

    /**
     * A view of [InboundWireTransferService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_wire_transfers`, but
         * is otherwise the same as [InboundWireTransferService.create].
         */
        @MustBeClosed
        fun create(params: InboundWireTransferCreateParams): HttpResponseFor<InboundWireTransfer> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: InboundWireTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundWireTransfer>
    }
}
