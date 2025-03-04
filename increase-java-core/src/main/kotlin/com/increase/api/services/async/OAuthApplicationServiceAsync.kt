// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPageAsync
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams
import java.util.concurrent.CompletableFuture

interface OAuthApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Application */
    @JvmOverloads
    fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplication>

    /** List OAuth Applications */
    @JvmOverloads
    fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OAuthApplicationListPageAsync>

    /** List OAuth Applications */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthApplicationListPageAsync> =
        list(OAuthApplicationListParams.none(), requestOptions)

    /**
     * A view of [OAuthApplicationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /oauth_applications/{oauth_application_id}`, but is
         * otherwise the same as [OAuthApplicationServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: OAuthApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthApplication>>

        /**
         * Returns a raw HTTP response for `get /oauth_applications`, but is otherwise the same as
         * [OAuthApplicationServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /oauth_applications`, but is otherwise the same as
         * [OAuthApplicationServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>> =
            list(OAuthApplicationListParams.none(), requestOptions)
    }
}
