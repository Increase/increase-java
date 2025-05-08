// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListPageAsync
import com.increase.api.models.physicalcards.PhysicalCardListPageResponse
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class PhysicalCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardServiceAsync {

    private val withRawResponse: PhysicalCardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> =
        // post /physical_cards
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> =
        // get /physical_cards/{physical_card_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> =
        // patch /physical_cards/{physical_card_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCardListPageAsync> =
        // get /physical_cards
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("physical_cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val retrieveHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("physical_cards", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val updateHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("physical_cards", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<PhysicalCardListPageResponse> =
            jsonHandler<PhysicalCardListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PhysicalCardListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCardListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("physical_cards")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PhysicalCardListPageAsync.builder()
                                    .service(PhysicalCardServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
