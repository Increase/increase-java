// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.services.blocking.intrafi.AccountEnrollmentService
import com.increase.api.services.blocking.intrafi.AccountEnrollmentServiceImpl
import com.increase.api.services.blocking.intrafi.BalanceService
import com.increase.api.services.blocking.intrafi.BalanceServiceImpl
import com.increase.api.services.blocking.intrafi.ExclusionService
import com.increase.api.services.blocking.intrafi.ExclusionServiceImpl
import com.increase.api.services.errorHandler

class IntrafiServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : IntrafiService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val accountEnrollments: AccountEnrollmentService by lazy {
        AccountEnrollmentServiceImpl(clientOptions)
    }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val exclusions: ExclusionService by lazy { ExclusionServiceImpl(clientOptions) }

    override fun accountEnrollments(): AccountEnrollmentService = accountEnrollments

    override fun balances(): BalanceService = balances

    override fun exclusions(): ExclusionService = exclusions
}
