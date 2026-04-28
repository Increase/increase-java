// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.accountrevenuepayments.AccountRevenuePaymentCreateParams
import com.increase.api.models.transactions.Transaction
import java.util.function.Consumer

interface AccountRevenuePaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountRevenuePaymentService

    /**
     * Simulates an account revenue payment to your account. In production, this happens
     * automatically on the first of each month.
     */
    fun create(params: AccountRevenuePaymentCreateParams): Transaction =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountRevenuePaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /**
     * A view of [AccountRevenuePaymentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountRevenuePaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/account_revenue_payments`, but is
         * otherwise the same as [AccountRevenuePaymentService.create].
         */
        @MustBeClosed
        fun create(params: AccountRevenuePaymentCreateParams): HttpResponseFor<Transaction> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountRevenuePaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>
    }
}
