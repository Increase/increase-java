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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPageAsync
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams
import java.util.concurrent.CompletableFuture

class OAuthConnectionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : OAuthConnectionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<OAuthConnection> =
        jsonHandler<OAuthConnection>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an OAuth Connection */
    override fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthConnection> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("oauth_connections", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<OAuthConnectionListPageAsync.Response> =
        jsonHandler<OAuthConnectionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List OAuth Connections */
    override fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OAuthConnectionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("oauth_connections")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { OAuthConnectionListPageAsync.of(this, params, it) }
            }
    }
}
