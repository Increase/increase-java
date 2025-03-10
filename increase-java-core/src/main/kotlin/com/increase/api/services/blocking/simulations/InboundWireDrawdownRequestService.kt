// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.simulations.inboundwiredrawdownrequests.InboundWireDrawdownRequestCreateParams

interface InboundWireDrawdownRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
    fun create(params: InboundWireDrawdownRequestCreateParams): InboundWireDrawdownRequest =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest

    /**
     * A view of [InboundWireDrawdownRequestService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_wire_drawdown_requests`, but
         * is otherwise the same as [InboundWireDrawdownRequestService.create].
         */
        @MustBeClosed
        fun create(
            params: InboundWireDrawdownRequestCreateParams
        ): HttpResponseFor<InboundWireDrawdownRequest> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InboundWireDrawdownRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireDrawdownRequest>
    }
}
