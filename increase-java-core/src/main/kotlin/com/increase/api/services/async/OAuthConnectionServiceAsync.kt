// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthconnections.OAuthConnection
import com.increase.api.models.oauthconnections.OAuthConnectionListPageAsync
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams
import java.util.concurrent.CompletableFuture

interface OAuthConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Connection */
    fun retrieve(params: OAuthConnectionRetrieveParams): CompletableFuture<OAuthConnection> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnection>

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
         * Returns a raw HTTP response for `get /oauth_connections/{oauth_connection_id}`, but is
         * otherwise the same as [OAuthConnectionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: OAuthConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<OAuthConnection>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnection>>

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(OAuthConnectionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(OAuthConnectionListParams.none(), requestOptions)
    }
}
