// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationInboundRealTimePaymentsTransferCreateParams
import com.increase.api.models.SimulationInboundRealTimePaymentsTransferCreateResponse
import java.util.concurrent.CompletableFuture

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Simulates an inbound Real-Time Payments transfer to your account. Real-Time Payments are a
     * beta feature.
     */
    @JvmOverloads
    fun create(
        params: SimulationInboundRealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<SimulationInboundRealTimePaymentsTransferCreateResponse>
}
