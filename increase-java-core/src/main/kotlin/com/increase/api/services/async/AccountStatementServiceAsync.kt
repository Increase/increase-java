// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.accountstatements.AccountStatementListPageAsync
import com.increase.api.models.accountstatements.AccountStatementListParams
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountStatementServiceAsync

    /** Retrieve an Account Statement */
    fun retrieve(accountStatementId: String): CompletableFuture<AccountStatement> =
        retrieve(accountStatementId, AccountStatementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accountStatementId: String,
        params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatement> =
        retrieve(params.toBuilder().accountStatementId(accountStatementId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accountStatementId: String,
        params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
    ): CompletableFuture<AccountStatement> =
        retrieve(accountStatementId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatement>

    /** @see retrieve */
    fun retrieve(params: AccountStatementRetrieveParams): CompletableFuture<AccountStatement> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        accountStatementId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountStatement> =
        retrieve(accountStatementId, AccountStatementRetrieveParams.none(), requestOptions)

    /** List Account Statements */
    fun list(): CompletableFuture<AccountStatementListPageAsync> =
        list(AccountStatementListParams.none())

    /** @see list */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatementListPageAsync>

    /** @see list */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none()
    ): CompletableFuture<AccountStatementListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountStatementListPageAsync> =
        list(AccountStatementListParams.none(), requestOptions)

    /**
     * A view of [AccountStatementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountStatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account_statements/{account_statement_id}`, but is
         * otherwise the same as [AccountStatementServiceAsync.retrieve].
         */
        fun retrieve(
            accountStatementId: String
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            retrieve(accountStatementId, AccountStatementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            accountStatementId: String,
            params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            retrieve(
                params.toBuilder().accountStatementId(accountStatementId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            accountStatementId: String,
            params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            retrieve(accountStatementId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatement>>

        /** @see retrieve */
        fun retrieve(
            params: AccountStatementRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            accountStatementId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            retrieve(accountStatementId, AccountStatementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(AccountStatementListParams.none())

        /** @see list */
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>>

        /** @see list */
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountStatementListPageAsync>> =
            list(AccountStatementListParams.none(), requestOptions)
    }
}
