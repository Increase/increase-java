// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPage
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams

interface ExternalAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an External Account */
    @JvmOverloads
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** Retrieve an External Account */
    @JvmOverloads
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** Update an External Account */
    @JvmOverloads
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** List External Accounts */
    @JvmOverloads
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPage

    /** List External Accounts */
    fun list(requestOptions: RequestOptions): ExternalAccountListPage =
        list(ExternalAccountListParams.none(), requestOptions)

    /**
     * A view of [ExternalAccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /external_accounts`, but is otherwise the same as
         * [ExternalAccountService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `patch /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the same as
         * [ExternalAccountService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPage>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the same as
         * [ExternalAccountService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalAccountListPage> =
            list(ExternalAccountListParams.none(), requestOptions)
    }
}
