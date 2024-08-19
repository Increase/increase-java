// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardReversalCreateParams
import java.util.concurrent.CompletableFuture

interface CardReversalServiceAsync {

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    @JvmOverloads
    fun create(
        params: SimulationCardReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>
}
