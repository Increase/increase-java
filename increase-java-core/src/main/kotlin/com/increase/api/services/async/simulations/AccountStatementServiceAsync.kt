// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.simulations.accountstatements.AccountStatementCreateParams
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

    /**
     * Simulates an [Account Statement](#account-statements) being created for an account. In
     * production, Account Statements are generated once per month.
     */
    fun create(params: AccountStatementCreateParams): CompletableFuture<AccountStatement> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountStatement>

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
         * Returns a raw HTTP response for `post /simulations/account_statements`, but is otherwise
         * the same as [AccountStatementServiceAsync.create].
         */
        fun create(
            params: AccountStatementCreateParams
        ): CompletableFuture<HttpResponseFor<AccountStatement>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountStatementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountStatement>>
    }
}
