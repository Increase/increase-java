// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardFuelConfirmationCreateParams
import java.util.concurrent.CompletableFuture

interface CardFuelConfirmationServiceAsync {

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    @JvmOverloads
    fun create(
        params: SimulationCardFuelConfirmationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardPayment>
}
