// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.SimulationRealTimePaymentsTransferCompleteParams
import java.util.concurrent.CompletableFuture

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Simulates submission of a [Real-Time Payments Transfer](#real-time-payments-transfers) and
     * handling the response from the destination financial institution. This transfer must first
     * have a `status` of `pending_submission`.
     */
    @JvmOverloads
    fun complete(
        params: SimulationRealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<RealTimePaymentsTransfer>
}
