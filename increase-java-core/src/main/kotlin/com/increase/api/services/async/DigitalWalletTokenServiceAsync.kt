// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListPageAsync
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams
import java.util.concurrent.CompletableFuture

interface DigitalWalletTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Digital Wallet Token */
    fun retrieve(params: DigitalWalletTokenRetrieveParams): CompletableFuture<DigitalWalletToken> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletToken>

    /** List Digital Wallet Tokens */
    fun list(): CompletableFuture<DigitalWalletTokenListPageAsync> =
        list(DigitalWalletTokenListParams.none())

    /** @see [list] */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletTokenListPageAsync>

    /** @see [list] */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
    ): CompletableFuture<DigitalWalletTokenListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DigitalWalletTokenListPageAsync> =
        list(DigitalWalletTokenListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens/{digital_wallet_token_id}`,
         * but is otherwise the same as [DigitalWalletTokenServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>>

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>> =
            list(DigitalWalletTokenListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
