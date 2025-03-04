// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken

    /** List Digital Wallet Tokens */
    @JvmOverloads
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenListPage

    /** List Digital Wallet Tokens */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken>

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenListPage>

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalWalletTokenListPage> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
