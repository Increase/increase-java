// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListPageAsync
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DigitalWalletTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigitalWalletTokenServiceAsync

    /** Retrieve a Digital Wallet Token */
    fun retrieve(digitalWalletTokenId: String): CompletableFuture<DigitalWalletToken> =
        retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        digitalWalletTokenId: String,
        params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletToken> =
        retrieve(
            params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        digitalWalletTokenId: String,
        params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
    ): CompletableFuture<DigitalWalletToken> =
        retrieve(digitalWalletTokenId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletToken>

    /** @see [retrieve] */
    fun retrieve(params: DigitalWalletTokenRetrieveParams): CompletableFuture<DigitalWalletToken> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        digitalWalletTokenId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalWalletToken> =
        retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalWalletTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens/{digital_wallet_token_id}`,
         * but is otherwise the same as [DigitalWalletTokenServiceAsync.retrieve].
         */
        fun retrieve(
            digitalWalletTokenId: String
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>> =
            retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            digitalWalletTokenId: String,
            params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>> =
            retrieve(
                params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            digitalWalletTokenId: String,
            params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>> =
            retrieve(digitalWalletTokenId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>>

        /** @see [retrieve] */
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            digitalWalletTokenId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalWalletToken>> =
            retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>> =
            list(DigitalWalletTokenListParams.none())

        /** @see [list] */
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>>

        /** @see [list] */
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenListPageAsync>> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
