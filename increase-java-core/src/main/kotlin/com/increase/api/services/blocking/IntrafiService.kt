// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.services.blocking.intrafi.AccountEnrollmentService
import com.increase.api.services.blocking.intrafi.BalanceService
import com.increase.api.services.blocking.intrafi.ExclusionService

interface IntrafiService {

    fun accountEnrollments(): AccountEnrollmentService

    fun balances(): BalanceService

    fun exclusions(): ExclusionService
}
