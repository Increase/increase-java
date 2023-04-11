@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferSimulation
import com.increase.api.models.SimulationsAchTransferCreateInboundParams
import com.increase.api.models.SimulationsAchTransferReturnParams
import com.increase.api.models.SimulationsAchTransferSubmitParams
import java.util.concurrent.CompletableFuture

interface AchTransferServiceAsync {

    /**
     * Simulates an inbound ACH transfer to your account. This imitates initiating a transaction to
     * an Increase account from a different financial institution. The transfer may be either a
     * credit or a debit depending on if the `amount` is positive or negative. The result of calling
     * this API will be either a [Transaction](#transactions) or a
     * [Declined Transaction](#declined-transactions) depending on whether or not the transfer is
     * allowed.
     */
    @JvmOverloads
    fun createInbound(
        params: SimulationsAchTransferCreateInboundParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AchTransferSimulation>

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve due to an
     * error condition. This will also create a Transaction to account for the returned funds. This
     * transfer must first have a `status` of `submitted`.
     */
    @JvmOverloads
    fun return_(
        params: SimulationsAchTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AchTransfer>

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_submission`. In
     * production, Increase submits ACH Transfers to the Federal Reserve three times per day on
     * weekdays. Since sandbox ACH Transfers are not submitted to the Federal Reserve, this endpoint
     * allows you to skip that delay and transition the ACH Transfer to a status of `submitted`.
     */
    @JvmOverloads
    fun submit(
        params: SimulationsAchTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AchTransfer>
}
