// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<Account> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** Update an Account */
    fun update(params: AccountUpdateParams): CompletableFuture<Account> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

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
    fun balance(params: AccountBalanceParams): CompletableFuture<BalanceLookup> =
        balance(params, RequestOptions.none())

    /** @see [balance] */
    fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceLookup>

    /** Close an Account */
    fun close(params: AccountCloseParams): CompletableFuture<Account> =
        close(params, RequestOptions.none())

    /** @see [close] */
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: AccountCreateParams): CompletableFuture<HttpResponseFor<Account>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: AccountUpdateParams): CompletableFuture<HttpResponseFor<Account>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is otherwise
         * the same as [AccountServiceAsync.balance].
         */
        @MustBeClosed
        fun balance(
            params: AccountBalanceParams
        ): CompletableFuture<HttpResponseFor<BalanceLookup>> =
            balance(params, RequestOptions.none())

        /** @see [balance] */
        @MustBeClosed
        fun balance(
            params: AccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceLookup>>

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is otherwise the
         * same as [AccountServiceAsync.close].
         */
        @MustBeClosed
        fun close(params: AccountCloseParams): CompletableFuture<HttpResponseFor<Account>> =
            close(params, RequestOptions.none())

        /** @see [close] */
        @MustBeClosed
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>
    }
}
