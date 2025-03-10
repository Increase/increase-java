// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.accountstatements.AccountStatementListPageAsync
import com.increase.api.models.accountstatements.AccountStatementListParams
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams
import java.util.concurrent.CompletableFuture

interface AccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Account Statement */
    fun retrieve(params: AccountStatementRetrieveParams): CompletableFuture<AccountStatement> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatement>

    /** List Account Statements */
    fun list(): CompletableFuture<AccountStatementListPageAsync> =
        list(AccountStatementListParams.none())

    /** @see [list] */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatementListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none()
    ): CompletableFuture<AccountStatementListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
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
        @MustBeClosed
        fun retrieve(
            params: AccountStatementRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatement>>

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(AccountStatementListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(AccountStatementListParams.none(), requestOptions)
    }
}
