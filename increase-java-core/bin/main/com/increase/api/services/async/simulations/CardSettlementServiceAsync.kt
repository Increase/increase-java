// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationCardSettlementCreateParams
import com.increase.api.models.Transaction
import java.util.concurrent.CompletableFuture

interface CardSettlementServiceAsync {

    /**
     * Simulates the settlement of an authorization by a card acquirer. After a card authorization
     * is created, the merchant will eventually send a settlement. This simulates that event, which
     * may occur many days after the purchase in production. The amount settled can be different
     * from the amount originally authorized, for example, when adding a tip to a restaurant bill.
     */
    @JvmOverloads
    fun create(
        params: SimulationCardSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Transaction>
}
