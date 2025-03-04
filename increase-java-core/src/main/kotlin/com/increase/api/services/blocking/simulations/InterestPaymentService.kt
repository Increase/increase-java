// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.SimulationInterestPaymentCreateParams
import com.increase.api.models.Transaction

interface InterestPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an interest payment to your account. In production, this happens automatically on
     * the first of each month.
     */
    @JvmOverloads
    fun create(
        params: SimulationInterestPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /**
     * A view of [InterestPaymentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/interest_payments`, but is otherwise
         * the same as [InterestPaymentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: SimulationInterestPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>
    }
}
