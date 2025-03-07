// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.SimulationInboundRealTimePaymentsTransferCreateParams

interface InboundRealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an [Inbound Real-Time Payments Transfer](#inbound-real-time-payments-transfers) to
     * your account. Real-Time Payments are a beta feature.
     */
    fun create(
        params: SimulationInboundRealTimePaymentsTransferCreateParams
    ): InboundRealTimePaymentsTransfer = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: SimulationInboundRealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer

    /**
     * A view of [InboundRealTimePaymentsTransferService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_real_time_payments_transfers`,
         * but is otherwise the same as [InboundRealTimePaymentsTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: SimulationInboundRealTimePaymentsTransferCreateParams
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: SimulationInboundRealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer>
    }
}
