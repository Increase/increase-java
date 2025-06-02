// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.feepayments.FeePaymentCreateParams
import com.increase.api.models.transactions.Transaction

interface FeePaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * A fee payment is how Increase charges you for technology fees incurred each month. In
     * production, these payments will be charged to your program's billing account.
     */
    fun create(params: FeePaymentCreateParams): Transaction = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FeePaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** A view of [FeePaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/fee_payments`, but is otherwise the
         * same as [FeePaymentService.create].
         */
        @MustBeClosed
        fun create(params: FeePaymentCreateParams): HttpResponseFor<Transaction> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FeePaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>
    }
}
