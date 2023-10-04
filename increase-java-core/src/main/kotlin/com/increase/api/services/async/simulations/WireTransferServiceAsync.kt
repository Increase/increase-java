// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationWireTransferCreateInboundParams
import com.increase.api.models.WireTransferSimulation
import java.util.concurrent.CompletableFuture

interface WireTransferServiceAsync {

    /** Simulates an inbound Wire Transfer to your account. */
    @JvmOverloads
    fun createInbound(
        params: SimulationWireTransferCreateInboundParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<WireTransferSimulation>
}
