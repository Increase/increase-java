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
import com.increase.api.models.WireDrawdownRequest
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestListPageAsync
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams
import java.util.concurrent.CompletableFuture

class WireDrawdownRequestServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : WireDrawdownRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<WireDrawdownRequest> =
        jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Wire Drawdown Request */
    override fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireDrawdownRequest> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_drawdown_requests")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<WireDrawdownRequest> =
        jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Wire Drawdown Request */
    override fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireDrawdownRequest> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("wire_drawdown_requests", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<WireDrawdownRequestListPageAsync.Response> =
        jsonHandler<WireDrawdownRequestListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Wire Drawdown Requests */
    override fun list(
        params: WireDrawdownRequestListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WireDrawdownRequestListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("wire_drawdown_requests")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
                    .let { WireDrawdownRequestListPageAsync.of(this, params, it) }
            }
    }
}
