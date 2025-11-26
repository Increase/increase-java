// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.externalaccounts.ExternalAccount
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountListParams
import com.increase.api.models.externalaccounts.ExternalAccountListResponse
import com.increase.api.models.externalaccounts.ExternalAccountRetrieveParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalAccountServiceAsync

    /** Create an External Account */
    fun create(params: ExternalAccountCreateParams): CompletableFuture<ExternalAccount> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** Retrieve an External Account */
    fun retrieve(externalAccountId: String): CompletableFuture<ExternalAccount> =
        retrieve(externalAccountId, ExternalAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        externalAccountId: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount> =
        retrieve(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        externalAccountId: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
    ): CompletableFuture<ExternalAccount> =
        retrieve(externalAccountId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** @see retrieve */
    fun retrieve(params: ExternalAccountRetrieveParams): CompletableFuture<ExternalAccount> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        externalAccountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> =
        retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

    /** Update an External Account */
    fun update(externalAccountId: String): CompletableFuture<ExternalAccount> =
        update(externalAccountId, ExternalAccountUpdateParams.none())

    /** @see update */
    fun update(
        externalAccountId: String,
        params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount> =
        update(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see update */
    fun update(
        externalAccountId: String,
        params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
    ): CompletableFuture<ExternalAccount> = update(externalAccountId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccount>

    /** @see update */
    fun update(params: ExternalAccountUpdateParams): CompletableFuture<ExternalAccount> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        externalAccountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalAccount> =
        update(externalAccountId, ExternalAccountUpdateParams.none(), requestOptions)

    /** List External Accounts */
    fun list(): CompletableFuture<ExternalAccountListResponse> =
        list(ExternalAccountListParams.none())

    /** @see list */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalAccountListResponse>

    /** @see list */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none()
    ): CompletableFuture<ExternalAccountListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalAccountListResponse> =
        list(ExternalAccountListParams.none(), requestOptions)

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExternalAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /external_accounts`, but is otherwise the same as
         * [ExternalAccountServiceAsync.create].
         */
        fun create(
            params: ExternalAccountCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /**
         * Returns a raw HTTP response for `get /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountServiceAsync.retrieve].
         */
        fun retrieve(
            externalAccountId: String
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(externalAccountId, ExternalAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            externalAccountId: String,
            params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(
                params.toBuilder().externalAccountId(externalAccountId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            externalAccountId: String,
            params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(externalAccountId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /** @see retrieve */
        fun retrieve(
            params: ExternalAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountServiceAsync.update].
         */
        fun update(externalAccountId: String): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(externalAccountId, ExternalAccountUpdateParams.none())

        /** @see update */
        fun update(
            externalAccountId: String,
            params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

        /** @see update */
        fun update(
            externalAccountId: String,
            params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(externalAccountId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccount>>

        /** @see update */
        fun update(
            params: ExternalAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalAccount>> =
            update(externalAccountId, ExternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the same as
         * [ExternalAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExternalAccountListResponse>> =
            list(ExternalAccountListParams.none())

        /** @see list */
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalAccountListResponse>>

        /** @see list */
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalAccountListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalAccountListResponse>> =
            list(ExternalAccountListParams.none(), requestOptions)
    }
}
