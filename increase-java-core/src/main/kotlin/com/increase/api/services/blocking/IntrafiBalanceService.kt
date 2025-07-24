// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafibalances.IntrafiBalance
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams
import java.util.function.Consumer

interface IntrafiBalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntrafiBalanceService

    /**
     * Returns the IntraFi balance for the given account. IntraFi may sweep funds to multiple banks.
     * This endpoint will include both the total balance and the amount swept to each institution.
     */
    fun intrafiBalance(accountId: String): IntrafiBalance =
        intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none())

    /** @see intrafiBalance */
    fun intrafiBalance(
        accountId: String,
        params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiBalance =
        intrafiBalance(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see intrafiBalance */
    fun intrafiBalance(
        accountId: String,
        params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
    ): IntrafiBalance = intrafiBalance(accountId, params, RequestOptions.none())

    /** @see intrafiBalance */
    fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiBalance

    /** @see intrafiBalance */
    fun intrafiBalance(params: IntrafiBalanceIntrafiBalanceParams): IntrafiBalance =
        intrafiBalance(params, RequestOptions.none())

    /** @see intrafiBalance */
    fun intrafiBalance(accountId: String, requestOptions: RequestOptions): IntrafiBalance =
        intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none(), requestOptions)

    /**
     * A view of [IntrafiBalanceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntrafiBalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/intrafi_balance`, but is
         * otherwise the same as [IntrafiBalanceService.intrafiBalance].
         */
        @MustBeClosed
        fun intrafiBalance(accountId: String): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none())

        /** @see intrafiBalance */
        @MustBeClosed
        fun intrafiBalance(
            accountId: String,
            params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see intrafiBalance */
        @MustBeClosed
        fun intrafiBalance(
            accountId: String,
            params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
        ): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(accountId, params, RequestOptions.none())

        /** @see intrafiBalance */
        @MustBeClosed
        fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiBalance>

        /** @see intrafiBalance */
        @MustBeClosed
        fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams
        ): HttpResponseFor<IntrafiBalance> = intrafiBalance(params, RequestOptions.none())

        /** @see intrafiBalance */
        @MustBeClosed
        fun intrafiBalance(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none(), requestOptions)
    }
}
