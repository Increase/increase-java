// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundMailItem
import com.increase.api.models.SimulationInboundMailItemCreateParams

interface InboundMailItemService {

    /**
     * Simulates an inbound mail item to your account, as if someone had mailed a physical check to
     * one of your account's Lockboxes.
     */
    @JvmOverloads
    fun create(
        params: SimulationInboundMailItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundMailItem
}