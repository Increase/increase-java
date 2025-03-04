// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.OAuthToken
import com.increase.api.models.OAuthTokenCreateParams
import java.util.concurrent.CompletableFuture

class OAuthTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthTokenServiceAsync {

    private val withRawResponse: OAuthTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthTokenServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthToken> =
        // post /oauth/tokens
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<OAuthToken> =
            jsonHandler<OAuthToken>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: OAuthTokenCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OAuthToken>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("oauth", "tokens")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
