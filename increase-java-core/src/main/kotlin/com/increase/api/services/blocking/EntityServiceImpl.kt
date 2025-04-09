// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
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
import com.increase.api.core.prepare
import com.increase.api.models.entities.Entity
import com.increase.api.models.entities.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.entities.EntityArchiveParams
import com.increase.api.models.entities.EntityConfirmParams
import com.increase.api.models.entities.EntityCreateBeneficialOwnerParams
import com.increase.api.models.entities.EntityCreateParams
import com.increase.api.models.entities.EntityListPage
import com.increase.api.models.entities.EntityListPageResponse
import com.increase.api.models.entities.EntityListParams
import com.increase.api.models.entities.EntityRetrieveParams
import com.increase.api.models.entities.EntityUpdateAddressParams
import com.increase.api.models.entities.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.entities.EntityUpdateIndustryCodeParams

class EntityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityService {

    private val withRawResponse: EntityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityService.WithRawResponse = withRawResponse

    override fun create(params: EntityCreateParams, requestOptions: RequestOptions): Entity =
        // post /entities
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions): Entity =
        // get /entities/{entity_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EntityListParams, requestOptions: RequestOptions): EntityListPage =
        // get /entities
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: EntityArchiveParams, requestOptions: RequestOptions): Entity =
        // post /entities/{entity_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions,
    ): Entity =
        // post /entities/{entity_id}/archive_beneficial_owner
        withRawResponse().archiveBeneficialOwner(params, requestOptions).parse()

    override fun confirm(params: EntityConfirmParams, requestOptions: RequestOptions): Entity =
        // post /entities/{entity_id}/confirm
        withRawResponse().confirm(params, requestOptions).parse()

    override fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions,
    ): Entity =
        // post /entities/{entity_id}/create_beneficial_owner
        withRawResponse().createBeneficialOwner(params, requestOptions).parse()

    override fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions,
    ): Entity =
        // post /entities/{entity_id}/update_address
        withRawResponse().updateAddress(params, requestOptions).parse()

    override fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions,
    ): Entity =
        // post /entities/{entity_id}/update_beneficial_owner_address
        withRawResponse().updateBeneficialOwnerAddress(params, requestOptions).parse()

    override fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions,
    ): Entity =
        // post /entities/{entity_id}/update_industry_code
        withRawResponse().updateIndustryCode(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("entities", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EntityListPageResponse> =
            jsonHandler<EntityListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: EntityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("entities")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { EntityListPage.of(EntityServiceImpl(clientOptions), params, it) }
            }
        }

        private val archiveHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val archiveBeneficialOwnerHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities", params._pathParam(0), "archive_beneficial_owner")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { archiveBeneficialOwnerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val confirmHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun confirm(
            params: EntityConfirmParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities", params._pathParam(0), "confirm")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { confirmHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createBeneficialOwnerHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities", params._pathParam(0), "create_beneficial_owner")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createBeneficialOwnerHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateAddressHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateAddress(
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities", params._pathParam(0), "update_address")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateAddressHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateBeneficialOwnerAddressHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "entities",
                        params._pathParam(0),
                        "update_beneficial_owner_address",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateBeneficialOwnerAddressHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateIndustryCodeHandler: Handler<Entity> =
            jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateIndustryCode(
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Entity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entities", params._pathParam(0), "update_industry_code")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateIndustryCodeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
