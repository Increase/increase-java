// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.AccountStatement
import com.increase.api.models.AccountStatementListPage
import com.increase.api.models.AccountStatementListParams
import com.increase.api.models.AccountStatementRetrieveParams

interface AccountStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Account Statement */
    fun retrieve(params: AccountStatementRetrieveParams): AccountStatement =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement

    /** List Account Statements */
    fun list(): AccountStatementListPage = list(AccountStatementListParams.none())

    /** @see [list] */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatementListPage

    /** @see [list] */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none()
    ): AccountStatementListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountStatementListPage =
        list(AccountStatementListParams.none(), requestOptions)

    /**
     * A view of [AccountStatementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /account_statements/{account_statement_id}`, but is
         * otherwise the same as [AccountStatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AccountStatementRetrieveParams): HttpResponseFor<AccountStatement> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatement>

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountStatementListPage> =
            list(AccountStatementListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatementListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none()
        ): HttpResponseFor<AccountStatementListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountStatementListPage> =
            list(AccountStatementListParams.none(), requestOptions)
    }
}
