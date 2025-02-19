// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams
import com.increase.api.models.SimulationInboundFundsHoldReleaseResponse

interface InboundFundsHoldService {

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    @JvmOverloads
    fun release(
        params: SimulationInboundFundsHoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimulationInboundFundsHoldReleaseResponse
}
