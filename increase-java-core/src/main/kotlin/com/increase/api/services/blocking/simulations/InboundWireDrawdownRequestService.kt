// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.SimulationInboundWireDrawdownRequestCreateParams

interface InboundWireDrawdownRequestService {

    /** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
    @JvmOverloads
    fun create(
        params: SimulationInboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireDrawdownRequest
}
