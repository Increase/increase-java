// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounts.Account
import com.increase.api.models.accounts.AccountBalanceParams
import com.increase.api.models.accounts.AccountCloseParams
import com.increase.api.models.accounts.AccountCreateParams
import com.increase.api.models.accounts.AccountListPageAsync
import com.increase.api.models.accounts.AccountListParams
import com.increase.api.models.accounts.AccountRetrieveParams
import com.increase.api.models.accounts.AccountUpdateParams
import com.increase.api.models.accounts.BalanceLookup
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account */
    fun create(params: AccountCreateParams): CompletableFuture<Account> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** Retrieve an Account */
    fun retrieve(accountId: String): CompletableFuture<Account> =
        retrieve(accountId, AccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        accountId: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> =
        retrieve(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        accountId: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<Account> = retrieve(accountId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see [retrieve] */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<Account> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(accountId: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        retrieve(accountId, AccountRetrieveParams.none(), requestOptions)

    /** Update an Account */
    fun update(accountId: String): CompletableFuture<Account> =
        update(accountId, AccountUpdateParams.none())

    /** @see [update] */
    fun update(
        accountId: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> =
        update(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [update] */
    fun update(
        accountId: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
    ): CompletableFuture<Account> = update(accountId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see [update] */
    fun update(params: AccountUpdateParams): CompletableFuture<Account> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(accountId: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        update(accountId, AccountUpdateParams.none(), requestOptions)

    /** List Accounts */
    fun list(): CompletableFuture<AccountListPageAsync> = list(AccountListParams.none())

    /** @see [list] */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountListParams = AccountListParams.none()
    ): CompletableFuture<AccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListPageAsync> =
        list(AccountListParams.none(), requestOptions)

    /**
     * Retrieve the current and available balances for an account in minor units of the account's
     * currency. Learn more about [account balances](/documentation/balance).
     */
    fun balance(accountId: String): CompletableFuture<BalanceLookup> =
        balance(accountId, AccountBalanceParams.none())

    /** @see [balance] */
    fun balance(
        accountId: String,
        params: AccountBalanceParams = AccountBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceLookup> =
        balance(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [balance] */
    fun balance(
        accountId: String,
        params: AccountBalanceParams = AccountBalanceParams.none(),
    ): CompletableFuture<BalanceLookup> = balance(accountId, params, RequestOptions.none())

    /** @see [balance] */
    fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceLookup>

    /** @see [balance] */
    fun balance(params: AccountBalanceParams): CompletableFuture<BalanceLookup> =
        balance(params, RequestOptions.none())

    /** @see [balance] */
    fun balance(
        accountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceLookup> =
        balance(accountId, AccountBalanceParams.none(), requestOptions)

    /** Close an Account */
    fun close(accountId: String): CompletableFuture<Account> =
        close(accountId, AccountCloseParams.none())

    /** @see [close] */
    fun close(
        accountId: String,
        params: AccountCloseParams = AccountCloseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> =
        close(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [close] */
    fun close(
        accountId: String,
        params: AccountCloseParams = AccountCloseParams.none(),
    ): CompletableFuture<Account> = close(accountId, params, RequestOptions.none())

    /** @see [close] */
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see [close] */
    fun close(params: AccountCloseParams): CompletableFuture<Account> =
        close(params, RequestOptions.none())

    /** @see [close] */
    fun close(accountId: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        close(accountId, AccountCloseParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        fun create(params: AccountCreateParams): CompletableFuture<HttpResponseFor<Account>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.retrieve].
         */
        fun retrieve(accountId: String): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(accountId, AccountRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            accountId: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            accountId: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(accountId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see [retrieve] */
        fun retrieve(params: AccountRetrieveParams): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(accountId, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.update].
         */
        fun update(accountId: String): CompletableFuture<HttpResponseFor<Account>> =
            update(accountId, AccountUpdateParams.none())

        /** @see [update] */
        fun update(
            accountId: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            update(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [update] */
        fun update(
            accountId: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            update(accountId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see [update] */
        fun update(params: AccountUpdateParams): CompletableFuture<HttpResponseFor<Account>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            update(accountId, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none())

        /** @see [list] */
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>>

        /** @see [list] */
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is otherwise
         * the same as [AccountServiceAsync.balance].
         */
        fun balance(accountId: String): CompletableFuture<HttpResponseFor<BalanceLookup>> =
            balance(accountId, AccountBalanceParams.none())

        /** @see [balance] */
        fun balance(
            accountId: String,
            params: AccountBalanceParams = AccountBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceLookup>> =
            balance(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [balance] */
        fun balance(
            accountId: String,
            params: AccountBalanceParams = AccountBalanceParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceLookup>> =
            balance(accountId, params, RequestOptions.none())

        /** @see [balance] */
        fun balance(
            params: AccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceLookup>>

        /** @see [balance] */
        fun balance(
            params: AccountBalanceParams
        ): CompletableFuture<HttpResponseFor<BalanceLookup>> =
            balance(params, RequestOptions.none())

        /** @see [balance] */
        fun balance(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceLookup>> =
            balance(accountId, AccountBalanceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is otherwise the
         * same as [AccountServiceAsync.close].
         */
        fun close(accountId: String): CompletableFuture<HttpResponseFor<Account>> =
            close(accountId, AccountCloseParams.none())

        /** @see [close] */
        fun close(
            accountId: String,
            params: AccountCloseParams = AccountCloseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            close(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [close] */
        fun close(
            accountId: String,
            params: AccountCloseParams = AccountCloseParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            close(accountId, params, RequestOptions.none())

        /** @see [close] */
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see [close] */
        fun close(params: AccountCloseParams): CompletableFuture<HttpResponseFor<Account>> =
            close(params, RequestOptions.none())

        /** @see [close] */
        fun close(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            close(accountId, AccountCloseParams.none(), requestOptions)
    }
}
