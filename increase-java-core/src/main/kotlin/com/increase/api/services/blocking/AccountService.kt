// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise the same
         * as [AccountService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise the same
         * as [AccountService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListPage>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPage> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is otherwise
         * the same as [AccountService.balance].
         */
        @JvmOverloads
        @MustBeClosed
        fun balance(
            params: AccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceLookup>

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is otherwise the
         * same as [AccountService.close].
         */
        @JvmOverloads
        @MustBeClosed
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>
    }
}
