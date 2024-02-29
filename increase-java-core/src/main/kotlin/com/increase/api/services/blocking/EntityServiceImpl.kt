// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Entity
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPage
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.services.blocking.entities.BeneficialOwnerService
import com.increase.api.services.blocking.entities.BeneficialOwnerServiceImpl
import com.increase.api.services.blocking.entities.IndustryCodeService
import com.increase.api.services.blocking.entities.IndustryCodeServiceImpl
import com.increase.api.services.blocking.entities.SupplementalDocumentService
import com.increase.api.services.blocking.entities.SupplementalDocumentServiceImpl
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class EntityServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EntityService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val beneficialOwners: BeneficialOwnerService by lazy {
        BeneficialOwnerServiceImpl(clientOptions)
    }

    private val supplementalDocuments: SupplementalDocumentService by lazy {
        SupplementalDocumentServiceImpl(clientOptions)
    }

    private val industryCode: IndustryCodeService by lazy { IndustryCodeServiceImpl(clientOptions) }

    override fun beneficialOwners(): BeneficialOwnerService = beneficialOwners

    override fun supplementalDocuments(): SupplementalDocumentService = supplementalDocuments

    override fun industryCode(): IndustryCodeService = industryCode

    private val createHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Entity */
    override fun create(params: EntityCreateParams, requestOptions: RequestOptions): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities")
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

    private val retrieveHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Entity */
    override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0))
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

    private val listHandler: Handler<EntityListPage.Response> =
        jsonHandler<EntityListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Entities */
    override fun list(params: EntityListParams, requestOptions: RequestOptions): EntityListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities")
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
                .let { EntityListPage.of(this, params, it) }
        }
    }

    private val archiveHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive an Entity */
    override fun archive(params: EntityArchiveParams, requestOptions: RequestOptions): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "archive")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { archiveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateAddressHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Natural Person or Corporation's address */
    override fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "address")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateAddressHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
