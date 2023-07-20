package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Limit
import com.increase.api.models.LimitCreateParams
import com.increase.api.models.LimitListPage
import com.increase.api.models.LimitListParams
import com.increase.api.models.LimitRetrieveParams
import com.increase.api.models.LimitUpdateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class LimitServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LimitService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Limit> =
        jsonHandler<Limit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Limit */
    override fun create(params: LimitCreateParams, requestOptions: RequestOptions): Limit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("limits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Limit> =
        jsonHandler<Limit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Limit */
    override fun retrieve(params: LimitRetrieveParams, requestOptions: RequestOptions): Limit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("limits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Limit> =
        jsonHandler<Limit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Limit */
    override fun update(params: LimitUpdateParams, requestOptions: RequestOptions): Limit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("limits", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<LimitListPage.Response> =
        jsonHandler<LimitListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** List Limits */
    override fun list(params: LimitListParams, requestOptions: RequestOptions): LimitListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("limits")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { LimitListPage.of(this, params, it) }
        }
    }
}
