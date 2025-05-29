// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.interestpayments.InterestPaymentCreateParams
import com.increase.api.models.transactions.Transaction
import java.util.concurrent.CompletableFuture

interface InterestPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an interest payment to your account. In production, this happens automatically on
     * the first of each month.
     */
    fun create(params: InterestPaymentCreateParams): CompletableFuture<Transaction> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InterestPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /**
     * A view of [InterestPaymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/interest_payments`, but is otherwise
         * the same as [InterestPaymentServiceAsync.create].
         */
        fun create(
            params: InterestPaymentCreateParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: InterestPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>
    }
}
