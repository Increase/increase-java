@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationWireTransferCreateInboundParams
import com.increase.api.models.WireTransferSimulation

interface WireTransferService {

    /** Simulates an inbound Wire Transfer to your account. */
    @JvmOverloads
    fun createInbound(
        params: SimulationWireTransferCreateInboundParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireTransferSimulation
}
