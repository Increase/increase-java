@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationCheckTransferDepositParams
import com.increase.api.models.SimulationCheckTransferMailParams
import java.util.concurrent.CompletableFuture

interface CheckTransferServiceAsync {

    /**
     * Simulates a [Check Transfer](#check-transfers) being deposited at a bank. This transfer must
     * first have a `status` of `mailed`.
     */
    @JvmOverloads
    fun deposit(
        params: SimulationCheckTransferDepositParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens once per weekday
     * in production but can be sped up in sandbox. This transfer must first have a `status` of
     * `pending_approval` or `pending_submission`.
     */
    @JvmOverloads
    fun mail(
        params: SimulationCheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckTransfer>
}
