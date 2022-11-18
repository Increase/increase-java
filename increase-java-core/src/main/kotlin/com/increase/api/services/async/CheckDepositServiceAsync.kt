@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckDeposit
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListPageAsync
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams
import java.util.concurrent.CompletableFuture

interface CheckDepositServiceAsync {

    /** Create a Check Deposit */
    @JvmOverloads
    fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckDeposit>

    /** Retrieve a Check Deposit */
    @JvmOverloads
    fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckDeposit>

    /** List Check Deposits */
    @JvmOverloads
    fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CheckDepositListPageAsync>
}
