// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafibalances.IntrafiBalance
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams
import java.util.concurrent.CompletableFuture

interface IntrafiBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns the IntraFi balance for the given account. IntraFi may sweep funds to multiple banks.
     * This endpoint will include both the total balance and the amount swept to each institution.
     */
    fun intrafiBalance(accountId: String): CompletableFuture<IntrafiBalance> =
        intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none())

    /** @see [intrafiBalance] */
    fun intrafiBalance(
        accountId: String,
        params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiBalance> =
        intrafiBalance(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [intrafiBalance] */
    fun intrafiBalance(
        accountId: String,
        params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
    ): CompletableFuture<IntrafiBalance> = intrafiBalance(accountId, params, RequestOptions.none())

    /** @see [intrafiBalance] */
    fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiBalance>

    /** @see [intrafiBalance] */
    fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams
    ): CompletableFuture<IntrafiBalance> = intrafiBalance(params, RequestOptions.none())

    /** @see [intrafiBalance] */
    fun intrafiBalance(
        accountId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntrafiBalance> =
        intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none(), requestOptions)

    /**
     * A view of [IntrafiBalanceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/intrafi_balance`, but is
         * otherwise the same as [IntrafiBalanceServiceAsync.intrafiBalance].
         */
        @MustBeClosed
        fun intrafiBalance(accountId: String): CompletableFuture<HttpResponseFor<IntrafiBalance>> =
            intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none())

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(
            accountId: String,
            params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>> =
            intrafiBalance(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(
            accountId: String,
            params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>> =
            intrafiBalance(accountId, params, RequestOptions.none())

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>>

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>> =
            intrafiBalance(params, RequestOptions.none())

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(
            accountId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>> =
            intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none(), requestOptions)
    }
}
