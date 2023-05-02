@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckDeposit
import com.increase.api.models.SimulationCheckDepositRejectParams
import com.increase.api.models.SimulationCheckDepositReturnParams
import com.increase.api.models.SimulationCheckDepositSubmitParams

interface CheckDepositService {

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    @JvmOverloads
    fun reject(
        params: SimulationCheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    @JvmOverloads
    fun return_(
        params: SimulationCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    @JvmOverloads
    fun submit(
        params: SimulationCheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit
}
