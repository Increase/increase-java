// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.DigitalWalletToken
import com.increase.api.models.DigitalWalletTokenListPage
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.DigitalWalletTokenRetrieveParams

interface DigitalWalletTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Digital Wallet Token */
    fun retrieve(params: DigitalWalletTokenRetrieveParams): DigitalWalletToken =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken

    /** List Digital Wallet Tokens */
    fun list(): DigitalWalletTokenListPage = list(DigitalWalletTokenListParams.none())

    /** @see [list] */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenListPage

    /** @see [list] */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
    ): DigitalWalletTokenListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DigitalWalletTokenListPage =
        list(DigitalWalletTokenListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens/{digital_wallet_token_id}`,
         * but is otherwise the same as [DigitalWalletTokenService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams
        ): HttpResponseFor<DigitalWalletToken> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken>

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DigitalWalletTokenListPage> =
            list(DigitalWalletTokenListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none()
        ): HttpResponseFor<DigitalWalletTokenListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalWalletTokenListPage> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
