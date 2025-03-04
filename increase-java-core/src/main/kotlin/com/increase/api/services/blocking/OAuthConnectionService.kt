// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPage
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams

interface OAuthConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Connection */
    @JvmOverloads
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnection

    /** List OAuth Connections */
    @JvmOverloads
    fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnectionListPage

    /** List OAuth Connections */
    fun list(requestOptions: RequestOptions): OAuthConnectionListPage =
        list(OAuthConnectionListParams.none(), requestOptions)

    /**
     * A view of [OAuthConnectionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /oauth_connections/{oauth_connection_id}`, but is
         * otherwise the same as [OAuthConnectionService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnection>

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnectionListPage>

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OAuthConnectionListPage> =
            list(OAuthConnectionListParams.none(), requestOptions)
    }
}
