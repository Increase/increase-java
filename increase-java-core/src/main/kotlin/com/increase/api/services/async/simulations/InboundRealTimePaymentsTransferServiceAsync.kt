// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.SimulationInboundRealTimePaymentsTransferCreateParams
import java.util.concurrent.CompletableFuture

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Simulates an [Inbound Real-Time Payments Transfer](#inbound-real-time-payments-transfers) to
     * your account. Real-Time Payments are a beta feature.
     */
    @JvmOverloads
    fun create(
        params: SimulationInboundRealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundRealTimePaymentsTransfer>
}
