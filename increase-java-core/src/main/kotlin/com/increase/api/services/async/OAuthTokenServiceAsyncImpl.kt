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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.OAuthToken
import com.increase.api.models.OAuthTokenCreateParams
import java.util.concurrent.CompletableFuture

class OAuthTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthTokenServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<OAuthToken> =
        jsonHandler<OAuthToken>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an OAuth Token */
    override fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthToken> {
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
