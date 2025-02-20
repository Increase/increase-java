// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.SimulationInboundCheckDepositCreateParams
import java.util.concurrent.CompletableFuture

interface InboundCheckDepositServiceAsync {

    /**
     * Simulates an Inbound Check Deposit against your account. This imitates someone depositing a
     * check at their bank that was issued from your account. It may or may not be associated with a
     * Check Transfer. Increase will evaluate the Check Deposit as we would in production and either
     * create a Transaction or a Declined Transaction as a result. You can inspect the resulting
     * Inbound Check Deposit object to see the result.
     */
    @JvmOverloads
    fun create(
        params: SimulationInboundCheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>
}
