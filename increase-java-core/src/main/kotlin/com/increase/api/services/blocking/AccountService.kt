// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounts.Account
import com.increase.api.models.accounts.AccountBalanceParams
import com.increase.api.models.accounts.AccountCloseParams
import com.increase.api.models.accounts.AccountCreateParams
import com.increase.api.models.accounts.AccountListPage
import com.increase.api.models.accounts.AccountListParams
import com.increase.api.models.accounts.AccountRetrieveParams
import com.increase.api.models.accounts.AccountUpdateParams
import com.increase.api.models.accounts.BalanceLookup

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account */
    fun create(params: AccountCreateParams): Account =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: AccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** Retrieve an Account */
    fun retrieve(params: AccountRetrieveParams): Account =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** Update an Account */
    fun update(params: AccountUpdateParams): Account =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** List Accounts */
    fun list(): AccountListPage = list(AccountListParams.none())

    /** @see [list] */
    fun list(params: AccountListParams = AccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AccountListPage

    /** @see [list] */
    fun list(params: AccountListParams = AccountListParams.none()): AccountListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountListPage = list(AccountListParams.none(), requestOptions)

    /**
     * Retrieve the current and available balances for an account in minor units of the
     * account's currency. Learn more about [account balances](/documentation/balance).
     */
    fun balance(params: AccountBalanceParams): BalanceLookup =
        balance(
          params, RequestOptions.none()
        )

    /** @see [balance] */
    fun balance(params: AccountBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): BalanceLookup

    /** Close an Account */
    fun close(params: AccountCloseParams): Account =
        close(
          params, RequestOptions.none()
        )

    /** @see [close] */
    fun close(params: AccountCloseParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /**
     * A view of [AccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountService.create].
         */
        @MustBeClosed
        fun create(params: AccountCreateParams): HttpResponseFor<Account> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: AccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise
         * the same as [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponseFor<Account> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise
         * the same as [AccountService.update].
         */
        @MustBeClosed
        fun update(params: AccountUpdateParams): HttpResponseFor<Account> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountListPage> = list(AccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: AccountListParams = AccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: AccountListParams = AccountListParams.none()): HttpResponseFor<AccountListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPage> = list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is
         * otherwise the same as [AccountService.balance].
         */
        @MustBeClosed
        fun balance(params: AccountBalanceParams): HttpResponseFor<BalanceLookup> =
            balance(
              params, RequestOptions.none()
            )

        /** @see [balance] */
        @MustBeClosed
        fun balance(params: AccountBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<BalanceLookup>

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is
         * otherwise the same as [AccountService.close].
         */
        @MustBeClosed
        fun close(params: AccountCloseParams): HttpResponseFor<Account> =
            close(
              params, RequestOptions.none()
            )

        /** @see [close] */
        @MustBeClosed
        fun close(params: AccountCloseParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>
    }
}
