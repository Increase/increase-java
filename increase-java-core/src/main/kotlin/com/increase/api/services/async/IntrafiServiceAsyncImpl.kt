// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.services.async.intrafi.AccountEnrollmentServiceAsync
import com.increase.api.services.async.intrafi.AccountEnrollmentServiceAsyncImpl
import com.increase.api.services.async.intrafi.BalanceServiceAsync
import com.increase.api.services.async.intrafi.BalanceServiceAsyncImpl
import com.increase.api.services.async.intrafi.ExclusionServiceAsync
import com.increase.api.services.async.intrafi.ExclusionServiceAsyncImpl
import com.increase.api.services.errorHandler

class IntrafiServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : IntrafiServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountEnrollments: AccountEnrollmentServiceAsync by lazy {
        AccountEnrollmentServiceAsyncImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val exclusions: ExclusionServiceAsync by lazy {
        ExclusionServiceAsyncImpl(clientOptions)
    }

    override fun accountEnrollments(): AccountEnrollmentServiceAsync = accountEnrollments

    override fun balances(): BalanceServiceAsync = balances

    override fun exclusions(): ExclusionServiceAsync = exclusions
}
