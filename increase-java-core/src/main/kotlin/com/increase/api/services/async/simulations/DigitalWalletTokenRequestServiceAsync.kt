@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.DigitalWalletTokenRequestCreateResponse
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateParams
import java.util.concurrent.CompletableFuture

interface DigitalWalletTokenRequestServiceAsync {

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    @JvmOverloads
    fun create(
        params: SimulationDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<DigitalWalletTokenRequestCreateResponse>
}
