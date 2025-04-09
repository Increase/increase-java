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
import com.increase.api.models.cards.Card
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetails
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardListPage
import com.increase.api.models.cards.CardListPageResponse
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams

class CardServiceImpl internal constructor(private val clientOptions: ClientOptions) : CardService {

    private val withRawResponse: CardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardService.WithRawResponse = withRawResponse

    override fun create(params: CardCreateParams, requestOptions: RequestOptions): Card =
        // post /cards
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: CardRetrieveParams, requestOptions: RequestOptions): Card =
        // get /cards/{card_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: CardUpdateParams, requestOptions: RequestOptions): Card =
        // patch /cards/{card_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: CardListParams, requestOptions: RequestOptions): CardListPage =
        // get /cards
        withRawResponse().list(params, requestOptions).parse()

    override fun details(params: CardDetailsParams, requestOptions: RequestOptions): CardDetails =
        // get /cards/{card_id}/details
        withRawResponse().details(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("cards")
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

        private val retrieveHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cards", params._pathParam(0))
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

        private val updateHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("cards", params._pathParam(0))
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

        private val listHandler: Handler<CardListPageResponse> =
            jsonHandler<CardListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cards")
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
                        CardListPage.builder()
                            .service(CardServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val detailsHandler: Handler<CardDetails> =
            jsonHandler<CardDetails>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDetails> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("cards", params._pathParam(0), "details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { detailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
