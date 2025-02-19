// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckDeposit
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListPage
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams

interface CheckDepositService {

    /** Create a Check Deposit */
    @JvmOverloads
    fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** Retrieve a Check Deposit */
    @JvmOverloads
    fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** List Check Deposits */
    @JvmOverloads
    fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDepositListPage
}
