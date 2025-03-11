// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafibalances.IntrafiBalance
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams

interface IntrafiBalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get IntraFi balances by bank */
    fun intrafiBalance(params: IntrafiBalanceIntrafiBalanceParams): IntrafiBalance =
        intrafiBalance(
          params, RequestOptions.none()
        )

    /** @see [intrafiBalance] */
    fun intrafiBalance(params: IntrafiBalanceIntrafiBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiBalance

    /**
     * A view of [IntrafiBalanceService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/intrafi_balance`,
         * but is otherwise the same as [IntrafiBalanceService.intrafiBalance].
         */
        @MustBeClosed
        fun intrafiBalance(params: IntrafiBalanceIntrafiBalanceParams): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(
              params, RequestOptions.none()
            )

        /** @see [intrafiBalance] */
        @MustBeClosed
        fun intrafiBalance(params: IntrafiBalanceIntrafiBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<IntrafiBalance>
    }
}
