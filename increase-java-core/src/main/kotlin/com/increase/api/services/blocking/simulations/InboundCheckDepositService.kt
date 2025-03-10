// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.simulations.inboundcheckdeposits.InboundCheckDepositCreateParams

interface InboundCheckDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an Inbound Check Deposit against your account. This imitates someone depositing a
     * check at their bank that was issued from your account. It may or may not be associated with a
     * Check Transfer. Increase will evaluate the Check Deposit as we would in production and either
     * create a Transaction or a Declined Transaction as a result. You can inspect the resulting
     * Inbound Check Deposit object to see the result.
     */
    fun create(params: InboundCheckDepositCreateParams): InboundCheckDeposit =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InboundCheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /**
     * A view of [InboundCheckDepositService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_check_deposits`, but is
         * otherwise the same as [InboundCheckDepositService.create].
         */
        @MustBeClosed
        fun create(params: InboundCheckDepositCreateParams): HttpResponseFor<InboundCheckDeposit> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: InboundCheckDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>
    }
}
