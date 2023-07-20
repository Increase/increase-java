package com.increase.api.services.blocking.entities

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Entity
import com.increase.api.models.EntitySupplementalDocumentCreateParams
import com.increase.api.models.EntitySupplementalDocumentListPage
import com.increase.api.models.EntitySupplementalDocumentListParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class SupplementalDocumentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SupplementalDocumentService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a supplemental document for an Entity */
    override fun create(
        params: EntitySupplementalDocumentCreateParams,
        requestOptions: RequestOptions
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "supplemental_documents")
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

    private val listHandler: Handler<EntitySupplementalDocumentListPage.Response> =
        jsonHandler<EntitySupplementalDocumentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Entity Supplemental Document Submissionss */
    override fun list(
        params: EntitySupplementalDocumentListParams,
        requestOptions: RequestOptions
    ): EntitySupplementalDocumentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entity_supplemental_documents")
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
                .let { EntitySupplementalDocumentListPage.of(this, params, it) }
        }
    }
}
