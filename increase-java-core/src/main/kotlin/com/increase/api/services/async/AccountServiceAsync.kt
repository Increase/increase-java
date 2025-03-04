// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Account
import com.increase.api.models.AccountBalanceParams
import com.increase.api.models.AccountCloseParams
import com.increase.api.models.AccountCreateParams
import com.increase.api.models.AccountListPageAsync
import com.increase.api.models.AccountListParams
import com.increase.api.models.AccountRetrieveParams
import com.increase.api.models.AccountUpdateParams
import com.increase.api.models.BalanceLookup
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account */
    @JvmOverloads
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** Retrieve an Account */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** Update an Account */
    @JvmOverloads
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** List Accounts */
    @JvmOverloads
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListPageAsync>

    /** List Accounts */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListPageAsync> =
        list(AccountListParams.none(), requestOptions)

    /**
     * Retrieve the current and available balances for an account in minor units of the account's
     * currency. Learn more about [account balances](/documentation/balance).
     */
    @JvmOverloads
    fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceLookup>

    /** Close an Account */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is otherwise
         * the same as [AccountServiceAsync.balance].
         */
        @JvmOverloads
        @MustBeClosed
        fun balance(
            params: AccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceLookup>>

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is otherwise the
         * same as [AccountServiceAsync.close].
         */
        @JvmOverloads
        @MustBeClosed
        fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>
    }
}
