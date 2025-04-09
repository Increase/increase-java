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
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.physicalcards.PhysicalCardCreateParams
import com.increase.api.models.physicalcards.PhysicalCardListPage
import com.increase.api.models.physicalcards.PhysicalCardListPageResponse
import com.increase.api.models.physicalcards.PhysicalCardListParams
import com.increase.api.models.physicalcards.PhysicalCardRetrieveParams
import com.increase.api.models.physicalcards.PhysicalCardUpdateParams

class PhysicalCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardService {

    private val withRawResponse: PhysicalCardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardService.WithRawResponse = withRawResponse

    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // post /physical_cards
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // get /physical_cards/{physical_card_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // patch /physical_cards/{physical_card_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions,
    ): PhysicalCardListPage =
        // get /physical_cards
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("physical_cards")
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

        private val retrieveHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PhysicalCardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("physical_cards", params._pathParam(0))
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

        private val updateHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PhysicalCardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("physical_cards", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<PhysicalCardListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("physical_cards")
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
                    .let {
                        PhysicalCardListPage.of(PhysicalCardServiceImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
