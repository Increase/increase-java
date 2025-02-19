// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardIncrementCreateParams

interface CardIncrementService {

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    @JvmOverloads
    fun create(
        params: SimulationCardIncrementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment
}
