// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingAccount
import com.increase.api.models.BookkeepingAccountBalanceParams
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountListPage
import com.increase.api.models.BookkeepingAccountListParams
import com.increase.api.models.BookkeepingAccountUpdateParams
import com.increase.api.models.BookkeepingBalanceLookup

interface BookkeepingAccountService {

    /** Create a Bookkeeping Account */
    @JvmOverloads
    fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingAccount

    /** Update a Bookkeeping Account */
    @JvmOverloads
    fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingAccount

    /** List Bookkeeping Accounts */
    @JvmOverloads
    fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingAccountListPage

    /** Retrieve a Bookkeeping Account Balance */
    @JvmOverloads
    fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingBalanceLookup
}
