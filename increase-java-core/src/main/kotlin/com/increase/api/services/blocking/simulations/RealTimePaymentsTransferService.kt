@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundRealTimePaymentsTransferSimulationResult
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.SimulationRealTimePaymentsTransferCompleteParams
import com.increase.api.models.SimulationRealTimePaymentsTransferCreateInboundParams

interface RealTimePaymentsTransferService {

    /**
     * Simulates submission of a Real-Time Payments transfer and handling the response from the
     * destination financial institution. This transfer must first have a `status` of
     * `pending_submission`.
     */
    @JvmOverloads
    fun complete(
        params: SimulationRealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsTransfer

    /**
     * Simulates an inbound Real-Time Payments transfer to your account. Real-Time Payments are a
     * beta feature.
     */
    @JvmOverloads
    fun createInbound(
        params: SimulationRealTimePaymentsTransferCreateInboundParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundRealTimePaymentsTransferSimulationResult
}
