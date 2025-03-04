// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPageAsync
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an External Account */
    @JvmOverloads
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** Retrieve an External Account */
    @JvmOverloads
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** Update an External Account */
    @JvmOverloads
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** List External Accounts */
    @JvmOverloads
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountListPageAsync>

    /** List External Accounts */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalAccountListPageAsync> =
        list(ExternalAccountListParams.none(), requestOptions)

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /external_accounts`, but is otherwise the same as
         * [ExternalAccountServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `patch /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the same as
         * [ExternalAccountServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the same as
         * [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> =
            list(ExternalAccountListParams.none(), requestOptions)
    }
}
