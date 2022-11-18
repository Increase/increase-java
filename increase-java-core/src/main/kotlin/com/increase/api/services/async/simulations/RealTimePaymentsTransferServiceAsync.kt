@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundRealTimePaymentsTransferSimulationResult
import com.increase.api.models.SimulationsRealTimePaymentsTransferCreateInboundParams
import java.util.concurrent.CompletableFuture

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Simulates an inbound Real Time Payments transfer to your account. Real Time Payments are a
     * beta feature.
     */
    @JvmOverloads
    fun createInbound(
        params: SimulationsRealTimePaymentsTransferCreateInboundParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InboundRealTimePaymentsTransferSimulationResult>
}
