// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AccountStatement
import com.increase.api.models.AccountStatementListPageAsync
import com.increase.api.models.AccountStatementListParams
import com.increase.api.models.AccountStatementRetrieveParams
import java.util.concurrent.CompletableFuture

interface AccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Account Statement */
    @JvmOverloads
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatement>

    /** List Account Statements */
    @JvmOverloads
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatementListPageAsync>

    /** List Account Statements */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountStatementListPageAsync> =
        list(AccountStatementListParams.none(), requestOptions)

    /**
     * A view of [AccountStatementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /account_statements/{account_statement_id}`, but is
         * otherwise the same as [AccountStatementServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatement>>

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(AccountStatementListParams.none(), requestOptions)
    }
}
