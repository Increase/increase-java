// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListResponse
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams
import java.util.function.Consumer

interface DigitalWalletTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigitalWalletTokenService

    /** Retrieve a Digital Wallet Token */
    fun retrieve(digitalWalletTokenId: String): DigitalWalletToken =
        retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenId: String,
        params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken =
        retrieve(
            params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenId: String,
        params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
    ): DigitalWalletToken = retrieve(digitalWalletTokenId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken

    /** @see retrieve */
    fun retrieve(params: DigitalWalletTokenRetrieveParams): DigitalWalletToken =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(digitalWalletTokenId: String, requestOptions: RequestOptions): DigitalWalletToken =
        retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

    /** List Digital Wallet Tokens */
    fun list(): DigitalWalletTokenListResponse = list(DigitalWalletTokenListParams.none())

    /** @see list */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenListResponse

    /** @see list */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
    ): DigitalWalletTokenListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DigitalWalletTokenListResponse =
        list(DigitalWalletTokenListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenService] that provides access to raw HTTP responses for each
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
        ): DigitalWalletTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens/{digital_wallet_token_id}`,
         * but is otherwise the same as [DigitalWalletTokenService.retrieve].
         */
        @MustBeClosed
        fun retrieve(digitalWalletTokenId: String): HttpResponseFor<DigitalWalletToken> =
            retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenId: String,
            params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken> =
            retrieve(
                params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenId: String,
            params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
        ): HttpResponseFor<DigitalWalletToken> =
            retrieve(digitalWalletTokenId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams
        ): HttpResponseFor<DigitalWalletToken> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletToken> =
            retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DigitalWalletTokenListResponse> =
            list(DigitalWalletTokenListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
        ): HttpResponseFor<DigitalWalletTokenListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalWalletTokenListResponse> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
