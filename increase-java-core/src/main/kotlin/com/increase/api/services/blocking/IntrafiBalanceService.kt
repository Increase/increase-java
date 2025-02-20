// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiBalance
import com.increase.api.models.IntrafiBalanceIntrafiBalanceParams

interface IntrafiBalanceService {

    /** Get IntraFi balances by bank */
    @JvmOverloads
    fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiBalance
}
