// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.OAuthToken
import com.increase.api.models.OAuthTokenCreateParams

interface OAuthTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an OAuth Token */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: OAuthTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthToken>
    }
}
