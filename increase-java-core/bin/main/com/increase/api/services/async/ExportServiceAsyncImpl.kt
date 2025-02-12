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
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPageAsync
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams
import java.util.concurrent.CompletableFuture

class ExportServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExportServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Export> =
        jsonHandler<Export>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Export */
    override fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Export> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("exports")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Export> =
        jsonHandler<Export>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Export */
    override fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Export> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("exports", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ExportListPageAsync.Response> =
        jsonHandler<ExportListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Exports */
    override fun list(
        params: ExportListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExportListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("exports")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ExportListPageAsync.of(this, params, it) }
        }
    }
}
