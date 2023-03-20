@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationsCheckTransferDepositParams
import com.increase.api.models.SimulationsCheckTransferMailParams
import com.increase.api.models.SimulationsCheckTransferReturnParams

interface CheckTransferService {

    /**
     * Simulates a [Check Transfer](#check-transfers) being deposited at a bank. This transfer must
     * first have a `status` of `mailed`.
     */
    @JvmOverloads
    fun deposit(
        params: SimulationsCheckTransferDepositParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens once per weekday
     * in production but can be sped up in sandbox. This transfer must first have a `status` of
     * `pending_approval` or `pending_submission`.
     */
    @JvmOverloads
    fun mail(
        params: SimulationsCheckTransferMailParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer

    /**
     * Simulates a [Check Transfer](#check-transfers) being returned via USPS to Increase. This
     * transfer must first have a `status` of `mailed`.
     */
    @JvmOverloads
    fun return_(
        params: SimulationsCheckTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer
}
