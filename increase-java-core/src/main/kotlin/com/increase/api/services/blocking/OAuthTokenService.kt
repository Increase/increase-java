// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthtokens.OAuthToken
import com.increase.api.models.oauthtokens.OAuthTokenCreateParams

interface OAuthTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an OAuth Token */
    fun create(params: OAuthTokenCreateParams): OAuthToken = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthToken

    /** A view of [OAuthTokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /oauth/tokens`, but is otherwise the same as
         * [OAuthTokenService.create].
         */
        @MustBeClosed
        fun create(params: OAuthTokenCreateParams): HttpResponseFor<OAuthToken> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: OAuthTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthToken>
    }
}
