// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequest
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPageAsync
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListParams
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestRetrieveParams
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

    /** Retrieve a Digital Wallet Token Request */
    fun retrieve(
        digitalWalletTokenRequestId: String
    ): CompletableFuture<DigitalWalletTokenRequest> =
        retrieve(digitalWalletTokenRequestId, DigitalWalletTokenRequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenRequestId: String,
        params: DigitalWalletTokenRequestRetrieveParams =
            DigitalWalletTokenRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletTokenRequest> =
        retrieve(
            params.toBuilder().digitalWalletTokenRequestId(digitalWalletTokenRequestId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenRequestId: String,
        params: DigitalWalletTokenRequestRetrieveParams =
            DigitalWalletTokenRequestRetrieveParams.none(),
    ): CompletableFuture<DigitalWalletTokenRequest> =
        retrieve(digitalWalletTokenRequestId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DigitalWalletTokenRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletTokenRequest>

    /** @see retrieve */
    fun retrieve(
        params: DigitalWalletTokenRequestRetrieveParams
    ): CompletableFuture<DigitalWalletTokenRequest> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenRequestId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalWalletTokenRequest> =
        retrieve(
            digitalWalletTokenRequestId,
            DigitalWalletTokenRequestRetrieveParams.none(),
            requestOptions,
        )

    /** List Digital Wallet Token Requests */
    fun list(): CompletableFuture<DigitalWalletTokenRequestListPageAsync> =
        list(DigitalWalletTokenRequestListParams.none())

    /** @see list */
    fun list(
        params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalWalletTokenRequestListPageAsync>

    /** @see list */
    fun list(
        params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none()
    ): CompletableFuture<DigitalWalletTokenRequestListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<DigitalWalletTokenRequestListPageAsync> =
        list(DigitalWalletTokenRequestListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get
         * /digital_wallet_token_requests/{digital_wallet_token_request_id}`, but is otherwise the
         * same as [DigitalWalletTokenRequestServiceAsync.retrieve].
         */
        fun retrieve(
            digitalWalletTokenRequestId: String
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>> =
            retrieve(digitalWalletTokenRequestId, DigitalWalletTokenRequestRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            digitalWalletTokenRequestId: String,
            params: DigitalWalletTokenRequestRetrieveParams =
                DigitalWalletTokenRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>> =
            retrieve(
                params.toBuilder().digitalWalletTokenRequestId(digitalWalletTokenRequestId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            digitalWalletTokenRequestId: String,
            params: DigitalWalletTokenRequestRetrieveParams =
                DigitalWalletTokenRequestRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>> =
            retrieve(digitalWalletTokenRequestId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>>

        /** @see retrieve */
        fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            digitalWalletTokenRequestId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>> =
            retrieve(
                digitalWalletTokenRequestId,
                DigitalWalletTokenRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /digital_wallet_token_requests`, but is otherwise
         * the same as [DigitalWalletTokenRequestServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestListPageAsync>> =
            list(DigitalWalletTokenRequestListParams.none())

        /** @see list */
        fun list(
            params: DigitalWalletTokenRequestListParams =
                DigitalWalletTokenRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestListPageAsync>>

        /** @see list */
        fun list(
            params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestListPageAsync>> =
            list(DigitalWalletTokenRequestListParams.none(), requestOptions)
    }
}
