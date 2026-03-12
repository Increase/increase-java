// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerArchiveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerCreateParams
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageResponse
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BeneficialOwnerServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BeneficialOwnerServiceAsync {

    private val withRawResponse: BeneficialOwnerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BeneficialOwnerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BeneficialOwnerServiceAsync =
        BeneficialOwnerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BeneficialOwnerCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityBeneficialOwner> =
        // post /entity_beneficial_owners
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityBeneficialOwner> =
        // get /entity_beneficial_owners/{entity_beneficial_owner_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityBeneficialOwner> =
        // patch /entity_beneficial_owners/{entity_beneficial_owner_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BeneficialOwnerListPageAsync> =
        // get /entity_beneficial_owners
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun archive(
        params: BeneficialOwnerArchiveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityBeneficialOwner> =
        // post /entity_beneficial_owners/{entity_beneficial_owner_id}/archive
        withRawResponse().archive(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BeneficialOwnerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BeneficialOwnerServiceAsync.WithRawResponse =
            BeneficialOwnerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun create(
            params: BeneficialOwnerCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BeneficialOwnerListPageResponse> =
            jsonHandler<BeneficialOwnerListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BeneficialOwnerListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                BeneficialOwnerListPageAsync.builder()
                                    .service(BeneficialOwnerServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val archiveHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override fun archive(
            params: BeneficialOwnerArchiveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
