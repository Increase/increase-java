// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPageAsync
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams
import java.util.concurrent.CompletableFuture

interface OAuthConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Connection */
    @JvmOverloads
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnection>

    /** List OAuth Connections */
    @JvmOverloads
    fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthConnectionListPageAsync>

    /** List OAuth Connections */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnection>>

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthConnectionListPageAsync>> =
            list(OAuthConnectionListParams.none(), requestOptions)
    }
}
