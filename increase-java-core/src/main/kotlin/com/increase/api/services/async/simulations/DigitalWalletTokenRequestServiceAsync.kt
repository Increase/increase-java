// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateParams
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DigitalWalletTokenRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DigitalWalletTokenRequestServiceAsync

    /**
     * Simulates a user attempting to add a [Card](#cards) to a digital wallet such as Apple Pay.
     */
    fun create(
        params: DigitalWalletTokenRequestCreateParams
    ): CompletableFuture<DigitalWalletTokenRequestCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletTokenRequestCreateResponse>

    /**
     * A view of [DigitalWalletTokenRequestServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalWalletTokenRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/digital_wallet_token_requests`, but is
         * otherwise the same as [DigitalWalletTokenRequestServiceAsync.create].
         */
        fun create(
            params: DigitalWalletTokenRequestCreateParams
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DigitalWalletTokenRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestCreateResponse>>
    }
}
