// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.beneficialowners.BeneficialOwnerArchiveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerListPage
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageResponse
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BeneficialOwnerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BeneficialOwnerService {

    private val withRawResponse: BeneficialOwnerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BeneficialOwnerService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeneficialOwnerService =
        BeneficialOwnerServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // get /entity_beneficial_owners/{entity_beneficial_owner_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // patch /entity_beneficial_owners/{entity_beneficial_owner_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions,
    ): BeneficialOwnerListPage =
        // get /entity_beneficial_owners
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: BeneficialOwnerArchiveParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // post /entity_beneficial_owners/{entity_beneficial_owner_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BeneficialOwnerService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BeneficialOwnerService.WithRawResponse =
            BeneficialOwnerServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BeneficialOwnerListPageResponse> =
            jsonHandler<BeneficialOwnerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BeneficialOwnerListPage.builder()
                            .service(BeneficialOwnerServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun archive(
            params: BeneficialOwnerArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0), "archive")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
