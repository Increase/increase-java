// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountStatement
import com.increase.api.models.SimulationAccountStatementCreateParams

interface AccountStatementService {

    /**
     * Simulates an [Account Statement](#account-statements) being created for an account. In
     * production, Account Statements are generated once per month.
     */
    @JvmOverloads
    fun create(
        params: SimulationAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement
}
