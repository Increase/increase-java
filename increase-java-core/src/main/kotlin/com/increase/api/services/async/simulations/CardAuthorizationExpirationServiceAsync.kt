// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams
import java.util.concurrent.CompletableFuture

interface CardAuthorizationExpirationServiceAsync {

    /** Simulates expiring a Card Authorization immediately. */
    @JvmOverloads
    fun create(
        params: SimulationCardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>
}
