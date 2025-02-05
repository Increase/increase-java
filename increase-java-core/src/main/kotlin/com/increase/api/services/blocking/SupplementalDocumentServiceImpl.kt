// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListPage
import com.increase.api.models.SupplementalDocumentListParams

class SupplementalDocumentServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : SupplementalDocumentService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EntitySupplementalDocument> =
        jsonHandler<EntitySupplementalDocument>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a supplemental document for an Entity */
    override fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions
    ): EntitySupplementalDocument {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entity_supplemental_documents")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<SupplementalDocumentListPage.Response> =
        jsonHandler<SupplementalDocumentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Entity Supplemental Document Submissions */
    override fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions
    ): SupplementalDocumentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entity_supplemental_documents")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { SupplementalDocumentListPage.of(this, params, it) }
    }
}
