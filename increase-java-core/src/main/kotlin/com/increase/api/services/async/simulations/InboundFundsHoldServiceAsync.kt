@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundFundsHoldReleaseResponse
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams
import java.util.concurrent.CompletableFuture

interface InboundFundsHoldServiceAsync {

    /**
     * This endpoint simulates immediately releasing an inbound funds hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    @JvmOverloads
    fun release(
        params: SimulationInboundFundsHoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundFundsHoldReleaseResponse>
}
