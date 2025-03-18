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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListPage
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams

class CardDisputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardDisputeService {

    private val withRawResponse: CardDisputeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardDisputeService.WithRawResponse = withRawResponse

    override fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions,
    ): CardDispute =
        // post /card_disputes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions,
    ): CardDispute =
        // get /card_disputes/{card_dispute_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions,
    ): CardDisputeListPage =
        // get /card_disputes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardDisputeService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CardDispute> =
            jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("card_disputes")
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

        private val retrieveHandler: Handler<CardDispute> =
            jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("card_disputes", params._pathParam(0))
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

        private val listHandler: Handler<CardDisputeListPage.Response> =
            jsonHandler<CardDisputeListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardDisputeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDisputeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("card_disputes")
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
                        CardDisputeListPage.of(CardDisputeServiceImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
