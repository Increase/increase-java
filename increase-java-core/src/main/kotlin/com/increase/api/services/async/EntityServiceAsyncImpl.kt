package com.increase.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.Entity
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPageAsync
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler
import com.increase.api.services.async.entities.SupplementalDocumentServiceAsync
import com.increase.api.services.async.entities.SupplementalDocumentServiceAsyncImpl

class EntityServiceAsyncImpl constructor(private val clientOptions: ClientOptions,) : EntityServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val supplementalDocuments: SupplementalDocumentServiceAsync by lazy { SupplementalDocumentServiceAsyncImpl(clientOptions) }

    override fun supplementalDocuments(): SupplementalDocumentServiceAsync = supplementalDocuments

    private val createHandler: Handler<Entity> =
    jsonHandler<Entity>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create an Entity */
    override fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Entity> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Entity> =
    jsonHandler<Entity>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve an Entity */
    override fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Entity> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<EntityListPageAsync.Response> =
    jsonHandler<EntityListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Entities */
    override fun list(
        params: EntityListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<EntityListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { EntityListPageAsync.of(this, params, it) }
        }
    }
}
