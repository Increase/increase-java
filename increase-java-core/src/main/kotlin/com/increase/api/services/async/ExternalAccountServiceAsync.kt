// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.externalaccounts.ExternalAccount
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountListPageAsync
import com.increase.api.models.externalaccounts.ExternalAccountListParams
import com.increase.api.models.externalaccounts.ExternalAccountRetrieveParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an External Account */
    fun create(params: ExternalAccountCreateParams): CompletableFuture<ExternalAccount> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: ExternalAccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ExternalAccount>

    /** Retrieve an External Account */
    fun retrieve(params: ExternalAccountRetrieveParams): CompletableFuture<ExternalAccount> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: ExternalAccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ExternalAccount>

    /** Update an External Account */
    fun update(params: ExternalAccountUpdateParams): CompletableFuture<ExternalAccount> =
        update(
          params, RequestOptions.none()
        )

    /** @see [update] */
    fun update(params: ExternalAccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ExternalAccount>

    /** List External Accounts */
    fun list(): CompletableFuture<ExternalAccountListPageAsync> = list(ExternalAccountListParams.none())

    /** @see [list] */
    fun list(params: ExternalAccountListParams = ExternalAccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ExternalAccountListPageAsync>

    /** @see [list] */
    fun list(params: ExternalAccountListParams = ExternalAccountListParams.none()): CompletableFuture<ExternalAccountListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalAccountListPageAsync> = list(ExternalAccountListParams.none(), requestOptions)

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /external_accounts`, but is otherwise the
         * same as [ExternalAccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: ExternalAccountCreateParams): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: ExternalAccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /external_accounts/{external_account_id}`,
         * but is otherwise the same as [ExternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ExternalAccountRetrieveParams): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ExternalAccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for
         * `patch /external_accounts/{external_account_id}`, but is otherwise the same as
         * [ExternalAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: ExternalAccountUpdateParams): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(
              params, RequestOptions.none()
            )

        /** @see [update] */
        @MustBeClosed
        fun update(params: ExternalAccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the
         * same as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> = list(ExternalAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: ExternalAccountListParams = ExternalAccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: ExternalAccountListParams = ExternalAccountListParams.none()): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<ExternalAccountListPageAsync>> = list(ExternalAccountListParams.none(), requestOptions)
    }
}
