// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Account
import com.increase.api.models.AccountBalanceParams
import com.increase.api.models.AccountCloseParams
import com.increase.api.models.AccountCreateParams
import com.increase.api.models.AccountListPage
import com.increase.api.models.AccountListParams
import com.increase.api.models.AccountRetrieveParams
import com.increase.api.models.AccountUpdateParams
import com.increase.api.models.BalanceLookup

interface AccountService {

    /** Create an Account */
    @JvmOverloads
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** Retrieve an Account */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** Update an Account */
    @JvmOverloads
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** List Accounts */
    @JvmOverloads
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListPage

    /** List Accounts */
    fun list(requestOptions: RequestOptions): AccountListPage =
        list(AccountListParams.none(), requestOptions)

    /**
     * Retrieve the current and available balances for an account in minor units of the account's
     * currency. Learn more about [account balances](/documentation/balance).
     */
    @JvmOverloads
    fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceLookup

    /** Close an Account */
    @JvmOverloads
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account
}
