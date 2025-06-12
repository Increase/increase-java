// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthconnections.OAuthConnection
import com.increase.api.models.oauthconnections.OAuthConnectionListPageAsync
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OAuthConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OAuthConnectionServiceAsync

    /** Retrieve an OAuth Connection */
    fun retrieve(oauthConnectionId: String): CompletableFuture<OAuthConnection> =
        retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        oauthConnectionId: String,
        params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnection> =
        retrieve(params.toBuilder().oauthConnectionId(oauthConnectionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        oauthConnectionId: String,
        params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
    ): CompletableFuture<OAuthConnection> =
        retrieve(oauthConnectionId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnection>

    /** @see [retrieve] */
    fun retrieve(params: OAuthConnectionRetrieveParams): CompletableFuture<OAuthConnection> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        oauthConnectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthConnection> =
        retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none(), requestOptions)

    /** List OAuth Connections */
    fun list(): CompletableFuture<OAuthConnectionListPageAsync> =
        list(OAuthConnectionListParams.none())

    /** @see [list] */
    fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnectionListPageAsync>

    /** @see [list] */
    fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none()
    ): CompletableFuture<OAuthConnectionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthConnectionListPageAsync> =
        list(OAuthConnectionListParams.none(), requestOptions)

    /**
     * A view of [OAuthConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): OAuthConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth_connections/{oauth_connection_id}`, but is
         * otherwise the same as [OAuthConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            oauthConnectionId: String
        ): CompletableFuture<HttpResponseFor<OAuthConnection>> =
            retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            oauthConnectionId: String,
            params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnection>> =
            retrieve(
                params.toBuilder().oauthConnectionId(oauthConnectionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            oauthConnectionId: String,
            params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnection>> =
            retrieve(oauthConnectionId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnection>>

        /** @see [retrieve] */
        fun retrieve(
            params: OAuthConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthConnection>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            oauthConnectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthConnection>> =
            retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(OAuthConnectionListParams.none())

        /** @see [list] */
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>>

        /** @see [list] */
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(OAuthConnectionListParams.none(), requestOptions)
    }
}
