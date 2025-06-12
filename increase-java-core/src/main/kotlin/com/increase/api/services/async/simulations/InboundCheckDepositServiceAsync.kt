// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.simulations.inboundcheckdeposits.InboundCheckDepositCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InboundCheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundCheckDepositServiceAsync

    /**
     * Simulates an Inbound Check Deposit against your account. This imitates someone depositing a
     * check at their bank that was issued from your account. It may or may not be associated with a
     * Check Transfer. Increase will evaluate the Check Deposit as we would in production and either
     * create a Transaction or a Declined Transaction as a result. You can inspect the resulting
     * Inbound Check Deposit object to see the result.
     */
    fun create(params: InboundCheckDepositCreateParams): CompletableFuture<InboundCheckDeposit> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: InboundCheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InboundCheckDeposit>

    /**
     * A view of [InboundCheckDepositServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundCheckDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_check_deposits`, but is
         * otherwise the same as [InboundCheckDepositServiceAsync.create].
         */
        fun create(
            params: InboundCheckDepositCreateParams
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: InboundCheckDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>>
    }
}
