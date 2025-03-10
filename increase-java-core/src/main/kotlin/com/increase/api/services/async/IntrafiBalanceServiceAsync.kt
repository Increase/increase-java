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

    /** Get IntraFi balances by bank */
    fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams
    ): CompletableFuture<IntrafiBalance> = intrafiBalance(params, RequestOptions.none())

    /** @see [intrafiBalance] */
    fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntrafiBalance>

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
        fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>> =
            intrafiBalance(params, RequestOptions.none())

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntrafiBalance>>
    }
}
