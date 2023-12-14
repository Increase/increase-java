// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.intrafi

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiBalance
import com.increase.api.models.IntrafiBalanceRetrieveParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /** Get IntraFi balances by bank */
    @JvmOverloads
    fun retrieve(
        params: IntrafiBalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IntrafiBalance>
}
