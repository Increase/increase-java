// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.services.async.intrafi.AccountEnrollmentServiceAsync
import com.increase.api.services.async.intrafi.BalanceServiceAsync
import com.increase.api.services.async.intrafi.ExclusionServiceAsync

interface IntrafiServiceAsync {

    fun accountEnrollments(): AccountEnrollmentServiceAsync

    fun balances(): BalanceServiceAsync

    fun exclusions(): ExclusionServiceAsync
}
