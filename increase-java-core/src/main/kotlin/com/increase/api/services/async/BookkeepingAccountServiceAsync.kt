// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccount
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountBalanceParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountCreateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListPageAsync
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountUpdateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingBalanceLookup
import java.util.concurrent.CompletableFuture

interface BookkeepingAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Bookkeeping Account */
    fun create(params: BookkeepingAccountCreateParams): CompletableFuture<BookkeepingAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingAccount>

    /** Update a Bookkeeping Account */
    fun update(
        bookkeepingAccountId: String,
        params: BookkeepingAccountUpdateParams,
    ): CompletableFuture<BookkeepingAccount> =
        update(bookkeepingAccountId, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        bookkeepingAccountId: String,
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingAccount> =
        update(
            params.toBuilder().bookkeepingAccountId(bookkeepingAccountId).build(),
            requestOptions,
        )

    /** @see [update] */
    fun update(params: BookkeepingAccountUpdateParams): CompletableFuture<BookkeepingAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingAccount>

    /** List Bookkeeping Accounts */
    fun list(): CompletableFuture<BookkeepingAccountListPageAsync> =
        list(BookkeepingAccountListParams.none())

    /** @see [list] */
    fun list(
        params: BookkeepingAccountListParams = BookkeepingAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: BookkeepingAccountListParams = BookkeepingAccountListParams.none()
    ): CompletableFuture<BookkeepingAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BookkeepingAccountListPageAsync> =
        list(BookkeepingAccountListParams.none(), requestOptions)

    /** Retrieve a Bookkeeping Account Balance */
    fun balance(bookkeepingAccountId: String): CompletableFuture<BookkeepingBalanceLookup> =
        balance(bookkeepingAccountId, BookkeepingAccountBalanceParams.none())

    /** @see [balance] */
    fun balance(
        bookkeepingAccountId: String,
        params: BookkeepingAccountBalanceParams = BookkeepingAccountBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingBalanceLookup> =
        balance(
            params.toBuilder().bookkeepingAccountId(bookkeepingAccountId).build(),
            requestOptions,
        )

    /** @see [balance] */
    fun balance(
        bookkeepingAccountId: String,
        params: BookkeepingAccountBalanceParams = BookkeepingAccountBalanceParams.none(),
    ): CompletableFuture<BookkeepingBalanceLookup> =
        balance(bookkeepingAccountId, params, RequestOptions.none())

    /** @see [balance] */
    fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookkeepingBalanceLookup>

    /** @see [balance] */
    fun balance(
        params: BookkeepingAccountBalanceParams
    ): CompletableFuture<BookkeepingBalanceLookup> = balance(params, RequestOptions.none())

    /** @see [balance] */
    fun balance(
        bookkeepingAccountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingBalanceLookup> =
        balance(bookkeepingAccountId, BookkeepingAccountBalanceParams.none(), requestOptions)

    /**
     * A view of [BookkeepingAccountServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bookkeeping_accounts`, but is otherwise the same
         * as [BookkeepingAccountServiceAsync.create].
         */
        fun create(
            params: BookkeepingAccountCreateParams
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BookkeepingAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>>

        /**
         * Returns a raw HTTP response for `patch /bookkeeping_accounts/{bookkeeping_account_id}`,
         * but is otherwise the same as [BookkeepingAccountServiceAsync.update].
         */
        fun update(
            bookkeepingAccountId: String,
            params: BookkeepingAccountUpdateParams,
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>> =
            update(bookkeepingAccountId, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            bookkeepingAccountId: String,
            params: BookkeepingAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>> =
            update(
                params.toBuilder().bookkeepingAccountId(bookkeepingAccountId).build(),
                requestOptions,
            )

        /** @see [update] */
        fun update(
            params: BookkeepingAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: BookkeepingAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingAccount>>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_accounts`, but is otherwise the same as
         * [BookkeepingAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BookkeepingAccountListPageAsync>> =
            list(BookkeepingAccountListParams.none())

        /** @see [list] */
        fun list(
            params: BookkeepingAccountListParams = BookkeepingAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingAccountListPageAsync>>

        /** @see [list] */
        fun list(
            params: BookkeepingAccountListParams = BookkeepingAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<BookkeepingAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BookkeepingAccountListPageAsync>> =
            list(BookkeepingAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /bookkeeping_accounts/{bookkeeping_account_id}/balance`, but is otherwise the same as
         * [BookkeepingAccountServiceAsync.balance].
         */
        fun balance(
            bookkeepingAccountId: String
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>> =
            balance(bookkeepingAccountId, BookkeepingAccountBalanceParams.none())

        /** @see [balance] */
        fun balance(
            bookkeepingAccountId: String,
            params: BookkeepingAccountBalanceParams = BookkeepingAccountBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>> =
            balance(
                params.toBuilder().bookkeepingAccountId(bookkeepingAccountId).build(),
                requestOptions,
            )

        /** @see [balance] */
        fun balance(
            bookkeepingAccountId: String,
            params: BookkeepingAccountBalanceParams = BookkeepingAccountBalanceParams.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>> =
            balance(bookkeepingAccountId, params, RequestOptions.none())

        /** @see [balance] */
        fun balance(
            params: BookkeepingAccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>>

        /** @see [balance] */
        fun balance(
            params: BookkeepingAccountBalanceParams
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>> =
            balance(params, RequestOptions.none())

        /** @see [balance] */
        fun balance(
            bookkeepingAccountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BookkeepingBalanceLookup>> =
            balance(bookkeepingAccountId, BookkeepingAccountBalanceParams.none(), requestOptions)
    }
}
