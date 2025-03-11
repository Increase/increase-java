// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthapplications.OAuthApplication
import com.increase.api.models.oauthapplications.OAuthApplicationListPageAsync
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import com.increase.api.models.oauthapplications.OAuthApplicationRetrieveParams
import java.util.concurrent.CompletableFuture

interface OAuthApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Application */
    fun retrieve(params: OAuthApplicationRetrieveParams): CompletableFuture<OAuthApplication> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see [retrieve] */
    fun retrieve(params: OAuthApplicationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OAuthApplication>

    /** List OAuth Applications */
    fun list(): CompletableFuture<OAuthApplicationListPageAsync> = list(OAuthApplicationListParams.none())

    /** @see [list] */
    fun list(params: OAuthApplicationListParams = OAuthApplicationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OAuthApplicationListPageAsync>

    /** @see [list] */
    fun list(params: OAuthApplicationListParams = OAuthApplicationListParams.none()): CompletableFuture<OAuthApplicationListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<OAuthApplicationListPageAsync> = list(OAuthApplicationListParams.none(), requestOptions)

    /**
     * A view of [OAuthApplicationServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /oauth_applications/{oauth_application_id}`, but is otherwise the same as
         * [OAuthApplicationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: OAuthApplicationRetrieveParams): CompletableFuture<HttpResponseFor<OAuthApplication>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: OAuthApplicationRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OAuthApplication>>

        /**
         * Returns a raw HTTP response for `get /oauth_applications`, but is otherwise the
         * same as [OAuthApplicationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>> = list(OAuthApplicationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(params: OAuthApplicationListParams = OAuthApplicationListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: OAuthApplicationListParams = OAuthApplicationListParams.none()): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OAuthApplicationListPageAsync>> = list(OAuthApplicationListParams.none(), requestOptions)
    }
}
