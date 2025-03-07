// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: ExternalAccountCreateParams): ExternalAccount =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** Retrieve an External Account */
    fun retrieve(params: ExternalAccountRetrieveParams): ExternalAccount =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** Update an External Account */
    fun update(params: ExternalAccountUpdateParams): ExternalAccount =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** List External Accounts */
    fun list(): ExternalAccountListPage = list(ExternalAccountListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPage

    /** @see [list] */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none()
    ): ExternalAccountListPage = list(params, RequestOptions.none())

    /** @see [list] */
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
        @MustBeClosed
        fun create(params: ExternalAccountCreateParams): HttpResponseFor<ExternalAccount> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ExternalAccountRetrieveParams): HttpResponseFor<ExternalAccount> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `patch /external_accounts/{external_account_id}`, but is
         * otherwise the same as [ExternalAccountService.update].
         */
        @MustBeClosed
        fun update(params: ExternalAccountUpdateParams): HttpResponseFor<ExternalAccount> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the same as
         * [ExternalAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExternalAccountListPage> =
            list(ExternalAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none()
        ): HttpResponseFor<ExternalAccountListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalAccountListPage> =
            list(ExternalAccountListParams.none(), requestOptions)
    }
}
