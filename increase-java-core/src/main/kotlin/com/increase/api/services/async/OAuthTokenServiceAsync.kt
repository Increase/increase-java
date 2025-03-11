// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthtokens.OAuthToken
import com.increase.api.models.oauthtokens.OAuthTokenCreateParams
import java.util.concurrent.CompletableFuture

interface OAuthTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an OAuth Token */
    fun create(params: OAuthTokenCreateParams): CompletableFuture<OAuthToken> =
        create(
          params, RequestOptions.none()
        )

    /** @see [create] */
    fun create(params: OAuthTokenCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OAuthToken>

    /**
     * A view of [OAuthTokenServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /oauth/tokens`, but is otherwise the same
         * as [OAuthTokenServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: OAuthTokenCreateParams): CompletableFuture<HttpResponseFor<OAuthToken>> =
            create(
              params, RequestOptions.none()
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: OAuthTokenCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OAuthToken>>
    }
}
