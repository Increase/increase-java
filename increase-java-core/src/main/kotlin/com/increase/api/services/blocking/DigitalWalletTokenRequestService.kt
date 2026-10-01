// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequest
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPage
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListParams
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestRetrieveParams
import java.util.function.Consumer

interface DigitalWalletTokenRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigitalWalletTokenRequestService

    /** Retrieve a Digital Wallet Token Request */
    fun retrieve(digitalWalletTokenRequestId: String): DigitalWalletTokenRequest =
        retrieve(digitalWalletTokenRequestId, DigitalWalletTokenRequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenRequestId: String,
        params: DigitalWalletTokenRequestRetrieveParams =
            DigitalWalletTokenRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenRequest =
        retrieve(
            params.toBuilder().digitalWalletTokenRequestId(digitalWalletTokenRequestId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenRequestId: String,
        params: DigitalWalletTokenRequestRetrieveParams =
            DigitalWalletTokenRequestRetrieveParams.none(),
    ): DigitalWalletTokenRequest =
        retrieve(digitalWalletTokenRequestId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DigitalWalletTokenRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenRequest

    /** @see retrieve */
    fun retrieve(params: DigitalWalletTokenRequestRetrieveParams): DigitalWalletTokenRequest =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        digitalWalletTokenRequestId: String,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenRequest =
        retrieve(
            digitalWalletTokenRequestId,
            DigitalWalletTokenRequestRetrieveParams.none(),
            requestOptions,
        )

    /** List Digital Wallet Token Requests */
    fun list(): DigitalWalletTokenRequestListPage = list(DigitalWalletTokenRequestListParams.none())

    /** @see list */
    fun list(
        params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenRequestListPage

    /** @see list */
    fun list(
        params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none()
    ): DigitalWalletTokenRequestListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DigitalWalletTokenRequestListPage =
        list(DigitalWalletTokenRequestListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenRequestService] that provides access to raw HTTP responses for
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
        ): DigitalWalletTokenRequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /digital_wallet_token_requests/{digital_wallet_token_request_id}`, but is otherwise the
         * same as [DigitalWalletTokenRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenRequestId: String
        ): HttpResponseFor<DigitalWalletTokenRequest> =
            retrieve(digitalWalletTokenRequestId, DigitalWalletTokenRequestRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenRequestId: String,
            params: DigitalWalletTokenRequestRetrieveParams =
                DigitalWalletTokenRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenRequest> =
            retrieve(
                params.toBuilder().digitalWalletTokenRequestId(digitalWalletTokenRequestId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenRequestId: String,
            params: DigitalWalletTokenRequestRetrieveParams =
                DigitalWalletTokenRequestRetrieveParams.none(),
        ): HttpResponseFor<DigitalWalletTokenRequest> =
            retrieve(digitalWalletTokenRequestId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenRequest>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams
        ): HttpResponseFor<DigitalWalletTokenRequest> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenRequest> =
            retrieve(
                digitalWalletTokenRequestId,
                DigitalWalletTokenRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /digital_wallet_token_requests`, but is otherwise
         * the same as [DigitalWalletTokenRequestService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DigitalWalletTokenRequestListPage> =
            list(DigitalWalletTokenRequestListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenRequestListParams =
                DigitalWalletTokenRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenRequestListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none()
        ): HttpResponseFor<DigitalWalletTokenRequestListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DigitalWalletTokenRequestListPage> =
            list(DigitalWalletTokenRequestListParams.none(), requestOptions)
    }
}
