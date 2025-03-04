// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.SimulationRealTimePaymentsTransferCompleteParams

interface RealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates submission of a [Real-Time Payments Transfer](#real-time-payments-transfers) and
     * handling the response from the destination financial institution. This transfer must first
     * have a `status` of `pending_submission`.
     */
    @JvmOverloads
    fun complete(
        params: SimulationRealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /**
     * A view of [RealTimePaymentsTransferService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete`, but
         * is otherwise the same as [RealTimePaymentsTransferService.complete].
         */
        @JvmOverloads
        @MustBeClosed
        fun complete(
            params: SimulationRealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>
    }
}
