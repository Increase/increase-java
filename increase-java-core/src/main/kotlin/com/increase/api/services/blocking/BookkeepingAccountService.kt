// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.BookkeepingAccount
import com.increase.api.models.BookkeepingAccountBalanceParams
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountListPage
import com.increase.api.models.BookkeepingAccountListParams
import com.increase.api.models.BookkeepingAccountUpdateParams
import com.increase.api.models.BookkeepingBalanceLookup

interface BookkeepingAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Bookkeeping Account */
    fun create(params: BookkeepingAccountCreateParams): BookkeepingAccount =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingAccount

    /** Update a Bookkeeping Account */
    fun update(params: BookkeepingAccountUpdateParams): BookkeepingAccount =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingAccount

    /** List Bookkeeping Accounts */
    fun list(): BookkeepingAccountListPage = list(BookkeepingAccountListParams.none())

    /** @see [list] */
    fun list(
        params: BookkeepingAccountListParams = BookkeepingAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingAccountListPage

    /** @see [list] */
    fun list(
        params: BookkeepingAccountListParams = BookkeepingAccountListParams.none()
    ): BookkeepingAccountListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BookkeepingAccountListPage =
        list(BookkeepingAccountListParams.none(), requestOptions)

    /** Retrieve a Bookkeeping Account Balance */
    fun balance(params: BookkeepingAccountBalanceParams): BookkeepingBalanceLookup =
        balance(params, RequestOptions.none())

    /** @see [balance] */
    fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingBalanceLookup

    /**
     * A view of [BookkeepingAccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bookkeeping_accounts`, but is otherwise the same
         * as [BookkeepingAccountService.create].
         */
        @MustBeClosed
        fun create(params: BookkeepingAccountCreateParams): HttpResponseFor<BookkeepingAccount> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BookkeepingAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingAccount>

        /**
         * Returns a raw HTTP response for `patch /bookkeeping_accounts/{bookkeeping_account_id}`,
         * but is otherwise the same as [BookkeepingAccountService.update].
         */
        @MustBeClosed
        fun update(params: BookkeepingAccountUpdateParams): HttpResponseFor<BookkeepingAccount> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BookkeepingAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingAccount>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_accounts`, but is otherwise the same as
         * [BookkeepingAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BookkeepingAccountListPage> =
            list(BookkeepingAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingAccountListParams = BookkeepingAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookkeepingAccountListParams = BookkeepingAccountListParams.none()
        ): HttpResponseFor<BookkeepingAccountListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookkeepingAccountListPage> =
            list(BookkeepingAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /bookkeeping_accounts/{bookkeeping_account_id}/balance`, but is otherwise the same as
         * [BookkeepingAccountService.balance].
         */
        @MustBeClosed
        fun balance(
            params: BookkeepingAccountBalanceParams
        ): HttpResponseFor<BookkeepingBalanceLookup> = balance(params, RequestOptions.none())

        /** @see [balance] */
        @MustBeClosed
        fun balance(
            params: BookkeepingAccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingBalanceLookup>
    }
}
