// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.simulations.accountstatements.AccountStatementCreateParams

interface AccountStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an [Account Statement](#account-statements) being created for an
     * account. In production, Account Statements are generated once per month.
     */
    fun create(params: AccountStatementCreateParams): AccountStatement =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: AccountStatementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): AccountStatement

    /**
     * A view of [AccountStatementService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/account_statements`, but is
         * otherwise the same as [AccountStatementService.create].
         */
        @MustBeClosed
        fun create(params: AccountStatementCreateParams): HttpResponseFor<AccountStatement> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: AccountStatementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountStatement>
    }
}
