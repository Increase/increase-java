// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateParams
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateResponse
import java.util.concurrent.CompletableFuture

interface DigitalWalletTokenRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    fun create(
        params: DigitalWalletTokenRequestCreateParams
    ): CompletableFuture<DigitalWalletTokenRequestCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
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
         * Returns a raw HTTP response for `post /simulations/digital_wallet_token_requests`, but is
         * otherwise the same as [DigitalWalletTokenRequestServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: DigitalWalletTokenRequestCreateParams
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DigitalWalletTokenRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestCreateResponse>>
    }
}
